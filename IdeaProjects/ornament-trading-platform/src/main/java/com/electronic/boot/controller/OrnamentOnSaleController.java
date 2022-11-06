package com.electronic.boot.controller;

import com.electronic.boot.bean.OrnamentOnSale;
import com.electronic.boot.service.OrnamentOnSaleService;
import com.electronic.boot.util.BitResult;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        BitResult result = new BitResult();
        log.info("{}", id);
        PageInfo<OrnamentOnSale> allOrnamentById = onSaleService.getAllOrnamentById(id, pageNum, pageSize,wearZone,conditionZone);
        result.setData(allOrnamentById);
        if (allOrnamentById.getList().size() > 0) {
            String name = allOrnamentById.getList().get(0).getName();
            String keyword = name.substring(name.indexOf('(') + 1, name.length() - 1);
            result.setKeyword(keyword);
        }
        result.setWearZone(wearZone);
        result.setConditionZone(conditionZone);
        return result.success("ok");
    }

    @ResponseBody
    @GetMapping("/getEveryExteriorGoods")
    public BitResult getEveryExteriorGoods(@RequestParam("name") String name) {
        List<Map<String, Object>> everyExteriorGoods = onSaleService.getEveryExteriorGoods(name);
        log.info("{}", everyExteriorGoods);
        return new BitResult(everyExteriorGoods).success("ok");
    }
}
