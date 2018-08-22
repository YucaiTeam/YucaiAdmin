package com.hyg.yucai.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyg.yucai.model.TCouresAndSeries;
import com.hyg.yucai.model.TCourse;
import com.hyg.yucai.model.TCourseExample;
import com.hyg.yucai.model.TSeries;
import com.hyg.yucai.service.TCourseAndSeriesService;
import com.hyg.yucai.service.TCourseService;
import com.hyg.yucai.service.TSeriesService;

@Controller
public class SeriesAndCourseController {

	@Autowired
	private TCourseAndSeriesService tCourseAndSeriesMapperService;
	@Autowired
	private TSeriesService tSeriesService;
	@Autowired
	private TCourseService tCourseService;
	
	
	
	//获取所有系列
	@RequestMapping("/findallseries")
	@ResponseBody
	public List<TSeries> getAllSeries(HttpServletResponse res,HttpServletRequest req) {
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		//挑系列和id
		return tSeriesService.findAllSeries();
		
	}
	
	//添加课程
	@RequestMapping("/addCourse")
	@ResponseBody
	public String addOneCourse(HttpServletResponse res,HttpServletRequest req,TCourse tCourse) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		tCourse.setCreatedate(new Date());
		tCourse.setEditdate(new Date());
		int i = tCourseService.addOneCourse(tCourse);
		if(i>0){
			return "true";
		}
		else{
			return "false";
		}
	}
	//添加系列
	@RequestMapping("/addSeries")
	@ResponseBody
	public String addOneSeries(HttpServletResponse res,HttpServletRequest req,TSeries tSeries) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		tSeries.setCreatedate(new Date());
		tSeries.setEditdate(new Date());
		int i = tSeriesService.addOneSeries(tSeries);
		if(i>0){
			return "true";
		}
		else{
			return "false";
		}
		
	}
	
	//获取一对多系列一个系列对应很多条课程
	@RequestMapping("/getSeriesAndCourse")
	@ResponseBody
	public List<TCouresAndSeries> getCourseAndSeriesMapper(HttpServletResponse res,HttpServletRequest req) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		List<TCouresAndSeries> list = tCourseAndSeriesMapperService.findCourseAndSeries();
		
		return list;
	}
	
	//根据系列Id获取系列id所对应的所有课程
	@RequestMapping("/getCourseBySeriesId")
	@ResponseBody
	public List<TCourse> getAllCourse(HttpServletResponse res,HttpServletRequest req,TCourse tCourse){
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		int id=Integer.parseInt(req.getParameter("seriesId"));
		tCourse.setSeriesid(id);
		TCourseExample tCourseExample = new TCourseExample();
		tCourseExample.createCriteria().andSeriesidEqualTo(tCourse.getSeriesid());
		//
		//tCourse.getSeriesid();
		return tCourseService.findAllCourseBySeriesId(tCourseExample);
		
	}
	//根据系列Id获取系列id所对应的所有课程
	@RequestMapping("/getCourseByCourseId")
	@ResponseBody
	public TCourse getAllCourseById(HttpServletResponse res,HttpServletRequest req,TCourse tCourse) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		int id=Integer.parseInt(req.getParameter("courseId"));
		tCourse.setCourseid(id);
		Map<String,Object> map=new HashMap();
//		tCourse.setSeriesid(id);
//		TCourseExample tCourseExample = new TCourseExample();
//		tCourseExample.createCriteria().andSeriesidEqualTo(tCourse.getSeriesid());
		//
		//tCourse.getSeriesid();
		
		
		return tCourseService.findCourseById(tCourse);
		
	}
	
	//删除系列
	//如果删除系列 请清空该系列内所有的课程
	@RequestMapping("/delSeries")
	@ResponseBody
	public String deleteOneSeries(HttpServletResponse res,HttpServletRequest req,TSeries tSeries) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setContentType("text/html;charset=utf-8");
		int id=Integer.parseInt(req.getParameter("seriesId"));
		tSeries.setSeriesid(id);
		try {
			int i = tSeriesService.deleteOneSeries(tSeries.getSeriesid());
			if(i>0){
				return "true";
			}
			else{
				return "请先删除系列里的课程";
			}
		} catch (Exception e) {
			return "请先删除系列里的课程";
		}
	}
	//修改系列
	@RequestMapping("/updateSeries")
	@ResponseBody
	public String updateOneSeries(HttpServletResponse res,HttpServletRequest req,TSeries tSeries) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		tSeries.setSeriesid(1);
		tSeries.setSeriesname("笔试基础通关系列");
		tSeries.setEditdate(new Date());
		int i = tSeriesService.updateOneSeries(tSeries);
		if(i>0){
			return "true";
		}
		else{
			return "false";
		}
		
	}
	
	//删除课程
	@RequestMapping("/delCourse")
	@ResponseBody
	public String deleteOneCourse(HttpServletResponse res,HttpServletRequest req,TCourse tCourse) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//测试
		int id=Integer.parseInt(req.getParameter("courseId"));
		tCourse.setCourseid(id);
		
		int i = tCourseService.deleteOneCourse(tCourse.getCourseid());
		
		if(i>0){
			return "true";
		}
		else{
			return "false";
		}
		
	} 
	//修改课程
	@RequestMapping("/updateCourse")
	@ResponseBody
	public String updateOneCourse(HttpServletResponse res,HttpServletRequest req,TCourse tCourse) {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		tCourse.setEditdate(new Date());
		int i = tCourseService.updateOneCourse(tCourse);
		if(i>0){
			return "true";
		}
		else{
			return "false";
		}
	}
	
}
