package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Dada una serie de numeros enteros terminada en cero, imprimir los tres mayores.

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ingrese un numero, el cual será el temaño del array: ");

        int tamanio = myScanner.nextInt();
        int array[] = new int[tamanio];

        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato " + (i + 1) + ": ");
            array[i] = myScanner.nextInt();
        }

        boolean hayCambios = false;
        int auxiliar = 0;

        do {
            hayCambios = false;

            for (i = 0; i < tamanio - 1; i++) {
                if (array[i + 1] > array[i]) {
                    auxiliar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = auxiliar;
                    hayCambios = true;
                }
            }

        } while (hayCambios) ;
            for (i = 0; i < tamanio; i++) {
            }

            int maximo = array[0];
            int segundoMaximo = array[1];
            int tercerMaximo = array[2];

            System.out.println("Los tres numeros mayores del array son: " + maximo + ", " + segundoMaximo + ", " + tercerMaximo);

        }
    }




