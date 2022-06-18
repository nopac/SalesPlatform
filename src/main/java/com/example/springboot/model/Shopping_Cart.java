package com.example.springboot.model;

import java.util.Date;

public class Shopping_Cart {
    private Integer shoppingCartId;

    private String shoppingCartCustomer;

    private String shoppingCartMerchant;

    private Integer shoppingCartProductId;

    private String shoppingCartProductName;

    private Integer shoppingCartCount;

    private Double shoppingCartUnitPrice;

    private Double shoppingCartTotalPrice;

    private Date shoppingCartAddDate;

    public Integer getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(Integer shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public String getShoppingCartCustomer() {
        return shoppingCartCustomer;
    }

    public void setShoppingCartCustomer(String shoppingCartCustomer) {
        this.shoppingCartCustomer = shoppingCartCustomer == null ? null : shoppingCartCustomer.trim();
    }

    public String getShoppingCartMerchant() {
        return shoppingCartMerchant;
    }

    public void setShoppingCartMerchant(String shoppingCartMerchant) {
        this.shoppingCartMerchant = shoppingCartMerchant == null ? null : shoppingCartMerchant.trim();
    }

    public Integer getShoppingCartProductId() {
        return shoppingCartProductId;
    }

    public void setShoppingCartProductId(Integer shoppingCartProductId) {
        this.shoppingCartProductId = shoppingCartProductId;
    }

    public String getShoppingCartProductName() {
        return shoppingCartProductName;
    }

    public void setShoppingCartProductName(String shoppingCartProductName) {
        this.shoppingCartProductName = shoppingCartProductName == null ? null : shoppingCartProductName.trim();
    }

    public Integer getShoppingCartCount() {
        return shoppingCartCount;
    }

    public void setShoppingCartCount(Integer shoppingCartCount) {
        this.shoppingCartCount = shoppingCartCount;
    }

    public Double getShoppingCartUnitPrice() {
        return shoppingCartUnitPrice;
    }

    public void setShoppingCartUnitPrice(Double shoppingCartUnitPrice) {
        this.shoppingCartUnitPrice = shoppingCartUnitPrice;
    }

    public Double getShoppingCartTotalPrice() {
        return shoppingCartTotalPrice;
    }

    public void setShoppingCartTotalPrice(Double shoppingCartTotalPrice) {
        this.shoppingCartTotalPrice = shoppingCartTotalPrice;
    }

    public Date getShoppingCartAddDate() {
        return shoppingCartAddDate;
    }

    public void setShoppingCartAddDate(Date shoppingCartAddDate) {
        this.shoppingCartAddDate = shoppingCartAddDate;
    }
}