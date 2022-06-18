package com.example.springboot.controller;


import com.example.springboot.mapper.OrderMapper;
import com.example.springboot.service.CustomerService;
import com.example.springboot.service.PurchaseService;
import com.example.springboot.service.SaleRecordService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 普通用户操作
 */

@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class CustomerController {

    @Autowired
    SaleRecordService saleRecordService;

    @Autowired
    PurchaseService purchaseService;

    @Autowired
    CustomerService customerService;

    /**
     * 按用户账号查询购买记录
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/salerecord/customer")
    @ResponseBody
    public Object selectSaleRecordByCustomerAccount(@RequestParam("customerAccount") String customerAccount){
        return saleRecordService.selectSaleRecordByCustomerAccount(customerAccount);
    }

    /**
     * 用户下单
     * @param customerAccount
     * @param merchantAccount
     * @param productId
     * @return
     */
    @PostMapping(value = "/order")
    @ResponseBody
    public Object order(@RequestParam("customerAccount") String customerAccount,
                           @RequestParam("merchantAccount") String merchantAccount,
                           @RequestParam("productId") Integer productId,
                           @RequestParam("price") Double price,
                           @RequestParam("amount") Integer amount,
                        @RequestParam("orderWay") String orderWay) {
        return purchaseService.order(customerAccount, merchantAccount, productId, price, amount, orderWay);
    }

    /**
     * 根据用户账号分页查询用户自己的订单
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/selectorder")
    @ResponseBody
    public Object selectOrder(@RequestParam("currPage") Integer currPage,
                              @RequestParam("pageSize") Integer pageSize,
                              @RequestParam("customerAccount") String customerAccount) {
        return purchaseService.selectOrder(currPage, pageSize, customerAccount);
    }

    /**
     * 根据订单id取消订单
     * @param orderId
     * @return
     */
    @PostMapping(value = "/cancelorder")
    @ResponseBody
    public Object cancelOrder(@RequestParam("orderId") Integer orderId) {
        return purchaseService.cancelOrder(orderId);
    }

    /**
     * 支付
     * @param orderId
     * @param useIntegral
     * @param password
     * @return
     */
    @PostMapping(value = "/pay")
    @ResponseBody
    public Object pay(@RequestParam("orderId") Integer orderId,
                      @RequestParam("useIntegral") int useIntegral,
                      @RequestParam("password") String password) {
        return purchaseService.pay(orderId, useIntegral, password);
    }

    /**
     * 确认收货
     * @param orderId
     * @param password
     * @return
     */
    @PostMapping(value = "/confirm")
    @ResponseBody
    public Object confirmReceipt(@RequestParam("orderId") Integer orderId,
                                 @RequestParam("password") String password) {
        return purchaseService.confirmReceipt(orderId, password);
    }

    /**
     * 用户提交评价,包括文字信息，图片转码，评分
     * @param orderId
     * @param textInfo
     * @param picInfo
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/comment")
    @ResponseBody
    public Object comment(@RequestParam("orderId") Integer orderId,
                          @RequestParam("asDescription") double asDescription,
                          @RequestParam("responseSpeed") double responseSpeed,
                          @RequestParam("serveAttitude") double serveAttitude,
                          @RequestParam("textInfo") String textInfo,
                          @RequestParam("picInfo") String picInfo) {
        return purchaseService.commit(orderId, asDescription, responseSpeed, serveAttitude, textInfo, picInfo);
    }

    /**
     * 申请退货处理
     * @param orderId
     * @return
     */
    @PostMapping(value = "/return")
    @ResponseBody
    public Object return_goods(@RequestParam("orderId") Integer orderId) {
        return purchaseService.returnGoods(orderId);
    }

    /**
     * 将商品加入购物车
     * @param customerAccount
     * @param productId
     * @param amount
     * @return
     */
    @PostMapping(value = "/joincart")
    @ResponseBody
    public Object join_cart(@RequestParam("customerAccount") String customerAccount,
                            @RequestParam("productId") int productId,
                            @RequestParam("amount") int amount) {
        return purchaseService.joinCart(customerAccount, productId, amount);
    }

    /**
     * 将商品移除购物车
     * @param cartId
     * @return
     */
    @PostMapping(value = "/removecart")
    @ResponseBody
    public Object remove_cart(@RequestParam("cartId") int cartId) {
        return purchaseService.removeCart(cartId);
    }

    /**
     * 查看购物车的内容
     * @param currPage
     * @param pageSize
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/selectcart")
    @ResponseBody
    public Object selectCart(@RequestParam("currPage") int currPage,
                             @RequestParam("pageSize") int pageSize,
                             @RequestParam("customerAccount") String customerAccount) {
        return purchaseService.selectCart(currPage, pageSize, customerAccount);
    }

    /**
     * 普通用户更新用户名
     * @param account
     * @param userName
     * @return
     */
    @PostMapping(value = "/customer/update/name")
    @ResponseBody
    public Object updateCustomerNameByAccount(@RequestParam("account") String account,
                                              @RequestParam("username") String userName) {
        return customerService.updateUserNameByAccount(account, userName);
    }

    /**
     * 普通用户更新用户密码
     * @param account
     * @param passowrd
     * @return
     */
    @PostMapping(value = "/customer/update/password")
    @ResponseBody
    public Object updateCustomerPasswordByAccount(@RequestParam("account") String account,
                                                  @RequestParam("password") String passowrd) {
        return customerService.updatePasswordByAccount(account, passowrd);
    }

    /**
     * 普通用户更新用户邮箱
     * @param account
     * @param mail
     * @return
     */
    @PostMapping(value = "/customer/update/mail")
    @ResponseBody
    public Object updateCustomerMailByAccount(@RequestParam("account") String account,
                                              @RequestParam("mail") String mail) {
        return customerService.updateMailByAccount(account, mail);
    }

    /**
     * 普通用户更新用户手机
     * @param account
     * @param phone
     * @return
     */
    @PostMapping(value = "/customer/update/phone")
    @ResponseBody
    public Object updateCustomerPhoneByAccount(@RequestParam("account") String account,
                                               @RequestParam("phone") String phone) {
        return customerService.updatePhoneByAccount(account, phone);
    }

    /**
     * 普通用户更新用户城市
     * @param account
     * @param city
     * @return
     */
    @PostMapping(value = "/customer/update/city")
    @ResponseBody
    public Object updateCustomerCityByAccount(@RequestParam("account") String account,
                                              @RequestParam("city") String city) {
        return customerService.updateCityByAccount(account, city);
    }

    /**
     * 普通用户更新用户头像
     * @param account
     * @param headpic
     * @return
     */
    @PostMapping(value = "/customer/update/headpic")
    @ResponseBody
    public Object updateCustomerHeadPicByAccount(@RequestParam("account") String account,
                                                 @RequestParam("headpic") String headpic) {
        return customerService.updateHeadPicByAccount(account, headpic);
    }

    /**
     * 通过用户账号充值
     * @param customerAccount
     * @param amount
     * @return
     */
    @PostMapping(value = "/recharge")
    @ResponseBody
    public Object recharge(@RequestParam("customerAccount") String customerAccount,
                           @RequestParam("amount") double amount) {
        return customerService.rechargeByAccount(customerAccount, amount);
    }

    /**
     * 通过用户账号查看充值记录
     * @param currPage
     * @param pageSize
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/selectrecharge")
    @ResponseBody
    public Object recharge(@RequestParam("currPage") int currPage,
                           @RequestParam("pageSize") int pageSize,
                           @RequestParam("customerAccount") String customerAccount) {
        return customerService.selectRechargeRecord(currPage, pageSize, customerAccount);
    }

    /**
     * 根据用户账号查看商家的评价
     * @param currPage
     * @param pageSize
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/selectcomment")
    @ResponseBody
    public Object selectCommentFromMerchant(@RequestParam("currPage") int currPage,
                           @RequestParam("pageSize") int pageSize,
                           @RequestParam("customerAccount") String customerAccount) {
        return customerService.selectCommentFromMerchant(currPage, pageSize, customerAccount);
    }

}
