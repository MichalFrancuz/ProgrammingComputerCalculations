package Set_of_task_3.Task_1;

public class Task1Set3 {
    public static void main(String[] args) {
        double[] tabXtr = {0, 3, 0}; // triangle a=3 h=5
        double[] tabYtr = {5, 0, 0};
        double[] tabXsq = {0, 3, 3, 0}; // square a = 3 b = 5
        double[] tabYsq = {5, 5, 0, 0};
        double[] tabX5apex = {2, 3.5, 4, 3, 1}; // geometric figure from example
        double[] tabY5apex = {4, 5, 2.5, 1.25, 1};
        System.out.println("Triangle area calculate by apex: \n" + polyarea(tabXtr, tabYtr));
        System.out.println("Triangle area calculate by length of base and length of high: \n" + triangleArea(3, 5));
        System.out.println("Square area calculate by apex: \n" + polyarea(tabXsq, tabYsq));
        System.out.println("Square area calculate by length of side: \n" + squareArea(3, 5));
        System.out.println("Figure with 5 apex area calculate by apex: \n" + polyarea(tabX5apex, tabY5apex));
    }

    public static double polyarea(double[] x, double[] y) {
        double resultXy;
        double resultXysum = 0;
        double resultYx;
        double resultYxsum = 0;
        double finalResult;
        if (x.length == y.length) {
            for (int i = 0; i <= x.length; i++) {
                if (i == x.length - 1) {
                    resultXysum += x[x.length - 1];
                    resultXysum -= y[y.length - 1];
                    resultYxsum += y[y.length - 1];
                    resultYxsum -= x[x.length - 1];
                } else if (i == x.length) {
                    resultXysum += x[x.length - 1] * y[0];
                    resultYxsum += y[y.length - 1] * x[0];
                } else {
                    resultXy = x[i] * y[i + 1];
                    resultXysum += resultXy;
                    resultYx = y[i] * x[i + 1];
                    resultYxsum += resultYx;
                }
            }
        } else System.out.println("Number of points of x apex isn't equals to number of points of y apex");
        finalResult = resultXysum - resultYxsum;
        if (finalResult < 0) {
            finalResult *= -1;
        }
        return 0.5 * finalResult;
    }

    public static double triangleArea(double a, double h) {
        return (a * h) / 2;
    }

    public static double squareArea(double a, double b) {
        return a * b;
    }
}