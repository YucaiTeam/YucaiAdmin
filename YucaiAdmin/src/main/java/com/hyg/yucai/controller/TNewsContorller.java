package com.hyg.yucai.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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
public class TNewsContorller {

	@Autowired
	private TNewsService tNewsService;
	
	@Autowired
	private TBankService tBankService;
	
	@Autowired
	private TAreaService tAreaService;
	

	@RequestMapping("/newsRelease")
	public String aaa(Model model) throws Exception {
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
	//测试json
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
	

	@RequestMapping("/list")
	public String list(Model model,HttpServletResponse res) throws Exception {
		
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		TNewsCustom newsCustom =new TNewsCustom();
		
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//		String start ="2018-02-03 22:22:22";
//		String end ="2018-02-03 22:22:22";
//		Date Startdate=simpleDateFormat.parse(start);
//		Date Enddate=simpleDateFormat.parse(end);
		newsCustom.setStartindex(10);
		newsCustom.setPagesize(5);
		
		
		
		List<TNewsCustom> newslist = tNewsService.findAllNews(newsCustom);
		/*ModelAndView modelandview = new ModelAndView();
		// 把东西放进去
		modelandview.addObject("newsList", newslist);*/
		for (TNewsCustom tNews : newslist) {
			System.out.println(tNews.getNewsauthor());
		}
		model.addAttribute("newsList", newslist);

		return "List";
	}
	@RequestMapping("/index")
	public String jump(Model model,@RequestParam(value="id")Integer iiii ) throws Exception {
		
		System.out.println(iiii);

		return "index";
	}
	
	
	////添加
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
	@RequestMapping("/addnews")
	@ResponseBody
	public String  AddNews(TNews tnews,HttpServletResponse res) throws Exception {
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(tnews.getNewscontent()+",");
		
		int x=tNewsService.insertNews(tnews);
		System.out.println(x);
		/*if(x>0){
			List<TNews> newslist = tNewsService.selectByExampleWithBLOBs();
			for (TNews tNews : newslist) {
				System.out.println(tNews.getNewsauthor());
			}*/
		if(x>0){
			return "ok";
		}else{
			return "no";
		}
		

		
	}

}
