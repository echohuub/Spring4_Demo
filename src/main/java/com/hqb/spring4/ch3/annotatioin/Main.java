package com.hqb.spring4.ch3.annotatioin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heqingbao on 2017/6/3.
 */
public class Main {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService service = context.getBean(DemoService.class);
        service.outputResult();

        context.close();
    }
}
