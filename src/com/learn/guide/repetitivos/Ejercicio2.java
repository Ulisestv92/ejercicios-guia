package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Leer un numero y calcular su factorial

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero = myScanner.nextInt();
        System.out.println("El factorial de " + numero + "es: " + factorial(numero));
        numero = myScanner.nextInt();

    }

    public static double factorial(int numero) {

        double aux = 1;

        for (int i = 1; i <= numero; i++) {
            aux = aux * i;
        }
        return aux;

        }
    }
