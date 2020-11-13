package com.learn.oop.car.dealership;

public class MyProgram {
    public static void main(String[] args) {

        Cars firstCar = new Cars (Brands.BMW, "z3", 2003, false);
        Motorcycles firstMotorcycle = new Motorcycles(Brands.SUBARU, "Vespa", 350);

        Cars secondCar = new Cars (Brands.DODGE, "Ram 2500", 2020, true);
        Motorcycles secondMotorcycle = new Motorcycles(Brands.PAGANINI, "V300", 450);

        Cars thirdCar = new Cars (Brands.LAND_ROVER, "Highlander", 2012, false);

        CarDealership myCarDealership = new CarDealership();

        myCarDealership.addCar(firstCar);
        myCarDealership.addCar(secondCar);
        myCarDealership.addCar(thirdCar);

        myCarDealership.addMotorcycle(firstMotorcycle);
        myCarDealership.addMotorcycle(secondMotorcycle);

        System.out.println(myCarDealership);

    }
}
