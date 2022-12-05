package com.example.oop;

import java.util.Scanner;

public class Car {
    public String nameCar;
    public String maker;
    public String yearRelease;
    public double engineVolume;

    public String getNameCar() {
        return nameCar;
    }

    public String getMaker() {
        return maker;
    }

    Scanner in = new Scanner(System.in);

    public Car() {
        System.out.print("Введите название автомобиля: ");
        this.nameCar = in.nextLine();
        System.out.print("Введите производителя: ");
        this.maker = in.nextLine();
        System.out.print("Введите год выпуска: ");
        this.yearRelease = in.nextLine();
        System.out.print("Введите  объём двигателя: ");
        this.engineVolume = in.nextDouble();
        System.out.println("Название автомобиля: "+this.nameCar+","+" производитель: "+this.maker+","+" год выпуска: "+this.yearRelease+","+" объём двигателя: "+this.engineVolume);
    }

    public Car(String nameCar, String maker, String yearRelease) {
        this.nameCar = nameCar;
        this.maker = maker;
        this.yearRelease = yearRelease;
        System.out.println("Название автомобиля: "+this.nameCar+","+" производитель: "+this.maker+","+" год выпуска: "+this.yearRelease);
    }

    public void show(){
        System.out.print("Введите название автомобиля: ");
        this.nameCar = in.nextLine();
        System.out.print("Введите производителя: ");
        this.maker = in.nextLine();
        System.out.print("Введите год выпуска: ");
        this.yearRelease = in.nextLine();
        System.out.print("Введите  объём двигателя: ");
        this.engineVolume = in.nextDouble();
        System.out.println("Название автомобиля: "+this.nameCar+","+" производитель: "+this.maker+","+" год выпуска: "+this.yearRelease+","+" объём двигателя: "+this.engineVolume);
    }

    public Car show(String nameCar, String maker, String yearRelease){
        this.nameCar = nameCar;
        this.maker = maker;
        this.yearRelease = yearRelease;
        return this;
    }

    public void show(String nameCar, String maker){
        this.nameCar = nameCar;
        this.maker = maker;
        System.out.println("Название автомобиля: "+this.getNameCar()+","+" производитель: "+this.getMaker());
    }

    public void show1(String nameCar, String maker, double engineVolume){
        this.nameCar = nameCar;
        this.maker = maker;
        this.engineVolume = engineVolume;
        System.out.println("Название автомобиля: "+this.nameCar+","+" производитель: "+this.maker+","+" объём двигателя: "+this.engineVolume);
    }
}
