package com.luna.Aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("这是AfterAdvice类的afterReturning方法.");
    }
}
