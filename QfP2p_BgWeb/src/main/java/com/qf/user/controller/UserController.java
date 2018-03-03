package com.qf.user.controller;

import com.qf.user.po.TUser;
import com.qf.user.po.vo.ResultJson;
import com.qf.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "add.op" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultJson save(TUser user){
       return userService.save(user);
    }
    @RequestMapping(value = "check.op")
    @ResponseBody
    public ResultJson check(String name){
        return userService.check(name);
    }
}
