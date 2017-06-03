package com.hqb.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Service
public class DemoAnnotatioinService {

    @Action(name="注解式拦截的add操作")
    public void add() {

    }
}
