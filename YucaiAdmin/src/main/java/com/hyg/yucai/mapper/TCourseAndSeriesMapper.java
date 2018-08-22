package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.TCouresAndSeries;

public interface TCourseAndSeriesMapper {
	//一对多查询系列 以及 系列所对应的课程
	public List<TCouresAndSeries> selectCourseAndSeries();
	
}
