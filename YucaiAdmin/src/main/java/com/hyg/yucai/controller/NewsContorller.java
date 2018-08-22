package com.hyg.yucai.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankCustom;
import com.hyg.yucai.model.TNews;
import com.hyg.yucai.model.TNewsCustom;
import com.hyg.yucai.service.TAreaService;
import com.hyg.yucai.service.TBankService;
import com.hyg.yucai.service.TNewsService;

@Controller
public class NewsContorller {

	@Autowired
	private TNewsService tNewsService;
	
	@Autowired
	private TBankService tBankService;
	
	@Autowired
	private TAreaService tAreaService;

	
	
	//测试获取地区名
	@RequestMapping("/getareaName")
	@ResponseBody
	public List<TArea> getarea(HttpServletResponse res) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		///获取list
		List<TArea> arealist=tAreaService.findAllAreaNameandNo();
		///利用ResponseBody特性返回json字符串
		//用rs[i][j].xxx拿到
		return arealist;
		
	}
	
	
	///根据地区获取银行
	@RequestMapping("/getbankName")
	@ResponseBody
	public List<TBankCustom> getBankName (HttpServletResponse res,String areano) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		///genjubankno查询bankName
		List<TBankCustom> list=tBankService.findBankNameByBankNo(areano);
		return list;
	}
	
	//查询全部
	@RequestMapping("/list")
	@ResponseBody
	public Map<String,Object>  list(HttpServletResponse res,HttpServletRequest req,TNewsCustom newsCustom) throws Exception {
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		//接收是否正在搜索
		String isSearching=req.getParameter("isSearching");
		//显示draw
		System.out.println(newsCustom.getDraw());
		String start =req.getParameter("startDate");
		String end =req.getParameter("endDate");
		System.out.println("startDate:"+start);
		System.out.println("endDate:"+end);
		
		if(!start.equals("")){
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
			
			Date Startdate=simpleDateFormat.parse(start);
			Date Enddate=simpleDateFormat.parse(end);
			////结束时间加1天
			Calendar cal = Calendar.getInstance();
			cal.setTime(Enddate);
			cal.add(Calendar.DATE, 1);//增加一天 
			Enddate=cal.getTime();

			newsCustom.setStartdate(Startdate);

			newsCustom.setEnddate(Enddate);
			System.out.println(Startdate+","+Enddate);
		}
		
		
		System.out.println("getStartindex:"+newsCustom.getStartindex());
		System.out.println("getPagesize:"+newsCustom.getPagesize());
		
		Map<String,Object> map=new HashMap<>();

		System.out.println(newsCustom.getTextcontent());
		//查询加条件
		List<TNewsCustom> newslist = tNewsService.findAllNewslikeDy(newsCustom);
		int likecount=tNewsService.findAllNewslikeDyAndCount(newsCustom);
		//查询总数
		int count =tNewsService.findAllNewsCount();
		
		///
		System.out.println("count:"+count);
		System.out.println("likecount:"+likecount);
		///准配发送
		if(isSearching.equals("false")){
			map.put("totals", count);
		}else{
			map.put("totals", likecount);
		}
		
		map.put("draw", newsCustom.getDraw());
		map.put("newsList", newslist);

		return map;
	}
		
	
	
	
	////获取地区和银行
	@RequestMapping("/AddNews")
	public String Add(Model model) throws Exception {
		List<TBank> banklist=tBankService.findAllBankNameandNo();
		List<TArea> arealist=tAreaService.findAllAreaNameandNo();
		
		for (TArea tArea : arealist) {
			System.out.println("AreaName:"+tArea.getAreaname()+",AreaNo:"+tArea.getAreano());
		}
		for (TBank tbank : banklist) {
			System.out.println("Name:"+tbank.getBankname()+",No:"+tbank.getBankno());
		}
		model.addAttribute("banklist", banklist);
		model.addAttribute("arealist", arealist);

		return "AddNews";
	}
	///插入新闻
	@RequestMapping("/addnews")
	@ResponseBody
	public String  AddNews(TNews tnews,HttpServletResponse res) throws Exception {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(tnews.getNewscontent()+",");
		tnews.setCreatedate(new Date());
		tnews.setEditdate(new Date());
		int x=tNewsService.insertNews(tnews);
		System.out.println(x);
		if(x>0){
			return "ok";
		}else{
			return "no";
		}
	}
	///删除新闻
	@RequestMapping("/delnews")
	@ResponseBody
	public Map<String,Object> DelNews(HttpServletResponse res,HttpServletRequest req) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		int id=Integer.parseInt(req.getParameter("newsid"));
		TNews news=new TNews();
		news.setNewsid(id);
		int x=tNewsService.deleteById(news);
		///返回json
		Map<String,Object> map=new HashMap<>();
		if(x>0){
			map.put("result", "ok");
			return map;
		}else{
			map.put("result", "no");
			return map;
		}
		
	}
	///更新前显示
	@RequestMapping("/showupdatenews")
	@ResponseBody	
	public Map<String,Object>  showupdate(HttpServletResponse res,HttpServletRequest req) throws Exception {
		//跨域Map<String,Object> ,
		res.setHeader("Access-Control-Allow-Origin", "*");
		////
		int id=Integer.parseInt(req.getParameter("newsid"));
		TNews news=new TNews();
		news.setNewsid(id);
		Map<String,Object> map=new HashMap<>();
		map.put("newsShow", tNewsService.findByIDWithBLOBs(news));

		return map;
	}
	
	
	///更新新闻
	@RequestMapping("/updatenews")
	@ResponseBody
	public Map<String,Object> UpdateNews(HttpServletResponse res,TNews news) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		news.setEditdate(new Date());
		int x=tNewsService.updateById(news);
		////返回json
		Map<String,Object> map=new HashMap<>();
		if(x>0){
			map.put("result", "ok");
			return map;
		}else{
			map.put("result", "no");
			return map;
		}
		
	}
	
	

}
