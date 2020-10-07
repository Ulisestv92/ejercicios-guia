package com.learn.selectivas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Escribir un algoritmo que lea un numero real cualquiera y lo imprima redondeado con 2 decimales

        Scanner myScanner = new Scanner(System.in);
        double numeroIngresado;

        System.out.println("Ingrese un numero real cualquiera");
        numeroIngresado = myScanner.nextDouble();

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El numero ingresado es: " + df.format(numeroIngresado));

    }
}
