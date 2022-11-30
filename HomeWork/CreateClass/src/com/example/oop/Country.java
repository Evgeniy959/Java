package com.example.oop;

public class Country {
    public String name;
    public String capital;
    public double population;
    public double square;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public Country(double population) {
        this.population = population;
    }

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Country(String capital, double population) {
        this.capital = capital;
        this.population = population;
    }

    public Country(String capital, double population, double square) {
        this(capital, population);
        this.square = square;
    }

    public Country(String name, String capital, double population, double square) {
        this(capital, population, square);
        this.name = name;
    }
}
