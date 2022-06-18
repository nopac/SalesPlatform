package com.example.springboot.mapper;

import com.example.springboot.model.Order;
import com.example.springboot.model.OrderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrderExample example);

    long countFinishedByMerchantAccount(String merchantAccount);

    long countByCustomerAccount(String customerAccount);

    long countUnfinishedByMerchantAccount(String merchantAccount);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    List<Object> selectByCustomerAccount(Map<Object, Object> data);

    List<Object> selectFinishedByMerchantAccount(Map<Object, Object> data);

    List<Object> selectUnfinishedByMerchantAccount(Map<Object, Object> data);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}