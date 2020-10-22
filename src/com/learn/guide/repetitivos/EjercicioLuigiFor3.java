package com.learn.ciclos.repetitivos;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class EjercicioLuigiFor3 {
    public static void main(String[] args) {

        // Escribir un programa Java que pida por consola a un usuario que ingrese el valor de un número N y
        // muestre por pantalla todos los números desde N hasta 1.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingreses un numero");

        int numeroIngresado = myScanner.nextInt();

        for (int i = numeroIngresado; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
