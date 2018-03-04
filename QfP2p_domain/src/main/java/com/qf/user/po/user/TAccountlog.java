package com.qf.user.po.user;

import java.math.BigDecimal;
import java.util.Date;

public class TAccountlog {
    private Integer id;

    private Integer aid;

    private Integer type;

    private BigDecimal money;

    private Date time;

    private Integer flag;

    private String verifier;

    private String logno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public String getLogno() {
        return logno;
    }

    public void setLogno(String logno) {
        this.logno = logno == null ? null : logno.trim();
    }
}