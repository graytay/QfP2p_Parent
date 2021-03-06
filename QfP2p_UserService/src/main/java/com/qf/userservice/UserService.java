package com.qf.userservice;

import com.qf.user.po.user.TUser;
import com.qf.user.po.user.TUserdetail;
import com.qf.user.po.vo.ResultJson;

public interface UserService {
    //注册
    ResultJson save(TUser user);
    //登陆
    ResultJson login(String name,String password);
    //检验是否存在：用户名密码邮箱
    ResultJson check(String name);
    //查询IP
    ResultJson selectIP(int id);
    //修改基本资料
    ResultJson updateUD(TUserdetail tUserdetail);
}
