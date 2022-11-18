package com.electronic.boot.controller;

import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.service.OrnamentOnSaleService;
import com.electronic.boot.util.BitResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/goods")
public class OrnamentOnSaleController {
    @Autowired
    private OrnamentOnSaleService onSaleService;

    @ResponseBody
    @GetMapping("/{id}")
    public BitResult getAllMarketItems(@PathVariable("id") Integer id,
                                       @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                       @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize,
                                       @RequestParam(value = "wearZone", required = false) String wearZone,
                                       @RequestParam(value = "conditionZone", required = false) String conditionZone) {
        return onSaleService.selectAllOrnamentsById(id, pageNum, pageSize,wearZone,conditionZone);
    }

    @ResponseBody
    @GetMapping("/getEveryExteriorGoods")
    public BitResult getEveryExteriorGoods(@RequestParam("name") String name) {
        return onSaleService.getEveryExteriorGoods(name);
    }

    @PostMapping("/payForGoodsItem")
    public BitResult payForGoodsItem(@RequestParam("userId")String userId,
                                     @RequestParam("accountBalance") BigDecimal balance,
                                     @RequestParam("itemId") Integer itemId){
        try {
            BitResult bitResult = onSaleService.dealThisItemPay(userId, balance, itemId);
            return bitResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new BitResult().fail("购买失败");
        }

    }
}
