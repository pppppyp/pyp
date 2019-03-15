package com.luna.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new FileSystemXmlApplicationContext("D:/idea-workspace/pyp/src/main/resource/applicationContext.xml");
        IStudent person = (IStudent)ctx.getBean("student");
        person.addStudent("pyp");
    }
}
