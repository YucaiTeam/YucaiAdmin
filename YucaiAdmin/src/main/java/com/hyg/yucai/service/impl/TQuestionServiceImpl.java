package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TQuestionCustomMapper;
import com.hyg.yucai.mapper.TQuestionMapper;
import com.hyg.yucai.model.TQuestion;
import com.hyg.yucai.model.TQuestionCustom;
import com.hyg.yucai.model.TQuestionWithBLOBs;
import com.hyg.yucai.service.TQuestionService;

@Service
public class TQuestionServiceImpl implements TQuestionService{
	@Autowired
	private TQuestionMapper tQuestionMapper;
	@Autowired
	private TQuestionCustomMapper tQuestionCustomMapper;

	@Override
	public List<TQuestion> findAllQuestion(TQuestionCustom tQuestionCustom) throws Exception {
		return tQuestionCustomMapper.selectByLikeWithBLOBs(tQuestionCustom);
	}

	@Override
	public int addQuestion(TQuestionWithBLOBs tQuestion) throws Exception {
		return tQuestionMapper.insertSelective(tQuestion);
	}

	@Override
	public TQuestionWithBLOBs findQuestionByid(int id)
			throws Exception {
		
		return tQuestionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateQuestion(TQuestionWithBLOBs tQuestion) throws Exception {
		
		return tQuestionMapper.updateByPrimaryKeySelective(tQuestion);
	}

	@Override
	public int delQuestion(int id) throws Exception {
		
		return tQuestionMapper.deleteByPrimaryKey(id);
	}

}
