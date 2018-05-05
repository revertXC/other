package com.deer.mySpring.aop.service;

import com.deer.mySpring.aop.annotation.ExecAop;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @ExecAop
    public void add(){
        System.out.println("*******执行方法");
    }

}
