package com.iisigroup.tutorial.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * HelloAdvice
 * 
 * @since 2015-12-14
 * @author Bo-Xuan Fan
 */
@Component("helloAdvice")
public class HelloAdvice implements MethodInterceptor, ThrowsAdvice {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("○○○開嗓中○○○("
                + invocation.getThis().getClass()
                + "." 
                + invocation.getMethod().getName()
                + ")");
        System.out.println("○○○準備上台○○○("
                + invocation.getThis().getClass()
                + "." 
                + invocation.getMethod().getName()
                + ")");
        Object retVal = invocation.proceed();
        System.out.println("○○○獲得分數:" + retVal + "分○○○("
                + invocation.getThis().getClass()
                + "." 
                + invocation.getMethod().getName()
                + ")");
        return retVal;
    }

    /*
     * read the org.springframework.aop.ThrowsAdvice document for more details
     */
    public void afterThrowing(Method method, Object[] args, Object target, Throwable cause) {
        System.out.println("○○○工作人員搶修○○○("
                + method + ", Exception型態:" + cause + ")");
    }
}
