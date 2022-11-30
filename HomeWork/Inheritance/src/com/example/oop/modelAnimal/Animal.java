package com.example.oop.modelAnimal;

public class Animal {
    String name;
    String detachment;
    String grade;

    public Animal(String name, String grade, String detachment) {
        this.name = name;
        this.grade = grade;
        this.detachment = detachment;
        System.out.print(name+" - "+grade+detachment);
    }

    public void movement(String move) {

        System.out.println(move);
    }
}
