package com.learn.oop.exercise2;

public class MyProgram {
    public static void main(String[] args) {

        Cup myFavCup = new Cup();
        String content = myFavCup.myContentIs(PossibleContents.CHOCOLATE);
        System.out.println(content);

        int volume = myFavCup.yourVolumeIs(500);
        System.out.println(volume + "ml");





         // Los metodos que me permiten cambiar el estado como
        //    yourContentIs se denominan Setters

        // Los metodos que me perminten obtener el valor de un atributo
        // como myContentIs se denominan Getters




    }
}
