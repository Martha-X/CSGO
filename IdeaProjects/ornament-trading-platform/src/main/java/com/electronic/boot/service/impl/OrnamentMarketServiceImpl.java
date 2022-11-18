package com.electronic.boot.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.electronic.boot.bean.OrnamentMarket;
import com.electronic.boot.mapper.OrnamentMarketMapper;
import com.electronic.boot.service.OrnamentMarketService;
import com.electronic.boot.util.BitResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【ornament_market】的数据库操作Service实现
 * @createDate 2022-11-18 22:39:37
 */
@Service
public class OrnamentMarketServiceImpl extends ServiceImpl<OrnamentMarketMapper, OrnamentMarket>
        implements OrnamentMarketService {

    @Autowired
    private OrnamentMarketMapper marketMapper;

    @Override
    public BitResult<OrnamentMarket> selectAllOrnamentsAsPage(Integer pageNum, Integer pageSize) {
        Page<OrnamentMarket> marketPageInfo = marketMapper.selectPage(new Page<>(pageNum, pageSize), null);
        return new BitResult<>(marketPageInfo);
    }
}




