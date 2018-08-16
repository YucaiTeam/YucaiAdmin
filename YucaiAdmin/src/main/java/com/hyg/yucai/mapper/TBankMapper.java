package com.hyg.yucai.mapper;

import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBankMapper {
    long countByExample(TBankExample example);

    int deleteByExample(TBankExample example);

    int deleteByPrimaryKey(Integer bankid);

    int insert(TBank record);

    int insertSelective(TBank record);

    List<TBank> selectByExample(TBankExample example);

    TBank selectByPrimaryKey(Integer bankid);

    int updateByExampleSelective(@Param("record") TBank record, @Param("example") TBankExample example);

    int updateByExample(@Param("record") TBank record, @Param("example") TBankExample example);

    int updateByPrimaryKeySelective(TBank record);

    int updateByPrimaryKey(TBank record);
}