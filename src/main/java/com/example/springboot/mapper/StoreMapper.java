package com.example.springboot.mapper;

import com.example.springboot.model.Store;
import com.example.springboot.model.StoreExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    long countByExample(StoreExample example);

    long countByMerchantAccount(String merchantAccount);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    List<Store> selectProductByMerchant(Map<Object, Object> map);

    Store selectByPrimaryKey(Integer storeId);

    Store selectByProductId(Integer productId);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}