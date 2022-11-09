package com.electronic.boot.mapper;

import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentInventoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrnamentInventoryMapper {
    long countByExample(OrnamentInventoryExample example);

    int deleteByExample(OrnamentInventoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrnamentInventory record);

    int insertSelective(OrnamentInventory record);

    List<OrnamentInventory> selectByExample(OrnamentInventoryExample example);

    OrnamentInventory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrnamentInventory record, @Param("example") OrnamentInventoryExample example);

    int updateByExample(@Param("record") OrnamentInventory record, @Param("example") OrnamentInventoryExample example);

    int updateByPrimaryKeySelective(OrnamentInventory record);

    int updateByPrimaryKey(OrnamentInventory record);

    OrnamentInventory selectInventoryByUserId(@Param("userId") String userId);
}