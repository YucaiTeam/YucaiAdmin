package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.BankToArea;

public interface BankToAreaMapper {
	public List<BankToArea> selectAllAreaByBank(String bankno);

}
