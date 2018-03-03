package com.qf.service;

import javax.servlet.http.HttpServletResponse;

public interface SsoService {
    boolean login(String username, String password, HttpServletResponse response);

    String checkLogin(String cookieValue);
}
