package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TSeriesMapper;
import com.hyg.yucai.model.TSeries;
import com.hyg.yucai.service.TSeriesService;


@Service
public class TSeriesServiceImpl implements TSeriesService{

	@Autowired
	private TSeriesMapper tSeriesMapper;
	@Override
	public List<TSeries> findAllSeries() {
		// TODO Auto-generated method stub

		return tSeriesMapper.selectByExample(null);
	}
	//添加系列
	@Override
	public int addOneSeries(TSeries tSeries) {
		// TODO Auto-generated method stub
		return tSeriesMapper.insertSelective(tSeries);
	}
	//删除系列
	@Override
	public int deleteOneSeries(int seriesid) {
		// TODO Auto-generated method stub
		return tSeriesMapper.deleteByPrimaryKey(seriesid);
	}
	//修改系列
	@Override
	public int updateOneSeries(TSeries tSeries) {
		// TODO Auto-generated method stub
		return tSeriesMapper.updateByPrimaryKeySelective(tSeries);
	}

}
