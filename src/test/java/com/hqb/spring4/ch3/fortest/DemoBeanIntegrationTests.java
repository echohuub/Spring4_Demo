package com.hqb.spring4.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by heqingbao on 2017/6/3.
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit4ClassRunner在Junit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class}) // ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod") // ActiveProfiles用来声明活动的profile
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
