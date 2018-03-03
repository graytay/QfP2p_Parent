package com.qf.user.controller;

import cn.dsna.util.images.ValidateCode;
import com.qf.user.po.util.JedisUtil;
import com.qf.user.po.vo.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class CodeController {
    @Autowired
    private JedisUtil jedisUtil;
    @RequestMapping("/codecreate.op")
    public void createCode(HttpServletResponse response, HttpSession session) throws IOException {
        ValidateCode validateCode=new ValidateCode(100,40,4,20);
        String code=validateCode.getCode();
        jedisUtil.addstr("code:"+session.getId(),code,180);
        validateCode.write(response.getOutputStream());
    }
    @ResponseBody
    @RequestMapping("/codecheck.op")
    public ResultJson check(String code,HttpSession session){
        if (jedisUtil.isHave("code:"+session.getId())){
            if (jedisUtil.getStr("code:"+session.getId()).compareToIgnoreCase(code)==0){
                return ResultJson.setOK("验证码正确",null);
            }else {
                return  ResultJson.setERROR("验证码错误",null);
            }
        }else {
            return  ResultJson.setERROR("验证码超时",null);
        }
    }
}
