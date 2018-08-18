package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TAreaMapper;
import com.hyg.yucai.model.TArea;
import com.hyg.yucai.service.TAreaService;


@Service
public class TAreaServiceImpl implements TAreaService{

	@Autowired
	private TAreaMapper tAreaMapper;
	
	@Override
	public List<TArea> findAllAreaNameandNo() throws Exception {
		
		List<TArea> arealist=tAreaMapper.selectAllNameAndNo(null);
		return arealist;
	}

}
