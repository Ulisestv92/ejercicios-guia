package com.learn.oop.exercise4;

public class MyProgram {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum = myCalculator.sumOfValues(9, 8);

        System.out.println(sum);
        System.out.println(myCalculator.getlastOperation());
        System.out.println("\n");

        int subtraction = myCalculator.subtraction(9, 8);

        System.out.println(subtraction);
        System.out.println(myCalculator.getlastOperation());
        System.out.println("\n");

        int multiplication = myCalculator.multiplication(9,8);

        System.out.println(multiplication);
        System.out.println(myCalculator.getlastOperation());
        System.out.println("\n");


        float division = myCalculator.division(9,8);

        System.out.println(division);
        System.out.println(myCalculator.getlastOperation());
        System.out.println();

    }
}

