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
	//查询areaNameAndNo
	@Override
	public List<TArea> findAllAreaNameandNo() throws Exception {
		
		List<TArea> arealist=tAreaMapper.selectAllNameAndNo(null);
		return arealist;
	}
	//添加地区
	@Override
	public int addArea(TArea tArea) throws Exception {
		int x=tAreaMapper.insertSelective(tArea);
		return x;
	}
	//修改地区
	@Override
	public int updateArea(TArea tArea) throws Exception {
		int x=tAreaMapper.updateByPrimaryKeySelective(tArea);
		return x;
	}
	//删除地区
	@Override
	public int delArea(TArea tArea) throws Exception {
		int x=tAreaMapper.deleteByPrimaryKey(tArea.getAreaid());
		return x;
	}
	///根据id查询地区
	@Override
	public TArea findAreaById(int id) throws Exception {
		
		return tAreaMapper.selectByPrimaryKey(id);
	}

}
