package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TSeries;

public interface TSeriesService {

	//获取所有系列
	public List<TSeries> findAllSeries();
	
	//添加系列
	public int addOneSeries(TSeries tSeries);
	
	//删除系列
	public int deleteOneSeries(int seriesid);
	//修改系列
	public int updateOneSeries(TSeries tSeries);
}
