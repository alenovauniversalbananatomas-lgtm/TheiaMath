package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Algebra {

    private static final int SCALE = 20;

    // POTENCIA (x^n entero)
    public static BigDecimal Pow(BigDecimal base, int exp) {
        BigDecimal result = BigDecimal.ONE;

        if (exp >= 0) {
            for (int i = 0; i < exp; i++) {
                result = result.multiply(base);
            }
        } else {
            // exponente negativo → 1 / x^n
            BigDecimal positive = Pow(base, -exp);
            result = BigDecimal.ONE.divide(positive, SCALE, RoundingMode.HALF_UP);
        }

        return result;
    }

    // RAÍZ CUADRADA (Newton)
    public static BigDecimal Sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Negative value");
        }

        BigDecimal x = value;
        BigDecimal two = new BigDecimal("2");

        for (int i = 0; i < 50; i++) {
            x = x.add(value.divide(x, SCALE, RoundingMode.HALF_UP))
                 .divide(two, SCALE, RoundingMode.HALF_UP);
        }

        return x;
    }

    // VALOR ABSOLUTO
    public static BigDecimal Abs(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            return value.negate();
        } else {
            return value;
        }
    }

    // MÍNIMO
    public static BigDecimal Min(BigDecimal a, BigDecimal b) {
        if (a.compareTo(b) < 0) {
            return a;
        } else {
            return b;
        }
    }

    // MÁXIMO
    public static BigDecimal Max(BigDecimal a, BigDecimal b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    // REDONDEO SIMPLE
    public static BigDecimal Round(BigDecimal value) {
        return value.setScale(0, RoundingMode.HALF_UP);
    }
}