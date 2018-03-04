package com.qf.user.provider;

import com.qf.dao.user.TAccountMapper;
import com.qf.dao.user.TUserdetailMapper;
import com.qf.dao.user.TUsersecurityMapper;
import com.qf.user.po.user.TAccount;
import com.qf.user.po.user.TUser;
import com.qf.user.po.user.TUserdetail;
import com.qf.user.po.user.TUsersecurity;
import com.qf.user.po.util.EncryptUtils;
import com.qf.user.po.vo.InitUser;
import com.qf.user.po.vo.ResultJson;
import com.qf.userservice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceProvider implements AccountService{
    @Autowired
    private TUserdetailMapper tUserdetailMapper;
    @Autowired
    private TUsersecurityMapper tUsersecurityMapper;
    @Autowired
    private TAccountMapper tAccountMapper;
    @Override
    public ResultJson save(TAccount tAccount) {
        if (tAccountMapper.insert(tAccount)>0){
            return ResultJson.setOK("添加账户成功",tAccount);
        }
        return ResultJson.setERROR("添加账户失败",null);
    }

    @Override
    public ResultJson initSave(InitUser initUser, TUser tUser) {
        //新增用户昵称
        TUserdetail tUserdetail=new TUserdetail();
        tUserdetail.setNikename(initUser.getNickname());
        tUserdetail.setUid(tUser.getId());
        tUserdetailMapper.insert(tUserdetail);
        //新增账户--支付密码
        TAccount tAccount=new TAccount();
        tAccount.setFlag(0);
        //支付密码使用对称加密
        tAccount.setPaypass(EncryptUtils.aesEncBase64(initUser.getPaypass(),"IMplPELFrvPXJWsfEXdqRg=="));
        tAccount.setId(tUser.getId());
        tAccount.setFrostbalance(BigDecimal.ZERO);
        tAccountMapper.insert(tAccount);
        //新增用户安全
        TUsersecurity tUsersecurity=new TUsersecurity();
        //设置账户id
        tUsersecurity.setAid(tAccount.getId());
        //设置账户的no
        tUsersecurity.setCardno(initUser.getCardno());
        //设置真实名称
        tUsersecurity.setRealname(initUser.getRealname());
        tUsersecurity.setPayauth(1);
        tUsersecurity.setCardauth(0);
        tUsersecurity.setEmail1auth(0);
        tUsersecurity.setCardauth(0);
        tUsersecurity.setSiteauth(0);
        tUsersecurity.setPhoneauth(0);
        tUsersecurity.setVerifier("系统");
        tUsersecurityMapper.insert(tUsersecurity);
        return ResultJson.setOK("初始向导成功",null);
    }
}
