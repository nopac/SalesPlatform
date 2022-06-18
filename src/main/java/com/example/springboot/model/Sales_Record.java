package com.example.springboot.model;

import java.util.Date;

public class Sales_Record {
    private Integer saleRecordId;

    private Integer salesOrder;

    private String salesRecordMerchant;

    private Integer salesRecordProduct;

    private String salesRecordCustomer;

    private Integer salesRecordSaleCount;

    private Double salesRecordMoneyAmount;

    private Double salesRecordServiceCharge;

    private Date salesRecordStartDate;

    private Date salesRecordPayDate;

    private Date salesRecordReceiveDate;

    private Date salesRecordConfirmDate;

    private Double salesRatingByMerchant;

    private Double salesRatingByCustomer;

    private String salesRecordIsReturn;

    private Double serveAttitude;

    private Double responseSpeed;

    private Double asDescription;

    private Date commentDate;

    private String commentTextInfo;

    private String commentPicInfo;

    private String commentAddtextInfo;

    public Integer getSaleRecordId() {
        return saleRecordId;
    }

    public void setSaleRecordId(Integer saleRecordId) {
        this.saleRecordId = saleRecordId;
    }

    public Integer getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(Integer salesOrder) {
        this.salesOrder = salesOrder;
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

    public Integer getSalesRecordSaleCount() {
        return salesRecordSaleCount;
    }

    public void setSalesRecordSaleCount(Integer salesRecordSaleCount) {
        this.salesRecordSaleCount = salesRecordSaleCount;
    }

    public Double getSalesRecordMoneyAmount() {
        return salesRecordMoneyAmount;
    }

    public void setSalesRecordMoneyAmount(Double salesRecordMoneyAmount) {
        this.salesRecordMoneyAmount = salesRecordMoneyAmount;
    }

    public Double getSalesRecordServiceCharge() {
        return salesRecordServiceCharge;
    }

    public void setSalesRecordServiceCharge(Double salesRecordServiceCharge) {
        this.salesRecordServiceCharge = salesRecordServiceCharge;
    }

    public Date getSalesRecordStartDate() {
        return salesRecordStartDate;
    }

    public void setSalesRecordStartDate(Date salesRecordStartDate) {
        this.salesRecordStartDate = salesRecordStartDate;
    }

    public Date getSalesRecordPayDate() {
        return salesRecordPayDate;
    }

    public void setSalesRecordPayDate(Date salesRecordPayDate) {
        this.salesRecordPayDate = salesRecordPayDate;
    }

    public Date getSalesRecordReceiveDate() {
        return salesRecordReceiveDate;
    }

    public void setSalesRecordReceiveDate(Date salesRecordReceiveDate) {
        this.salesRecordReceiveDate = salesRecordReceiveDate;
    }

    public Date getSalesRecordConfirmDate() {
        return salesRecordConfirmDate;
    }

    public void setSalesRecordConfirmDate(Date salesRecordConfirmDate) {
        this.salesRecordConfirmDate = salesRecordConfirmDate;
    }

    public Double getSalesRatingByMerchant() {
        return salesRatingByMerchant;
    }

    public void setSalesRatingByMerchant(Double salesRatingByMerchant) {
        this.salesRatingByMerchant = salesRatingByMerchant;
    }

    public Double getSalesRatingByCustomer() {
        return salesRatingByCustomer;
    }

    public void setSalesRatingByCustomer(Double salesRatingByCustomer) {
        this.salesRatingByCustomer = salesRatingByCustomer;
    }

    public String getSalesRecordIsReturn() {
        return salesRecordIsReturn;
    }

    public void setSalesRecordIsReturn(String salesRecordIsReturn) {
        this.salesRecordIsReturn = salesRecordIsReturn == null ? null : salesRecordIsReturn.trim();
    }

    public Double getServeAttitude() {
        return serveAttitude;
    }

    public void setServeAttitude(Double serveAttitude) {
        this.serveAttitude = serveAttitude;
    }

    public Double getResponseSpeed() {
        return responseSpeed;
    }

    public void setResponseSpeed(Double responseSpeed) {
        this.responseSpeed = responseSpeed;
    }

    public Double getAsDescription() {
        return asDescription;
    }

    public void setAsDescription(Double asDescription) {
        this.asDescription = asDescription;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTextInfo() {
        return commentTextInfo;
    }

    public void setCommentTextInfo(String commentTextInfo) {
        this.commentTextInfo = commentTextInfo == null ? null : commentTextInfo.trim();
    }

    public String getCommentPicInfo() {
        return commentPicInfo;
    }

    public void setCommentPicInfo(String commentPicInfo) {
        this.commentPicInfo = commentPicInfo == null ? null : commentPicInfo.trim();
    }

    public String getCommentAddtextInfo() {
        return commentAddtextInfo;
    }

    public void setCommentAddtextInfo(String commentAddtextInfo) {
        this.commentAddtextInfo = commentAddtextInfo == null ? null : commentAddtextInfo.trim();
    }
}