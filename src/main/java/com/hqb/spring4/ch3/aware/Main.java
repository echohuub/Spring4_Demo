package com.hqb.spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heqingbao on 2017/6/3.
 */
public class Main {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService service = context.getBean(AwareService.class);
        service.outputResult();

        context.close();
    }
}
