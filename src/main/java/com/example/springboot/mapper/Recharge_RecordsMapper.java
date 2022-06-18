package com.example.springboot.mapper;

import com.example.springboot.model.Recharge_Records;
import com.example.springboot.model.Recharge_RecordsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Recharge_RecordsMapper {
    long countByExample(Recharge_RecordsExample example);

    int deleteByExample(Recharge_RecordsExample example);

    int deleteByPrimaryKey(Integer rechargeRecordId);

    int insert(Recharge_Records record);

    int insertSelective(Recharge_Records record);

    List<Recharge_Records> selectByExample(Recharge_RecordsExample example);

    List<Object> selectByAccount(Map<Object, Object> map);

    Recharge_Records selectByPrimaryKey(Integer rechargeRecordId);

    long countByCustomerAccount(String customerAccount);

    int updateByExampleSelective(@Param("record") Recharge_Records record, @Param("example") Recharge_RecordsExample example);

    int updateByExample(@Param("record") Recharge_Records record, @Param("example") Recharge_RecordsExample example);

    int updateByPrimaryKeySelective(Recharge_Records record);

    int updateByPrimaryKey(Recharge_Records record);
}