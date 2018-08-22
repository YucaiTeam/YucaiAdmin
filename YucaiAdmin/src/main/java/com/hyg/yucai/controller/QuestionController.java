package com.hyg.yucai.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyg.yucai.model.TQuestion;
import com.hyg.yucai.model.TQuestionCustom;
import com.hyg.yucai.model.TQuestionWithBLOBs;
import com.hyg.yucai.service.TQuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	private TQuestionService tQuestionService;
	
	
	//模糊查询所有
	@RequestMapping("/findAllQuestion")
	@ResponseBody
	public List<TQuestion> findAllQuestion(HttpServletResponse res,HttpServletRequest req,TQuestionCustom tQuestionCustom) throws Exception{
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		return tQuestionService.findAllQuestion(tQuestionCustom);
	}
	///添加题库
	@RequestMapping("/addQuestion")
	@ResponseBody
	public String addQuestion(HttpServletResponse res,HttpServletRequest req,TQuestionWithBLOBs tQuestion) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		tQuestion.setCreatedate(new Date());
		
		int x=tQuestionService.addQuestion(tQuestion);
		if(x>0){
			return "addtrue";
		}else{
			return "addfalse";
		}
	}
	//更新题目
	@RequestMapping("/updateQuestion")
	@ResponseBody
	public String updateQuestion(HttpServletResponse res,HttpServletRequest req,TQuestionWithBLOBs tQuestion) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		tQuestion.setEditdate(new Date());
		int x=tQuestionService.updateQuestion(tQuestion);
		if(x>0){
			return "addtrue";
		}else{
			return "addfalse";
		}
	}
	//更新题目前根据id查询
	@RequestMapping("/updateQuestionShow")
	@ResponseBody
	public TQuestionWithBLOBs updateQuestion(HttpServletResponse res,HttpServletRequest req) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		//int id=Integer.parseInt(req.getParameter("questionId"));
		int id=2;
		return tQuestionService.findQuestionByid(id);
	}
	///
	@RequestMapping("/delQuestion")
	@ResponseBody
	public String delQuestion(HttpServletResponse res,HttpServletRequest req) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		//int id=Integer.parseInt(req.getParameter("questionId"));
		int id=4;
		int x=tQuestionService.delQuestion(4);
		if(x>0){
			return "delQuestiontrue";
		}else{
			return "delQuestionfalse";
		}
	}
	

}
