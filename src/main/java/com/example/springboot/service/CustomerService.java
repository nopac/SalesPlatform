package com.example.springboot.service;

public interface CustomerService {
    Object updateUserNameByAccount(String account, String newName);
    Object updatePasswordByAccount(String account, String password);
    Object updateMailByAccount(String account, String mail);
    Object updatePhoneByAccount(String account, String phone);
    Object updateCityByAccount(String account, String city);
    Object updateHeadPicByAccount(String account, String headPic);
    Object rechargeByAccount(String account, double amount);
    Object selectRechargeRecord(int currPage, int pageSize, String customerAccount);
    Object selectCommentFromMerchant(int currPage, int pageSize, String customerAccount);
}
