package com.example.oop;

public class Human {
    public String firstName;
    public String lastName;
    public int age;

    {
        System.out.println("CALL INIT BLOC");
        firstName = "NoName";
        lastName = "NoLastName";
        age = 0;
    }
    public Human() {
    }

    public Human(String firstName) {
        this.firstName = firstName;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Human(String firstName, int age) {
        this(firstName);
        this.age = age;
    }

    public Human(String firstName, String lastName, int age) {
        this(firstName, age);
        this.lastName = lastName;
    }
}
