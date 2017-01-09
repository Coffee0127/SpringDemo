package com.iisigroup.tutorial.service.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.iisigroup.tutorial.service.HelloService;
import com.iisigroup.tutorial.utils.ApplicationContextHolder;

/**
 * AOPTest
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
public class AOPTest {

    /**
     * Test method for {@link com.iisigroup.tutorial.service.impl.HelloSpringService#greeting()}.
     */
    @Test
    public void testGreeting() {
        ApplicationContext context = ApplicationContextHolder.getContext();
        HelloService service = context.getBean("helloService", HelloService.class);
        System.out.println("Before test gretting");
        service.greeting();
        System.out.println("After test gretting");
        assertTrue(true);
    }
    
    /**
     * Test method for {@link com.iisigroup.tutorial.service.impl.HelloSpringErrorService#greeting()}.
     */
    @Test
    public void testErrorGreeting() {
        try {
            ApplicationContext context = ApplicationContextHolder.getContext();
            HelloService service = context.getBean("helloErrorService", HelloService.class);
            System.out.println("Before test error gretting");
            service.greeting();
            // rest of code will never be executed
            System.out.println("After test error gretting");
            assertTrue(false);
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }
}
