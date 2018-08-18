package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAreaMapper {
    int countByExample(TAreaExample example);

    int deleteByExample(TAreaExample example);

    int deleteByPrimaryKey(Integer areaid);

    int insert(TArea record);

    int insertSelective(TArea record);

    List<TArea> selectByExample(TAreaExample example);
    
    
    List<TArea> selectAllNameAndNo(TAreaExample example);

    TArea selectByPrimaryKey(Integer areaid);

    int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}