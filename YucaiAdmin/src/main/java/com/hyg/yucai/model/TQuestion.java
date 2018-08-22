package com.hyg.yucai.model;

import java.util.Date;

public class TQuestion extends Page{
    private Integer questionid;

    private String questionoption1;

    private String questionoption2;

    private String questionoption3;

    private String questionoption4;

    private String questionanswer;

    private Date createdate;

    private Date editdate;

    private String standbyField01;

    private String standbyField02;

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestionoption1() {
        return questionoption1;
    }

    public void setQuestionoption1(String questionoption1) {
        this.questionoption1 = questionoption1 == null ? null : questionoption1.trim();
    }

    public String getQuestionoption2() {
        return questionoption2;
    }

    public void setQuestionoption2(String questionoption2) {
        this.questionoption2 = questionoption2 == null ? null : questionoption2.trim();
    }

    public String getQuestionoption3() {
        return questionoption3;
    }

    public void setQuestionoption3(String questionoption3) {
        this.questionoption3 = questionoption3 == null ? null : questionoption3.trim();
    }

    public String getQuestionoption4() {
        return questionoption4;
    }

    public void setQuestionoption4(String questionoption4) {
        this.questionoption4 = questionoption4 == null ? null : questionoption4.trim();
    }

    public String getQuestionanswer() {
        return questionanswer;
    }

    public void setQuestionanswer(String questionanswer) {
        this.questionanswer = questionanswer == null ? null : questionanswer.trim();
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