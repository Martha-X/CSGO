package com.electronic.boot.controller;

import com.electronic.boot.service.OrnamentInventoryService;
import com.electronic.boot.util.BitResult;
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

    /**
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return 库存中的饰品记录
     */
    @GetMapping("/")
    public BitResult getInventoryByUserId(@RequestParam(value = "userId", required = true) String userId,
                                          @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                          @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return inventoryService.selectOrnamentInventoryAsPageByUserId(userId, pageNum, pageSize);
    }

    /**
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return 自售中的饰品记录
     */
    @GetMapping("/selling")
    public BitResult getSellingByUserId(@RequestParam(value = "userId", required = true) String userId,
                                        @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return inventoryService.selectOrnamentSelfSellingAsPageByUserId(userId, pageNum, pageSize);
    }
}
