package com.luna.reflect;

public class Robot {
    private String name;
    public void getHello(String arg){
        System.out.println(arg + "getHello" + name);
    }
    private String throwHi(String hiName){
        return  hiName;
    }
}
