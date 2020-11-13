package com.learn.oop.cars;

public class Car {

    private int wheels;
    private CarBrands brand;
    private String color;
    private String engine;

    public Car (int wheels, CarBrands brand, String engine) {
        this.wheels = wheels;
        this.brand = brand;
        this.engine = engine;

    }
    public Car (CarBrands brand, int wheels, String color, String engine) {
        this.brand = CarBrands.CHEVROLET;
        this.wheels = 4;
        this.color = "Grey";
        this.engine = "Turbo diesel 1.8";

    }

    public Car (String engine) {
        this.engine = engine;
    }



    public String getColor() {
        return color;
    }
    public CarBrands getBrand() {
        return brand;
    }
    public int getWheels (){
        return wheels;
    }

    public String getEngine(){
        return engine;
    }

    public void setEngine (String engine) {
        this.engine = engine;
    }

    public void setBrand (CarBrands brand) {
        this.brand = brand;
    }
}
