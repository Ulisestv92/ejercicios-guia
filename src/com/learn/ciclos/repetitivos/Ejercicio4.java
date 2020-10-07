package com.learn.ciclos.repetitivos;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Dada una serie de nu ́meros reales, determinar el valor m ́aximo, el m ́ınimo
        // y las posiciones en que  ́estos se encontraban en la serie. El programa deber ́a ir preguntando si hay m ́as nu ́meros para ingresar.

        double [] numerosReales = {18.6,23.1,98.49,7.9,25.4,84.1,2.35,66.77};
        double maximo = numerosReales[0];
        double minimo = numerosReales[0];

        for (int i = 1; i<numerosReales.length;i++) {
            if (numerosReales[i]>maximo) {
                maximo = numerosReales[i];
            }
        }
        for (int i = 1; i<numerosReales.length;i++) {
            if (numerosReales[i]<minimo) {
                minimo = numerosReales[i];
            }
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}
