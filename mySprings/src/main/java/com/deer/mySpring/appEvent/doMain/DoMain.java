package com.deer.mySpring.appEvent.doMain;

import com.deer.mySpring.appEvent.config.EventConfig;
import com.deer.mySpring.appEvent.publish.DemoPublish;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DoMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublish publish = context.getBean(DemoPublish.class);
        publish.publish("Hello World");
        context.close();
    }


}
