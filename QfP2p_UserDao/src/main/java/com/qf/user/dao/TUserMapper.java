package com.qf.user.dao;

import com.qf.user.po.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);
    //注册
    int insert(TUser record);

    TUser selectByPrimaryKey(Integer id);
    //登录
    TUser selectByName(String name);
    int updateByPrimaryKey(TUser record);
}