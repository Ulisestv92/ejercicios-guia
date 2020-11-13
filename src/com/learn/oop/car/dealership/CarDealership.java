package com.learn.oop.car.dealership;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {

    private List<Cars> cars;
    private List<Motorcycles> motorcycles;

    public CarDealership (){
        this.cars = new ArrayList<>();
        this.motorcycles = new ArrayList<>();
    }

    public void addCar (Cars cars){
        this.cars.add(cars);

    }

    public void addMotorcycle (Motorcycles motorcycles) {
        this.motorcycles.add(motorcycles);
    }

    @Override
    public String toString (){
        String output = this.cars.toString() + this.motorcycles.toString();
        return output;
    }

}


