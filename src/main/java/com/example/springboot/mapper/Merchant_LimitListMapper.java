package com.example.springboot.mapper;

import com.example.springboot.model.Merchant_LimitList;
import com.example.springboot.model.Merchant_LimitListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Merchant_LimitListMapper {
    long countByExample(Merchant_LimitListExample example);

    int deleteByExample(Merchant_LimitListExample example);

    int deleteByPrimaryKey(Integer limitlistRecordId);

    int insert(Merchant_LimitList record);

    int insertSelective(Merchant_LimitList record);

    List<Merchant_LimitList> selectByExample(Merchant_LimitListExample example);

    List<Object> selectAll(Map<Object, Object> map);

    Object selectByMerchantAccount(String merchantAccount);

    Merchant_LimitList selectByPrimaryKey(Integer limitlistRecordId);

    int updateByExampleSelective(@Param("record") Merchant_LimitList record, @Param("example") Merchant_LimitListExample example);

    int updateByExample(@Param("record") Merchant_LimitList record, @Param("example") Merchant_LimitListExample example);

    int updateByPrimaryKeySelective(Merchant_LimitList record);

    int updateByPrimaryKey(Merchant_LimitList record);
}