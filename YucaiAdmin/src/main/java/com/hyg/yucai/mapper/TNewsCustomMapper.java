package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.TNewsCustom;

public interface TNewsCustomMapper {
	//查询所有的新闻，连表
	public List<TNewsCustom> selectAllNews(TNewsCustom newsCustom) throws Exception;
	//查询所有的新闻，动态连表
	public List<TNewsCustom> selectAllNewsByDy(TNewsCustom newsCustom) throws Exception;
	//查询新闻，动态连表
	public List<TNewsCustom> selectNewsByDy(TNewsCustom newsCustom) throws Exception;
	//查询所有的新闻，动态模糊连表
	public List<TNewsCustom> selectAllNewslikeDy(TNewsCustom newsCustom) throws Exception;
	//查询所有的新闻，动态模糊连表,条数
	public int selectAllNewslikeDyAndCount(TNewsCustom newsCustom) throws Exception;
	

}
