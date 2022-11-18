package com.electronic.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.util.BitResult;

import java.math.BigDecimal;

/**
* @author Administrator
* @description 针对表【ornament_on_sale】的数据库操作Service
* @createDate 2022-11-18 22:47:46
*/
public interface OrnamentOnSaleService extends IService<OrnamentOnSale> {

    BitResult selectAllOrnamentsById(Integer id, Integer pageNum, Integer pageSize, String wearZone, String conditionZone);

    BitResult getEveryExteriorGoods(String name);

    BitResult dealThisItemPay(String userId, BigDecimal balance, Integer itemId);
}
