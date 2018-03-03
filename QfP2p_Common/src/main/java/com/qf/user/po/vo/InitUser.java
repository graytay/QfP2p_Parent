package com.qf.user.po.vo;

import java.io.Serializable;

public class InitUser implements Serializable{
    private String nickname;
    private String realname;
    private String cardno;
    private String paypass;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getPaypass() {
        return paypass;
    }

    public void setPaypass(String paypass) {
        this.paypass = paypass;
    }

    @Override
    public String toString() {
        return "InitUser{" +
                "nickname='" + nickname + '\'' +
                ", realname='" + realname + '\'' +
                ", cardno='" + cardno + '\'' +
                ", paypass='" + paypass + '\'' +
                '}';
    }
}
