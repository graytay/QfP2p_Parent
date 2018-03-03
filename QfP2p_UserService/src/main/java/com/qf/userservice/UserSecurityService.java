package com.qf.userservice;

import com.qf.user.po.TUsersecurity;
import com.qf.user.po.vo.ResultJson;

public interface UserSecurityService {
    ResultJson save(TUsersecurity tUsersecurity);
}
