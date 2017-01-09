package com.iisigroup.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iisigroup.tutorial.advice.annotation.TutorialPointCut;
import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringService
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
@Service("helloService")
public class HelloSpringService implements HelloService {

    @Autowired
    private HelloBean helloBean;

    @Override
    @TutorialPointCut
    public int greeting() {
        System.out.println("Hello " + helloBean.getName());
        return 100;
    }

    /**
     * @param helloBean the helloBean to set
     */
    public void setHelloBean(HelloBean helloBean) {
        this.helloBean = helloBean;
    }
}
