package com.example.springboot.model;

public class Store {
    private Integer storeId;

    private String storeMerchant;

    private Integer storeProduct;

    private String storeName;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreMerchant() {
        return storeMerchant;
    }

    public void setStoreMerchant(String storeMerchant) {
        this.storeMerchant = storeMerchant == null ? null : storeMerchant.trim();
    }

    public Integer getStoreProduct() {
        return storeProduct;
    }

    public void setStoreProduct(Integer storeProduct) {
        this.storeProduct = storeProduct;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }
}