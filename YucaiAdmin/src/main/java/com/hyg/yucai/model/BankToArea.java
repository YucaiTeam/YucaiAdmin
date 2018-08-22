package com.hyg.yucai.model;

import java.util.Date;

public class BankToArea {
	//根据银行显示所有的地区
	private Integer areaid;

    private String areaname;

    private String areano;
    
	private Date createdate;

    private Date editdate;
    
    public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getAreano() {
		return areano;
	}

	public void setAreano(String areano) {
		this.areano = areano;
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

	public BankToArea(String areaname, String areano, Date createdate,
			Date editdate) {
		super();
		this.areaname = areaname;
		this.areano = areano;
		this.createdate = createdate;
		this.editdate = editdate;
	}

	public BankToArea() {
		super();
	}

	
	
	

	
	
	

	
	

}
