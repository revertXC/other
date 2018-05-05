package com.deer.mySpring.aop.controller;

import com.deer.mySpring.aop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("addTest")
    public String add(){
        testService.add();
        return "test";
    }

}
