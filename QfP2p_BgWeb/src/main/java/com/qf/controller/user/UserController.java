package com.qf.controller.user;

import com.alibaba.fastjson.JSON;
import com.qf.user.po.user.TLog;
import com.qf.user.po.user.TUser;
import com.qf.user.po.user.TUserdetail;
import com.qf.user.po.util.ActiveMQUtil;
import com.qf.user.po.util.FdfsUtils;
import com.qf.user.po.util.JedisUtil;
import com.qf.user.po.vo.ResultJson;
import com.qf.userservice.LogService;
import com.qf.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.jms.JMSException;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.IOException;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ActiveMQUtil activeMQUtil;
    @Autowired
    private FdfsUtils fdfsUtils;
    @Autowired
    private LogService logService;
    private long lasttime;
    @RequestMapping(value = "add.op" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultJson save(TUser user,HttpSession session){
        if (System.currentTimeMillis()-lasttime>1000){
            lasttime=System.currentTimeMillis();
            user.setRecommendno("1");
            user.setFlag(0);
           ResultJson resultJson= userService.save(user);
            if (resultJson.getCode()==200){
                session.setAttribute("user",user);
            }
            return resultJson;
        }else {
            return ResultJson.setOK("OK",null);
        }

    }
    @RequestMapping(value = "check.op")
    @ResponseBody
    public ResultJson check(String name){
        return userService.check(name);
    }
    @ResponseBody
    @RequestMapping("/userlogin.op")
    public ResultJson loginUser(String name, String pass, String ip, HttpSession session) throws JMSException {
        ResultJson resultJson = userService.login(name, pass);
        if (resultJson.getCode()==200){
            TUser tUser = (TUser) resultJson.getData();
            //添加登陆日志
            TLog tLog=new TLog();
            tLog.setCreatetime(new Date());
            tLog.setMsg(tUser.getId()+"");
            tLog.setIp(ip);
            activeMQUtil.sendMsg("logqueue", JSON.toJSONString(tLog));
            session.setAttribute("user",tUser);
        }
        return resultJson;
    }
    //获得最后一次登陆的ip地址
    @ResponseBody
    @RequestMapping("/userloginip.op")
    public ResultJson getLoginIp(HttpSession session){
        TUser user = (TUser) session.getAttribute("user");
        if (user!=null){
            return userService.selectIP(user.getId());
        }else {
            return ResultJson.setERROR("登录失败", null);
        }
    }
    //头像上传
    @ResponseBody
    @RequestMapping("userbase.op")
    public ResultJson updateBase(@RequestParam("fileimg")MultipartFile multipartFile, TUserdetail tUserdetail,HttpSession session) throws IOException {
        if (!multipartFile.isEmpty()){
            String filename = multipartFile.getOriginalFilename();
            if (filename.length()>50){
                filename = filename.substring(filename.length() - 50);
            }
            String filepath=fdfsUtils.uploadBytes(multipartFile.getBytes(),filename);
            tUserdetail.setHeadimg("http://10.0.127.179/"+filepath);
        }
        TUser user = (TUser) session.getAttribute("user");
        if (user!=null){
            tUserdetail.setId(user.getId());
            return userService.updateUD(tUserdetail);
        }else {
            return ResultJson.setERROR("登录失败",null);
        }
    }
}
