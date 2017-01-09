package com.iisigroup.tutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * HelloAroundAspect
 * 
 * @since 2015-12-14
 * @author Bo-Xuan Fan
 */
@Component  // make it spring bean
@Aspect // make it aspect
public class HelloAroundAspect {

    // define point cut
    @Pointcut("execution(* com.iisigroup.tutorial.service.HelloService.greeting(..))")
    private void greeting() {}

    // 結合 Before Advice 與 After returning advice
    @Around("greeting()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("○○○開嗓中○○○("
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ")");
        System.out.println("○○○準備上台○○○("
              + joinPoint.getThis().getClass()
              + "." 
              + joinPoint.getSignature().getName()
              + ")");
         
        Object retVal = joinPoint.proceed();

        System.out.println("○○○獲得分數:" + retVal + "分○○○("
              + joinPoint.getThis().getClass()
              + "." 
              + joinPoint.getSignature().getName()
              + ")");
        return retVal;
    }

    @AfterThrowing(pointcut = "greeting()", throwing = "cause")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable cause) {
        System.out.println("○○○工作人員搶修○○○("
                + joinPoint.getThis().getClass()
                + "." 
                + joinPoint.getSignature().getName()
                + ", Exception型態:" + cause + ")");
    }
}
