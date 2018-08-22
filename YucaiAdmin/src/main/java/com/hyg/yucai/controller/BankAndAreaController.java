package com.hyg.yucai.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyg.yucai.model.AreaToBank;
import com.hyg.yucai.model.BankToArea;
import com.hyg.yucai.model.TAb;
import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.service.BankAndAreaService;
import com.hyg.yucai.service.TAbService;
import com.hyg.yucai.service.TAreaService;
import com.hyg.yucai.service.TBankService;


@Controller
public class BankAndAreaController {
	
	@Autowired
	private BankAndAreaService bankAndAreaService;
	@Autowired
	private TBankService tBankService;
	@Autowired
	private TAreaService tAreaService;
	@Autowired
	private TAbService tAbService;
	
	
	//获取所有area
	@RequestMapping("/findAllArea")
	@ResponseBody
	public List<BankToArea> getAllArea(HttpServletResponse res,HttpServletRequest req) throws Exception{
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		//挑系列和id
		return bankAndAreaService.findAllAreabyBank(null);
		
	}
	//根据银行no获取所有area
	@RequestMapping("/findAllAreaByBankno")
	@ResponseBody
	public List<BankToArea> getAllAreaby(HttpServletResponse res,HttpServletRequest req) throws Exception{
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		//挑系列和id
		return bankAndAreaService.findAllAreabyBank("20010");
		
	}
	//获取所有bank
	@RequestMapping("/findAllBank")
	@ResponseBody
	public List<AreaToBank> getAllBank(HttpServletResponse res,HttpServletRequest req) throws Exception{
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		//挑系列和id
		return bankAndAreaService.findAllBankByArea(null);
		
	}
	//获取所有bankby
	@RequestMapping("/findAllBankByAreano")
	@ResponseBody
	public List<AreaToBank> getAllBankBy(HttpServletResponse res,HttpServletRequest req) throws Exception{
		//跨域Map<String,Object> 
		res.setHeader("Access-Control-Allow-Origin", "*");
		//挑系列和id
		return bankAndAreaService.findAllBankByArea("00531");
		
	}
	//测试获取地区名
	@RequestMapping("/getAreaName")
	@ResponseBody
	public List<TArea> getAreaName(HttpServletResponse res) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		///获取list
		List<TArea> arealist=tAreaService.findAllAreaNameandNo();
		///利用ResponseBody特性返回json字符串
		//用rs[i][j].xxx拿到
		return arealist;
		
	}
	//测试获取银行名
	@RequestMapping("/getBankName")
	@ResponseBody
	public List<TBank> getBankName(HttpServletResponse res) throws Exception{
		res.setHeader("Access-Control-Allow-Origin", "*");
		///获取list
		List<TBank> banklist=tBankService.findAllBankNameandNo();
		///利用ResponseBody特性返回json字符串
		//用rs[i][j].xxx拿到
		return banklist;
	}
	//添加地区
	//选择银行编号同时添加到连接表
	@RequestMapping("/addAreaInfo")
	@ResponseBody
	public String addAreaInfo(HttpServletResponse res,HttpServletRequest req,TArea tArea) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String bankno=req.getParameter("bankno");
		String areano=tArea.getAreano();
		tArea.setCreatedate(new Date());
		tArea.setEditdate(new Date());
		///测试数据
		tArea.setAreaname("测试地区");
		tArea.setAreano("vvvvb");
		///
		int x=tAreaService.addArea(tArea);
		if(x>0){
			TAb tAb=new TAb();
			tAb.setAreano(tArea.getAreano());
			//tAb.setBankno(bankno);
			tAb.setBankno("20011");
			int y=tAbService.addAreanoAndBankno(tAb);
			if(y>0){
				return "addareatrue";
			}else{
				return "addabfase";
			}
			
		}else{
			return "addareafalse";
		}
	}
	//添加银行
	//选择银行编号同时添加到连接表
	@RequestMapping("/addBankInfo")
	@ResponseBody
	public String addBankInfo(HttpServletResponse res,HttpServletRequest req,TBank tBank) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String areano=req.getParameter("bankno");
		tBank.setCreatedate(new Date());
		tBank.setEditdate(new Date());
		///测试数据
		tBank.setBankname("测试数据1");
		tBank.setBankno("yyyyx");

		int x=tBankService.addBank(tBank);
		if(x>0){
			TAb tAb=new TAb();
			//tAb.setAreano(areano);
			tAb.setAreano("00531");
			tAb.setBankno(tBank.getBankno());
			int y=tAbService.addAreanoAndBankno(tAb);
			if(y>0){
				return "addbanktrue";
			}else{
				return "addabfase";
			}
			
		}else{
			return "addbankfalse";
		}
	}
	///修改前显示地区
	@RequestMapping("/updateAreaInfoShow")
	@ResponseBody
	public TArea updateAreaInfoShow(HttpServletResponse res,HttpServletRequest req)throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//int id=Integer.parseInt(req.getParameter("areaId"));
		//return tAreaService.findAreaById(id);
		return tAreaService.findAreaById(2);
	}
	///修改地区
	///数据库自动修改ab表
	@RequestMapping("/updateAreaInfo")
	@ResponseBody
	public String updateAreaInfo(HttpServletResponse res,HttpServletRequest req,TArea tArea) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String oldareano=req.getParameter("oldareano");
		//String areano=tArea.getAreano();
		tArea.setEditdate(new Date());
		int x=tAreaService.updateArea(tArea);
		if(x>0){
			return "upareatrue";

		}else{
			return "upareafalse";
		}
	}
	//修改前显示
	@RequestMapping("/updateBankInfoShow")
	@ResponseBody
	public TBank updateBankInfoShow(HttpServletResponse res,HttpServletRequest req)throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//int id=Integer.parseInt(req.getParameter("bankId"));
		//return tBankService.findBankById(id);
		return tBankService.findBankById(2);
	}
	//修改银行
	//如果修改的是no，数据库自动遍历修改
	@RequestMapping("/updateBankInfo")
	@ResponseBody
	public String updateBankInfo(HttpServletResponse res,HttpServletRequest req,TBank tBank) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String bankno=tBank.getBankno();
		//String areano=req.getParameter("bankno");
		tBank.setEditdate(new Date());
		int x=tBankService.updateBank(tBank);
		if(x>0){
			return "updatebanktrue";
		}else{
			return "updatebankfalse";
		}
	}
	///删除地区
	///数据库自动修改ab表
	@RequestMapping("/delAreaInfo")
	@ResponseBody
	public String delAreaInfo(HttpServletResponse res,HttpServletRequest req,TArea tArea) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String oldareano=req.getParameter("oldareano");
		//String areano=tArea.getAreano();
		tArea.setAreaid(10);
		int x=tAreaService.delArea(tArea);
		if(x>0){
			return "delareatrue";
		}else{
			return "delareafalse";
		}
	}
	//删除银行
	//如果删除的是no，数据库自动遍历修改
	@RequestMapping("/delBankInfo")
	@ResponseBody
	public String delBankInfo(HttpServletResponse res,HttpServletRequest req,TBank tBank) throws Exception{
		//跨域
		res.setHeader("Access-Control-Allow-Origin", "*");
		//String bankno=tBank.getBankno();
		//String areano=req.getParameter("bankno");
		int x=tBankService.delBank(tBank);
		if(x>0){
			return "delbanktrue";
		}else{
			return "delbankfalse";
		}
	}
	
	
	
	
	
	

}