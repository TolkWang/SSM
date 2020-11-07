package com.wt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class TestController {

    @RequestMapping("/test")
    public void test() {
        System.out.println("abc123");
    }
}
