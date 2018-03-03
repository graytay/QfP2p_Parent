package com.qf.userservice;

import com.qf.user.po.TAccount;
import com.qf.user.po.TUser;
import com.qf.user.po.vo.InitUser;
import com.qf.user.po.vo.ResultJson;

public interface AccountService {
    ResultJson save(TAccount tAccount);
    ResultJson initSave(InitUser initUser, TUser tUser);
}
