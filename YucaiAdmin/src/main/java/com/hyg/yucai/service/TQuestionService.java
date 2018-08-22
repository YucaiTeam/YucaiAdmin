package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TQuestion;
import com.hyg.yucai.model.TQuestionCustom;
import com.hyg.yucai.model.TQuestionExample;
import com.hyg.yucai.model.TQuestionWithBLOBs;

public interface TQuestionService {
	//查询练习题
	public List<TQuestion> findAllQuestion(TQuestionCustom tQuestionCustom) throws Exception;
	//添加每日一练
	public int addQuestion(TQuestionWithBLOBs tQuestion) throws Exception;
	///根据id查询
	public TQuestionWithBLOBs findQuestionByid(int id) throws Exception;
	//修改
	public int updateQuestion(TQuestionWithBLOBs tQuestion) throws Exception;
	//删除
	public int delQuestion(int id) throws Exception;
}
