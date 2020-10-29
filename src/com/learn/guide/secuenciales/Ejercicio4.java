package com.learn.guide.secuenciales;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Dado el radio R de una esfera, calcular e imprimir su superficie y volumen

        Scanner myScanner = new Scanner (System.in);
        double radio, superficie, volumen;

        System.out.println("Introduza el valor del radio de la esfera");
        radio = myScanner.nextDouble();

        superficie = 4 * Math.PI * Math.pow(radio,2);

        System.out.println("La superficie de la esfera es " + superficie);

        volumen = 1.3333 * Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de la esfera es " + volumen);

    }
}
