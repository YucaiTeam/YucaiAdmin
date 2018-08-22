package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TQuestion;
import com.hyg.yucai.model.TQuestionExample;
import com.hyg.yucai.model.TQuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionMapper {
    int countByExample(TQuestionExample example);

    int deleteByExample(TQuestionExample example);

    int deleteByPrimaryKey(Integer questionid);

    int insert(TQuestionWithBLOBs record);

    int insertSelective(TQuestionWithBLOBs record);

    List<TQuestionWithBLOBs> selectByExampleWithBLOBs(TQuestionExample example);

    List<TQuestion> selectByExample(TQuestionExample example);

    TQuestionWithBLOBs selectByPrimaryKey(Integer questionid);

    int updateByExampleSelective(@Param("record") TQuestionWithBLOBs record, @Param("example") TQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuestionWithBLOBs record, @Param("example") TQuestionExample example);

    int updateByExample(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByPrimaryKeySelective(TQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TQuestionWithBLOBs record);

    int updateByPrimaryKey(TQuestion record);
}