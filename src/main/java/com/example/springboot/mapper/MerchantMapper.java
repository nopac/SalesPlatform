package com.example.springboot.mapper;

import com.example.springboot.model.Merchant;
import com.example.springboot.model.MerchantExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {
    long countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Integer merchantid);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantExample example);

    List<Object> selectAll(Map<Object, Object> map);

    List<Merchant> selectAllMerchant();

    Merchant selectByPrimaryKey(Integer merchantid);

    Merchant selectByAccount(String merchantAccount);

    Merchant selectByPhone(String phone);

    Merchant selectByIdCard(String idCard);

    Merchant selectByLicense(String license);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}