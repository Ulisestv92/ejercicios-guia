package com.learn.selectivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args) {
        // Leer la base y la altura de un rectangulo y calcular el perímetro y la superficie

        Scanner myScanner = new Scanner(System.in);
        float base;
        float altura;
        float perimetro;
        float superficie;

        System.out.println("Ingresar la base del rectangulo");
        base = myScanner.nextFloat();

        System.out.println("Ingrese la altura del rectangulo");
        altura = myScanner.nextFloat();

        perimetro = (base + altura) *2;
        superficie = base * altura;

        System.out.println("El perimetro del rectangulo es " + perimetro);
        System.out.println("La superficie del rectangulo es " + superficie);

    }
}
