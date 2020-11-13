package com.example.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoXin
 * @date 2020/11/13 9:33
 */
@RestController
public class Test {
    @RequestMapping("/test")
    public String test() {
        return "success";
    }
}
