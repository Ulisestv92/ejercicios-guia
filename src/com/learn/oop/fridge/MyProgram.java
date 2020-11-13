package com.learn.oop.fridge;

public class MyProgram {
    public static void main(String[] args) {

        Tupper myTupper = new Tupper(Contents.MILANESAS, true);
        Fridge myFridge = new Fridge();

        Tupper otherTupper = new Tupper (Contents.SPAGHETTI);

        myFridge.addTupper(myTupper);
        myFridge.addTupper(otherTupper);

        System.out.println(myFridge);
    }
}
