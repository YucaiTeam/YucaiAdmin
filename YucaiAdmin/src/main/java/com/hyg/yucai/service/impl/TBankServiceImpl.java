package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TBankCustomMapper;
import com.hyg.yucai.mapper.TBankMapper;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankExample;
import com.hyg.yucai.model.TBankCustom;
import com.hyg.yucai.service.TBankService;

@Service
public class TBankServiceImpl implements TBankService{

	@Autowired
	private TBankMapper tBankMapper;
	@Autowired
	private TBankCustomMapper tBankItemMapper;
	@Override
	public List<TBank> findAllBankNameandNo() throws Exception {
		
		List<TBank> banklist =tBankMapper.selectBankNameandNo(null);
		return banklist;
	}
	@Override
	public List<TBankCustom> findBankNameByBankNo(String bankno)
			throws Exception {
		List<TBankCustom> tbank=tBankItemMapper.selectBankNameByNo(bankno);
		return tbank;
	}
	

}
