package com.learn.secuenciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Leer un numero por teclado e imprimirlo en pantalla con el siguiente cartel: "Numero ingresado = numero"

        Scanner myScanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero");

        numero = myScanner.nextInt();
        System.out.println("Numero ingresado " + numero);
      }
    }

