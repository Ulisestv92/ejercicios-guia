package com.learn.oop.fridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

    private List<Tupper> tuppers;

    public Fridge (){
        this.tuppers = new ArrayList<>();

    }

    public void addTupper (Tupper tupper) {
        this.tuppers.add(tupper);

    }

    @Override
    public String toString () {
        String output = this.tuppers.toString();
        return output;

    }
}
