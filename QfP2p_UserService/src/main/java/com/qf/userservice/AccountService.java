package com.qf.userservice;

import com.qf.user.po.user.TAccount;
import com.qf.user.po.user.TUser;
import com.qf.user.po.vo.InitUser;
import com.qf.user.po.vo.ResultJson;

public interface AccountService {
    ResultJson save(TAccount tAccount);
    ResultJson initSave(InitUser initUser, TUser tUser);
}
