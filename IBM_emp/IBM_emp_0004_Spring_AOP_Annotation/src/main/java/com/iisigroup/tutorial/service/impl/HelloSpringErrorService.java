package com.iisigroup.tutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iisigroup.tutorial.advice.annotation.TutorialPointCut;
import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringErrorService
 * 
 * @since 2015-12-14
 * @author Bo-Xuan Fan
 */
@Service("helloErrorService")
public class HelloSpringErrorService implements HelloService {

    @Autowired
    private HelloBean helloBean;

    @Override
    @TutorialPointCut
    public int greeting() {
        throw new RuntimeException("Oops!");
    }

    /**
     * @param helloBean the helloBean to set
     */
    public void setHelloBean(HelloBean helloBean) {
        this.helloBean = helloBean;
    }
}
