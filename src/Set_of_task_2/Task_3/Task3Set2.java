package Set_of_task_2.Task_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task3Set2 { // Leibniz formula for pi.
    public static void main(String[] args) {
        long start = System.nanoTime();
        double pi = 0;
        for (int i = 1; i < 1000000000; i += 4) { // Here calculating of pi is dependent highly by operating on time,
            // max integer is complicated situation, in bigger number with 'i' is growing then bigger accuracy in pi number.
            pi += 8.0 / (i * (i + 2L));
        }
        long time = System.nanoTime() - start;
        System.out.println(pi + " took " + time / 1000000 / 1e3 + " secs.");
    }
}

final class Pi { // Eulera formula for pi.
    public static void main(String[] args) {
        System.out.println(pi(100)); // Call this method. Here I can set accuracy of number pi by setting decimal numbers.
    }

    private static final BigDecimal TWO = new BigDecimal("2");
    private static final BigDecimal FOUR = new BigDecimal("4");
    private static final BigDecimal FIVE = new BigDecimal("5");
    private static final BigDecimal TWO_THIRTY_NINE = new BigDecimal("239");

    private Pi() {
    }

    public static BigDecimal pi(int numDigits) {

        int calcDigits = numDigits + 10;

        return FOUR.multiply((FOUR.multiply(arccot(FIVE, calcDigits)))
                        .subtract(arccot(TWO_THIRTY_NINE, calcDigits)))
                .setScale(numDigits, RoundingMode.DOWN);
    }

    private static BigDecimal arccot(BigDecimal x, int numDigits) {

        BigDecimal unity = BigDecimal.ONE.setScale(numDigits,
                RoundingMode.DOWN);
        BigDecimal sum = unity.divide(x, RoundingMode.DOWN);
        BigDecimal xpower = new BigDecimal(sum.toString());
        BigDecimal term = null;

        boolean add = false;

        for (BigDecimal n = new BigDecimal("3"); term == null ||
                term.compareTo(BigDecimal.ZERO) != 0; n = n.add(TWO)) {

            xpower = xpower.divide(x.pow(2), RoundingMode.DOWN);
            term = xpower.divide(n, RoundingMode.DOWN);
            sum = add ? sum.add(term) : sum.subtract(term);
            add = !add;
        }
        return sum;
    }
}