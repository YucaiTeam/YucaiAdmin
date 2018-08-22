package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TArea;

public interface TAreaService {
	//查询areaNameAndNo
	public List<TArea> findAllAreaNameandNo() throws Exception;
	///根据id查询
	public TArea findAreaById(int id) throws Exception;
	//添加地区
	public int addArea(TArea tArea)throws Exception;
	//修改地区
	public int updateArea(TArea tArea)throws Exception;
	//删除地区
	public int delArea(TArea tArea)throws Exception;

}
