package Set_of_task_3.Task_4;

import Set_of_task_3.Task_3.Task3Set3;

public class Task4Set3 extends Task3Set3 {
    static double[][] matrixL = {{1, 0, 0},
            {(double) 3 / 2, 1, 0}, // Convert every fraction to double
            {(double) 1 / 2, (double) 11 / 13, 1}};
    static double[][] matrixU = {{2, -3, -1},
            {0, (double) 13 / 2, (double) -7 / 2},
            {0, 0, (double) 32 / 13}};
    static double[] tableB = {1, -1, 2}; // Calculate for table
    static double[][] matrixA = calculateMultiplication(matrixL, matrixU); // Multiplication of matrix's
    static double[][] matrixResume = new double[matrixA.length][matrixA.length]; // Create new matrix

    public static void main(String[] args) {

        double[] matrixBCopy = new double[tableB.length];
        System.arraycopy(tableB, 0, matrixBCopy, 0, tableB.length);

        for (int i = 0; i < tableB.length - 1; i++) { // Gauss's elimination method
            for (int j = i + 1; j <= tableB.length - 1; j++) {
                for (int k = 0; k < tableB.length; k++) {
                    matrixResume[j][k] = matrixA[j][k] - (matrixA[i][k] * (matrixA[j][i] / matrixA[i][i]));
                }

                matrixBCopy[j] = tableB[j] - (tableB[i] * (matrixA[j][i] / matrixA[i][i]));

                for (int ii = 0; ii < matrixResume.length; ii++) {
                    System.arraycopy(matrixResume[ii], 0, matrixA[ii], 0, matrixResume.length);
                    tableB[ii] = matrixBCopy[ii];
                }
            }
        }

        for (int j = 0; j < tableB.length; j++) { // Print result
            for (int k = 0; k < tableB.length; k++) {
                System.out.print(matrixA[j][k] + "\t");
            }
            System.out.println("\t" + tableB[j]);
        }
    }
}