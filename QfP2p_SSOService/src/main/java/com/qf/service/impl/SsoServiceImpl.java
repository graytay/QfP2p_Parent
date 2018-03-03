package com.qf.service.impl;

import com.qf.service.CookieUtil;
import com.qf.service.JedisUtils;
import com.qf.service.SsoService;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

public class SsoServiceImpl implements SsoService{
    @Override
    public boolean login(String username, String password, HttpServletResponse response) {
        if (username.length()>5&&password.length()>5){
            //第一次登陆产生令牌
            String key="usertoken:"+ UUID.randomUUID();
            //将登陆的信息存储到Redis中
            JedisUtils.setKey(key,"{'username':'"+username+"'}");
            CookieUtil.set(key,response);
            return true;
        }
        return false;
    }

    @Override
    public String checkLogin(String cookieValue) {
        if (cookieValue.length()>0){
            return JedisUtils.getValue("usertoken:"+cookieValue);
        }
        return null;
    }
}

