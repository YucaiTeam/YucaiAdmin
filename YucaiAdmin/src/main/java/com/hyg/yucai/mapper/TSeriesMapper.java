package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TSeries;
import com.hyg.yucai.model.TSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSeriesMapper {
    int countByExample(TSeriesExample example);

    int deleteByExample(TSeriesExample example);

    int deleteByPrimaryKey(Integer seriesid);

    int insert(TSeries record);

    int insertSelective(TSeries record);

    List<TSeries> selectByExample(TSeriesExample example);

    TSeries selectByPrimaryKey(Integer seriesid);

    int updateByExampleSelective(@Param("record") TSeries record, @Param("example") TSeriesExample example);

    int updateByExample(@Param("record") TSeries record, @Param("example") TSeriesExample example);

    int updateByPrimaryKeySelective(TSeries record);

    int updateByPrimaryKey(TSeries record);
}