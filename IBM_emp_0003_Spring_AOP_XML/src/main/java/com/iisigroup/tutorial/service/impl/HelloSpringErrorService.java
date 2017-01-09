package com.iisigroup.tutorial.service.impl;

import com.iisigroup.tutorial.bean.HelloBean;
import com.iisigroup.tutorial.service.HelloService;

/**
 * HelloSpringErrorService
 * 
 * @since 2015-XX-XX
 * @author Bo-Xuan Fan
 */
public class HelloSpringErrorService implements HelloService {

    @SuppressWarnings("unused")
    private HelloBean helloBean;

    @Override
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
