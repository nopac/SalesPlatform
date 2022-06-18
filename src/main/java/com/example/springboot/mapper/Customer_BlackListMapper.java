package com.example.springboot.mapper;

import com.example.springboot.model.Customer_BlackList;
import com.example.springboot.model.Customer_BlackListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Customer_BlackListMapper {
    long countByExample(Customer_BlackListExample example);

    long countByMerchantAccount(String merchantAccount);

    int deleteByExample(Customer_BlackListExample example);

    int deleteByPrimaryKey(Integer blacklistId);

    int insert(Customer_BlackList record);

    int insertSelective(Customer_BlackList record);

    List<Customer_BlackList> selectByExample(Customer_BlackListExample example);

    Customer_BlackList selectByPrimaryKey(Integer blacklistId);

    Object selectByFromTo(Map<Object, Object> map);

    List<Object> selectMyList(Map<Object, Object> map);

    List<Object> selectAll(Map<Object, Object> map);

    int updateByExampleSelective(@Param("record") Customer_BlackList record, @Param("example") Customer_BlackListExample example);

    int updateByExample(@Param("record") Customer_BlackList record, @Param("example") Customer_BlackListExample example);

    int updateByPrimaryKeySelective(Customer_BlackList record);

    int updateByPrimaryKey(Customer_BlackList record);
}