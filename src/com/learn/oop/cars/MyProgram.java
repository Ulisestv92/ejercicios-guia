package com.learn.oop.cars;

public class MyProgram {
    public static void main(String[] args) {

        Car myCar = new Car (4,CarBrands.BMW,"Turbo 1.4");

        myCar.setEngine("Turbo 1.8 recontra turroooo");
        myCar.setBrand(CarBrands.MITSUBISHI);
        

        System.out.println("This car is a " + myCar.getBrand());
        System.out.println("Of course, as every car I've got: " + myCar.getWheels());
        System.out.println("My engine is super powerful, it's a "+ myCar.getEngine());

    }
}
