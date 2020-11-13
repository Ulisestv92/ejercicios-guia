package com.learn.oop.car.dealership;

public class Cars {

    private Brands brand;
    private String model;
    private int year;
    private boolean isNew;

    public Cars () {
    }

    public Cars (Brands brand, String model, int year, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isNew = isNew;

    }

    public String toString () {
        return this.brand.toString() +" " + this.model;
    }


}
