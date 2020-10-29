package com.learn.guide.repetitivos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Imprimir por pantalla una lista de 20 numeros consecutivos, los cuales comienzan con un numero ingresado por teclado

        Scanner myScanner = new Scanner(System.in);
        int numero;
        int i;

        System.out.println("Ingrese un numero");
        numero = myScanner.nextInt();

        for (i = numero; i<=numero+20; i ++) {
            System.out.println(i);
        }


    }
}
