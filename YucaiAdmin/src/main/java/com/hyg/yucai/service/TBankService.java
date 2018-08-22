package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankCustom;

public interface TBankService {
	
	//找银行名和编号
	public List<TBank> findAllBankNameandNo() throws Exception;
	//根据id查找信息
	public TBank findBankById(int id) throws Exception;
	//找名根据 编号
	public List<TBankCustom> findBankNameByBankNo(String bankno) throws Exception;
	//添加银行
	public int addBank(TBank tBank) throws Exception;
	//修改银行
	public int updateBank(TBank tBank) throws Exception;
	//删除银行
	public int delBank(TBank tBank) throws Exception;

}
