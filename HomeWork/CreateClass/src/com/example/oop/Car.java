package com.example.oop;

import java.util.Scanner;

public class Car {
    public String nameCar;
    public String maker;
    public String yearRelease;
    public int engineVolume;

    public String getNameCar() {
        return nameCar;
    }

    public String getMaker() {
        return maker;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public int getEngineVolume() {
        return engineVolume;
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
        this.engineVolume = in.nextInt();
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
        this.engineVolume = in.nextInt();
        System.out.println("Название автомобиля: "+this.nameCar+","+" производитель: "+this.maker+","+" год выпуска: "+this.yearRelease+","+" объём двигателя: "+this.engineVolume);
    }
}
