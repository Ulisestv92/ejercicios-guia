package com.learn.guide.secuenciales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args) {
        // Escribir un programa que lea el nombre de una persona y luego lo salude

        Scanner myScanner = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = myScanner.nextLine();

        System.out.println("Hola " + nombre);


    }
}
