package com.qf.user.po.user;

import java.util.Date;

public class TUsersecurity {
    private Integer id;

    private Integer payauth;

    private String realname;

    private String cardno;

    private Integer cardauth;

    private Integer siteauth;

    private Integer phoneauth;

    private Integer email1auth;

    private String verifier;

    private Integer aid;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPayauth() {
        return payauth;
    }

    public void setPayauth(Integer payauth) {
        this.payauth = payauth;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Integer getCardauth() {
        return cardauth;
    }

    public void setCardauth(Integer cardauth) {
        this.cardauth = cardauth;
    }

    public Integer getSiteauth() {
        return siteauth;
    }

    public void setSiteauth(Integer siteauth) {
        this.siteauth = siteauth;
    }

    public Integer getPhoneauth() {
        return phoneauth;
    }

    public void setPhoneauth(Integer phoneauth) {
        this.phoneauth = phoneauth;
    }

    public Integer getEmail1auth() {
        return email1auth;
    }

    public void setEmail1auth(Integer email1auth) {
        this.email1auth = email1auth;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}