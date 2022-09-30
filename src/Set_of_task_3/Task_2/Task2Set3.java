package Set_of_task_3.Task_2;

public class Task2Set3 {
    static double[][] matrix1 = {{1, 2, 3}, // 1, 2
                                 {2, 3, 4}, // 2, 3
                                 {3, 4, 5}}; // 3, 4
    static double[][] matrix2 = {{2.11, -0.8, 1.72}, // 2.11, -0.8
                                {-1.84, 3.03, 1.29}, // -1.84, 3.03
                                 {-1.57, 5.25, 4.3}}; // -1.57, 5.25
    static double[][] matrix3 = {{2, -1, 0}, // 2, -1
                                {-1, 2, -1}, // -1, 2
                                 {0, -1, 2}}; // 0, -1
    static double[][] matrix4 = {{4, 3, -1}, // 4, 3
                                 {7, -2, 3}, // 7, -2
                               {5, -18, 13}}; // 5, -18

    public static void main(String[] args) {
        System.out.println(calculateMatrix3x3(matrix1) + "\n"); // singular and well-conditioned matrix
        System.out.println(calculateMatrix3x3(matrix2) + "\n"); // non-singular and ill-conditioned matrix
        System.out.println(calculateMatrix3x3(matrix3) + "\n"); // non-singular and well-conditioned matrix
        System.out.println(calculateMatrix3x3(matrix4) + "\n"); // singular and well-conditioned matrix
    }

    public static double calculateMatrix3x3(double[][] x) {
        double firstFromLeft = x[0][0] * x[1][1] * x[2][2];
        double secondFromLeft = x[0][1] * x[1][2] * x[2][0];
        double thirdFromLeft = x[0][2] * x[1][0] * x[2][1];
        double firstFromRight = x[0][1] * x[1][0] * x[2][2];
        double secondFromRight = x[0][0] * x[1][2] * x[2][1];
        double thirdFromRight = x[0][2] * x[1][1] * x[2][0];
        double leftResume = firstFromLeft + secondFromLeft + thirdFromLeft;
        double rightResume = firstFromRight + secondFromRight + thirdFromRight;
        return leftResume - rightResume;
    }
}