package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TNotice;
import com.hyg.yucai.model.TNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNoticeMapper {
    long countByExample(TNoticeExample example);

    int deleteByExample(TNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TNotice record);

    int insertSelective(TNotice record);

    List<TNotice> selectByExample(TNoticeExample example);

    int updateByExampleSelective(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByExample(@Param("record") TNotice record, @Param("example") TNoticeExample example);
}