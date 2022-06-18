package com.example.springboot.mapper;

import com.example.springboot.model.Customer;
import com.example.springboot.model.CustomerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    List<Customer> selectAll(Map<String, Object> data);

    Customer selectByPrimaryKey(Integer customerId);

    Customer selectByAccount(String customerAccount);

    Customer selectByMail(String mail);

    Customer selectByPhone(String phone);

    Customer selectByBankAccount(String bankAccount);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}