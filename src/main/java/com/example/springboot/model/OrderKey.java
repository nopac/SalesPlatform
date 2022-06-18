package com.example.springboot.model;

public class OrderKey {
    private String orderCustomer;

    private String orderMerchant;

    private Integer orderProduct;

    private Integer orderId;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}