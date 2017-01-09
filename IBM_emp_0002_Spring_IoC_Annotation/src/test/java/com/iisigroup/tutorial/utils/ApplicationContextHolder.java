package com.iisigroup.tutorial.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContextHolder, for org.springframework.context.ApplicationContext convenience
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
public class ApplicationContextHolder {

    private static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("beans-config.xml");
        // register a shutdown hook with the JVM
        ((AbstractApplicationContext) context).registerShutdownHook();
    }

    /**
     * @return the context
     */
    public static ApplicationContext getContext() {
        return context;
    }
}
