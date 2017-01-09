package com.iisigroup.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringService_Constructor
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
@Service("helloService_ctor")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloSpringService_Constructor implements HelloService {

    private HelloBean helloBean;

    /**
     * @param helloBean
     */
    @Autowired
    public HelloSpringService_Constructor(HelloBean helloBean) {
        this.helloBean = helloBean;
    }

    @Override
    public void greeting() {
        System.out.println("helloService_ctor: Hello " + helloBean.getName());
    }
}
