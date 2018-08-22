package com.hyg.yucai.model;

import java.util.Date;

public class TQuestionCustom extends TQuestionWithBLOBs{
	///开始时间,结束时间
    private Date startdate;
    private Date enddate;
    //文本框内容
    private String textcontent;
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getTextcontent() {
		return textcontent;
	}
	public void setTextcontent(String textcontent) {
		this.textcontent = textcontent;
	}
	public TQuestionCustom() {
		super();
	}
	public TQuestionCustom(Date startdate, Date enddate, String textcontent) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
		this.textcontent = textcontent;
	}
	
}
