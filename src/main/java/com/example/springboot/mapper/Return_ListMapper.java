package com.example.springboot.mapper;

import com.example.springboot.model.Return_List;
import com.example.springboot.model.Return_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Return_ListMapper {
    long countByExample(Return_ListExample example);

    long countByMerchantAccount(String merchantAccount);

    int deleteByExample(Return_ListExample example);

    int deleteByPrimaryKey(Integer saleRecord);

    int insert(Return_List record);

    int insertSelective(Return_List record);

    List<Return_List> selectByExample(Return_ListExample example);

    Return_List selectByPrimaryKey(Integer saleRecord);

    List<Object> selectByMerchantAccount(Map<Object, Object> map);

    int updateByExampleSelective(@Param("record") Return_List record, @Param("example") Return_ListExample example);

    int updateByExample(@Param("record") Return_List record, @Param("example") Return_ListExample example);

    int updateByPrimaryKeySelective(Return_List record);

    int updateByPrimaryKey(Return_List record);
}