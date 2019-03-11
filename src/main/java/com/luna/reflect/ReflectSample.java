package com.luna.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,InstantiationException,NoSuchMethodException, InvocationTargetException {
        Class rc = Class.forName("com.luna.reflect.Robot");
        Robot robot = (Robot) rc.newInstance();
        System.out.println(rc.getName());
        Method getHello = rc.getDeclaredMethod("throwHi", String.class);
        getHello.setAccessible(true);
        Object Str = getHello.invoke(robot,"ppppyp");
        System.out.println("getHello result" + Str);
        Method sayHi = rc.getMethod("getHello",String.class);
        sayHi.invoke(robot, "ttttt");
    }
}
