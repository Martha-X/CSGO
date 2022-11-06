package com.electronic.boot.mapper;

import com.electronic.boot.bean.RechargeRecord;
import com.electronic.boot.bean.RechargeRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RechargeRecordMapper {
    long countByExample(RechargeRecordExample example);

    int deleteByExample(RechargeRecordExample example);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    List<RechargeRecord> selectByExample(RechargeRecordExample example);

    int updateByExampleSelective(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);

    int updateByExample(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);
}