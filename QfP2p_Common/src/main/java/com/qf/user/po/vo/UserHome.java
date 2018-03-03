package com.qf.user.po.vo;

import java.io.Serializable;

public class UserHome implements Serializable{
    private String headimg;
    private String nickname;
    private String username;
    private String groupname;
    private String ip;
    private  Integer credits;
    private String usebalance;
    private  String frostbalance;
    private String redmoney;
    private Integer redcount;

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getUsebalance() {
        return usebalance;
    }

    public void setUsebalance(String usebalance) {
        this.usebalance = usebalance;
    }

    public String getFrostbalance() {
        return frostbalance;
    }

    public void setFrostbalance(String frostbalance) {
        this.frostbalance = frostbalance;
    }

    public String getRedmoney() {
        return redmoney;
    }

    public void setRedmoney(String redmoney) {
        this.redmoney = redmoney;
    }

    public Integer getRedcount() {
        return redcount;
    }

    public void setRedcount(Integer redcount) {
        this.redcount = redcount;
    }

    @Override
    public String toString() {
        return "UserHome{" +
                "headimg='" + headimg + '\'' +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", groupname='" + groupname + '\'' +
                ", ip='" + ip + '\'' +
                ", credits=" + credits +
                ", usebalance='" + usebalance + '\'' +
                ", frostbalance='" + frostbalance + '\'' +
                ", redmoney='" + redmoney + '\'' +
                ", redcount=" + redcount +
                '}';
    }
}
