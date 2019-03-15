package com.luna.Aop;

public class StudentImpl implements IStudent{
    @Override
    public void addStudent(String name) {
        System.out.printf(" 欢迎  " + name + "  你加入Spring家庭! ");
    }
}
