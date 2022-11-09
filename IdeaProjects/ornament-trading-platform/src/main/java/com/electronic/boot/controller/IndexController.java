package com.electronic.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping({"/index", "/index.html"})
    public String toIndexPage() {
        return "index";
    }

    @GetMapping("/goods/{id}")
    public ModelAndView toMarketItemPage(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("market-item");
        mv.addObject("goodsId", id);
        return mv;
    }

    @GetMapping("/toPay")
    public String toPay() {
        return "pay";
    }

    @GetMapping("/toMarketPage")
    public String toMarketPage() {
        return "market";
    }

    @GetMapping("/toSellPage")
    public String toSellPage() {
        return "sell";
    }


    @GetMapping("/toAccountPage")
    public String toAccountPage() {
        return "account";
    }

    @GetMapping("/toInventoryPage")
    public String toInventoryPage() {
        return "inventory";
    }


    @GetMapping("/toPurchaseRecordPage")
    public String toPurchaseRecordPage() {
        return "purchase-record";
    }

    @GetMapping("/toSellRecordPage")
    public String toSelleRecordPage() {
        return "sell-record";
    }
}
