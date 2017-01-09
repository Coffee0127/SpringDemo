package com.iisigroup.tutorial.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * HelloBean
 * 
 * @since 2015-12-13
 * @author Bo-Xuan Fan
 */
@Component
public class HelloBean {

    @Value("${my.name}")
    private String name = "World";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
