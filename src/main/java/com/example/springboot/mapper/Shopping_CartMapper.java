package com.example.springboot.mapper;

import com.example.springboot.model.Shopping_Cart;
import com.example.springboot.model.Shopping_CartExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Shopping_CartMapper {
    long countByExample(Shopping_CartExample example);

    long countByCustomerAccount(String customerAccount);

    int deleteByExample(Shopping_CartExample example);

    int deleteByPrimaryKey(Integer shoppingCartId);

    int insert(Shopping_Cart record);

    int insertSelective(Shopping_Cart record);

    List<Shopping_Cart> selectByExample(Shopping_CartExample example);

    List<Object> selectAll(Map<Object, Object> data);

    Shopping_Cart selectByPrimaryKey(Integer shoppingCartId);

    int updateByExampleSelective(@Param("record") Shopping_Cart record, @Param("example") Shopping_CartExample example);

    int updateByExample(@Param("record") Shopping_Cart record, @Param("example") Shopping_CartExample example);

    int updateByPrimaryKeySelective(Shopping_Cart record);

    int updateByPrimaryKey(Shopping_Cart record);
}