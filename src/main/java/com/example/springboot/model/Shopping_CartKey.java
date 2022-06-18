package com.example.springboot.model;

public class Shopping_CartKey {
    private String shoppingCartCustomer;

    private Integer shoppingCartProduct;

    private String shoppingCartMerchant;

    public String getShoppingCartCustomer() {
        return shoppingCartCustomer;
    }

    public void setShoppingCartCustomer(String shoppingCartCustomer) {
        this.shoppingCartCustomer = shoppingCartCustomer == null ? null : shoppingCartCustomer.trim();
    }

    public Integer getShoppingCartProduct() {
        return shoppingCartProduct;
    }

    public void setShoppingCartProduct(Integer shoppingCartProduct) {
        this.shoppingCartProduct = shoppingCartProduct;
    }

    public String getShoppingCartMerchant() {
        return shoppingCartMerchant;
    }

    public void setShoppingCartMerchant(String shoppingCartMerchant) {
        this.shoppingCartMerchant = shoppingCartMerchant == null ? null : shoppingCartMerchant.trim();
    }
}