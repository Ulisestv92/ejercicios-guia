package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Leer una serie de numeros reales, terminando la serie con un 0. Imprimir los datos a medida que se los ingresa
        // junto con la suma parcial de los mismos

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numeroIngresado = myScanner.nextInt();

        for (int i = numeroIngresado; i>= 0; i--) {
            System.out.println(i);
        }
    }
}
