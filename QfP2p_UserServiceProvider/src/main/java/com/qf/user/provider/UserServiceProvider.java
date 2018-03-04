package com.qf.user.provider;

import com.qf.user.po.user.TUser;
import com.qf.user.po.user.TUserdetail;
import com.qf.user.po.vo.ResultJson;
import com.qf.dao.user.TUserMapper;
import com.qf.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProvider implements UserService{
    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public ResultJson save(TUser user) {
        if (tUserMapper.insert(user)>0){
            if (user.getRecommendno().length()>0){

            }
            return ResultJson.setOK("注册成功",user);
        }
        return ResultJson.setERROR("注册失败",null);
    }

    @Override
    public ResultJson login(String name, String password) {
        return null;
    }

    @Override
    public ResultJson selectIP(int id) {
        return null;
    }

    @Override
    public ResultJson updateUD(TUserdetail tUserdetail) {
        return null;
    }

    @Override
    public ResultJson check(String name) {
        if (tUserMapper.selectByName(name)!=null){
            return ResultJson.setERROR("已经注册",null);
        }
        return ResultJson.setOK("可以注册",null);
    }
}
