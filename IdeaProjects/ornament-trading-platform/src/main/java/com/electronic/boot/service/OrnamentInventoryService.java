package com.electronic.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.util.BitResult;

/**
* @author Administrator
* @description 针对表【ornament_inventory】的数据库操作Service
* @createDate 2022-11-18 20:23:28
*/
public interface OrnamentInventoryService extends IService<OrnamentInventory> {

    BitResult selectOrnamentInventoryAsPageByUserId(String userId,Integer pageNum,Integer pageSize);

    BitResult selectOrnamentSelfSellingAsPageByUserId(String userId,Integer pageNum,Integer pageSize);

}
