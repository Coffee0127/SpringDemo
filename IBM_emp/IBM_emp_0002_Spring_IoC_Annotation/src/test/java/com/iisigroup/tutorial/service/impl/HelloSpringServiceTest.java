package com.iisigroup.tutorial.service.impl;

import static org.junit.Assert.assertEquals;
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
     * Test method for {@link com.iisigroup.tutorial.service.impl.HelloSpringService_Properties#greeting()}.
     */
    @Test
    public void testGreeting() {
        ApplicationContext context = ApplicationContextHolder.getContext();
        String beanName = "helloService_prop";
//        String beanName = "helloService_ctor";
//        String beanName = "helloService_setter";
//        String beanName = "helloService_single";
        
        HelloService service = context.getBean(beanName, HelloService.class);
        System.out.println(service);
        service.greeting();
        // get bean again
        service = context.getBean(beanName, HelloService.class);
        System.out.println(service);
        assertTrue(true);
    }

//    @Test
    public void testScope() {
        ApplicationContext context = ApplicationContextHolder.getContext();
        String beanName = "helloService_single";
        HelloService service1 = context.getBean(beanName, HelloService.class);
        System.out.println(service1);
        HelloService service2 = context.getBean(beanName, HelloService.class);
        System.out.println(service2);
        assertEquals(service1, service2);
    }
}
