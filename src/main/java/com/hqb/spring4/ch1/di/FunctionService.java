package com.hqb.spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by heqingbao on 2017/6/2.
 */
@Service
public class FunctionService {

    public String sayHello(String world) {
        return "Hello " + world + " !";
    }
}
