package com.hyg.yucai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TAbMapper;
import com.hyg.yucai.model.TAb;
import com.hyg.yucai.model.TAbExample;
import com.hyg.yucai.service.TAbService;

@Service
public class TAbServiceImpl implements TAbService{
	@Autowired
	private TAbMapper tAbMapper;

	///插入银行编号和地区编号
	@Override
	public int addAreanoAndBankno(TAb tAb) throws Exception {
		int x=tAbMapper.insertSelective(tAb);
		return x;
	}
	//根据条件删除信息
	@Override
	public int delAreanoAndBankno(TAbExample abExample) throws Exception {
		int x=tAbMapper.deleteByExample(abExample);
		return x;
	}
	//根据条件更新
	@Override
	public int updateAreanoAndBankno(TAb tAb,TAbExample abExampl) throws Exception {
		int x=tAbMapper.updateByExampleSelective(tAb, abExampl);
		return x;
	}
	

}
