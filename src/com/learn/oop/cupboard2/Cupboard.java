package com.learn.oop.cupboard2;

import java.util.ArrayList;
import java.util.List;

public class Cupboard {
    private List<IGrocery> groceries;

    public Cupboard(){
        this.groceries = new ArrayList<>();
    }

    public void addGrocery(IGrocery grocery) {
        this.groceries.add(grocery);
    }

    public String getReport (){
        String result = "";
        for (int i = 0; i < this.groceries.size() ; i++) {
            result = result + groceries.get(i).getGroceryName();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "groceries=" + groceries +
                '}';
    }
}

