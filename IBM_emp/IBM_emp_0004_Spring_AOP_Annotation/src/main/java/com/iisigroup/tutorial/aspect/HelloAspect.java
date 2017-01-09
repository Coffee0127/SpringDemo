package com.iisigroup.tutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * HelloAspect
 * 
 * @since 2015-12-14
 * @author Bo-Xuan Fan
 */
//@org.springframework.stereotype.Component
//@org.aspectj.lang.annotation.Aspect
public class HelloAspect {

    @Pointcut("execution(* com.iisigroup.tutorial.service.HelloService.greeting(..))")
    private void greeting() {}

    @Before("greeting()")
//    @Before("execution(* com.iisigroup.tutorial.service.HelloService.greeting(..))")  // 或可寫 expression
    public void beforeAdvice1(JoinPoint joinPoint) {
        System.out.println("○○○開嗓中○○○("
                // print com.iisigroup.tutorial.service.HelloService
//                + jointPoint.getSignature().getDeclaringTypeName()
                // print com.sun.proxy.$Proxy
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ")");
    }

    @Before("greeting()")
    public void beforeAdvice2(JoinPoint joinPoint) {
        System.out.println("○○○準備上台○○○("
//                + joinPoint.getSignature().getDeclaringTypeName()
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ")");
    }

    @AfterReturning(pointcut = "greeting()", returning = "retVal")
    public void afterReturningAdvice(JoinPoint joinPoint, Object retVal) {
        System.out.println("○○○獲得分數:" + retVal + "分○○○("
//                + joinPoint.getSignature().getDeclaringTypeName()
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ")");
    }

    @AfterThrowing(pointcut = "greeting()", throwing = "cause")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable cause) {
        System.out.println("○○○工作人員搶修○○○("
//                + joinPoint.getSignature().getDeclaringTypeName()
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ", Exception型態:" + cause + ")");
//        throw new RuntimeException("Wrapper Exception Msg:" + throwable.getMessage());
    }
}
