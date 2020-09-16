package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Leer 2 numeros reales e imprimir el mayor de ellos

        Scanner myScanner = new Scanner(System.in);
        float primerNumero, segundoNumero;

        System.out.println("Ingrese un numero");
        primerNumero = myScanner.nextFloat();

        System.out.println("Ingrese otro numero");
        segundoNumero = myScanner.nextFloat();

        if (primerNumero > segundoNumero) {
            System.out.println("El primer valor ingresado es mayor que el segundo");
        } else if (segundoNumero > primerNumero) {
            System.out.println("El segundo valor ingresado es mayor que el primero");
        } else {
            System.out.println("Los numeros ingresados son iguales");
        }
    }
}