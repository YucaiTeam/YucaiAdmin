package com.hyg.yucai.service;

import com.hyg.yucai.model.TAb;
import com.hyg.yucai.model.TAbExample;


public interface TAbService {
	//插入银行号和地区号
	public int addAreanoAndBankno(TAb tAb) throws Exception; 
	//根据条件删除信息
	public int delAreanoAndBankno(TAbExample abExample) throws Exception;
	//根据条件更新
	public int updateAreanoAndBankno(TAb tAb,TAbExample abExampl) throws Exception;
	
	

}
