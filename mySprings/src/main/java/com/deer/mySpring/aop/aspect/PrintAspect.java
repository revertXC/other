package com.deer.mySpring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 打印Aspect
 */

@Aspect
@Component
public class PrintAspect {

    /**
     * 设置切入点
     */
    @Pointcut("@annotation(com.deer.mySpring.aop.annotation.ExecAop)")
    public void execAnno(){}

    @Before("execAnno()")
    public void beforeExec(){
        System.out.println("注解方式：方法之前执行~~~~~~~~~~~~~~~");
    }

//    @After("execAnno()")
//    public void afterExec(){
//        System.out.println("注解方式：方法之后执行~~~~~~~~~~~~~~~");
//    }

    @After("execution(* com.deer.mySpring.aop.service..*.*(..))")
    public void afterExec(){
        System.out.println("方法规则：方法之后执行~~~~~~~~~~~~~~~");
    }

}
