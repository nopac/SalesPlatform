package com.example.springboot.service.impl;

import com.example.springboot.mapper.Sales_RecordMapper;
import com.example.springboot.model.Sales_Record;
import com.example.springboot.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleRecordServiceImpl implements SaleRecordService {

    @Autowired
    Sales_RecordMapper sales_recordMapper;
    @Override
    public List<Sales_Record> selectSaleRecordByProductId(Integer id) {
        return sales_recordMapper.selectByProductId(id);
    }

    @Override
    public List<Sales_Record> selectSaleRecordByMerchantAccount(String merchantAccount) {
        return sales_recordMapper.selectByMerchantAccount(merchantAccount);
    }

    @Override
    public List<Sales_Record> selectSaleRecordByCustomerAccount(String customerAccount) {
        return sales_recordMapper.selectByCustomerAccount(customerAccount);
    }
}
