package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TCourse;
import com.hyg.yucai.model.TCourseExample;

public interface TCourseService {

	//根据seriesId查询课程
	public List<TCourse> findAllCourseBySeriesId(TCourseExample example);
	//添加课程
	public int addOneCourse(TCourse tCourse);
	//删除课程
	public int deleteOneCourse(int courseid);
	//修改课程
	public int updateOneCourse(TCourse tCourse);
	//根据id查找课程
	public TCourse findCourseById(TCourse tCourse) throws Exception;
}
