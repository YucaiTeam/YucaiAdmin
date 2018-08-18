package com.hyg.yucai.model;

import java.util.Date;

public class TNewsCustom extends Page{
	
	private Integer newsid;

    private String newstitle;

    private String newsguide;

    private String newssource;

    private String newsauthor;

    private Date createdate;

    private Date editdate;

    private String areaname;

    private String bankname;

    private String standbyField01;

    private String standbyField02;

    private String newscontent;
    
    
    ///开始时间,结束时间
    private Date startdate;
    private Date enddate;
    //文本框内容
    private String textcontent;
    
    
    

	public TNewsCustom(Integer newsid, String newstitle, String newsguide,
			String newssource, String newsauthor, Date createdate,
			Date editdate, String areaname, String bankname,
			String standbyField01, String standbyField02, String newscontent,
			Date startdate, Date enddate, String textcontent) {
		super();
		this.newsid = newsid;
		this.newstitle = newstitle;
		this.newsguide = newsguide;
		this.newssource = newssource;
		this.newsauthor = newsauthor;
		this.createdate = createdate;
		this.editdate = editdate;
		this.areaname = areaname;
		this.bankname = bankname;
		this.standbyField01 = standbyField01;
		this.standbyField02 = standbyField02;
		this.newscontent = newscontent;
		this.startdate = startdate;
		this.enddate = enddate;
		this.textcontent = textcontent;
	}

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
		this.newstitle = newstitle;
	}

	public String getNewsguide() {
		return newsguide;
	}

	public void setNewsguide(String newsguide) {
		this.newsguide = newsguide;
	}

	public String getNewssource() {
		return newssource;
	}

	public void setNewssource(String newssource) {
		this.newssource = newssource;
	}

	public String getNewsauthor() {
		return newsauthor;
	}

	public void setNewsauthor(String newsauthor) {
		this.newsauthor = newsauthor;
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

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getStandbyField01() {
		return standbyField01;
	}

	public void setStandbyField01(String standbyField01) {
		this.standbyField01 = standbyField01;
	}

	public String getStandbyField02() {
		return standbyField02;
	}

	public void setStandbyField02(String standbyField02) {
		this.standbyField02 = standbyField02;
	}

	public String getNewscontent() {
		return newscontent;
	}

	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}

	public TNewsCustom() {
		super();
	}

    
}
