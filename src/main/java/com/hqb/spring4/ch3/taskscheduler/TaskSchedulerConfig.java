package com.hqb.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Configuration
@ComponentScan("com.hqb.spring4.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
