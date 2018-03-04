package com.qf.dao.user;

import com.qf.user.po.user.TUsergroup;
import com.qf.user.po.user.TUsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsergroupMapper {
    long countByExample(TUsergroupExample example);

    int deleteByExample(TUsergroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUsergroup record);

    int insertSelective(TUsergroup record);

    List<TUsergroup> selectByExample(TUsergroupExample example);

    TUsergroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUsergroup record, @Param("example") TUsergroupExample example);

    int updateByExample(@Param("record") TUsergroup record, @Param("example") TUsergroupExample example);

    int updateByPrimaryKeySelective(TUsergroup record);

    int updateByPrimaryKey(TUsergroup record);
}