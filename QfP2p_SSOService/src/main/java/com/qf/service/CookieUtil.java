package com.qf.service;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    //设置令牌
    public static void set(String value, HttpServletResponse response){
        Cookie cookie=new Cookie("usertoken",value);
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        //如果当前需要进行单点登录的系统不再同一域名下，那么需要设置Cookie的域名
        cookie.setDomain("localhost");
        response.addCookie(cookie);
    }
    //失效令牌
    public static void setTimeOut(Cookie cookie,HttpServletResponse response){
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
