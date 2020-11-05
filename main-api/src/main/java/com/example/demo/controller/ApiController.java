package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author ZhaoXin
 * @date 2020/11/5 14:03
 */
@RestController
public class ApiController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }
}
