package com.hyg.yucai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankExample;

public interface TBankMapper {
    int countByExample(TBankExample example);

    int deleteByExample(TBankExample example);

    int deleteByPrimaryKey(Integer bankid);

    int insert(TBank record);

    int insertSelective(TBank record);

    List<TBank> selectByExample(TBankExample example);
    //    
    List<TBank> selectBankNameandNo(TBankExample example);
    
    ///
    TBank selectByPrimaryKey(Integer bankid);

    int updateByExampleSelective(@Param("record") TBank record, @Param("example") TBankExample example);

    int updateByExample(@Param("record") TBank record, @Param("example") TBankExample example);

    int updateByPrimaryKeySelective(TBank record);

    int updateByPrimaryKey(TBank record);
}