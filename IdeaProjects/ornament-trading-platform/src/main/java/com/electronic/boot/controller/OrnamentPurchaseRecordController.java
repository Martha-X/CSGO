package com.electronic.boot.controller;

import com.electronic.boot.service.OrnamentPurchaseRecordService;
import com.electronic.boot.util.BitResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/purchase")
public class OrnamentPurchaseRecordController {
    @Autowired
    private OrnamentPurchaseRecordService purchaseRecordService;

    @GetMapping("/record")
    public BitResult getAllOrnamentPurchaseRecordsByPage(@RequestParam("userId") String userId,
                                                         @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize){
        return purchaseRecordService.getAllOrnamentPurchaseRecordsAsPage(userId,pageNum, pageSize);
    }
}
