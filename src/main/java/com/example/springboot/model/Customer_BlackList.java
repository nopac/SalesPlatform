package com.example.springboot.model;

import java.util.Date;

public class Customer_BlackList {
    private Integer blacklistId;

    private String blacklistFrom;

    private String blacklistTo;

    private String blacklistType;

    private Date blacklistStartDate;

    private Date blacklistEndDate;

    public Integer getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(Integer blacklistId) {
        this.blacklistId = blacklistId;
    }

    public String getBlacklistFrom() {
        return blacklistFrom;
    }

    public void setBlacklistFrom(String blacklistFrom) {
        this.blacklistFrom = blacklistFrom == null ? null : blacklistFrom.trim();
    }

    public String getBlacklistTo() {
        return blacklistTo;
    }

    public void setBlacklistTo(String blacklistTo) {
        this.blacklistTo = blacklistTo == null ? null : blacklistTo.trim();
    }

    public String getBlacklistType() {
        return blacklistType;
    }

    public void setBlacklistType(String blacklistType) {
        this.blacklistType = blacklistType == null ? null : blacklistType.trim();
    }

    public Date getBlacklistStartDate() {
        return blacklistStartDate;
    }

    public void setBlacklistStartDate(Date blacklistStartDate) {
        this.blacklistStartDate = blacklistStartDate;
    }

    public Date getBlacklistEndDate() {
        return blacklistEndDate;
    }

    public void setBlacklistEndDate(Date blacklistEndDate) {
        this.blacklistEndDate = blacklistEndDate;
    }
}