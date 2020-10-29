package com.learn.guide.repetitivos;

import java.util.Scanner;

public class EjercicioLuigiFor5 {
    public static void main(String[] args) {
        // Escribir un programa Java que pida por consola a un usuario que
        // ingrese el valor de un número N y muestre por pantalla su tabla de multiplicar.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingreses un numero");

        int numeroIngresado = myScanner.nextInt();

        for (int i = 0; i <= 20; i++) {

            System.out.println(i + " x " + numeroIngresado + " = " + i * numeroIngresado);

        }
    }
}
