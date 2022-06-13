package Cwiczenia1;
import static java.lang.Math.PI;

public class Zad2Cwi1{
    public static void main(String[]args){
        double dobryWynikC=12.566370614359172;
        double dobryWynikA=12.566370614359172;
        int r=4;
        double C=2*PI*r;
        double A=PI*(r*r);
        if (C==dobryWynikC && A==dobryWynikA)System.out.println("Obwod kola (C) wynosi: "+C+" a pole kola (A) wynosi: "+A);
        else System.out.println("Obliczenia sa zle lub zostaly zmienione zmienne, wynik jest dla zmiennych r=2, i PI dokładnego do 15. liczby po przecinku. ");
    }
}