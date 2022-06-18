package com.example.springboot.service.impl;

import com.example.springboot.mapper.Comment_From_MerchantMapper;
import com.example.springboot.mapper.CustomerMapper;
import com.example.springboot.mapper.Recharge_RecordsMapper;
import com.example.springboot.model.*;
import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    Recharge_RecordsMapper recharge_recordsMapper;

    @Autowired
    Comment_From_MerchantMapper comment_from_merchantMapper;


    @Override
    public Object updateUserNameByAccount(String account, String newName) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerName(newName);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object updatePasswordByAccount(String account, String password) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerPassword(password);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object updateMailByAccount(String account, String mail) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerMail(mail);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object updatePhoneByAccount(String account, String phone) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerPhone(phone);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object updateCityByAccount(String account, String city) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerCity(city);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object updateHeadPicByAccount(String account, String headPic) {
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerHeadPic(headPic);
        customerMapper.updateByPrimaryKey(customer);
        return "Success";
    }

    @Override
    public Object rechargeByAccount(String account, double amount) {
        Map<Object, Object> resultMap = new HashMap<>();
        if(amount <= 0) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "充值金额应大于0");
            return resultMap;
        }
        Recharge_Records recharge_records = new Recharge_Records();
        recharge_records.setRechargeCustomer(account);
        recharge_records.setRechargeAmount(amount);
        recharge_records.setRechargeDate(new Date(System.currentTimeMillis()));
        Customer customer = customerMapper.selectByAccount(account);
        customer.setCustomerWalletBalance((customer.getCustomerWalletBalance()==null ? 0 : customer.getCustomerWalletBalance()) + amount);
        customerMapper.updateByPrimaryKey(customer);
        recharge_recordsMapper.insert(recharge_records);
        resultMap.put("state", "Success");
        resultMap.put("info", "充值成功");
        return resultMap;
    }

    @Override
    public Object selectRechargeRecord(int currPage, int pageSize, String customerAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("customerAccount", customerAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", recharge_recordsMapper.selectByAccount(map));
        Long recordsCount = recharge_recordsMapper.countByCustomerAccount(customerAccount);
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", currPage);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object selectCommentFromMerchant(int currPage, int pageSize, String customerAccount) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        map.put("customerAccount", customerAccount);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", comment_from_merchantMapper.selectByAccount(map));
        int recordsCount = (int) comment_from_merchantMapper.countByCustomerAccount(customerAccount);
        int pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", currPage);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }
}
