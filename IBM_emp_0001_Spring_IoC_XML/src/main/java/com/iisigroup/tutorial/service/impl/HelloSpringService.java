package com.iisigroup.tutorial.service.impl;

import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringService
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
public class HelloSpringService implements HelloService {

    private HelloBean helloBean;

    /**
     * @param helloBean
     */
    public HelloSpringService(HelloBean helloBean) {
        this.helloBean = helloBean;
    }

    @Override
    public void greeting() {
        System.out.println("Hello " + helloBean.getName());
    }
}
