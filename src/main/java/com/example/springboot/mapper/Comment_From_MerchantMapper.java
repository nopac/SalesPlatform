package com.example.springboot.mapper;

import com.example.springboot.model.Comment_From_Merchant;
import com.example.springboot.model.Comment_From_MerchantExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Comment_From_MerchantMapper {
    long countByExample(Comment_From_MerchantExample example);

    long countByCustomerAccount(String customerAccount);

    int deleteByExample(Comment_From_MerchantExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment_From_Merchant record);

    int insertSelective(Comment_From_Merchant record);

    List<Comment_From_Merchant> selectByExample(Comment_From_MerchantExample example);

    Comment_From_Merchant selectByPrimaryKey(Integer commentId);

    List<Object> selectByAccount(Map<Object, Object> map);

    int updateByExampleSelective(@Param("record") Comment_From_Merchant record, @Param("example") Comment_From_MerchantExample example);

    int updateByExample(@Param("record") Comment_From_Merchant record, @Param("example") Comment_From_MerchantExample example);

    int updateByPrimaryKeySelective(Comment_From_Merchant record);

    int updateByPrimaryKey(Comment_From_Merchant record);
}