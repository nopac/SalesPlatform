package com.example.springboot.controller;


import com.example.springboot.service.ManageService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 管理员控制类
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class ManagerController {

    @Autowired
    ManageService manageService;

    /**
     * 管理员查看上架申请
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/putaway/all")
    @ResponseBody
    public Object queryPutawayList(@RequestParam("currPage") Integer currPage,
                                    @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryPutawayList(currPage, pageSize);
    }

    /**
     * 管理员同意上架申请
     * @param putawayId
     * @return
     */
    @PostMapping(value = "/manage/putaway/check")
    @ResponseBody
    public Object checkPutawayList(@RequestParam("putawayId") Integer putawayId) {
        return manageService.checkPutawayList(putawayId);
    }

    /**
     * 管理员打回上架申请并附上原因
     * @param putawayId
     * @param reason
     * @return
     */
    @PostMapping(value = "/manage/putaway/deny")
    @ResponseBody
    public Object denyPutawayList(@RequestParam("putawayId") Integer putawayId,
                                   @RequestParam("reason") String reason) {
        return manageService.denyPutawayList(putawayId, reason);
    }

    /**
     * 管理员查看用户注册列表
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/register/all")
    @ResponseBody
    public Object queryRegisterApply(@RequestParam("currPage") Integer currPage,
                                  @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryCustomerRegister(currPage, pageSize);
    }

    /**
     * 同意用户注册
     * @param registerId
     * @return
     */
    @PostMapping(value = "/manage/register/check")
    @ResponseBody
    public Object checkRegisterApply(@RequestParam("registerId") Integer registerId) {
        return manageService.checkCustomerRegister(registerId);
    }

    /**
     * 拒绝用户注册
     * @param registerId
     * @param reason
     * @return
     */
    @PostMapping(value = "/manage/register/deny")
    @ResponseBody
    public Object denyRegisterApply(@RequestParam("registerId") Integer registerId,
                                    @RequestParam("reason") String reason) {
        return manageService.denyCustomerRegister(registerId, reason);
    }

    /**
     * 查询未审核的注册申请
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/register/uncheck")
    @ResponseBody
    public Object queryUnckeckRegister(@RequestParam("currPage") Integer currPage,
                                    @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryUncheckList(currPage, pageSize);
    }

    /**
     * 查询所有普通用户
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/query/customer")
    @ResponseBody
    public Object queryCustomer(@RequestParam("currPage") Integer currPage,
                                  @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryCustomer(currPage, pageSize);
    }

    /**
     * 管理员拉黑普通用户
     * @param customerAccount
     * @param days
     * @return
     */
    @PostMapping(value = "/manage/disable/customer")
    @ResponseBody
    public Object disableCustomer(@RequestParam("customerAccount") String customerAccount,
                                       @RequestParam("days") Integer days) {
        return manageService.disableCustomer(customerAccount, days);
    }

    /**
     * 查询所有商家
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/query/merchant")
    @ResponseBody
    public Object queryMerchant(@RequestParam("currPage") Integer currPage,
                                @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryMerchant(currPage, pageSize);
    }

    /**
     * 拉黑商家
     * @param merchantAccount
     * @param days
     * @return
     */
    @PostMapping(value = "/manage/disable/merchant")
    @ResponseBody
    public Object disableMerchant(@RequestParam("merchantAccount") String merchantAccount,
                                  @RequestParam("days") Integer days) {
        return manageService.disableMerchant(merchantAccount, days);
    }

    /**
     * 更新商家等级
     * @param merchantAccount
     * @param level
     * @return
     */
    @PostMapping(value = "/manage/update/pricerate")
    @ResponseBody
    public Object updatePriceRate(@RequestParam("merchantAccount") String merchantAccount,
                                  @RequestParam("level") Integer level) {
        return manageService.updateMerchantLevel(merchantAccount, level);
    }

    /**
     * 查询拉黑用户名单
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/blacklist/customer")
    @ResponseBody
    public Object queryCustomerBlackList(@RequestParam("currPage") Integer currPage,
                                         @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryCustomerBlackList(currPage, pageSize);
    }

    /**
     * 查询拉黑商家名单
     * @param currPage
     * @param pageSize
     * @return
     */
    @PostMapping(value = "/manage/blacklist/merchant")
    @ResponseBody
    public Object queryMerchantBlackList(@RequestParam("currPage") Integer currPage,
                                         @RequestParam("pageSize") Integer pageSize) {
        return manageService.queryMerchantBlackList(currPage, pageSize);
    }

    /**
     * 移除普通用户黑名单
     * @param blacklistId
     * @return
     */
    @PostMapping(value = "/manage/blacklist/remove/customer")
    @ResponseBody
    public Object removeCustomerFromBlackList(@RequestParam("customerBlacklistId") Integer blacklistId) {
        return manageService.removeCustomerFromBlackList(blacklistId);
    }

    /**
     * 移除商家黑名单
     * @param blacklistId
     * @return
     */
    @PostMapping(value = "/manage/blacklist/remove/merchant")
    @ResponseBody
    public Object removeMerchantFromBlackList(@RequestParam("merchantBlacklistId") Integer blacklistId) {
        return manageService.removeMerchantFromBlackList(blacklistId);
    }

    /**
     * 查询平台总销售额
     * @return
     */
    @PostMapping(value = "/manage/query/totalamount")
    @ResponseBody
    public Object queryTotalSaleAmount() {
        return manageService.queryTotalAmount();
    }

    /**
     * 查询平台总服务费
     * @return
     */
    @PostMapping(value = "/manage/query/totalcharge")
    @ResponseBody
    public Object queryTotalServiceCharge() {
        return manageService.queryTotalServiceCharge();
    }


}
