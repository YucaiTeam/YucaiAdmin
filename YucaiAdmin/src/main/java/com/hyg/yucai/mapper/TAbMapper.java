package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TAb;
import com.hyg.yucai.model.TAbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAbMapper {
    long countByExample(TAbExample example);

    int deleteByExample(TAbExample example);

    int deleteByPrimaryKey(Integer abid);

    int insert(TAb record);

    int insertSelective(TAb record);

    List<TAb> selectByExample(TAbExample example);

    TAb selectByPrimaryKey(Integer abid);

    int updateByExampleSelective(@Param("record") TAb record, @Param("example") TAbExample example);

    int updateByExample(@Param("record") TAb record, @Param("example") TAbExample example);

    int updateByPrimaryKeySelective(TAb record);

    int updateByPrimaryKey(TAb record);
}