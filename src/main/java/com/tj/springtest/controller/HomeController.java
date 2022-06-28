package com.tj.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String hello() {
        return "hello1";
    }

    @RequestMapping("/hello")
    public String hello232() {
        return "kukaro";
    }
}
