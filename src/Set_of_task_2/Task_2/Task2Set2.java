package Cwiczenia2.Task_2;

import java.util.Random;

public class Task2Set2 {
    public static void main(String[] args) {

        Random random = new Random();
        int rand = 0;
        while (true) { // This loop generate pseudo-random whole number from 1 to 100.
            rand = random.nextInt(100);
            if (rand != 0) break;
        }

        int xi = rand;
        int fxi = linear_function(rand); // call a method
        int c_as_x = 2;
        int fc = linear_function(c_as_x); // call a method
        int numerator = fxi - fc;
        int denominator = xi - c_as_x;
        int result = numerator / denominator;

        System.out.println(numerator);
        System.out.println(denominator);
        System.out.println(result);
    }

    public static int linear_function(int x) {
        return 4 * x + 1;
    }
}
