package com.learn.guide.selectivas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {
        // Leer un numero real y decir si es mayor, menor o igual a 0

    Scanner myScanner = new Scanner(System.in);
    int NumeroIngresado;

    System.out.println("Ingrese un numero");

    NumeroIngresado = myScanner.nextInt();

    if (NumeroIngresado > 0) {
        System.out.println("El numero ingresado es mayor a 0");

    } else if (NumeroIngresado < 0) {
            System.out.println("El numero ingresado es menor a 0"); }

            else {
                System.out.println("El numero es igual a 0");
        }



}

}
