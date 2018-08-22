package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TNews;
import com.hyg.yucai.model.TNewsCustom;

public interface TNewsService {

	public List<TNews> selectByExampleWithBLOBs() throws Exception;
	
	
	///多个表查所有news
	public List<TNewsCustom> findAllNews(TNewsCustom newsCustom) throws Exception;
	///动态查
	public List<TNewsCustom> findAllNewsByDy(TNewsCustom newsCustom) throws Exception;
	//模糊查
	public List<TNewsCustom> findAllNewslikeDy(TNewsCustom newsCustom) throws Exception;
	//查询总数
	public int findAllNewsCount() throws Exception;
	//根据id擦汗寻
	public TNews findByIDWithBLOBs(TNews news) throws Exception;
	//查询新闻单
	public List<TNewsCustom> findNewsByDy(TNewsCustom newsCustom) throws Exception;
	
	//模糊查条数
	public int findAllNewslikeDyAndCount(TNewsCustom newsCustom) throws Exception;
	public int insertNews(TNews news) throws Exception;

	//删除news
	public int deleteById(TNews news) throws Exception;
	//更新所有根据ID
	public int updateById(TNews news) throws Exception;
	
	
}