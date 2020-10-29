package com.learn.oop.exercise1;

public class Person {

    public String greeting () {           // String en este caso es el tipo de dato que quiero que me devuelvan
        return "hello";
    }
    public String greetingByName (String name) {
        return "hello " + name;
    }

    public boolean isOlder (int age) {      // boolean en este caso es el tipo de dato que quiero que me devuelvan
                                            // int representa el tipo de dato que puedo recibir por parametro
                                            // age es el nombre de la variable donde se va a guardar lo que me pasan por parametro
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
