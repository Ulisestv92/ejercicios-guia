package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Escribir un algoritmo que determine si un numero es par

        Scanner myScanner = new Scanner(System.in);
        int numeroIngresado;

        System.out.println("Ingrese un numero");
        numeroIngresado = myScanner.nextInt();

        if (numeroIngresado %2 == 0) {
            System.out.println("El numero ingresado es par");

        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
