package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentSellRecord;
import com.electronic.boot.bean.OrnamentSellRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrnamentSellRecordMapper {
    long countByExample(OrnamentSellRecordExample example);

    int deleteByExample(OrnamentSellRecordExample example);

    int insert(OrnamentSellRecord record);

    int insertSelective(OrnamentSellRecord record);

    List<OrnamentSellRecord> selectByExample(OrnamentSellRecordExample example);

    int updateByExampleSelective(@Param("record") OrnamentSellRecord record, @Param("example") OrnamentSellRecordExample example);

    int updateByExample(@Param("record") OrnamentSellRecord record, @Param("example") OrnamentSellRecordExample example);
}