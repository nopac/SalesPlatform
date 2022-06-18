package com.example.springboot.model;

import java.util.Date;

public class Merchant_LimitList {
    private Integer limitlistRecordId;

    private String limitMerchant;

    private Date limitStartDate;

    private Date limitEndDate;

    private String limitType;

    public Integer getLimitlistRecordId() {
        return limitlistRecordId;
    }

    public void setLimitlistRecordId(Integer limitlistRecordId) {
        this.limitlistRecordId = limitlistRecordId;
    }

    public String getLimitMerchant() {
        return limitMerchant;
    }

    public void setLimitMerchant(String limitMerchant) {
        this.limitMerchant = limitMerchant == null ? null : limitMerchant.trim();
    }

    public Date getLimitStartDate() {
        return limitStartDate;
    }

    public void setLimitStartDate(Date limitStartDate) {
        this.limitStartDate = limitStartDate;
    }

    public Date getLimitEndDate() {
        return limitEndDate;
    }

    public void setLimitEndDate(Date limitEndDate) {
        this.limitEndDate = limitEndDate;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType == null ? null : limitType.trim();
    }
}