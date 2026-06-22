package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * ⚠ EXPERIMENTAL
 *
 * This implementation belongs to the arithmetic-experimental branch.
 *
 * BigDecimal support is currently under development and evaluation.
 * Method signatures, behavior, precision rules, and internal
 * implementation may change without notice.
 *
 * Stability and backward compatibility are not guaranteed.
 *
 * Do not rely on this API for production use.
 *
 * The Arithmetic class provides basic mathematical operations
 * using BigDecimal for high-precision calculations.
 *
 * <p>Includes addition, subtraction, multiplication, division,
 * and modulo operations. Integer-specific methods are prefixed
 * with 'I'.</p>
 *
 * <p>Division by zero throws an ArithmeticException.</p>
 */
public class Arithmetic {

    /**
     * Internal scale used for division operations.
     */
    private static final int SCALE = 20;

    /**
     * Adds two BigDecimal values.
     *
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    public static BigDecimal Add(BigDecimal a, BigDecimal b) {
        // Simple addition using BigDecimal
        return a.add(b);
    }

    /**
     * Subtracts one BigDecimal value from another.
     *
     * @param a first operand
     * @param b second operand
     * @return the result of a - b
     */
    public static BigDecimal Sub(BigDecimal a, BigDecimal b) {
        // Subtraction: difference between a and b
        return a.subtract(b);
    }

    /**
     * Multiplies two BigDecimal values.
     *
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    public static BigDecimal Mul(BigDecimal a, BigDecimal b) {
        // Multiplication: product of a and b
        return a.multiply(b);
    }

    /**
     * Divides one BigDecimal value by another.
     *
     * @param a numerator
     * @param b denominator
     * @return the result of a / b
     * @throws ArithmeticException if b is zero
     */
    public static BigDecimal Div(BigDecimal a, BigDecimal b) {
        // Check for division by zero
        if (b.compareTo(BigDecimal.ZERO) != 0) {
            return a.divide(b, SCALE, RoundingMode.HALF_UP);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Performs integer division of two BigDecimal values.
     *
     * @param a numerator
     * @param b denominator
     * @return integer result of a / b
     * @throws ArithmeticException if b is zero
     */
    public static long Idiv(BigDecimal a, BigDecimal b) {
        // Integer division using BigDecimal
        if (b.compareTo(BigDecimal.ZERO) != 0) {
            return a.divideToIntegralValue(b).longValue();
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Computes the modulo of two BigDecimal values.
     *
     * @param a dividend
     * @param b divisor
     * @return the remainder of a % b
     * @throws ArithmeticException if b is zero
     */
    public static BigDecimal Mod(BigDecimal a, BigDecimal b) {
        // Modulo operation with high precision
        if (b.compareTo(BigDecimal.ZERO) != 0) {
            return a.remainder(b);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Computes the integer modulo of two BigDecimal values.
     *
     * @param a dividend
     * @param b divisor
     * @return integer remainder of a % b
     * @throws ArithmeticException if b is zero
     */
    public static long Imod(BigDecimal a, BigDecimal b) {
        // Convert remainder to integer
        if (b.compareTo(BigDecimal.ZERO) != 0) {
            return a.remainder(b).longValue();
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}