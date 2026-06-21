package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Algebra class provides advanced mathematical operations
 * using BigDecimal for high precision (20 decimal places).
 *
 * <p>Includes power, square root, absolute value, minimum,
 * maximum, and rounding functions.</p>
 *
 * <p>All operations are designed to maintain consistent precision
 * across calculations.</p>
 */
public class Algebra {

    // Default scale for precision (20 decimal places)
    private static final int SCALE = 20;

    /**
     * Computes the power of a base raised to an integer exponent.
     *
     * @param base the base value
     * @param exp the exponent (can be negative)
     * @return base raised to the power of exp
     */
    public static BigDecimal Pow(BigDecimal base, int exp) {
        BigDecimal result = BigDecimal.ONE;

        if (exp >= 0) {
            // Exponent positive → multiply base exp times
            for (int i = 0; i < exp; i++) {
                result = result.multiply(base);
            }
        } else {
            // Exponent negative → 1 / (base^|exp|)
            BigDecimal positive = Pow(base, -exp);
            result = BigDecimal.ONE.divide(positive, SCALE, RoundingMode.HALF_UP);
        }

        return result;
    }

    /**
     * Computes the square root of a value using Newton's method.
     *
     * @param value the number to compute the square root of
     * @return square root of value
     * @throws ArithmeticException if value is negative
     */
    public static BigDecimal Sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Negative value");
        }

        // Initial approximation: x = value
        BigDecimal x = value;
        BigDecimal two = new BigDecimal("2");

        // Iterative refinement (50 iterations for precision)
        for (int i = 0; i < 50; i++) {
            x = x.add(value.divide(x, SCALE, RoundingMode.HALF_UP))
                 .divide(two, SCALE, RoundingMode.HALF_UP);
        }

        return x;
    }

    /**
     * Returns the absolute value of a BigDecimal.
     *
     * @param value the input number
     * @return absolute value of input
     */
    public static BigDecimal Abs(BigDecimal value) {
        // If negative, negate; otherwise return as is
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            return value.negate();
        } else {
            return value;
        }
    }

    /**
     * Returns the minimum of two BigDecimal values.
     *
     * @param a first value
     * @param b second value
     * @return smaller of a and b
     */
    public static BigDecimal Min(BigDecimal a, BigDecimal b) {
        // Compare and return the smaller value
        if (a.compareTo(b) < 0) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Returns the maximum of two BigDecimal values.
     *
     * @param a first value
     * @param b second value
     * @return larger of a and b
     */
    public static BigDecimal Max(BigDecimal a, BigDecimal b) {
        // Compare and return the larger value
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Rounds a BigDecimal to the nearest integer using HALF_UP mode.
     *
     * @param value the input number
     * @return rounded integer value
     */
    public static BigDecimal Round(BigDecimal value) {
        // Round to 0 decimal places with HALF_UP strategy
        return value.setScale(0, RoundingMode.HALF_UP);
    }
}