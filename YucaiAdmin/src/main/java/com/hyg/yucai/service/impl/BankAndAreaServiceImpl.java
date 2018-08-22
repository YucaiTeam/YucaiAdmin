package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.AreaToBankMapper;
import com.hyg.yucai.mapper.BankToAreaMapper;
import com.hyg.yucai.model.AreaToBank;
import com.hyg.yucai.model.BankToArea;
import com.hyg.yucai.service.BankAndAreaService;


@Service
public class BankAndAreaServiceImpl implements BankAndAreaService{

	@Autowired
	private BankToAreaMapper bankToAreaMapper;
	@Autowired
	private AreaToBankMapper areaToBankMapper;
	@Override
	public List<BankToArea> findAllAreabyBank(String bankno) throws Exception {
		List<BankToArea> list=bankToAreaMapper.selectAllAreaByBank(bankno);
		return list;
	}
	@Override
	public List<AreaToBank> findAllBankByArea(String areano) throws Exception {
		List<AreaToBank> list=areaToBankMapper.selectAllBankByArea(areano);
		return list;
	}

	
}
