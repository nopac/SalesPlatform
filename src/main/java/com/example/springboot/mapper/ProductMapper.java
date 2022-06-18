package com.example.springboot.mapper;

import com.example.springboot.model.Product;
import com.example.springboot.model.ProductExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    long countByType(String type);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    List<Product> selectAll(Map<String, Integer> data);

    List<Product> selectType(Map<String, Object> data);

    List<Product> selectByName(String productName);

    Product selectByPrimaryKey(Integer productId);

    Product selectLastByPrimaryKey();

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}