package com.learn.oop.cupboard;

import java.util.ArrayList;
import java.util.List;

public class Cupboard {
    private List<Grocery> groceries;

    public Cupboard(){
        this.groceries = new ArrayList<>();
    }

    public void addGrocery(Grocery grocery) {
        this.groceries.add(grocery);
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "groceries=" + groceries +
                '}';
    }
}

