package com.example.springboot.model;

import java.util.Date;

public class Putaway_Apply_List {
    private Integer putawayId;

    private String putawayMerchant;

    private String putawayName;

    private Integer putawayCount;

    private Double putawayPrice;

    private Double putawayDiscountPrice;

    private String putawayCatagory;

    private String putawaySize;

    private String putawayPictureDir;

    private String putawayNegotiable;

    private Double putawayConditionDegree;

    private String putawayDescription;

    private String putawayStatment;

    private Date putawaySubmitDate;

    private Date putawayFinishDate;

    public Integer getPutawayId() {
        return putawayId;
    }

    public void setPutawayId(Integer putawayId) {
        this.putawayId = putawayId;
    }

    public String getPutawayMerchant() {
        return putawayMerchant;
    }

    public void setPutawayMerchant(String putawayMerchant) {
        this.putawayMerchant = putawayMerchant == null ? null : putawayMerchant.trim();
    }

    public String getPutawayName() {
        return putawayName;
    }

    public void setPutawayName(String putawayName) {
        this.putawayName = putawayName == null ? null : putawayName.trim();
    }

    public Integer getPutawayCount() {
        return putawayCount;
    }

    public void setPutawayCount(Integer putawayCount) {
        this.putawayCount = putawayCount;
    }

    public Double getPutawayPrice() {
        return putawayPrice;
    }

    public void setPutawayPrice(Double putawayPrice) {
        this.putawayPrice = putawayPrice;
    }

    public Double getPutawayDiscountPrice() {
        return putawayDiscountPrice;
    }

    public void setPutawayDiscountPrice(Double putawayDiscountPrice) {
        this.putawayDiscountPrice = putawayDiscountPrice;
    }

    public String getPutawayCatagory() {
        return putawayCatagory;
    }

    public void setPutawayCatagory(String putawayCatagory) {
        this.putawayCatagory = putawayCatagory == null ? null : putawayCatagory.trim();
    }

    public String getPutawaySize() {
        return putawaySize;
    }

    public void setPutawaySize(String putawaySize) {
        this.putawaySize = putawaySize == null ? null : putawaySize.trim();
    }

    public String getPutawayPictureDir() {
        return putawayPictureDir;
    }

    public void setPutawayPictureDir(String putawayPictureDir) {
        this.putawayPictureDir = putawayPictureDir == null ? null : putawayPictureDir.trim();
    }

    public String getPutawayNegotiable() {
        return putawayNegotiable;
    }

    public void setPutawayNegotiable(String putawayNegotiable) {
        this.putawayNegotiable = putawayNegotiable == null ? null : putawayNegotiable.trim();
    }

    public Double getPutawayConditionDegree() {
        return putawayConditionDegree;
    }

    public void setPutawayConditionDegree(Double putawayConditionDegree) {
        this.putawayConditionDegree = putawayConditionDegree;
    }

    public String getPutawayDescription() {
        return putawayDescription;
    }

    public void setPutawayDescription(String putawayDescription) {
        this.putawayDescription = putawayDescription == null ? null : putawayDescription.trim();
    }

    public String getPutawayStatment() {
        return putawayStatment;
    }

    public void setPutawayStatment(String putawayStatment) {
        this.putawayStatment = putawayStatment == null ? null : putawayStatment.trim();
    }

    public Date getPutawaySubmitDate() {
        return putawaySubmitDate;
    }

    public void setPutawaySubmitDate(Date putawaySubmitDate) {
        this.putawaySubmitDate = putawaySubmitDate;
    }

    public Date getPutawayFinishDate() {
        return putawayFinishDate;
    }

    public void setPutawayFinishDate(Date putawayFinishDate) {
        this.putawayFinishDate = putawayFinishDate;
    }
}