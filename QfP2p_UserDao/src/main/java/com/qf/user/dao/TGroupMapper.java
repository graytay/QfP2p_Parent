package com.qf.user.dao;

import com.qf.user.po.TGroup;
import com.qf.user.po.TGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupMapper {
    long countByExample(TGroupExample example);

    int deleteByExample(TGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    List<TGroup> selectByExampleWithBLOBs(TGroupExample example);

    List<TGroup> selectByExample(TGroupExample example);

    TGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByExample(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKeyWithBLOBs(TGroup record);

    int updateByPrimaryKey(TGroup record);
}