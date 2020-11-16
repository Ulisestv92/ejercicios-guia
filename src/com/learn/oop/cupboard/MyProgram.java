package com.learn.oop.cupboard;

public class MyProgram {
    public static void main(String[] args) {

        /*Cupboard
        cans (tuna, corn, pea, chickpeas)
        rice
        pasta (spaguetti, noodles)
        flour
        condiments (curry, paprika, pepper, cardamoms, cumin, basil)

         */

        Cupboard cupboard = new Cupboard();
        cupboard.addGrocery(Grocery.RICE);
        cupboard.addGrocery(Grocery.CANS);
        System.out.println(cupboard);

    }
}
