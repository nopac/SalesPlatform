package com.example.springboot.service;

import com.example.springboot.model.Customer;
import com.example.springboot.model.Merchant;

import java.util.Map;

public interface RegisterService {
    void addCustomer(Customer customer);

    void addMerchant(Merchant merchant);

    Object getVerCode();

    Object customerRegister(String account, String userName, String password, String phone, String mail, String city, String sex, String bankAccount, String verCode);

    Object merchantRegister(String account, String userName, String password, String phone, String sex, String idCard, String license, String verCode);
}
