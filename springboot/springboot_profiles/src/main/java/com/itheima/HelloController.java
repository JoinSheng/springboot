package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JoinCao
 * @CreateDate: 2020-03-02
 */
@RestController
public class HelloController {
//    @Value("${name}")
//    private String name01;
//    @Value("${age}")
//    private int age;
//    @Value("${person01.name}")
//    private String name02;

    @Autowired
    private Environment environment;

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello() {
//        System.out.println(name01);
//        System.out.println(age);
//        System.out.println(name02);

        System.out.println(environment.getProperty("name"));
        //System.out.println(environment.getProperty("person01.name"));
        System.out.println(person);
        return "hello,springboot...";
    }
}
