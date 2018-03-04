package com.qf.dao.user;

import com.qf.user.po.user.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);
    //注册
    int insert(TUser record);

    TUser selectByPrimaryKey(Integer id);
    //登录
    TUser selectByName(String name);
    int updateByPrimaryKey(TUser record);
    //查询最后一次ip
    String selectIP(int id);
}