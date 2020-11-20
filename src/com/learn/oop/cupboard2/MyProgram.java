package com.learn.oop.cupboard2;

import com.learn.oop.cupboard2.ricebox.RiceBox;
import com.learn.oop.cupboard2.tupper.TomatoCan;

public class MyProgram {
    public static void main(String[] args) {


       RiceBox myRiceBox = new RiceBox ();
       TomatoCan myTomatoCan = new TomatoCan();
       Cupboard myCupboard = new Cupboard();

       myCupboard.addGrocery(myRiceBox);
       myCupboard.addGrocery(myTomatoCan);

        System.out.println(myCupboard.getReport());







    }
}
