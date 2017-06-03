package com.hqb.spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by heqingbao on 2017/6/3.
 */
public class Main {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSigletonService s1 = context.getBean(DemoSigletonService.class);
        DemoSigletonService s2 = context.getBean(DemoSigletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println(s1 == s2);
        System.out.println(p1 == p2);

        context.close();

    }
}
