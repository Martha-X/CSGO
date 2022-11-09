package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentPurchaseRecord;
import com.electronic.boot.bean.OrnamentPurchaseRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrnamentPurchaseRecordMapper {
    long countByExample(OrnamentPurchaseRecordExample example);

    int deleteByExample(OrnamentPurchaseRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrnamentPurchaseRecord record);

    int insertSelective(OrnamentPurchaseRecord record);

    List<OrnamentPurchaseRecord> selectByExample(OrnamentPurchaseRecordExample example);

    OrnamentPurchaseRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrnamentPurchaseRecord record, @Param("example") OrnamentPurchaseRecordExample example);

    int updateByExample(@Param("record") OrnamentPurchaseRecord record, @Param("example") OrnamentPurchaseRecordExample example);

    int updateByPrimaryKeySelective(OrnamentPurchaseRecord record);

    int updateByPrimaryKey(OrnamentPurchaseRecord record);
}