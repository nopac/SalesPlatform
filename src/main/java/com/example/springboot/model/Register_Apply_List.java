package com.example.springboot.model;

import java.util.Date;

public class Register_Apply_List {
    private Integer registerlistId;

    private String registerType;

    private String registerAccount;

    private String registerName;

    private String registerSex;

    private String registerPhone;

    private String registerMail;

    private String registerPassword;

    private String registerCity;

    private String registerBankAccount;

    private String registerIdCard;

    private String registerLicense;

    private String registerLicenseDir;

    private String registerIdCardDir;

    private String registerStatment;

    private Date registerSubmitDate;

    private Date registerFinishDate;

    public Integer getRegisterlistId() {
        return registerlistId;
    }

    public void setRegisterlistId(Integer registerlistId) {
        this.registerlistId = registerlistId;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType == null ? null : registerType.trim();
    }

    public String getRegisterAccount() {
        return registerAccount;
    }

    public void setRegisterAccount(String registerAccount) {
        this.registerAccount = registerAccount == null ? null : registerAccount.trim();
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName == null ? null : registerName.trim();
    }

    public String getRegisterSex() {
        return registerSex;
    }

    public void setRegisterSex(String registerSex) {
        this.registerSex = registerSex == null ? null : registerSex.trim();
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone == null ? null : registerPhone.trim();
    }

    public String getRegisterMail() {
        return registerMail;
    }

    public void setRegisterMail(String registerMail) {
        this.registerMail = registerMail == null ? null : registerMail.trim();
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword == null ? null : registerPassword.trim();
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity == null ? null : registerCity.trim();
    }

    public String getRegisterBankAccount() {
        return registerBankAccount;
    }

    public void setRegisterBankAccount(String registerBankAccount) {
        this.registerBankAccount = registerBankAccount == null ? null : registerBankAccount.trim();
    }

    public String getRegisterIdCard() {
        return registerIdCard;
    }

    public void setRegisterIdCard(String registerIdCard) {
        this.registerIdCard = registerIdCard == null ? null : registerIdCard.trim();
    }

    public String getRegisterLicense() {
        return registerLicense;
    }

    public void setRegisterLicense(String registerLicense) {
        this.registerLicense = registerLicense == null ? null : registerLicense.trim();
    }

    public String getRegisterLicenseDir() {
        return registerLicenseDir;
    }

    public void setRegisterLicenseDir(String registerLicenseDir) {
        this.registerLicenseDir = registerLicenseDir == null ? null : registerLicenseDir.trim();
    }

    public String getRegisterIdCardDir() {
        return registerIdCardDir;
    }

    public void setRegisterIdCardDir(String registerIdCardDir) {
        this.registerIdCardDir = registerIdCardDir == null ? null : registerIdCardDir.trim();
    }

    public String getRegisterStatment() {
        return registerStatment;
    }

    public void setRegisterStatment(String registerStatment) {
        this.registerStatment = registerStatment == null ? null : registerStatment.trim();
    }

    public Date getRegisterSubmitDate() {
        return registerSubmitDate;
    }

    public void setRegisterSubmitDate(Date registerSubmitDate) {
        this.registerSubmitDate = registerSubmitDate;
    }

    public Date getRegisterFinishDate() {
        return registerFinishDate;
    }

    public void setRegisterFinishDate(Date registerFinishDate) {
        this.registerFinishDate = registerFinishDate;
    }
}