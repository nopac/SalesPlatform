package com.example.springboot.model;

public class Customer_BlackListKey {
    private String blacklistFrom;

    private String blacklistTo;

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
}