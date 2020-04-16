package com.amena.ejercicios;
public class McdApp {
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int c = 0;
            c = a % b;
            while (c != 0) {
                a = b;
                b = c;
                c = a % b;
            }//while
            return b;
        }//else
    }                                                                  
    public static void main(String[] args) {
            int valor1 = 6, valor2 = 15;
        int mcdRetornado = mcd(valor1, valor2);
        System.out.format("El MCD de %d y %d es %d %n", valor1,valor2, mcdRetornado);  
        System.out.format("El MCD de %d y %d es %d %n", valor1,valor2, mcd(valor1, valor2));
    }
}
