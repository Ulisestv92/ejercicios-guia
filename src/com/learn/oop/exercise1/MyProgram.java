package com.learn.oop.exercise1;

public class MyProgram {

    public static void main(String[] args) {
        Person juan = new Person (); // creo un objeto
        String greet = juan.greeting(); // mandar el mensaje greeting al objeto Juan

        System.out.println(greet);

        String greetByName = juan.greetingByName("Ulises"); // mandar el mensaje greetingbyname con el parámetro Ulises al objeto Juan

        System.out.println(greetByName);

        boolean ifItsOlder = juan.isOlder(5);
        System.out.println(ifItsOlder);



    }
}
