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
	
	public int insertNews(TNews news) throws Exception;
	
	
	
}