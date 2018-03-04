package com.qf.user.po.user;

public class TBankcard {
    private Integer id;

    private Integer aid;

    private String openname;

    private String cardno;

    private String bankname;

    private String bankaddress;

    private Integer flag;

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

    public String getOpenname() {
        return openname;
    }

    public void setOpenname(String openname) {
        this.openname = openname == null ? null : openname.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankaddress() {
        return bankaddress;
    }

    public void setBankaddress(String bankaddress) {
        this.bankaddress = bankaddress == null ? null : bankaddress.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}