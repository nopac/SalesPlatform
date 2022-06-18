package com.example.springboot.service.impl;

import com.example.springboot.mapper.*;
import com.example.springboot.model.*;
import com.example.springboot.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    Putaway_Apply_ListMapper putaway_apply_listMapper;

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    Return_ListMapper returnListMapper;

    @Autowired
    Sales_RecordMapper sales_recordMapper;

    @Autowired
    Comment_From_MerchantMapper comment_from_merchantMapper;

    @Autowired
    Customer_BlackListMapper customer_blackListMapper;

    @Override
    public Object putOnObject(String merchantAccount, String catagory, String productName, int count, double price, double discountPrice, String size, String picInfo, String negotiable, double condition, String describeInfo) {
        Map<Object, Object> resultMap = new HashMap();
        try {
            Putaway_Apply_List putaway_apply_list = new Putaway_Apply_List();
            putaway_apply_list.setPutawayMerchant(merchantAccount);
            putaway_apply_list.setPutawayCatagory(catagory);
            putaway_apply_list.setPutawayName(productName);
            putaway_apply_list.setPutawayCount(count);
            putaway_apply_list.setPutawayPrice(price);
            putaway_apply_list.setPutawayDiscountPrice(discountPrice);
            putaway_apply_list.setPutawaySize(size);
            putaway_apply_list.setPutawayPictureDir(picInfo);
            putaway_apply_list.setPutawayNegotiable(negotiable);
            putaway_apply_list.setPutawayConditionDegree(condition);
            putaway_apply_list.setPutawayDescription(describeInfo);
            putaway_apply_list.setPutawayStatment("待审核");
            putaway_apply_list.setPutawaySubmitDate(new Date(System.currentTimeMillis()));
            putaway_apply_listMapper.insert(putaway_apply_list);
            resultMap.put("state", "Success");
            resultMap.put("info", "提交上架申请成功，请等待管理员审核");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("state", "Failed");
            resultMap.put("info", "提交失败，系统错误");
        }
        return resultMap;
    }

    @Override
    public Object queryMySelf(String merchantAccount) {
        return merchantMapper.selectByAccount(merchantAccount);
    }

    @Override
    public Object queryProductInStore(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("merchantAccount", merchantAccount);
        List<Store> storeList = storeMapper.selectProductByMerchant(map);
        List<Object> result = new LinkedList<>();
        for(Store store : storeList) {
            result.add(productMapper.selectByPrimaryKey(store.getStoreProduct()));
        }
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", result);
        Long recordsCount = storeMapper.countByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object queryOrderFinished(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("merchantAccount", merchantAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", orderMapper.selectFinishedByMerchantAccount(map));
        Long recordsCount = orderMapper.countFinishedByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object queryOrderUnfinished(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("merchantAccount", merchantAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", orderMapper.selectUnfinishedByMerchantAccount(map));
        Long recordsCount = orderMapper.countUnfinishedByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object dispatch(int orderId) {
        Map<Object, Object> resultMap = new HashMap<>();
        Order order = orderMapper.selectByPrimaryKey(orderId);
        order.setOrderState("已发货");
        orderMapper.updateByPrimaryKey(order);
        resultMap.put("state", "Success");
        resultMap.put("info", "发货成功");
        return resultMap;
    }

    @Override
    public Object takeProductOff(int productId) {
        Map<Object, Object> resultMap = new HashMap<>();
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setProductOnSale("no");
        productMapper.updateByPrimaryKey(product);
        resultMap.put("state", "Success");
        resultMap.put("info", "下架成功");
        return resultMap;
    }

    @Override
    public Object takeProductOn(int productId) {
        Map<Object, Object> resultMap = new HashMap<>();
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setProductOnSale("yes");
        productMapper.updateByPrimaryKey(product);
        resultMap.put("state", "Success");
        resultMap.put("info", "上架成功");
        return resultMap;
    }

    @Override
    public Object queryReturnList(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("merchantAccount", merchantAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", returnListMapper.selectByMerchantAccount(map));
        Long recordsCount = returnListMapper.countByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object confirmReturnProduct(int saleRecord) {
        Map<Object, Object> resultMap = new HashMap<>();

        Return_List return_list = returnListMapper.selectByPrimaryKey(saleRecord);
        if(return_list == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该退货申请不存在");
            return resultMap;
        }
        Sales_Record sales_record = sales_recordMapper.selectByPrimaryKey(saleRecord);
        Order order = orderMapper.selectByPrimaryKey(sales_record.getSalesOrder());
        Product product = productMapper.selectByPrimaryKey(order.getOrderProduct());
        Customer customer = customerMapper.selectByAccount(order.getOrderCustomer());
        Merchant merchant = merchantMapper.selectByAccount(order.getOrderMerchant());

        product.setProductCount(product.getProductCount() + order.getOrderAmount());
        customer.setCustomerWalletBalance(customer.getCustomerWalletBalance() + order.getOrderTotalPrice());
        customer.setCustomerWalletIntegral(customer.getCustomerWalletIntegral() - (int)(order.getOrderTotalPrice()/100));
        merchant.setMerchantTotalSaleAmount(merchant.getMerchantTotalSaleAmount() - order.getOrderTotalPrice());

        return_list.setReturnState("退货成功");
        sales_record.setSalesRecordIsReturn("yes");
        order.setOrderState("退货成功");

        returnListMapper.updateByPrimaryKey(return_list);
        sales_recordMapper.updateByPrimaryKey(sales_record);
        orderMapper.updateByPrimaryKey(order);
        productMapper.updateByPrimaryKey(product);
        customerMapper.updateByPrimaryKey(customer);
        merchantMapper.updateByPrimaryKey(merchant);

        resultMap.put("state", "Success");
        resultMap.put("info", "退货成功");

        return resultMap;
    }

    @Override
    public Object refuseReturnProduct(int saleRecord) {
        Map<Object, Object> resultMap = new HashMap<>();

        Return_List return_list = returnListMapper.selectByPrimaryKey(saleRecord);
        if(return_list == null || (!return_list.getReturnState().equals("退货中"))) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该退货申请不存在");
            return resultMap;
        }
        Sales_Record sales_record = sales_recordMapper.selectByPrimaryKey(saleRecord);
        Order order = orderMapper.selectByPrimaryKey(sales_record.getSalesOrder());

        return_list.setReturnState("商家未同意");
        order.setOrderState("交易成功");

        returnListMapper.updateByPrimaryKey(return_list);
//        sales_recordMapper.updateByPrimaryKey(sales_record);
        orderMapper.updateByPrimaryKey(order);

        resultMap.put("state", "Success");
        resultMap.put("info", "打回退货申请成功");

        return resultMap;
    }

    @Override
    public Object commentToCustomer(String merchantAccount, String customerAccount, int saleRecordId, String textInfo, double rate) {
        Map<Object, Object> resultMap = new HashMap<>();
        Sales_Record sales_record = sales_recordMapper.selectByPrimaryKey(saleRecordId);
        if(sales_record == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该订单不存在");
            return resultMap;
        }
        Comment_From_Merchant comment_from_merchant = new Comment_From_Merchant();
        comment_from_merchant.setMerchantAccount(merchantAccount);
        comment_from_merchant.setCustomerAccount(customerAccount);
        comment_from_merchant.setSaleRecordId(saleRecordId);
        comment_from_merchant.setTextInfo(textInfo);
        comment_from_merchant.setRate(rate);
        comment_from_merchant.setCommentDate(new Date(System.currentTimeMillis()));
        Product product = productMapper.selectByPrimaryKey(sales_record.getSalesRecordProduct());
        comment_from_merchant.setProductName(product.getProductName());
        comment_from_merchantMapper.insert(comment_from_merchant);
        resultMap.put("state", "Success");
        resultMap.put("info", "评价成功");
        return resultMap;
    }

    @Override
    public Object putCustomerToBlackList(String merchantAccount, String customerAccount, long days) {
        Map<Object, Object> resultMap = new HashMap<>();
        Map<Object, Object> map = new HashMap<>();
        map.put("blacklistFrom", merchantAccount);
        map.put("blacklistTo", customerAccount);
        Customer_BlackList customer_blackList = (Customer_BlackList) customer_blackListMapper.selectByFromTo(map);
        Date currDate = new Date(System.currentTimeMillis());
        Date endDate = new Date(currDate.getTime() + (1000 * 3600 * 24)*days);
        if(customer_blackList  == null) {
            customer_blackList = new Customer_BlackList();
            customer_blackList.setBlacklistFrom(merchantAccount);
            customer_blackList.setBlacklistTo(customerAccount);
            customer_blackList.setBlacklistType("merchant");
            customer_blackList.setBlacklistStartDate(currDate);
            customer_blackList.setBlacklistEndDate(endDate);
            customer_blackListMapper.insert(customer_blackList);
            resultMap.put("state", "Failed");
            resultMap.put("info", "拉黑成功");
            return resultMap;
        }

        customer_blackList.setBlacklistStartDate(currDate);
        customer_blackList.setBlacklistEndDate(endDate);
        customer_blackListMapper.updateByPrimaryKey(customer_blackList);

        resultMap.put("state", "Failed");
        resultMap.put("info", "拉黑成功");
        return resultMap;
    }

    @Override
    public Object queryBlackList(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("blacklistFrom", merchantAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", customer_blackListMapper.selectMyList(map));
        Long recordsCount = customer_blackListMapper.countByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object cancelBlackList(String merchantAccount, String customerAccount) {
        Map<Object, Object> resultMap = new HashMap<>();
        Map<Object, Object> map = new HashMap<>();
        map.put("blacklistFrom", merchantAccount);
        map.put("blacklistTo", customerAccount);
        Customer_BlackList customer_blackList = (Customer_BlackList) customer_blackListMapper.selectByFromTo(map);
        if(customer_blackList == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "拉黑记录不存在");
            return resultMap;
        }
        if(customer_blackList.getBlacklistType().equals("platform")) {
            customer_blackList.setBlacklistFrom(null);
            customer_blackListMapper.updateByPrimaryKey(customer_blackList);

        } else {
            customer_blackListMapper.deleteByPrimaryKey(customer_blackList.getBlacklistId());
        }
        resultMap.put("state", "Success");
        resultMap.put("info", "取消拉黑成功");
        return resultMap;
    }

    @Override
    public Object queryCommentFromCustomer(int currPage, int pageSize, String merchantAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("merchantAccount", merchantAccount);
        List<Sales_Record> returnList = sales_recordMapper.selectComment(map);
        if(returnList == null) {
            return null;
        }
        List<Object> resultList = new LinkedList<>();
        for(Sales_Record record : returnList) {
            Map<Object, Object> comment = new HashMap<>();
            comment.put("merchant", record.getSalesRecordMerchant());
            comment.put("customer", record.getSalesRecordCustomer());
            comment.put("saleRecordId", record.getSaleRecordId());
            comment.put("productName", productMapper.selectByPrimaryKey(record.getSalesRecordProduct()).getProductName());
            comment.put("与描述相符", record.getAsDescription());
            comment.put("响应速度", record.getResponseSpeed());
            comment.put("服务态度", record.getServeAttitude());
            comment.put("总体评价", record.getSalesRatingByCustomer());
            comment.put("文字评价", record.getCommentTextInfo());
            comment.put("图片内容", record.getCommentPicInfo());
            comment.put("date", record.getCommentDate());
            resultList.add(comment);
        }
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", resultList);
        Long recordsCount = sales_recordMapper.countByMerchantAccount(merchantAccount);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }
}
