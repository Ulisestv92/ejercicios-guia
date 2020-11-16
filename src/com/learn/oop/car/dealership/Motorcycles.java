package com.learn.oop.car.dealership;

import com.learn.oop.random.exercise.Breed;

public class Motorcycles {

    private Brands brand;
    private String model;
    private int cylinder;

    public Motorcycles (){
    }

    public Motorcycles (Brands brand, String model,int cylinder) {
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
    }

    public String toString (){
        return "Motorcycle available [" + this.brand + " "+ this.model + "]";
    }
}
