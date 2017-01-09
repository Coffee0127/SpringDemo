package com.iisigroup.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringService_Properties
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
@Service("helloService_prop")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloSpringService_Properties implements HelloService {

    @Autowired
    private HelloBean helloBean;

    /*
     * 需要宣告無參數建構子，或是將帶參數建構子註解掉
     */
    public HelloSpringService_Properties() {
    }

    /**
     * @param helloBean
     */
    public HelloSpringService_Properties(HelloBean helloBean) {
        this.helloBean = helloBean;
    }

    @Override
    public void greeting() {
        System.out.println("helloService_prop: Hello " + helloBean.getName());
    }
}
