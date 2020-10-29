package com.learn.oop.exercise4;

public class Calculator {

    private Operation lastOperation;
    // Crear una entidad llamada calculadora que entienda los siguientes mensajes:  sum, subtraction, division, multiplication
    // recibe 2 parametros enteros cada mensaje. Devolver lo necesario que se tenga que devolver.


    public int sumOfValues(int a, int b) {
        this.lastOperation = Operation.SUM;
        return a + b;
    }

    public int subtraction(int a, int b) {
        this.lastOperation = Operation.SUBTRACTION;
        return a - b;
    }

    public int multiplication(int a, int b) {
        this.lastOperation = Operation.MULTIPLICATION;
        return a * b;
    }

    public float division(int a, int b) {
        this.lastOperation = Operation.DIVISION;
        return (float) a/ b;
    }

    public Operation getlastOperation() {
        return this.lastOperation;
    }


}


