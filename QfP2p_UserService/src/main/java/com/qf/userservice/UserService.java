package com.qf.userservice;

import com.qf.user.po.TUser;
import com.qf.user.po.vo.ResultJson;

public interface UserService {
    //注册
    ResultJson save(TUser user);
    //登陆
    ResultJson login(TUser user);
    //检验是否存在：用户名密码邮箱
    ResultJson check(String name);
}
