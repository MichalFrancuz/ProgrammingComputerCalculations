package Set_of_task_1.Task_2;

import static java.lang.Math.PI;

public class Task2Set1 {
    public static void main(String[] args) {
        double goodResultCAndA = 12.566370614359172;
        int r = 2;
        double C = 2 * PI * r;
        double A = PI * (r * r);
        System.out.println(A);
        if (C == goodResultCAndA && A == goodResultCAndA)
            System.out.println("The circumference of the circle (C) is: " + C + " , and the surface of the circle (A) is: " + A);
        else
            System.out.println("The calculation is wrong or the variables have been changed, the result is for variables r=2, and PI with accurate to 15. decimal place.");
    }
}