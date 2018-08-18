package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TNewsCustomMapper;
import com.hyg.yucai.mapper.TNewsMapper;
import com.hyg.yucai.model.TNews;
import com.hyg.yucai.model.TNewsCustom;
import com.hyg.yucai.service.TNewsService;

@Service
public class TNewsServiceImpl implements TNewsService{
	
	@Autowired
	private TNewsMapper tNewsmapper;
	@Autowired
	private TNewsCustomMapper tNewsCustomMapper;
	@Override
	public List<TNews> selectByExampleWithBLOBs() throws Exception {
		//查询数据库
		List<TNews> list = tNewsmapper.selectByExampleWithBLOBs(null);
		return list;
	}
	@Override
	public int insertNews(TNews news) throws Exception {
		int x=tNewsmapper.insertSelective(news);
		return x;
	}
	@Override
	public List<TNewsCustom> findAllNews(TNewsCustom newsCustom) throws Exception {
		List<TNewsCustom> newscustomlist=tNewsCustomMapper.selectAllNews(newsCustom);
		return newscustomlist;
	}
	@Override
	public List<TNewsCustom> findAllNewsByDy(TNewsCustom newsCustom)
			throws Exception {
		List<TNewsCustom> newscustomlist=tNewsCustomMapper.selectAllNewsByDy(newsCustom);
		return newscustomlist;
	}
	@Override
	public List<TNewsCustom> findAllNewslikeDy(TNewsCustom newsCustom) throws Exception {
		List<TNewsCustom> newscustomlist=tNewsCustomMapper.selectAllNewslikeDy(newsCustom);
		return newscustomlist;
	}

}
