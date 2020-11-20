package com.learn.oop.cupboard2.ricebox;

import com.learn.oop.cupboard2.IGrocery;
import com.learn.oop.cupboard2.GroceryName;
import com.learn.oop.cupboard2.GroceryType;

public class RiceBox implements IGrocery {
    public static final int DEFAULT_SIZE_CONTENT_VALUE = 1000;
    public static final int KING_SIZE_CONTENT_VALUE = DEFAULT_SIZE_CONTENT_VALUE * 2;
    private int contentInGrams;
    private boolean isOpen;
    private GroceryType groceryType;
    private GroceryName groceryName;

    public RiceBox (){
        this.contentInGrams = DEFAULT_SIZE_CONTENT_VALUE;
        this.isOpen = false;
        this.groceryType = GroceryType.CEREAL;
        this.groceryName = GroceryName.RICE_BOX;
    }

    public RiceBox (boolean isKingSize){
        this();

        if (isKingSize){
            this.contentInGrams = KING_SIZE_CONTENT_VALUE;

        } else {
            this.contentInGrams = DEFAULT_SIZE_CONTENT_VALUE;
        }

    }



    public GroceryName getGroceryName() {
        return this.groceryName;
    }

    public GroceryType getGroceryType (){
        return this.groceryType;
    }

    public int getAvailableContentPercentage (){
        return this.contentInGrams * 100 / DEFAULT_SIZE_CONTENT_VALUE;
    }

    public void openBox (){
        this.isOpen = true;

    }

    public boolean isOpen (){
        return this.isOpen;
    }

    public boolean isDue (){
        // TODO
        return false;
    }


    public void extractGrams (int amoutToExtractInGrams){
        if (this.contentInGrams >= amoutToExtractInGrams && this.isOpen) {
            this.contentInGrams = this.contentInGrams - amoutToExtractInGrams;

        }
    }

}
