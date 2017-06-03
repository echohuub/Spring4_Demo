package com.hqb.spring4.ch3.annotatioin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface HQBConfiguration {

    String[] value() default {}; // 覆盖 value 参数
}
