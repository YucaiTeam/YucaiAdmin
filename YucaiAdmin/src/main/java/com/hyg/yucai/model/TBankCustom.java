package com.hyg.yucai.model;

public class TBankCustom {
	
	private String bankname;

    private String bankno;

	public TBankCustom(String bankname, String bankno) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public TBankCustom() {
		super();
	}

	public String getBankno() {
		return bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

}
