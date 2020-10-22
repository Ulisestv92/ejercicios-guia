package com.learn.secuenciales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args) {
        // Leer 2 numeros (A y B) e intercambiar el valor de sus variables

        Scanner myScanner = new Scanner(System.in);
        int A;
        int B;
        int aux;

        System.out.println("Ingrese el primer numero");
        A = myScanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        B = myScanner.nextInt();

        System.out.println("A vale " + A + " y B vale " + B );

        aux = A;
        A = B;
        B = aux;

        System.out.println("Ahora A vale " + A + " y B vale " + B);

    }
}
