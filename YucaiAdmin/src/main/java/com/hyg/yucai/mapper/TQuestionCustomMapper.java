package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.TQuestion;
import com.hyg.yucai.model.TQuestionCustom;

public interface TQuestionCustomMapper {
	
	List<TQuestion> selectByLikeWithBLOBs(TQuestionCustom tQuestionCustom);

}
