package com.learn.guide.repetitivos;

import java.util.Scanner;

public class EjercicioLuigiFor2 {
    public static void main(String[] args) {
        // Escribir un programa Java que pida por consola a un usuario que ingrese el valor de un número N y
        // muestre por pantalla todos los números desde 1 hasta N.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numeroIngresado = myScanner.nextInt();

        for (int i = 1; i<= numeroIngresado; i++) {
            System.out.println(i);
        }
    }
}
