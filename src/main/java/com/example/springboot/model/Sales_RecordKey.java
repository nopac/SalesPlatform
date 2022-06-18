package com.example.springboot.model;

public class Sales_RecordKey {
    private Integer saleRecordId;

    private String salesRecordMerchant;

    private Integer salesRecordProduct;

    private String salesRecordCustomer;

    public Integer getSaleRecordId() {
        return saleRecordId;
    }

    public void setSaleRecordId(Integer saleRecordId) {
        this.saleRecordId = saleRecordId;
    }

    public String getSalesRecordMerchant() {
        return salesRecordMerchant;
    }

    public void setSalesRecordMerchant(String salesRecordMerchant) {
        this.salesRecordMerchant = salesRecordMerchant == null ? null : salesRecordMerchant.trim();
    }

    public Integer getSalesRecordProduct() {
        return salesRecordProduct;
    }

    public void setSalesRecordProduct(Integer salesRecordProduct) {
        this.salesRecordProduct = salesRecordProduct;
    }

    public String getSalesRecordCustomer() {
        return salesRecordCustomer;
    }

    public void setSalesRecordCustomer(String salesRecordCustomer) {
        this.salesRecordCustomer = salesRecordCustomer == null ? null : salesRecordCustomer.trim();
    }
}