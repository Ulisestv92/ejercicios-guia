package com.learn.guide.secuenciales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Leer 2 numeros por teclado e imprimir: La suma, resta y multiplicacion de ambos

        Scanner myScanner = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Ingrese el primer numero");
        valor1 = myScanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        valor2 = myScanner.nextInt();

        System.out.println("La suma de los numeros es " + (valor1+valor2));
        System.out.println("La resta de los numeros es " + (valor1-valor2));
        System.out.println("La multiplicacion de los numeros es " + (valor1*valor2));
        System.out.println("La division de los numeros es " + (valor1/valor2));


    }
}
