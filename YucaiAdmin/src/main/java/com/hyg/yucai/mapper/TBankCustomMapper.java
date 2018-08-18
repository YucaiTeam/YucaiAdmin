package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.TBankCustom;

public interface TBankCustomMapper {
	//
    List<TBankCustom> selectBankNameByNo(String bankno);

}
