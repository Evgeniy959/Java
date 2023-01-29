package com.topacademy.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");

        Car toyota = context.getBean("toyota", Car.class);
        Car audi = context.getBean("audi", Car.class);
        Car bmw = context.getBean("bmw", Car.class);
        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(bmw);

    }
}
