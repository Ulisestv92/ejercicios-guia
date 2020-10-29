package com.learn.oop.friday.exercise1;

public class Instrument {

    // entidad flute, mensaje que tiene que entender es makeasound , que nos devuelva el sonido de la flauta

    public String makeASound () {

        return "fiu, fa, fiu, fruli, fru";
    }

    public String makeASoundWithNote (Notes note ) {
        return "fiu, fa, fiu, fruli, fru: " + note;
    }

}
