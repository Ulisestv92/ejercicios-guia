package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Escribir un algoritmo que determine si un numero N es divisible por M

        Scanner myScanner = new Scanner(System.in);
        int N, M;

        System.out.println("Ingrese el valor de la variable N");
        N = myScanner.nextInt();

        System.out.println("Ingrese el valor de la variable M");
        M = myScanner.nextInt();

        if (N % M == 0) {
            System.out.println("La variable N = " + N + " es divisible por la variable M = " + M);
        } else {
            System.out.println("El primer valor ingresado no es divisible por el segundo");
        }
    }
}

