package Cwiczenia1.Zadanie_2;

import static java.lang.Math.PI;

public class Zad2Cwi1 {
    public static void main(String[] args) {
        double dobryWynikCiA = 12.566370614359172;
        int r = 2;
        double C = 2 * PI * r;
        double A = PI * (r * r);
        System.out.println(A);
        if (C == dobryWynikCiA && A == dobryWynikCiA)
            System.out.println("Obwod kola (C) wynosi: " + C + " , a pole kola (A) wynosi: " + A);
        else
            System.out.println("Obliczenia sa zle lub zostaly zmienione zmienne, wynik jest dla zmiennych r=2, i PI dokładnego do 15. liczby po przecinku.");
    }
}