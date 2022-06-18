package com.example.springboot.mapper;

import com.example.springboot.model.Sales_Record;
import com.example.springboot.model.Sales_RecordExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Sales_RecordMapper {
    long countByExample(Sales_RecordExample example);

    long countByMerchantAccount(String merchantAccount);

    long countByProductId(Integer productId);

    int deleteByExample(Sales_RecordExample example);

    int deleteByPrimaryKey(Integer saleRecordId);

    int insert(Sales_Record record);

    int insertSelective(Sales_Record record);

    List<Sales_Record> selectByExample(Sales_RecordExample example);

    List<Sales_Record> selectByCustomerAccount(String customerAccount);

    List<Sales_Record> selectByMerchantAccount(String customerAccount);

    List<Sales_Record> selectByProductId(Integer productId);

    List<Sales_Record> selectComment(Map<Object, Object> map);

    List<Sales_Record> selectCommentByProductId(Map<Object, Object> map);

    List<Sales_Record> selectAll();

    Sales_Record selectByOrderId(Integer orderId);

    Sales_Record selectByPrimaryKey(Integer saleRecordId);

    int updateByExampleSelective(@Param("record") Sales_Record record, @Param("example") Sales_RecordExample example);

    int updateByExample(@Param("record") Sales_Record record, @Param("example") Sales_RecordExample example);

    int updateByPrimaryKeySelective(Sales_Record record);

    int updateByPrimaryKey(Sales_Record record);
}