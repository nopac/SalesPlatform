package com.example.springboot.controller;

import com.example.springboot.service.RegisterService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

/**
 * 注册业务控制层
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    /**
     * 获取验证码
     * @return
     * @throws IOException
     */
    @GetMapping(value = "getvercode")
    @ResponseBody
    public Object getVerCode() throws IOException {
        return registerService.getVerCode();
    }

    /**
     * 普通用户注册
     * @param account
     * @param userName
     * @param password
     * @return
     */
    @PostMapping(value = "/customer_register")
    @ResponseBody
    public Object customer_register_submit(@RequestParam("account") String account,
                                           @RequestParam("username") String userName,
                                           @RequestParam("password") String password,
                                           @RequestParam("phone") String phone,
                                           @RequestParam("mail") String mail,
                                           @RequestParam("city") String city,
                                           @RequestParam("sex") String sex,
                                           @RequestParam("bankaccount") String bankAccount,
                                           @RequestParam("vercode") String verCode) {
        return registerService.customerRegister(account, userName, password, phone, mail, city, sex, bankAccount, verCode);
    }


    /**
     * 商家注册
     * @param account
     * @param userName
     * @param password
     * @return
     */
    @PostMapping(value = "/merchant_register")
    @ResponseBody
    public Object merchant_register_submit(@RequestParam("account") String account,
                                           @RequestParam("username") String userName,
                                           @RequestParam("password") String password,
                                           @RequestParam("phone") String phone,
                                           @RequestParam("sex") String sex,
                                           @RequestParam("idcard") String idCard,
                                           @RequestParam("license") String license,
                                           @RequestParam("vercode") String verCode) {
        return registerService.merchantRegister(account, userName, password, phone, sex, idCard, license, verCode);
    }
}
