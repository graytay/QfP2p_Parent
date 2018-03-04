package com.qf.dao.user;

import com.qf.user.po.user.TUsersecurity;
import com.qf.user.po.user.TUsersecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersecurityMapper {
    long countByExample(TUsersecurityExample example);

    int deleteByExample(TUsersecurityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUsersecurity record);

    int insertSelective(TUsersecurity record);

    List<TUsersecurity> selectByExample(TUsersecurityExample example);

    TUsersecurity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUsersecurity record, @Param("example") TUsersecurityExample example);

    int updateByExample(@Param("record") TUsersecurity record, @Param("example") TUsersecurityExample example);

    int updateByPrimaryKeySelective(TUsersecurity record);

    int updateByPrimaryKey(TUsersecurity record);
}