package com.electronic.boot.controller;

import com.electronic.boot.bean.OrnamentMarket;
import com.electronic.boot.service.OrnamentMarketService;
import com.electronic.boot.util.BitResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/market")
public class OrnamentMarketController {
    @Autowired
    private OrnamentMarketService marketService;

    @GetMapping("/")
    public BitResult<OrnamentMarket> toMarket(@RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                              @RequestParam(value = "pageSize", defaultValue = "9", required = false) Integer pageSize) {
        return marketService.selectAllOrnamentsAsPage(pageNum, pageSize);
    }
}
