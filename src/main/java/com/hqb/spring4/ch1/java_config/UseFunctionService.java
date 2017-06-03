package com.hqb.spring4.ch1.java_config;

/**
 * Created by heqingbao on 2017/6/2.
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String world) {
        return functionService.sayHello(world);
    }
}
