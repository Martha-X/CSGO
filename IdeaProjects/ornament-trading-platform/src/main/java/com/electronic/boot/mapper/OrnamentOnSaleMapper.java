package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.bean.OrnamentOnSaleExample;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrnamentOnSaleMapper {
    long countByExample(OrnamentOnSaleExample example);

    int deleteByExample(OrnamentOnSaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrnamentOnSale record);

    int insertSelective(OrnamentOnSale record);

    List<OrnamentOnSale> selectByExample(OrnamentOnSaleExample example);

    OrnamentOnSale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrnamentOnSale record, @Param("example") OrnamentOnSaleExample example);

    int updateByExample(@Param("record") OrnamentOnSale record, @Param("example") OrnamentOnSaleExample example);

    int updateByPrimaryKeySelective(OrnamentOnSale record);

    int updateByPrimaryKey(OrnamentOnSale record);

    @MapKey("id")
    List<Map<String,Object>> getEveryExteriorGoods(String name);
}