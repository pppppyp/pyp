package com.luna.Aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable{
        Object result = null;
        String stu_name = invocation.getArguments()[0].toString();
        if ( stu_name.equals("pyp")){
            result= invocation.proceed();
        } else {
            System.out.println("此学生是"+stu_name+"而不是dragon,不批准其加入.");
        }
        return null;
    }
}
