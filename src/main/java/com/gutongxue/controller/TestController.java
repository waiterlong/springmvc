package com.gutongxue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/home")
    public String index() {
        return "index1";
    }
}
