package ru.org.zavhozoffice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class TestSpring {
    public static void main(Spring[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean TestBean = context.getBean("testBean", TestBean.class);

        System.out.println(TestBean.getName());

        context.close();
    }
}
