package com.iisigroup.tutorial.service.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.iisigroup.tutorial.service.HelloService;
import com.iisigroup.tutorial.utils.ApplicationContextHolder;

/**
 * HelloSpringServiceTest
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
public class HelloSpringServiceTest {

    /**
     * Test method for {@link com.iisigroup.tutorial.service.impl.HelloSpringService#greeting()}.
     */
    @Test
    public void testGreeting() {
        ApplicationContext context = ApplicationContextHolder.getContext();
        HelloService service = context.getBean(HelloService.class);
        // 注意: 若Spring設定檔內，該介面有多個 bean，則需指定 bean id/name
//        HelloService service = context.getBean("myHelloService2", HelloService.class);
        service.greeting();
        assertTrue(true);
    }
}
