package com.hyg.yucai.model;

public class TAb {
    private Integer abid;

    private String areano;

    private String bankno;

    private String standbyField01;

    private String standbyField02;

    public Integer getAbid() {
        return abid;
    }

    public void setAbid(Integer abid) {
        this.abid = abid;
    }

    public String getAreano() {
        return areano;
    }

    public void setAreano(String areano) {
        this.areano = areano == null ? null : areano.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
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