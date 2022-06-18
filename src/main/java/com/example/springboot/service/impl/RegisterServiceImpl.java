package com.example.springboot.service.impl;

import com.example.springboot.mapper.CustomerMapper;
import com.example.springboot.mapper.MerchantMapper;
import com.example.springboot.mapper.Register_Apply_ListMapper;
import com.example.springboot.model.Customer;
import com.example.springboot.model.Merchant;
import com.example.springboot.model.Register_Apply_List;
import com.example.springboot.service.RegisterService;
import com.pig4cloud.captcha.SpecCaptcha;
import com.pig4cloud.captcha.base.Captcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    Register_Apply_ListMapper register_apply_listMapper;

    String verCode = "";

    @Override
    public Object getVerCode() {
        Map<String, String> resultMap = new HashMap<>();
        // 三个参数分别为宽、高、位数
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
        // 设置字体
        specCaptcha.setFont(new Font("Verdana", Font.PLAIN, 32));  // 有默认字体，可以不用设置
        // 设置类型，纯数字、纯字母、字母数字混合
        specCaptcha.setCharType(Captcha.TYPE_ONLY_NUMBER);

        this.verCode = specCaptcha.text().toLowerCase();
        resultMap.put("vercode", specCaptcha.text().toLowerCase());
        String base64Code = specCaptcha.toBase64().split(",")[1];
        resultMap.put("base64code", base64Code);
        resultMap.put("filetype", "png");

        //生成图片
        //        byte[] decode = Base64.getDecoder().decode(base64Code);
        //        ByteArrayInputStream bais = new ByteArrayInputStream(decode);
        //        BufferedImage bi1 = ImageIO.read(bais);
        //        try {
        //            File w2 = new File("./text.png");//可以是jpg,png,gif格式
        //            ImageIO.write(bi1, "jpg", w2);//不管输出什么格式图片，此处不需改动
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }finally{
        //            bais.close();
        //        }

        return resultMap;
    }

    @Override
    public Object customerRegister(String account, String userName, String password, String phone, String mail, String city, String sex, String bankAccount, String verCode) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("account", account);
        resultMap.put("username", userName);
        resultMap.put("password", password);
        resultMap.put("phone", phone);
        resultMap.put("mail", mail);
        resultMap.put("city", city);
        resultMap.put("sex", sex);
        resultMap.put("bankAccount", bankAccount);
        resultMap.put("vercode", verCode);
        if(customerMapper.selectByAccount(account) != null) {
            resultMap.put("info", "注册失败，账号已被使用！");
            return resultMap;
        }
        if(customerMapper.selectByMail(mail) != null) {
            resultMap.put("info", "注册失败，邮箱已被使用！");
            return resultMap;
        }
        if(customerMapper.selectByPhone(phone) != null) {
            resultMap.put("info", "注册失败，手机号已被使用！");
            return resultMap;
        }
        if(customerMapper.selectByBankAccount(bankAccount) != null) {
            resultMap.put("info", "注册失败，银行账户已被使用！");
            return resultMap;
        }
        if(verCode.equals("") || !verCode.equals(this.verCode)) {
            resultMap.put("info", "注册失败，验证码错误！");
            return resultMap;
        }
        Customer customer = new Customer();
        customer.setCustomerName(userName);
        customer.setCustomerAccount(account);
        customer.setCustomerPassword(password);
        customer.setCustomerPhone(phone);
        customer.setCustomerMail(mail);
        customer.setCustomerCity(city);
        customer.setCustomerSex(sex);
        customer.setCustomerBankAccount(bankAccount);
        customer.setCustomerDegree(4.0);
        this.addCustomer(customer);
        resultMap.put("info", "注册成功，请等待审核！");

        //注册成功重置验证码
        this.verCode = "";
        return resultMap;
    }

    @Override
    public void addCustomer(Customer customer) {
        Register_Apply_List register_apply_list = new Register_Apply_List();
        register_apply_list.setRegisterAccount(customer.getCustomerAccount());
        register_apply_list.setRegisterCity(customer.getCustomerCity());
        register_apply_list.setRegisterSex(customer.getCustomerSex());
        register_apply_list.setRegisterBankAccount(customer.getCustomerBankAccount());
        register_apply_list.setRegisterMail(customer.getCustomerMail());
        register_apply_list.setRegisterName(customer.getCustomerName());
        register_apply_list.setRegisterPassword(customer.getCustomerPassword());
        register_apply_list.setRegisterType("普通用户");
        register_apply_list.setRegisterSubmitDate(new Date(System.currentTimeMillis()));
        register_apply_list.setRegisterPhone(customer.getCustomerPhone());
        register_apply_list.setRegisterStatment("待审核");
        register_apply_listMapper.insert(register_apply_list);

    }


    @Override
    public void addMerchant(Merchant merchant) {
        Register_Apply_List register_apply_list = new Register_Apply_List();
        register_apply_list.setRegisterAccount(merchant.getMerchantAccount());
        register_apply_list.setRegisterSex(merchant.getMerchantSex());
        register_apply_list.setRegisterName(merchant.getMerchantName());
        register_apply_list.setRegisterPassword(merchant.getMerchantPassword());
        register_apply_list.setRegisterType("商家");
        register_apply_list.setRegisterSubmitDate(new Date(System.currentTimeMillis()));
        register_apply_list.setRegisterPhone(merchant.getMerchantPhone());
        register_apply_list.setRegisterStatment("待审核");
        register_apply_list.setRegisterIdCard(merchant.getMerchantIdcard());
        register_apply_list.setRegisterIdCardDir(merchant.getMerchantIdcardDir());
        register_apply_list.setRegisterLicense(merchant.getMerchantLicense());
        register_apply_list.setRegisterLicenseDir(merchant.getMerchantLicenseDir());
        register_apply_listMapper.insert(register_apply_list);
    }

    @Override
    public Object merchantRegister(String account, String userName, String password, String phone, String sex, String idCard, String license, String verCode) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("account", account);
        resultMap.put("username", userName);
        resultMap.put("password", password);
        resultMap.put("phone", phone);
        resultMap.put("sex", sex);
        resultMap.put("idcard", idCard);
        resultMap.put("license", license);
        resultMap.put("vercode", verCode);
        if(merchantMapper.selectByAccount(account) != null) {
            resultMap.put("info", "注册失败，账号已被使用！");
            return resultMap;
        }
        if(merchantMapper.selectByPhone(phone) != null) {
            resultMap.put("info", "注册失败，手机号已被使用！");
            return resultMap;
        }
        if(merchantMapper.selectByIdCard(idCard) != null) {
            resultMap.put("info", "注册失败，身份证号已被使用！");
            return resultMap;
        }
        if(merchantMapper.selectByLicense(license) != null) {
            resultMap.put("info", "注册失败，营业执照已被使用！");
            return resultMap;
        }
        if(verCode.equals("") || !verCode.equals(this.verCode)) {
            resultMap.put("info", "注册失败，验证码错误！");
            return resultMap;
        }
        Merchant merchant = new Merchant();
        merchant.setMerchantName(userName);
        merchant.setMerchantAccount(account);
        merchant.setMerchantPassword(password);
        merchant.setMerchantPhone(phone);
        merchant.setMerchantIdcard(idCard);
        merchant.setMerchantSex(sex);
        merchant.setMerchantLicense(license);
        merchant.setMerchantServicePriceRate(0.01);
        merchant.setMerchantSatisfactionDegree(4.0);
        merchant.setMerchantTotalSaleAmount(0.0);
        this.addMerchant(merchant);
        resultMap.put("info", "注册成功，请等待审核！");

        //注册成功重置验证码
        this.verCode = "";
        return resultMap;
    }
}
