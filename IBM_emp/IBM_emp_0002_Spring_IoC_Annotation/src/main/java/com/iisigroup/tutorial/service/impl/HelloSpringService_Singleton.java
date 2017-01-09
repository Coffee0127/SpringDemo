package com.iisigroup.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringService_Singleton
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
@Service("helloService_single")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HelloSpringService_Singleton implements HelloService {

    @Autowired
    private HelloBean helloBean;

    @Override
    public void greeting() {
        System.out.println("helloService_single: Hello " + helloBean.getName());
    }
}
