package com.learn.oop.cupboard2.tupper;

import com.learn.oop.cupboard2.IGrocery;
import com.learn.oop.cupboard2.GroceryName;
import com.learn.oop.cupboard2.GroceryType;

public class TomatoCan implements IGrocery {

    private GroceryType groceryType;
    private GroceryName groceryName;

    public TomatoCan (){
        this.groceryType = GroceryType.CAN;
        this.groceryName = GroceryName.TOMATO_CAN;


    }

    public GroceryType getGroceryType () {
        return this.groceryType;

    }

    public GroceryName getGroceryName () {
        return this.groceryName;
    }
}



