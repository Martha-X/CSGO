package com.electronic.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.electronic.boot.bean.OrnamentMarket;
import com.electronic.boot.util.BitResult;

/**
 * @author Administrator
 * @description 针对表【ornament_market】的数据库操作Service
 * @createDate 2022-11-18 22:39:37
 */
public interface OrnamentMarketService extends IService<OrnamentMarket> {

    BitResult<OrnamentMarket> selectAllOrnamentsAsPage(Integer pageNum, Integer pageSize);
}