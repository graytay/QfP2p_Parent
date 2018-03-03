package com.qf.controller;

import com.qf.service.JedisUtils;
import com.qf.service.SsoService;
import com.qf.service.impl.SsoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SsoController {
    @RequestMapping("/login.do")
    public void login(String name, String pass, HttpServletResponse response,String callback) throws IOException {
        SsoService ssoService=new SsoServiceImpl();
        String result="{'code':404}";
        if (ssoService.login(name,pass,response)){
            result="{'code':200}";
        }
        response.getWriter().print(callback+"{\""+result+"\"}");
    }
    //根据传递的Cookie的令牌校验登录信息的合法性和返回登录信息
    @RequestMapping("checklogin.do")
    public void check(String ck,String callback,HttpServletResponse response) throws IOException {
            String result= JedisUtils.getValue(ck);
            if (result!=null&&result.length()>0){
                //更新Redis的超时时间
                JedisUtils.setTime(ck);
                result="{'code':200,'user':"+result+"}";
            }else {
                result="{'code':404,'user':{}}";
            }
            response.getWriter().print(callback+"(\""+result+"\")");
    }
    //退出登陆
    @RequestMapping("/loginout.do")
    public void loginOut(String ck, HttpServletResponse response, HttpServletRequest request){
        JedisUtils.remove(ck);
        Cookie[] cookies=request.getCookies();
        Cookie cookie=null;
        for (Cookie cookie1 : cookies) {
                if (cookie1.getName().equals("usertoken")){
                    cookie=cookie1;
                    break;
                }
        }
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
