package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class EjercicioLuigiWhile2 {
    public static void main(String[] args) {
        // Escribir un programa Java que pida por consola a un usuario que ingrese el valor de un número N
        // y muestre por pantalla todos los números desde 1 hasta N.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numeroIngresado = myScanner.nextInt();
        int i = 1;

        while (i<=numeroIngresado) {
            System.out.println(i);
            i++;

        }
    }
}
