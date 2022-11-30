package com.example.oop;

public class City {
    public String cityName;
    public double population;

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(double population) {
        this.population = population;
    }

    public City(String cityName, double population) {
        this.cityName = cityName;
        this.population = population;
    }
}
