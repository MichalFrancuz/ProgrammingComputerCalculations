package Set_of_task_3.Task_3;

import java.util.Arrays;

public class Task3Set3 {
    static double[][] matrix1L = {{1, 0, 0},
            {1, 1, 0},
            {1, (double) 5 / 3, 1}};
    static double[][] matrix1U = {{1, 2, 4},
            {0, 3, 21},
            {0, 0, 0}};
    static double[][] matrix2L = {{2, 0, 0},
            {-1, 1, 0},
            {1, -3, 1}};
    static double[][] matrix2U = {{2, -1, 1},
            {0, 1, -3},
            {0, 0, 1}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(calculateMultiplication(matrix1L, matrix1U)));
        System.out.println(Arrays.deepToString(calculateMultiplication(matrix2L, matrix2U)));
    }

    public static double[][] calculateMultiplication(double[][] x, double[][] y) {
        double upLeft = x[0][0] * y[0][0] + x[0][1] * y[1][0] + x[0][2] * y[2][0];
        double upMiddle = x[0][0] * y[0][1] + x[0][1] * y[1][1] + x[0][2] * y[2][1];
        double upRight = x[0][0] * y[0][2] + x[0][1] * y[1][2] + x[0][2] * y[2][2];
        double middleLeft = x[1][0] * y[0][0] + x[1][1] * y[1][0] + x[1][2] * y[2][0];
        double middleMiddle = x[1][0] * y[0][1] + x[1][1] * y[1][1] + x[1][2] * y[2][1];
        double middleRight = x[1][0] * y[0][2] + x[1][1] * y[1][2] + x[1][2] * y[2][2];
        double downLeft = x[2][0] * y[0][0] + x[2][1] * y[1][0] + x[2][2] * y[2][0];
        double downMiddle = x[2][0] * y[0][1] + x[2][1] * y[1][1] + x[2][2] * y[2][1];
        double downRight = x[2][0] * y[0][2] + x[2][1] * y[1][2] + x[2][2] * y[2][2];
        return new double[][]{{upLeft, upMiddle, upRight},
                {middleLeft, middleMiddle, middleRight},
                {downLeft, downMiddle, downRight}};
    }
}
