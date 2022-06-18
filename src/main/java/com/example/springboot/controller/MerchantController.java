package com.example.springboot.controller;

import com.example.springboot.service.MerchantService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商家操作控制类
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class MerchantController {
    @Autowired
    MerchantService merchantService;

    /**
     * 商家提交上架商品申请
     * @param merchantAccount
     * @param productName
     * @param count
     * @param price
     * @param discountprice
     * @param size
     * @param picInfo
     * @param negotiable
     * @param condition
     * @param describeInfo
     * @return
     */
    @PostMapping(value = "/merchant/putaway")
    @ResponseBody
    public Object putawayProduct(@RequestParam("merchantAccount") String merchantAccount,
                                 @RequestParam("catagory") String catagory,
                                 @RequestParam("productName") String productName,
                                 @RequestParam("count") int count,
                                 @RequestParam("price") double price,
                                 @RequestParam("discountprice") double discountprice,
                                 @RequestParam("size") String size,
                                 @RequestParam("picInfo") String picInfo,
                                 @RequestParam("negotiable") String negotiable,
                                 @RequestParam("condition") double condition,
                                 @RequestParam("describeInfo") String describeInfo) {
        return merchantService.putOnObject(merchantAccount, catagory, productName, count, price, discountprice, size, picInfo, negotiable, condition, describeInfo);
    }

    /**
     * 商家查询自己的个人信息
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/selectself")
    @ResponseBody
    public Object selectMySelf(@RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryMySelf(merchantAccount);
    }

    /**
     * 商家查询自己店铺中的商品
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/selectmyproduct")
    @ResponseBody
    public Object selectMyProduct(@RequestParam("currPage") int currPage,
                                  @RequestParam("pageSize") int pageSize,
                                  @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryProductInStore(currPage, pageSize, merchantAccount);
    }

    /**
     * 商家查询已完成订单
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/order/finished")
    @ResponseBody
    public Object selectFinishedOrder(@RequestParam("currPage") int currPage,
                                        @RequestParam("pageSize") int pageSize,
                                        @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryOrderFinished(currPage, pageSize, merchantAccount);
    }

    /**
     * 商家查询未完成订单
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/order/unfinished")
    @ResponseBody
    public Object selectUnfinishedOrder(@RequestParam("currPage") int currPage,
                                      @RequestParam("pageSize") int pageSize,
                                      @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryOrderUnfinished(currPage, pageSize, merchantAccount);
    }

    /**
     * 商家发货
     * @param orderId
     * @return
     */
    @PostMapping(value = "/merchant/dispatch")
    @ResponseBody
    public Object dispatch(@RequestParam("orderId") int orderId) {
        return merchantService.dispatch(orderId);
    }

    /**
     * 商家根据商品id下架商品
     * @param productId
     * @return
     */
    @PostMapping(value = "/merchant/product/takeoff")
    @ResponseBody
    public Object takeProductOff(@RequestParam("productId") int productId) {
        return merchantService.takeProductOff(productId);
    }

    /**
     * 商家根据商品id上架商品
     * @param productId
     * @return
     */
    @PostMapping(value = "/merchant/product/takeon")
    @ResponseBody
    public Object takeProductOn(@RequestParam("productId") int productId) {
        return merchantService.takeProductOn(productId);
    }

    /**
     * 商家查看退货申请列表
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/product/return")
    @ResponseBody
    public Object takeProductOn(@RequestParam("currPage") int currPage,
                                @RequestParam("pageSize") int pageSize,
                                @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryReturnList(currPage, pageSize, merchantAccount);
    }

    /**
     * 商家根据销售记录id同意退货
     * @param saleRecordId
     * @return
     */
    @PostMapping(value = "/merchant/product/confirmreturn")
    @ResponseBody
    public Object confirmReturn(@RequestParam("saleRecordId") int saleRecordId) {
        return merchantService.confirmReturnProduct(saleRecordId);
    }

    /**
     * 商家根据销售记录id拒绝退货
     * @param saleRecordId
     * @return
     */
    @PostMapping(value = "/merchant/product/refusereturn")
    @ResponseBody
    public Object refuseReturn(@RequestParam("saleRecordId") int saleRecordId) {
        return merchantService.refuseReturnProduct(saleRecordId);
    }

    /**
     * 商家提交对用户的评价
     * @param merchantAccount
     * @param customerAccount
     * @param saleRecordId
     * @param textInfo
     * @param rate
     * @return
     */
    @PostMapping(value = "/merchant/comment")
    @ResponseBody
    public Object refuseReturn(@RequestParam("merchantAccount") String merchantAccount,
                               @RequestParam("customerAccount") String customerAccount,
                               @RequestParam("saleRecordId") int saleRecordId,
                               @RequestParam("textInfo") String textInfo,
                               @RequestParam("rate") double rate) {
        return merchantService.commentToCustomer(merchantAccount, customerAccount, saleRecordId, textInfo, rate);
    }

    /**
     * 商家拉黑用户
     * @param merchantAccount
     * @param customerAccount
     * @param days
     * @return
     */
    @PostMapping(value = "/merchant/addblacklist")
    @ResponseBody
    public Object putCustomerToBlackList(@RequestParam("merchantAccount") String merchantAccount,
                               @RequestParam("customerAccount") String customerAccount,
                               @RequestParam("days") long days) {
        return merchantService.putCustomerToBlackList(merchantAccount, customerAccount, days);
    }

    /**
     * 商家查看被自己拉黑的用户名单
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/blacklist")
    @ResponseBody
    public Object putCustomerToBlackList(@RequestParam("currPage") int currPage,
                                         @RequestParam("pageSize") int pageSize,
                                         @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryBlackList(currPage, pageSize, merchantAccount);
    }

    /**
     * 用户取消拉黑
     * @param merchantAccount
     * @param customerAccount
     * @return
     */
    @PostMapping(value = "/merchant/cancelblacklist")
    @ResponseBody
    public Object cancelBlackList(@RequestParam("merchantAccount") String merchantAccount,
                                  @RequestParam("customerAccount") String customerAccount) {
        return merchantService.cancelBlackList(merchantAccount, customerAccount);
    }

    /**
     * 商家查看用户对自己的评价
     * @param currPage
     * @param pageSize
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/merchant/selectcomment")
    @ResponseBody
    public Object cancelBlackList(@RequestParam("currPage") int currPage,
                                  @RequestParam("pageSize") int pageSize,
                                  @RequestParam("merchantAccount") String merchantAccount) {
        return merchantService.queryCommentFromCustomer(currPage, pageSize, merchantAccount);
    }


}
