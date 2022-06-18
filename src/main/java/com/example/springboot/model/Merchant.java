package com.example.springboot.model;

import java.util.Date;

public class Merchant {
    private Integer merchantid;

    private String merchantAccount;

    private String merchantPassword;

    private String merchantPhone;

    private String merchantName;

    private String merchantSex;

    private String merchantIdcard;

    private String merchantIdcardDir;

    private String merchantLicenseDir;

    private Date merchantRegisterDate;

    private Double merchantServicePriceRate;

    private Double merchantSatisfactionDegree;

    private Double merchantTotalSaleAmount;

    private String merchantLicense;

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount == null ? null : merchantAccount.trim();
    }

    public String getMerchantPassword() {
        return merchantPassword;
    }

    public void setMerchantPassword(String merchantPassword) {
        this.merchantPassword = merchantPassword == null ? null : merchantPassword.trim();
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone == null ? null : merchantPhone.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantSex() {
        return merchantSex;
    }

    public void setMerchantSex(String merchantSex) {
        this.merchantSex = merchantSex == null ? null : merchantSex.trim();
    }

    public String getMerchantIdcard() {
        return merchantIdcard;
    }

    public void setMerchantIdcard(String merchantIdcard) {
        this.merchantIdcard = merchantIdcard == null ? null : merchantIdcard.trim();
    }

    public String getMerchantIdcardDir() {
        return merchantIdcardDir;
    }

    public void setMerchantIdcardDir(String merchantIdcardDir) {
        this.merchantIdcardDir = merchantIdcardDir == null ? null : merchantIdcardDir.trim();
    }

    public String getMerchantLicenseDir() {
        return merchantLicenseDir;
    }

    public void setMerchantLicenseDir(String merchantLicenseDir) {
        this.merchantLicenseDir = merchantLicenseDir == null ? null : merchantLicenseDir.trim();
    }

    public Date getMerchantRegisterDate() {
        return merchantRegisterDate;
    }

    public void setMerchantRegisterDate(Date merchantRegisterDate) {
        this.merchantRegisterDate = merchantRegisterDate;
    }

    public Double getMerchantServicePriceRate() {
        return merchantServicePriceRate;
    }

    public void setMerchantServicePriceRate(Double merchantServicePriceRate) {
        this.merchantServicePriceRate = merchantServicePriceRate;
    }

    public Double getMerchantSatisfactionDegree() {
        return merchantSatisfactionDegree;
    }

    public void setMerchantSatisfactionDegree(Double merchantSatisfactionDegree) {
        this.merchantSatisfactionDegree = merchantSatisfactionDegree;
    }

    public Double getMerchantTotalSaleAmount() {
        return merchantTotalSaleAmount;
    }

    public void setMerchantTotalSaleAmount(Double merchantTotalSaleAmount) {
        this.merchantTotalSaleAmount = merchantTotalSaleAmount;
    }

    public String getMerchantLicense() {
        return merchantLicense;
    }

    public void setMerchantLicense(String merchantLicense) {
        this.merchantLicense = merchantLicense == null ? null : merchantLicense.trim();
    }
}