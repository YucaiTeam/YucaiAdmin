package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.AreaToBank;
import com.hyg.yucai.model.BankToArea;

public interface BankAndAreaService {
	///根据bankno找area
	public List<BankToArea> findAllAreabyBank(String bankno) throws Exception;
	//根据areano找bank
	public List<AreaToBank> findAllBankByArea(String areano) throws Exception;

}
