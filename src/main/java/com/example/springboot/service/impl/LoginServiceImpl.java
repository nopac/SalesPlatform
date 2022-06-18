package com.example.springboot.service.impl;

import com.example.springboot.mapper.*;
import com.example.springboot.model.*;
import com.example.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆服务接口实现
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    ManagerMapper managerMapper;

    @Autowired
    Merchant_LimitListMapper merchant_limitListMapper;

    @Autowired
    Customer_BlackListMapper customer_blackListMapper;

    @Override
    public Object login(String account, String password, String userType) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("account", account);
        resultMap.put("password", password);
        switch (userType) {
            case "customer":
                Customer customer = customerMapper.selectByAccount(account);
                if (customer != null && customer.getCustomerPassword().equals(password)) {
                    resultMap.put("userType", "customer");
                    resultMap.put("currentUser", customer);
                    resultMap.put("info", "登录成功！");
                    return resultMap;
                }
                break;
            case "merchant":
                Merchant merchant = merchantMapper.selectByAccount(account);
                if (merchant != null && merchant.getMerchantPassword().equals(password)) {
                    Merchant_LimitList merchant_limitList = (Merchant_LimitList) merchant_limitListMapper.selectByMerchantAccount(account);
                    if(merchant_limitList != null) {
                        int i = merchant_limitList.getLimitEndDate().compareTo(new Date(System.currentTimeMillis()));
                        if(i > 0) {
                            resultMap.put("userType", "merchant");
                            resultMap.put("currentUser", merchant);
                            resultMap.put("info", "你已被平台封禁！");
                            return resultMap;
                        }

                    }

                    resultMap.put("userType", "merchant");
                    resultMap.put("currentUser", merchant);
                    resultMap.put("info", "登录成功！");
                    return resultMap;
                }
                break;
            case "manager":
                Manager manager = managerMapper.selectByAccount(account);
                if (manager != null && manager.getManagerPassword().equals(password)) {
                    //                    request.getSession().setAttribute("userType", "manager");
                    //                    request.getSession().setAttribute("currentUser", manager);
                    resultMap.put("userType", "manager");
                    resultMap.put("currentUser", manager);
                    resultMap.put("info", "登录成功！");
                    return resultMap;
                }
                break;
        }

        resultMap.put("userType", null);
        resultMap.put("currentUser", null);
        resultMap.put("info", "账号或密码错误！");
        return resultMap;
    }
}
