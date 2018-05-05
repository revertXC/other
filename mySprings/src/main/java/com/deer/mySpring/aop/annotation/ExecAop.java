package com.deer.mySpring.aop.annotation;

import java.lang.annotation.*;

//http://www.jb51.net/article/55371.htm

/**注解放在什么上面*/
@Target(ElementType.METHOD) /*方法上*/
/**注解存在什么时候*/
@Retention(RetentionPolicy.RUNTIME) /*执行时候*/
@Documented /*表明这个注解应该被 javadoc工具记录*/
public @interface ExecAop {

}
