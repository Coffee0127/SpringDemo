package com.iisigroup.tutorial.bean;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.iisigroup.tutorial.utils.ApplicationContextHolder;

/**
 * HelloBeanTest
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
public class HelloBeanTest {

    @Test
    public void test() {
        assertNotNull(ApplicationContextHolder.getContext().getBean(HelloBean.class));
    }
}
