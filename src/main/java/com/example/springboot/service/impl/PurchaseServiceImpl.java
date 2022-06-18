package com.example.springboot.service.impl;

import com.example.springboot.mapper.*;
import com.example.springboot.model.*;
import com.example.springboot.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    Customer_BlackListMapper customer_blackListMapper;

    @Autowired
    Sales_RecordMapper sales_recordMapper;

    @Autowired
    Return_ListMapper return_listMapper;

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    Shopping_CartMapper shopping_cartMapper;

    //订单状态有8种，待支付，待发货，已发货，已收货，待评价，退货中，退货成功，交易成功

    /**
     * 用户下单
     * @param customerAccount
     * @param merchantAccount
     * @param productId
     * @param price
     * @param amount
     * @param orderWay
     * @return
     */
    @Override
    public Object order(String customerAccount, String merchantAccount, int productId, double price, int amount, String orderWay) {
        Map<Object, Object> resultMap = new HashMap<>();

        if(merchantMapper.selectByAccount(merchantAccount) == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该商家不存在");
            return resultMap;
        }

        if(customerMapper.selectByAccount(customerAccount) == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该用户不存在");
            return resultMap;
        }

        //确认黑名单
        Customer_BlackList customer_black = new Customer_BlackList();
        customer_black.setBlacklistFrom(merchantAccount);
        customer_black.setBlacklistTo(customerAccount);
        Map<Object, Object> map = new HashMap<>();
        map.put("blacklistFrom", merchantAccount);
        map.put("blacklistTo", customerAccount);
        Customer_BlackList customer_blackList = (Customer_BlackList) customer_blackListMapper.selectByFromTo(map);
        if(customer_blackList != null) {
            resultMap.put("state", "Failed");
            if(customer_blackList.getBlacklistType().equals("merchant")) {
                resultMap.put("info", "你已被该商家拉黑");
            } else if(customer_blackList.getBlacklistType().equals("platform")) {
                resultMap.put("info", "你已被平台禁止交易");
            }
            resultMap.put("detail", customer_blackList);
            return resultMap;
        }

        if(productMapper.selectByPrimaryKey(productId) == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该商品不存在");
            return resultMap;
        }

        Product product = productMapper.selectByPrimaryKey(productId);
        if(amount > product.getProductCount()) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "库存不足");
            return resultMap;
        }

        Order order = new Order();
        order.setOrderCustomer(customerAccount);
        order.setOrderMerchant(merchantAccount);
        order.setOrderProduct(productId);
        order.setOrderWay(orderWay);
        order.setOrderPrice(price);
        order.setOrderAmount(amount);
        order.setOrderTotalPrice(amount*price);
        order.setOrderState("待支付");
        order.setOrderDate(new Date(System.currentTimeMillis()));
        try {
            product.setProductCount(product.getProductCount()-amount);
            productMapper.updateByPrimaryKey(product);
            orderMapper.insert(order);
            resultMap.put("state", "Success");
            resultMap.put("info", "下单成功");
            return resultMap;
        } catch (Exception e) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "内部错误");
            return resultMap;
        }
    }

    /**
     * 用户查询订单
     * @param currPage
     * @param pageSize
     * @param customerAccount
     * @return
     */
    @Override
    public Object selectOrder(int currPage, int pageSize, String customerAccount) {
        Map<Object, Object> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("customerAccount", customerAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", orderMapper.selectByCustomerAccount(data));
        Long recordsCount = orderMapper.countByCustomerAccount(customerAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    /**
     * 通过订单id取消订单
     * @param orderId
     * @return
     */
    @Override
    public Object cancelOrder(Integer orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        Map<Object, Object> resultMap = new HashMap<>();
        if(order == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "订单不存在");

        } else {
            if(order.getOrderState().equals("待发货")) {
                Customer customer = customerMapper.selectByAccount(order.getOrderCustomer());
                customer.setCustomerWalletBalance(order.getOrderTotalPrice());
                customerMapper.updateByPrimaryKey(customer);
            }
            Product product = productMapper.selectByPrimaryKey(order.getOrderProduct());
            product.setProductCount(product.getProductCount()+order.getOrderAmount());
            productMapper.updateByPrimaryKey(product);
            orderMapper.deleteByPrimaryKey(orderId);
            resultMap.put("state", "Success");
            resultMap.put("info", "取消成功");
        }
        return resultMap;
    }

    /**
     * 付款
     * @param orderId
     * @param useIntegral
     * @param password
     * @return
     */
    @Override
    public Object pay(Integer orderId, int useIntegral, String password) {
        Map<Object, Object> resultMap = new HashMap<>();
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if(order == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该订单不存在");
            return resultMap;
        }

        //确认金额
        Customer customer = customerMapper.selectByAccount(order.getOrderCustomer());
        if(!customer.getCustomerPassword().equals(password)) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "密码错误");
            return resultMap;
        }

        if(!order.getOrderState().equals("待支付")) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "请勿重复支付");
            return resultMap;
        }

        if(useIntegral == 0) {
            //不使用积分
            if(customer.getCustomerWalletBalance() < order.getOrderTotalPrice()) {
                resultMap.put("state", "Failed");
                resultMap.put("info", "账户余额不足");
                return resultMap;
            } else {
                //更新客户的积分和余额
                customer.setCustomerWalletBalance(customer.getCustomerWalletBalance()-order.getOrderTotalPrice());
                customer.setCustomerWalletIntegral(customer.getCustomerWalletIntegral()+order.getOrderTotalPrice().intValue());
                customerMapper.updateByPrimaryKey(customer);
            }
        } else if(useIntegral == 1) {
            //使用积分
            if(customer.getCustomerWalletBalance()+(customer.getCustomerWalletIntegral()/100.0) < order.getOrderTotalPrice()) {
                resultMap.put("state", "Failed");
                resultMap.put("info", "账户余额不足");
                return resultMap;
            } else {
                if(customer.getCustomerWalletIntegral()/100.0 >= order.getOrderTotalPrice()) {
                    customer.setCustomerWalletIntegral((int) (customer.getCustomerWalletIntegral()-order.getOrderTotalPrice()*100));
                } else {
                    customer.setCustomerWalletBalance(customer.getCustomerWalletBalance()+(customer.getCustomerWalletIntegral()/100.0)-order.getOrderTotalPrice());
                    customer.setCustomerWalletIntegral(order.getOrderTotalPrice().intValue());
                }
                customerMapper.updateByPrimaryKey(customer);
            }
        }

        order.setOrderState("待发货");
        try {
            orderMapper.updateByPrimaryKey(order);
            resultMap.put("state", "Success");
            resultMap.put("info", "付款成功");
            return resultMap;
        } catch (Exception e) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "内部错误");
            return resultMap;
        }
    }

    /**
     * 催促发货
     * @param customerAccount
     * @param merchantAccount
     * @param productId
     * @return
     */
    @Override
    public Object urge(String customerAccount, String merchantAccount, String productId) {
        return null;
    }

    /**
     * 确认收货
     * @param orderId
     * @param password
     * @return
     */
    @Override
    public Object confirmReceipt(Integer orderId, String password) {
        Map<Object, Object> resultMap = new HashMap<>();
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if(order == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该订单不存在");
            return resultMap;
        }
        //确认密码
        Customer customer = customerMapper.selectByAccount(order.getOrderCustomer());
        if(!customer.getCustomerPassword().equals(password)) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "密码错误");
            return resultMap;
        }

        order.setOrderState("待评价");
        Sales_Record sales_record = new Sales_Record();
        sales_record.setSalesOrder(orderId);
        sales_record.setSalesRecordMerchant(order.getOrderMerchant());
        sales_record.setSalesRecordProduct(order.getOrderProduct());
        sales_record.setSalesRecordCustomer(order.getOrderCustomer());
        sales_record.setSalesRecordSaleCount(order.getOrderAmount());
        sales_record.setSalesRecordMoneyAmount(order.getOrderTotalPrice());
        sales_record.setSalesRecordStartDate(order.getOrderDate());
        sales_record.setSalesRecordPayDate(order.getOrderDate());
        sales_record.setSalesRecordIsReturn("no");
        sales_record.setSalesRecordConfirmDate(new Date(System.currentTimeMillis()));
        sales_record.setSalesRecordReceiveDate(new Date(System.currentTimeMillis()));
        Merchant merchant = merchantMapper.selectByAccount(order.getOrderMerchant());
        sales_record.setSalesRecordServiceCharge(merchant.getMerchantServicePriceRate()*order.getOrderTotalPrice());
        double total = merchant.getMerchantTotalSaleAmount();
        merchant.setMerchantTotalSaleAmount(total + order.getOrderTotalPrice()-sales_record.getSalesRecordServiceCharge());

        orderMapper.updateByPrimaryKey(order);
        sales_recordMapper.insert(sales_record);
        merchantMapper.updateByPrimaryKey(merchant);

        resultMap.put("state", "Success");
        resultMap.put("info", "确认收货成功");
        return resultMap;
    }

    /**
     * 提交评论
     * @param orderId
     * @param asDescription
     * @param responseSpeed
     * @param serveAttitude
     * @param textInfo
     * @param picInfo
     * @return
     */
    @Override
    public Object commit(int orderId, double asDescription, double responseSpeed, double serveAttitude, String textInfo, String picInfo) {
        Map<Object, Object> resultMap = new HashMap<>();
        Sales_Record sales_record = sales_recordMapper.selectByOrderId(orderId);
        sales_record.setAsDescription(asDescription);
        sales_record.setResponseSpeed(responseSpeed);
        sales_record.setSalesRatingByCustomer((asDescription+responseSpeed+serveAttitude)/3.0);
        sales_record.setServeAttitude(serveAttitude);
        sales_record.setCommentDate(new Date(System.currentTimeMillis()));
        sales_record.setCommentTextInfo(textInfo);
        sales_record.setCommentPicInfo(picInfo);
        sales_recordMapper.updateByPrimaryKey(sales_record);
        Order order = orderMapper.selectByPrimaryKey(sales_record.getSalesOrder());
        order.setOrderState("交易成功");
        orderMapper.updateByPrimaryKey(order);
        resultMap.put("state", "Success");
        resultMap.put("info", "评价成功");
        return resultMap;
    }

    /**
     * 申请退货
     * @param orderId
     * @return
     */
    @Override
    public Object returnGoods(int orderId) {
        Map<Object, Object> resultMap = new HashMap<>();
        Sales_Record sales_record = sales_recordMapper.selectByOrderId(orderId);
        Date currDate = new Date(System.currentTimeMillis());
        int dateDiffer = 0;
        try {
            dateDiffer = Math.abs((int) ((sales_record.getSalesRecordConfirmDate().getTime() - currDate.getTime()) / (1000 * 3600 * 24)));
            if(dateDiffer >= 1) {
                resultMap.put("state", "Failed");
                resultMap.put("info", "确认收货已超过24小时，无法退货");
                return resultMap;
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("state", "Failed");
            resultMap.put("info", "确认收货已超过24小时，无法退货");
            return resultMap;
        }

        Return_List return_list = new Return_List();
        return_list.setReturnAmount(sales_record.getSalesRecordSaleCount());
        return_list.setReturnDate(new Date(System.currentTimeMillis()));
        return_list.setReturnCustomer(sales_record.getSalesRecordCustomer());
        return_list.setReturnMerchant(sales_record.getSalesRecordMerchant());
        return_list.setReturnMoney(sales_record.getSalesRecordMoneyAmount());
        return_list.setReturnProduct(sales_record.getSalesRecordProduct());
        return_list.setSaleRecord(sales_record.getSaleRecordId());
        return_list.setReturnState("退货中");

        Order order = orderMapper.selectByPrimaryKey(orderId);
        order.setOrderState("退货中");
        orderMapper.updateByPrimaryKey(order);
        return_listMapper.insert(return_list);

        resultMap.put("state", "Success");
        resultMap.put("info", "申请退货成功，等待商家处理");
        return resultMap;
    }

    /**
     * 将商品加入购物车
     * @param customerAccount
     * @param productId
     * @param amount
     * @return
     */
    @Override
    public Object joinCart(String customerAccount, int productId, int amount) {
        Map<Object, Object> resultMap = new HashMap<>();
        Product product = productMapper.selectByPrimaryKey(productId);
        Store store = storeMapper.selectByProductId(productId);
        Shopping_Cart shopping_cart = new Shopping_Cart();
        shopping_cart.setShoppingCartCount(amount);
        shopping_cart.setShoppingCartCustomer(customerAccount);
        shopping_cart.setShoppingCartAddDate(new Date(System.currentTimeMillis()));
        shopping_cart.setShoppingCartMerchant(store.getStoreMerchant());
        shopping_cart.setShoppingCartProductId(productId);
        shopping_cart.setShoppingCartProductName(product.getProductName());
        shopping_cart.setShoppingCartUnitPrice(product.getProductDiscountPrice());
        shopping_cart.setShoppingCartTotalPrice(product.getProductDiscountPrice() * amount);
        shopping_cartMapper.insert(shopping_cart);

        resultMap.put("state", "Success");
        resultMap.put("info", "加入购物车成功");
        return resultMap;
    }

    /**
     * 将商品从购物车移除
     * @param cartId
     * @return
     */
    @Override
    public Object removeCart(int cartId) {
        Map<Object, Object> resultMap = new HashMap<>();
        shopping_cartMapper.deleteByPrimaryKey(cartId);
        resultMap.put("state", "Success");
        resultMap.put("info", "移除购物车成功");
        return resultMap;
    }

    /**
     * 查询自己购物车中的商品
     * @param currPage
     * @param pageSize
     * @param customerAccount
     * @return
     */
    @Override
    public Object selectCart(int currPage, int pageSize, String customerAccount) {
        Map<Object, Object> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("customerAccount", customerAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", shopping_cartMapper.selectAll(data));
        Long recordsCount = shopping_cartMapper.countByCustomerAccount(customerAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }
}
