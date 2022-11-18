package com.electronic.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentOnSale;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @description 针对表【ornament_inventory】的数据库操作Mapper
 * @createDate 2022-11-18 20:03:44
 * @Entity com.electronic.boot.bean.OrnamentInventory
 */
@Repository
public interface OrnamentInventoryMapper extends BaseMapper<OrnamentInventory> {

    /**
     * @param page
     * @param userId
     * @return 对应用户库存的饰品记录
     */
    Page<OrnamentOnSale> selectOrnamentInventoryAsPageByUserId(Page<OrnamentOnSale> page, @Param("userId") String userId);


    Page<OrnamentOnSale> selectOrnamentSelfSellingAsPageByUserId(Page<OrnamentOnSale> page, @Param("userId") String userId);
}




