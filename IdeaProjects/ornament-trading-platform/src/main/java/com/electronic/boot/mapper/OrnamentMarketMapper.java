package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentMarket;
import com.electronic.boot.bean.OrnamentMarketExample;
import com.electronic.boot.bean.OrnamentOnSaleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrnamentMarketMapper {
    long countByExample(OrnamentMarketExample example);

    int deleteByExample(OrnamentMarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrnamentMarket record);

    int insertSelective(OrnamentMarket record);

    List<OrnamentMarket> selectByExample(OrnamentOnSaleExample.Criteria example);

    OrnamentMarket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrnamentMarket record, @Param("example") OrnamentMarketExample example);

    int updateByExample(@Param("record") OrnamentMarket record, @Param("example") OrnamentMarketExample example);

    int updateByPrimaryKeySelective(OrnamentMarket record);

    int updateByPrimaryKey(OrnamentMarket record);
}