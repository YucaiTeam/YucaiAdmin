package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankCustom;

public interface TBankService {
	
	
	public List<TBank> findAllBankNameandNo() throws Exception;
	
	public List<TBankCustom> findBankNameByBankNo(String bankno) throws Exception;
	

}
