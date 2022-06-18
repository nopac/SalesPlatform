package com.example.springboot.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderCustomer;

    private String orderMerchant;

    private Integer orderProduct;

    private Double orderPrice;

    private Integer orderAmount;

    private Double orderTotalPrice;

    private String orderWay;

    private String orderState;

    private Date orderDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer == null ? null : orderCustomer.trim();
    }

    public String getOrderMerchant() {
        return orderMerchant;
    }

    public void setOrderMerchant(String orderMerchant) {
        this.orderMerchant = orderMerchant == null ? null : orderMerchant.trim();
    }

    public Integer getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(Integer orderProduct) {
        this.orderProduct = orderProduct;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(String orderWay) {
        this.orderWay = orderWay == null ? null : orderWay.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}