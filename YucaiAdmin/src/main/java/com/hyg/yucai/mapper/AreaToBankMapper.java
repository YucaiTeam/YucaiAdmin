package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.AreaToBank;

public interface AreaToBankMapper {
	
	//根据areano查bank
	List<AreaToBank> selectAllBankByArea(String areano);

}
