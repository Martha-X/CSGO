package com.electronic.boot;

import com.electronic.boot.bean.OrnamentInventory;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.mapper.OrnamentInventoryMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@SpringBootTest
class OrnamentTradingPlatformApplicationTests {
    @Autowired
    private OrnamentInventoryMapper mapper;

    @Test
    void contextLoads() {
        Page<Object> page = PageHelper.startPage(1, 5);
        OrnamentInventory ornamentInventory = mapper.selectInventoryByUserId("U1096735006");
        PageInfo<OrnamentOnSale> pageInfo = new PageInfo<>(ornamentInventory.getInventoryList());
        Map<String, PageInfo> resultMap = new HashMap<>();
        resultMap.put(ornamentInventory.getUserId(), pageInfo);
        log.info("{}", resultMap);
    }

}
