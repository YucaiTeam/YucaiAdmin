package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TCourseMapper;
import com.hyg.yucai.model.TCourse;
import com.hyg.yucai.model.TCourseExample;
import com.hyg.yucai.service.TCourseService;

@Service
public class TCourseServiceImpl implements TCourseService {

	@Autowired
	private TCourseMapper tCourseMapper;
	@Override
	public List<TCourse> findAllCourseBySeriesId(TCourseExample example) {
		// TODO Auto-generated method stub
		return tCourseMapper.selectByExample(example);
	}
	@Override
	public int addOneCourse(TCourse tCourse) {
		// TODO Auto-generated method stub
		return tCourseMapper.insertSelective(tCourse);
	}
	@Override
	public int deleteOneCourse(int courseid) {
		// TODO Auto-generated method stub
		return tCourseMapper.deleteByPrimaryKey(courseid);
	}
	@Override
	public int updateOneCourse(TCourse tCourse) {
		// TODO Auto-generated method stub
		return tCourseMapper.updateByPrimaryKey(tCourse);
	}
	@Override
	public TCourse findCourseById(TCourse tCourse) throws Exception {
		// TODO Auto-generated method stub
		return tCourseMapper.selectByPrimaryKey(tCourse.getCourseid());
	}

}
