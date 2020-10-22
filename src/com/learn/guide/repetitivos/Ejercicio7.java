package com.learn.ciclos.repetitivos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Leer A y B, enteros. Calcular C = AB mediante multiplicaciones sucesivas e imprimir el resultado. Tener en cuenta
        //que son nu ́meros enteros, por lo tanto pueden tomar valores positivos, negativos o cero.

        Scanner myScaner = new Scanner(System.in);
        int exponencial = 1;

        System.out.println("Ingrese un primer numero");
        int PrimerNroIngresado = myScaner.nextInt();

        System.out.println("Ingrese un segundo numero");
        int SegundoNroIngresado = myScaner.nextInt();

        for (int i = 1; i <= SegundoNroIngresado; i++) {
            exponencial = exponencial * PrimerNroIngresado;
        }
        System.out.println("La multiplicacion entre ambos numeros es = " + exponencial);
    }
}
