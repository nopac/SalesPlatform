package com.example.springboot.service;

import com.example.springboot.model.Putaway_Apply_List;

public interface MerchantService {
    public Object putOnObject(String merchantAccount, String category, String productName, int count, double price, double discountPrice, String size, String picInfo, String negotiable, double condition, String describeInfo);
    public Object queryMySelf(String merchantAccount);
    public Object queryProductInStore(int currPage, int pageSize, String merchantAccount);
    public Object queryOrderFinished(int currPage, int pageSize, String merchantAccount);
    public Object queryOrderUnfinished(int currPage, int pageSize, String merchantAccount);
    public Object dispatch(int orderId);
    public Object takeProductOff(int productId);
    public Object takeProductOn(int productId);
    public Object queryReturnList(int currPage, int pageSize, String merchantAccount);
    public Object confirmReturnProduct(int saleRecord);
    public Object refuseReturnProduct(int saleRecord);
    public Object commentToCustomer(String merchantAccount, String customerAccount, int saleRecordId, String textInfo, double rate);
    public Object putCustomerToBlackList(String merchantAccount, String customerAccount, long days);
    public Object queryBlackList(int currPage, int pageSize, String merchantAccount);
    public Object cancelBlackList(String merchantAccount, String customerAccount);
    public Object queryCommentFromCustomer(int currPage, int pageSize, String merchantAccount);
}
