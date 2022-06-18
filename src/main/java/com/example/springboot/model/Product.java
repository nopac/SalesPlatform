package com.example.springboot.model;

import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private Integer productCount;

    private Double productPrice;

    private Double productDiscountPrice;

    private String productCategory;

    private String productSize;

    private String productPictureDir;

    private String productNegotiable;

    private Double productConditionDegree;

    private String productOnSale;

    private String productDescription;

    private Date productAddDate;

    private Date productDeleteDate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductDiscountPrice() {
        return productDiscountPrice;
    }

    public void setProductDiscountPrice(Double productDiscountPrice) {
        this.productDiscountPrice = productDiscountPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize == null ? null : productSize.trim();
    }

    public String getProductPictureDir() {
        return productPictureDir;
    }

    public void setProductPictureDir(String productPictureDir) {
        this.productPictureDir = productPictureDir == null ? null : productPictureDir.trim();
    }

    public String getProductNegotiable() {
        return productNegotiable;
    }

    public void setProductNegotiable(String productNegotiable) {
        this.productNegotiable = productNegotiable == null ? null : productNegotiable.trim();
    }

    public Double getProductConditionDegree() {
        return productConditionDegree;
    }

    public void setProductConditionDegree(Double productConditionDegree) {
        this.productConditionDegree = productConditionDegree;
    }

    public String getProductOnSale() {
        return productOnSale;
    }

    public void setProductOnSale(String productOnSale) {
        this.productOnSale = productOnSale == null ? null : productOnSale.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public Date getProductAddDate() {
        return productAddDate;
    }

    public void setProductAddDate(Date productAddDate) {
        this.productAddDate = productAddDate;
    }

    public Date getProductDeleteDate() {
        return productDeleteDate;
    }

    public void setProductDeleteDate(Date productDeleteDate) {
        this.productDeleteDate = productDeleteDate;
    }
}