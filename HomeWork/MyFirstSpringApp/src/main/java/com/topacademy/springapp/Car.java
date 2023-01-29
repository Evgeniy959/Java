package com.topacademy.springapp;

import java.util.Arrays;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private Wheel[] wheel;
    private Body body;
    private float price;
    private String brand, name, priceMarkup;

    public Car() {

    }

    public Car(Engine engine, Transmission transmission, Body body) {
        this.engine = engine;
        this.transmission = transmission;
        this.body = body;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public float getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPriceMarkup() {
        return priceMarkup;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceMarkup(String priceMarkup) {
        this.priceMarkup = priceMarkup;
    }

    @Override
    public String toString() {
        return brand+" "+name+": " +
                "engine volume=" + engine.getVolume() +
                ", transmission:" + transmission.getType() +
                ", wheel diameter=" + wheel[1].getDiameter() + ", number of wheels=" +wheel.length+
                ", body:" + body.getType()+", price=" + price+"$"+", price markup=" + priceMarkup;
    }
}
