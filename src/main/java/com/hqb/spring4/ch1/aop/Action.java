package com.hqb.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
