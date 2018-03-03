package com.qf.user.po;

import java.math.BigDecimal;

public class TAccount {
    private Integer id;

    private String paypass;

    private BigDecimal usebalance;

    private BigDecimal frostbalance;

    private Integer uid;

    private Integer credits;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaypass() {
        return paypass;
    }

    public void setPaypass(String paypass) {
        this.paypass = paypass == null ? null : paypass.trim();
    }

    public BigDecimal getUsebalance() {
        return usebalance;
    }

    public void setUsebalance(BigDecimal usebalance) {
        this.usebalance = usebalance;
    }

    public BigDecimal getFrostbalance() {
        return frostbalance;
    }

    public void setFrostbalance(BigDecimal frostbalance) {
        this.frostbalance = frostbalance;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}