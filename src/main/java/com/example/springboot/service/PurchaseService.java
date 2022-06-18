package com.example.springboot.service;

import java.util.List;

public interface PurchaseService {
    Object order(String customerAccount, String merchantAccount, int productId, double price, int amount, String orderWay);
    Object selectOrder(int currPage, int pageSize, String customerAccount);
    Object cancelOrder(Integer orderId);
    Object pay(Integer orderId, int useIntegral, String password);
    Object urge(String customerAccount, String merchantAccount, String productId);
    Object confirmReceipt(Integer orderId, String password);
    Object commit(int saleRecordId, double asDescription, double responseSpeed, double serveAttitude, String textInfo, String picInfo);
    Object returnGoods(int orderId);
    Object joinCart(String customerAccount, int productId, int amount);
    Object removeCart(int cartId);
    Object selectCart(int currPage, int pageSize, String customerAccount);

}
