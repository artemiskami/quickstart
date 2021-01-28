package com.kami.spring.formwork.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: quickstart
 * @description: helloWorld测试
 * @author: Dong HuYu
 * @create: 2021-01-28 17:53
 */
@RequestMapping("hello")
@RestController
public class HelloWorld {

    @RequestMapping("test")
    public String test(@RequestParam("name") String name ){
        return name+",welcome to springBoot !";
    }

}
