package com.example.springboot.model;

import java.util.Date;

public class Return_List {
    private Integer saleRecord;

    private String returnCustomer;

    private String returnMerchant;

    private Integer returnProduct;

    private Integer returnAmount;

    private Double returnMoney;

    private Date returnDate;

    private String returnState;

    public Integer getSaleRecord() {
        return saleRecord;
    }

    public void setSaleRecord(Integer saleRecord) {
        this.saleRecord = saleRecord;
    }

    public String getReturnCustomer() {
        return returnCustomer;
    }

    public void setReturnCustomer(String returnCustomer) {
        this.returnCustomer = returnCustomer == null ? null : returnCustomer.trim();
    }

    public String getReturnMerchant() {
        return returnMerchant;
    }

    public void setReturnMerchant(String returnMerchant) {
        this.returnMerchant = returnMerchant == null ? null : returnMerchant.trim();
    }

    public Integer getReturnProduct() {
        return returnProduct;
    }

    public void setReturnProduct(Integer returnProduct) {
        this.returnProduct = returnProduct;
    }

    public Integer getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(Integer returnAmount) {
        this.returnAmount = returnAmount;
    }

    public Double getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(Double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnState() {
        return returnState;
    }

    public void setReturnState(String returnState) {
        this.returnState = returnState == null ? null : returnState.trim();
    }
}