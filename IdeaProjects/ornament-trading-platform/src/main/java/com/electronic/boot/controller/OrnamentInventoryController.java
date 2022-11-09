package com.electronic.boot.controller;

import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.service.OrnamentInventoryService;
import com.electronic.boot.util.BitResult;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/inventory/")
public class OrnamentInventoryController {
    @Autowired
    private OrnamentInventoryService inventoryService;

    @GetMapping("/")
    public BitResult getInventoryByUserId(@RequestParam(value = "userId",required = true) String userId,
                                          @RequestParam(value="pageNum",defaultValue = "1",required = false) Integer pageNum,
                                          @RequestParam(value="pageSize",defaultValue = "1",required = false) Integer pageSize){
        PageInfo<OrnamentOnSale> pageInfo = inventoryService.getInventoryByUserId(userId, pageNum, pageSize);
        return new BitResult(pageInfo).success("ok");
    }
}
