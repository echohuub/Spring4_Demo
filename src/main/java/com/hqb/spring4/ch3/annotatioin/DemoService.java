package com.hqb.spring4.ch3.annotatioin;

import org.springframework.stereotype.Service;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }
}
