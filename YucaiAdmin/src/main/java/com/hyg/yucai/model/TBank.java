package com.hyg.yucai.model;

import java.util.Date;

public class TBank {
    private Integer bankid;

    private String bankname;

    private String bankno;

    private Date createdate;

    private Date editdate;

    private String founder;

    private String standbyField01;

    private String standbyField02;

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public String getStandbyField01() {
        return standbyField01;
    }

    public void setStandbyField01(String standbyField01) {
        this.standbyField01 = standbyField01 == null ? null : standbyField01.trim();
    }

    public String getStandbyField02() {
        return standbyField02;
    }

    public void setStandbyField02(String standbyField02) {
        this.standbyField02 = standbyField02 == null ? null : standbyField02.trim();
    }
}