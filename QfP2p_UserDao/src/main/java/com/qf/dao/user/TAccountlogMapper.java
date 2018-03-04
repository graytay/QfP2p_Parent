package com.qf.dao.user;

import com.qf.user.po.user.TAccountlog;
import com.qf.user.po.user.TAccountlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountlogMapper {
    long countByExample(TAccountlogExample example);

    int deleteByExample(TAccountlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAccountlog record);

    int insertSelective(TAccountlog record);

    List<TAccountlog> selectByExample(TAccountlogExample example);

    TAccountlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAccountlog record, @Param("example") TAccountlogExample example);

    int updateByExample(@Param("record") TAccountlog record, @Param("example") TAccountlogExample example);

    int updateByPrimaryKeySelective(TAccountlog record);

    int updateByPrimaryKey(TAccountlog record);
}