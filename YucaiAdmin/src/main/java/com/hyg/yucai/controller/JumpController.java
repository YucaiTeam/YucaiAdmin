package com.hyg.yucai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {
	/**
	 * 主页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index")
	public String Index() throws Exception {
		return "index";
	}
	
	/**
	 * 发布课程页面
	 * @return
	 */
	@RequestMapping("/courseRelease")
	public String CourseRelease(){
		System.out.println("c");
		return "course/courseRelease";
		
	}
	/**
	 * 课程列表页面
	 * @return
	 */
	@RequestMapping("/courseList")
	public String CourseList(){
		return "course/courseList";
	}
	
	/**
	 * 新闻列表页面
	 * @return
	 */
	@RequestMapping("/newsList")
	public String NewsList(){
		return "news/newsList";
	}
	
	
	/**
	 * 跳转到上传新闻页面
	 * @return
	 */
	@RequestMapping("/newsRelease")
	public String NewsRelease(){
		return "news/newsRelease";
	}
}



















