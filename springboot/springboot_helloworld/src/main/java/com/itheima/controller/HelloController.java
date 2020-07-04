package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JoinSheng
 * @CreateDate: 2020-02-29
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name01;
    @Value("${age}")
    private int age;
    @Value("${person01.name}")
    private String name02;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name01);
        System.out.println(age);
        System.out.println(name02);
        return "hello,springboot...";
    }

}
