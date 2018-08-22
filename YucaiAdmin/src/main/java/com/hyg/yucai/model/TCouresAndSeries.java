package com.hyg.yucai.model;

import java.util.List;

public class TCouresAndSeries{
	//添加两个字段
	private int seriesid;
	private String seriesname;
	//TCourse对象
	private List<TCourse> tCourse;
	
	public int getSeriesid() {
		return seriesid;
	}
	public void setSeriesid(int seriesid) {
		this.seriesid = seriesid;
	}
	public String getSeriesname() {
		return seriesname;
	}
	public void setSeriesname(String seriesname) {
		this.seriesname = seriesname;
	}
	public List<TCourse> gettCourse() {
		return tCourse;
	}
	public void settCourse(List<TCourse> tCourse) {
		this.tCourse = tCourse;
	}
	
	
	
}
