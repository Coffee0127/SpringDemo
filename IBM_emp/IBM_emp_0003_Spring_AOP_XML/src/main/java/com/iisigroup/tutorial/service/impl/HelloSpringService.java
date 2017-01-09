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

    @Override
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
