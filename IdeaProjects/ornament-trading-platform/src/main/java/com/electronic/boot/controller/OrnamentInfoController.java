package com.electronic.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrnamentInfoController {
    @GetMapping("/ornament/{id}")
    public String toOrnamentOnSell(@PathVariable("id") Integer id){
        return "";
    }
}
