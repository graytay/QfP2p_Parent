package com.qf.userservice;

import com.qf.user.po.TUserdetail;
import com.qf.user.po.vo.ResultJson;

public interface UserDetailService {
    ResultJson save(TUserdetail tUserdetail);
}
