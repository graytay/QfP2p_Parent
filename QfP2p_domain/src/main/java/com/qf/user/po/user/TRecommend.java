package com.qf.user.po.user;

public class TRecommend {
    private String no;
    private String realname;
    private String phonenum;
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }
    public String getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }
}