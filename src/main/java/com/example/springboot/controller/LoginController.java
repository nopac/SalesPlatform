package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * 登录业务控制层
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 进入登陆首页
     * @param request
     * @param model
     * @return
     */
    @GetMapping(value = "/")
    public String login(HttpServletRequest request, Model model) {
        return "index";
    }

    /**
     * 登陆验证
     * @param account
     * @param password
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestParam("account") String account,
                        @RequestParam("password") String password,
                        @RequestParam("usertype") String userType) {
        return loginService.login(account, password, userType);
    }

}
