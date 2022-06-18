package com.example.springboot.model;

import java.util.Date;

public class Recharge_Records {
    private Integer rechargeRecordId;

    private String rechargeCustomer;

    private Double rechargeAmount;

    private Date rechargeDate;

    public Integer getRechargeRecordId() {
        return rechargeRecordId;
    }

    public void setRechargeRecordId(Integer rechargeRecordId) {
        this.rechargeRecordId = rechargeRecordId;
    }

    public String getRechargeCustomer() {
        return rechargeCustomer;
    }

    public void setRechargeCustomer(String rechargeCustomer) {
        this.rechargeCustomer = rechargeCustomer == null ? null : rechargeCustomer.trim();
    }

    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }
}