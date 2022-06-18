package com.example.springboot.mapper;

import com.example.springboot.model.Putaway_Apply_List;
import com.example.springboot.model.Putaway_Apply_ListExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Putaway_Apply_ListMapper {
    long countByExample(Putaway_Apply_ListExample example);

    int deleteByExample(Putaway_Apply_ListExample example);

    int deleteByPrimaryKey(Integer putawayId);

    int insert(Putaway_Apply_List record);

    int insertSelective(Putaway_Apply_List record);

    List<Putaway_Apply_List> selectByExample(Putaway_Apply_ListExample example);

    Putaway_Apply_List selectByPrimaryKey(Integer putawayId);

    List<Object> selectAll(Map<Object, Object> map);

    int updateByExampleSelective(@Param("record") Putaway_Apply_List record, @Param("example") Putaway_Apply_ListExample example);

    int updateByExample(@Param("record") Putaway_Apply_List record, @Param("example") Putaway_Apply_ListExample example);

    int updateByPrimaryKeySelective(Putaway_Apply_List record);

    int updateByPrimaryKey(Putaway_Apply_List record);
}