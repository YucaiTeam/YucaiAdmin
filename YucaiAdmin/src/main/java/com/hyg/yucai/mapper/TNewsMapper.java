package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TNews;
import com.hyg.yucai.model.TNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNewsMapper {
    long countByExample(TNewsExample example);

    int deleteByExample(TNewsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(TNews record);

    int insertSelective(TNews record);

    List<TNews> selectByExampleWithBLOBs(TNewsExample example);

    List<TNews> selectByExample(TNewsExample example);

    TNews selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") TNews record, @Param("example") TNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") TNews record, @Param("example") TNewsExample example);

    int updateByExample(@Param("record") TNews record, @Param("example") TNewsExample example);

    int updateByPrimaryKeySelective(TNews record);

    int updateByPrimaryKeyWithBLOBs(TNews record);

    int updateByPrimaryKey(TNews record);
}