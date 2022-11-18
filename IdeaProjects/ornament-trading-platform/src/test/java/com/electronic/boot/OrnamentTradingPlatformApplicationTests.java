package com.electronic.boot;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.mapper.OrnamentInventoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class OrnamentTradingPlatformApplicationTests {

    @Autowired
    private OrnamentInventoryMapper service;

    @Test
    void contextLoads() {
        Page<OrnamentOnSale> page = new Page<>(1, 3);
        Page<OrnamentOnSale> listPage = service.selectOrnamentInventoryAsPageByUserId(page,"U1096735006");
        log.info("{}", listPage.getTotal());
    }

}
