package Cwiczenia1.Zadanie_5;

public class Zad5Cwi1 {

    public static void main(String[] args) {
// węzły interpolacji oraz odpowiadające im wartości
// ( jak nie trudno się domyślić funkcja to x^2)
        double[] x = {-4, -2, 0, 1, 3, 5, 7, 9, 11, 13};
        double[] y = {16, 4, 0, 1, 9, 13, 20, 29, 38, 47};

//chcemy znaleźć wartość w x = 2
        double y2 = lagrangeInterpolation(x, y, 2);
        System.out.println("x = 2 -> y = " + y2);

    }

    public static double lagrangeInterpolation(double[] xs, double[] ys, double x) {
        double t;
        double y = 0.0;

        for (int k = 0; k < xs.length; k++) {
            t = 1.0;
            for (int j = 0; j < xs.length; j++) {
                if (j != k) {
                    t = t * ((x - xs[j]) / (xs[k] - xs[j]));
                }
            }
            y += t * ys[k];
        }
        return y;
    }


}
