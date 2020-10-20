package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Leer A y B, enteros. Calcular C = A ∗ B mediante sumas sucesivas e imprimir el resultado

        Scanner myScanner = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese el primer numero");
        int PrimerNroIngresado = myScanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int SegundoNroIngresado = myScanner.nextInt();

        for( int i = 1; i <= SegundoNroIngresado; i++) {
            suma = suma + PrimerNroIngresado;
        }
        System.out.println("El producto de los numeros ingresados es = " +suma);
    }
}
