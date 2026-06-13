package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Advanced {

    private static final int SCALE = 20;

    private static final BigDecimal PI = new BigDecimal(
            "3.14159265358979323846"
    );

    // EXPONENCIAL (e^x aproximado con series)
    public static BigDecimal Exp(BigDecimal x) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        for (int i = 1; i < 50; i++) {
            term = term.multiply(x)
                       .divide(new BigDecimal(i), SCALE, RoundingMode.HALF_UP);
            result = result.add(term);
        }

        return result.setScale(SCALE, RoundingMode.HALF_UP);
    }

    // LOG NATURAL (ln) aproximado (Newton)
    public static BigDecimal Ln(BigDecimal x) {
        if (x.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ArithmeticException("Invalid input");
        }

        BigDecimal guess = x;
        BigDecimal eToGuess;
        BigDecimal one = BigDecimal.ONE;

        for (int i = 0; i < 40; i++) {
            eToGuess = Exp(guess);
            guess = guess.subtract(
                    eToGuess.subtract(x)
                            .divide(eToGuess, SCALE, RoundingMode.HALF_UP)
            );
        }

        return guess.setScale(SCALE, RoundingMode.HALF_UP);
    }

    // POTENCIA GENERAL (x^y real)
    public static BigDecimal Pow(BigDecimal base, BigDecimal exp) {
        if (base.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ArithmeticException("Base must be positive");
        }

        // x^y = e^(y * ln(x))
        BigDecimal ln = Ln(base);
        BigDecimal product = exp.multiply(ln);

        return Exp(product);
    }

    // SIN (aproximación serie de Taylor)
    public static BigDecimal Sin(BigDecimal x) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal term = x;

        int sign = 1;

        for (int i = 1; i < 20; i += 2) {
            if (sign == 1) {
                result = result.add(term);
            } else {
                result = result.subtract(term);
            }

            term = term.multiply(x)
                       .multiply(x)
                       .divide(new BigDecimal(i + 1)
                       .multiply(new BigDecimal(i + 2)), SCALE, RoundingMode.HALF_UP);

            sign *= -1;
        }

        return result.setScale(SCALE, RoundingMode.HALF_UP);
    }

    // COS (derivado de sin)
    public static BigDecimal Cos(BigDecimal x) {
        return Sin(x.add(new BigDecimal(String.valueOf(PI.divide(new BigDecimal("2"), SCALE, RoundingMode.HALF_UP)))));
    }

    // ABSOLUTO
    public static BigDecimal Abs(BigDecimal x) {
        if (x.compareTo(BigDecimal.ZERO) < 0) {
            return x.negate();
        } else {
            return x;
        }
    }

    // FACTORIAL
    public static BigDecimal Fact(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative factorial");
        }

        BigDecimal result = BigDecimal.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }

        return result;
    }
}