package com.hyg.yucai.model;

public class Page {
	private String draw;
	private int pagetotal;
	private int startindex;
	private int pagesize;
	public int getPagetotal() {
		return pagetotal;
	}
	public void setPagetotal(int pagetotal) {
		this.pagetotal = pagetotal;
	}
	public int getStartindex() {
		return startindex;
	}
	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public Page(int pagetotal, int startindex, int pagesize) {
		super();
		this.pagetotal = pagetotal;
		this.startindex = startindex;
		this.pagesize = pagesize;
	}
	public Page() {
		super();
	}
	public Page(String draw, int pagetotal, int startindex, int pagesize) {
		super();
		this.draw = draw;
		this.pagetotal = pagetotal;
		this.startindex = startindex;
		this.pagesize = pagesize;
	}
	public String getDraw() {
		return draw;
	}
	public void setDraw(String draw) {
		this.draw = draw;
	}
	
	
	
}
