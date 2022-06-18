package com.example.springboot.service;

import com.example.springboot.model.Sales_Record;

import java.util.List;

public interface SaleRecordService {
    public List<Sales_Record> selectSaleRecordByProductId(Integer id);

    public List<Sales_Record> selectSaleRecordByMerchantAccount(String merchantAccount);

    public List<Sales_Record> selectSaleRecordByCustomerAccount(String customerAccount);
}
