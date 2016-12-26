package com.frenclub.practiceapplication.models;

/**
 * Created by minhazur on 12/23/16.
 */

public class Country {
    private String name;
    private String capital;
    private double area;

    public Country(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
