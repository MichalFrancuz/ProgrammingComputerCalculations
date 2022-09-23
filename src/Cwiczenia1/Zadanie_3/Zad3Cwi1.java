package Cwiczenia1.Zadanie_3;

import java.util.Arrays;

public class Zad3Cwi1 {
    public static strictfp double[] metoda(double d1, double d2, int n, double potega) {
        double[] y = new double[n];
        double[] p = linspace(d1, d2, n);
        for (int i = 0; i < y.length - 1; i++) y[i] = Math.pow(potega, p[i]);
        y[y.length - 1] = Math.pow(potega, d2);
        return y;
    }

    public static strictfp double[] linspace(double d1, double d2, int n) {
        double[] y = new double[n];
        double dy = (d2 - d1) / (n - 1);
        for (int i = 0; i < n; i++) y[i] = d1 + (dy * i);
        return y;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(metoda(1,3,3,1)));
        System.out.println(Arrays.toString(linspace(1,3,3)));
        System.out.println(Arrays.toString(metoda(1,3,3,2)));
        System.out.println(Arrays.toString(metoda(1,3,3,3)));
    }
}