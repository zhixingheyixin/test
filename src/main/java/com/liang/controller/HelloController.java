package com.liang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 刘鹏亮
 * @data 2019/1/5 14:14
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello() {
        return "hello world";
    }
}
