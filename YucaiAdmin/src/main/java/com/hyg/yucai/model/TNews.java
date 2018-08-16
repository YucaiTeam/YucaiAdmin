package com.hyg.yucai.model;

import java.util.Date;

public class TNews {
    private Integer newsid;

    private String newstitle;

    private String newsguide;

    private String newssource;

    private String newsauthor;

    private Date createdate;

    private Date editdate;

    private String areano;

    private String bankno;

    private String standbyField01;

    private String standbyField02;

    private String newscontent;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewsguide() {
        return newsguide;
    }

    public void setNewsguide(String newsguide) {
        this.newsguide = newsguide == null ? null : newsguide.trim();
    }

    public String getNewssource() {
        return newssource;
    }

    public void setNewssource(String newssource) {
        this.newssource = newssource == null ? null : newssource.trim();
    }

    public String getNewsauthor() {
        return newsauthor;
    }

    public void setNewsauthor(String newsauthor) {
        this.newsauthor = newsauthor == null ? null : newsauthor.trim();
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

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }
}