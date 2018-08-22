package com.hyg.yucai.model;

import java.util.Date;

public class AreaToBank{
	///一个地区对应多个银行
	private Integer bankid;

    private String bankname;

    private String bankno;

    private Date createdate;

    private Date editdate;

    private String founder;

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
		this.bankname = bankname;
	}

	public String getBankno() {
		return bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
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
		this.founder = founder;
	}

	public AreaToBank(String bankname, String bankno, Date createdate,
			Date editdate, String founder) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
		this.createdate = createdate;
		this.editdate = editdate;
		this.founder = founder;
	}

	public AreaToBank() {
		super();
	}
    
	

}
