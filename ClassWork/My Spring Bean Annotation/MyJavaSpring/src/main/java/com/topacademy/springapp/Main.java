package com.topacademy.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Okey");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");

        TestBean testBean = context.getBean("testBean",TestBean.class);
        TestBean testBean2 = context.getBean("testBean",TestBean.class);

        testBean.setName("Ivan");
        testBean2.setName("Oleq");

        System.out.println(testBean);
        System.out.println(testBean2);

    }
}
