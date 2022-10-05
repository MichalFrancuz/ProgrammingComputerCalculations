package Set_of_task_2.Task_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Task1Set2 {
    public static void main(String[] args) {

        double[] measurement = new double[10];
        double[] time = new double[10]; // [min]
        double[] range = {3.2}; // t = 3,2 [min]
        double[] measurement2 = {4.4, 2.0, 11.0, 21.5, 7.5}; // Table from requirement 3c of this task.
        double[] time2 = {0, 1, 2, 3, 4}; // [min]
        double[] range2 = {2.5, 3.1}; // t = 2,5 [min]; t = 3,1 [min]; table from requirement 3c of this task.

        for (int i = 0; i < measurement.length; i++) {
            double accuracy = (double) i * 875; // Change values to see some differences in results.
            measurement[i] = accuracy;
        }

        for (int i = 0; i < time.length; i++) {
            time[i] = i;
        }

        System.out.println(Arrays.toString(interpLinear(time, measurement, range))); // Call method -> result of requirement 1. of this task.
        System.out.println(Arrays.toString(interpLinear(time2, measurement2, range2)));
        // Call method -> result of requirement 3a, 3b of this task.
    }

    public static double[] interpLinear(double[] x, double[] y, double[] xi) throws IllegalArgumentException {

        if (x.length != y.length) {
            throw new IllegalArgumentException("X and Y must be the same length");
        }
        if (x.length == 1) {
            throw new IllegalArgumentException("X must contain more than one value");
        }
        double[] dx = new double[x.length - 1];
        double[] dy = new double[x.length - 1];
        double[] slope = new double[x.length - 1];
        double[] intercept = new double[x.length - 1];

        // Calculate the line equation (i.e. slope and intercept) between each point.
        for (int i = 0; i < x.length - 1; i++) {
            dx[i] = x[i + 1] - x[i];
            if (dx[i] == 0) {
                throw new IllegalArgumentException("X must be monotonic. A duplicate x-value was found");
            }
            if (dx[i] < 0) {
                throw new IllegalArgumentException("X must be sorted");
            }
            dy[i] = y[i + 1] - y[i];
            slope[i] = dy[i] / dx[i];
            intercept[i] = y[i] - x[i] * slope[i];
        }

        // Perform the interpolation here.
        double[] yi = new double[xi.length];
        for (int i = 0; i < xi.length; i++) {
            if ((xi[i] > x[x.length - 1]) || (xi[i] < x[0])) {
                yi[i] = Double.NaN;
            } else {
                int loc = Arrays.binarySearch(x, xi[i]);
                if (loc < -1) {
                    loc = -loc - 2;
                    yi[i] = slope[loc] * xi[i] + intercept[loc];
                } else {
                    yi[i] = y[loc];
                }
            }
        }

        return yi;
    }

    public static BigDecimal[] interpLinear(BigDecimal[] x, BigDecimal[] y, BigDecimal[] xi) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("X and Y must be the same length");
        }
        if (x.length == 1) {
            throw new IllegalArgumentException("X must contain more than one value");
        }
        BigDecimal[] dx = new BigDecimal[x.length - 1];
        BigDecimal[] dy = new BigDecimal[x.length - 1];
        BigDecimal[] slope = new BigDecimal[x.length - 1];
        BigDecimal[] intercept = new BigDecimal[x.length - 1];

        // Calculate the line equation (i.e. slope and intercept) between each point.
        BigInteger zero = new BigInteger("0");
        BigDecimal minusOne = new BigDecimal(-1);

        for (int i = 0; i < x.length - 1; i++) {
            //dx[i] = x[i + 1] - x[i];
            dx[i] = x[i + 1].subtract(x[i]);
            if (dx[i].equals(new BigDecimal(zero, dx[i].scale()))) {
                throw new IllegalArgumentException("X must be monotonic. A duplicate " + "x-value was found");
            }
            if (dx[i].signum() < 0) {
                throw new IllegalArgumentException("X must be sorted");
            }
            //dy[i] = y[i + 1] - y[i];
            dy[i] = y[i + 1].subtract(y[i]);
            //slope[i] = dy[i] / dx[i];
            slope[i] = dy[i].divide(dx[i]);
            //intercept[i] = y[i] - x[i] * slope[i];
            intercept[i] = x[i].multiply(slope[i]).subtract(y[i]).multiply(minusOne);
            //intercept[i] = y[i].subtract(x[i]).multiply(slope[i]);
        }

        // Perform the interpolation here.
        BigDecimal[] yi = new BigDecimal[xi.length];
        for (int i = 0; i < xi.length; i++) {
            //if ((xi[i] > x[x.length - 1]) || (xi[i] < x[0])) {
            if (xi[i].compareTo(x[x.length - 1]) > 0 || xi[i].compareTo(x[0]) < 0) {
                yi[i] = null; // same as NaN
            } else {
                int loc = Arrays.binarySearch(x, xi[i]);
                if (loc < -1) {
                    loc = -loc - 2;
                    //yi[i] = slope[loc] * xi[i] + intercept[loc];
                    yi[i] = slope[loc].multiply(xi[i]).add(intercept[loc]);
                } else {
                    yi[i] = y[loc];
                }
            }
        }

        return yi;
    }

    public static double[] interpLinear(long[] x, double[] y, long[] xi) throws IllegalArgumentException {

        double[] xd = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            xd[i] = (double) x[i];
        }

        double[] xid = new double[xi.length];
        for (int i = 0; i < xi.length; i++) {
            xid[i] = (double) xi[i];
        }

        return interpLinear(xd, y, xid);
    }

    static class find_y { // All class is result of requirement 3a, 3b of this task.
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Input number of range starting: ");
            double rangeStarting = scan.nextDouble();

            System.out.println("Input number of range ending: ");
            double rangeEnding = scan.nextDouble();

            System.out.println("Input number of range repeatability: ");
            double rangeRepeatability = scan.nextDouble();

            scan.close();

            double[] range3 = new double[(int) ((rangeEnding - rangeStarting) / rangeRepeatability) + 1];
            // Length of table must be in int, so I had to convert double type to int type.
            double[] measurement3 = {4.2, 7.4, 22.4, 75.3, 9.1, 65.3, 1000, 783.33, 43.2, 91.1}; // Table with examples values.
            double[] time = new double[10]; // [min]

            for (int i = 0; i < time.length; i++) {
                time[i] = i;
            }

            if (rangeStarting > 0 && rangeEnding > 0 && rangeRepeatability > 0) {
                for (int i = 0; i < range3.length; i++) { // Put values from parameters witch was inputted from user to table range3.
                    range3[i] = rangeStarting;
                    rangeStarting += rangeRepeatability;
                }
            } else {
                System.out.println("Some of your values are negative or equals zero, please make sure that all your input are positive number.");
            }
            System.out.println(range3.length);
            System.out.println(Arrays.toString(range3)); // Print values of table range3.
            System.out.println(Arrays.toString(interpLinear(time, measurement3, range3)));
            // Call method with new range -> calculate required values for inputting range of time.
        }
    }
}