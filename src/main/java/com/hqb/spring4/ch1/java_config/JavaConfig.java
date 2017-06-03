package com.hqb.spring4.ch1.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by heqingbao on 2017/6/2.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService service = new UseFunctionService();
        service.setFunctionService(functionService);
        return service;
    }
}
