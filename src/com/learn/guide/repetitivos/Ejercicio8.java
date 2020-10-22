package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Escribir un algoritmo que descomponga un nu ́mero en sus factores primos.

        Scanner myScanner = new Scanner(System.in);
        int factor = 2;

        System.out.println("Ingrese un numero para descomponer sus factores primos");
        int numeroIngresado = myScanner.nextInt();


        for (factor=2; factor<=numeroIngresado;factor++) {
            while (numeroIngresado%factor==0) {
                System.out.println(numeroIngresado + " | " + factor);
                numeroIngresado = numeroIngresado / factor;
            }

            }
                
        }
    }

