package com.iisigroup.tutorial.advice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TutorialPointCut
 * 
 * @since 2015-12-14
 * @author Bo-Xuan Fan
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TutorialPointCut {
}
