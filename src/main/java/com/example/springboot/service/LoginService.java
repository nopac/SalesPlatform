package com.example.springboot.service;

import com.example.springboot.model.Customer;
import com.example.springboot.model.Manager;
import com.example.springboot.model.Merchant;

/**
 * 登陆服务接口
 */
public interface LoginService {

    Object login(String account, String password, String uesrType);
}
