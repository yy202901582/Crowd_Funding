package com.my.crowd.mapper;

import com.my.crowd.entity.Base;
import com.my.crowd.entity.BaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper {
    int countByExample(BaseExample example);

    int deleteByExample(BaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Base record);

    int insertSelective(Base record);

    List<Base> selectByExampleWithBLOBs(BaseExample example);

    List<Base> selectByExample(BaseExample example);

    Base selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Base record, @Param("example") BaseExample example);

    int updateByExampleWithBLOBs(@Param("record") Base record, @Param("example") BaseExample example);

    int updateByExample(@Param("record") Base record, @Param("example") BaseExample example);

    int updateByPrimaryKeySelective(Base record);

    int updateByPrimaryKeyWithBLOBs(Base record);

    int updateByPrimaryKey(Base record);
}