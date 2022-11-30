package com.example.oop.modelHuman;

public class Human {
    public String firstName;
    public String lastName;
    public int age;
    public String post;

    public Human(String firstName, String lastName, int age, String post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        System.out.print(firstName+lastName+age+" лет, "+post);
    }
    public void work(String nameWork) {

        System.out.println(nameWork);
    }
}
