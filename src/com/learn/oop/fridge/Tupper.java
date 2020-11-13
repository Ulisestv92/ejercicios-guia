package com.learn.oop.fridge;

public class Tupper {

    private Contents content;
    private boolean isOpen;

    public Tupper (){
        this.content = Contents.EMPTY;
        this.isOpen = false;
    }

    public Tupper (Contents content) {
        this.content = content;
        this.isOpen = false;
    }

    public Tupper (boolean isOpen){
        this.content = Contents.EMPTY;
        this.isOpen = isOpen;
    }

    public Tupper (Contents content, boolean isOpen){
        this.content = content;
        this.isOpen = isOpen;

    }
    // Metodo que dado un objeto, devuelve su representacion como un String

    @Override
    public String toString () {
        String output = this.content + " " + this.isOpen;
        return output;
    }



}
