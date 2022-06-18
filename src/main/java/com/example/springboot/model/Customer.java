package com.example.springboot.model;

import java.util.Date;

public class Customer {
    private Integer customerId;

    private String customerAccount;

    private String customerPassword;

    private String customerName;

    private String customerSex;

    private String customerPhone;

    private String customerMail;

    private String customerCity;

    private String customerBankAccount;

    private Date customerRegisterDate;

    private Double customerDegree;

    private Double customerWalletBalance;

    private Integer customerWalletIntegral;

    private String customerHeadPic;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerHeadPic() {
        return customerHeadPic;
    }

    public void setCustomerHeadPic(String customerHeadPic) {
        this.customerHeadPic = customerHeadPic == null ? null : customerHeadPic.trim();
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount == null ? null : customerAccount.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail == null ? null : customerMail.trim();
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity == null ? null : customerCity.trim();
    }

    public String getCustomerBankAccount() {
        return customerBankAccount;
    }

    public void setCustomerBankAccount(String customerBankAccount) {
        this.customerBankAccount = customerBankAccount == null ? null : customerBankAccount.trim();
    }

    public Date getCustomerRegisterDate() {
        return customerRegisterDate;
    }

    public void setCustomerRegisterDate(Date customerRegisterDate) {
        this.customerRegisterDate = customerRegisterDate;
    }

    public Double getCustomerDegree() {
        return customerDegree;
    }

    public void setCustomerDegree(Double customerDegree) {
        this.customerDegree = customerDegree;
    }

    public Double getCustomerWalletBalance() {
        return customerWalletBalance;
    }

    public void setCustomerWalletBalance(Double customerWalletBalance) {
        this.customerWalletBalance = customerWalletBalance;
    }

    public Integer getCustomerWalletIntegral() {
        return customerWalletIntegral;
    }

    public void setCustomerWalletIntegral(Integer customerWalletIntegral) {
        this.customerWalletIntegral = customerWalletIntegral;
    }
}