package com.example.springboot.mapper;

import com.example.springboot.model.Register_Apply_List;
import com.example.springboot.model.Register_Apply_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Register_Apply_ListMapper {
    long countByExample(Register_Apply_ListExample example);

    long countByUnchecked();

    int deleteByExample(Register_Apply_ListExample example);

    int deleteByPrimaryKey(Integer registerlistId);

    int insert(Register_Apply_List record);

    int insertSelective(Register_Apply_List record);

    List<Register_Apply_List> selectByExample(Register_Apply_ListExample example);

    Register_Apply_List selectByPrimaryKey(Integer registerlistId);

    List<Object> selectAll(Map<Object, Object> map);

    List<Object> selectUnchecked(Map<Object, Object> map);

    int updateByExampleSelective(@Param("record") Register_Apply_List record, @Param("example") Register_Apply_ListExample example);

    int updateByExample(@Param("record") Register_Apply_List record, @Param("example") Register_Apply_ListExample example);

    int updateByPrimaryKeySelective(Register_Apply_List record);

    int updateByPrimaryKey(Register_Apply_List record);
}