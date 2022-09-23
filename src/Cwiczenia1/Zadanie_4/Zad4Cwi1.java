package Cwiczenia1.Zadanie_4;

import java.util.Scanner;

public class Zad4Cwi1 {
    public static void main(String[] args) {
        double liczba = 0;
        double suma = 0;
        int[] liczby = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje liczby do obliczenia sredniej, po kazdej liczbie potwierdz to wciskajac enter:");
        for (int i = 0; i < 5; i++) {
            liczby[i] = scan.nextInt();
            suma = liczba += liczby[i];
        }
        double srednia = suma / liczby.length;
        System.out.println(suma);
        System.out.println(srednia);
    }
}
