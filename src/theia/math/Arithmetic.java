package theia.math;

/**
 * The Arithmetic class provides basic mathematical operations
 * with support for both double precision and integer results.
 *
 * <p>Includes addition, subtraction, multiplication, division,
 * and modulo operations. Integer-specific methods are prefixed
 * with 'I'.</p>
 *
 * <p>Division by zero throws an ArithmeticException.</p>
 */
public class Arithmetic {

    /**
     * Adds two double values.
     *
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    public static double Add(double a, double b) {
        // Simple addition using primitive double
        return a + b;
    }

    /**
     * Subtracts one double value from another.
     *
     * @param a first operand
     * @param b second operand
     * @return the result of a - b
     */
    public static double Sub(double a, double b) {
        // Subtraction: difference between a and b
        return a - b;
    }

    /**
     * Multiplies two double values.
     *
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    public static double Mul(double a, double b) {
        // Multiplication: product of a and b
        return a * b;
    }

    /**
     * Divides one double value by another.
     *
     * @param a numerator
     * @param b denominator
     * @return the result of a / b
     * @throws ArithmeticException if b is zero
     */
    public static double Div(double a, double b) {
        // Check for division by zero
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Performs integer division of two double values.
     *
     * @param a numerator
     * @param b denominator
     * @return integer result of a / b
     * @throws ArithmeticException if b is zero
     */
    public static int Idiv(double a, double b) {
        // Cast result to int for integer division
        if (b != 0) {
            return (int) (a / b);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Computes the modulo of two double values.
     *
     * @param a dividend
     * @param b divisor
     * @return the remainder of a % b
     * @throws ArithmeticException if b is zero
     */
    public static double Mod(double a, double b) {
        // Modulo operation with double precision
        if (b != 0) {
            return a % b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Computes the integer modulo of two double values.
     *
     * @param a dividend
     * @param b divisor
     * @return integer remainder of a % b
     * @throws ArithmeticException if b is zero
     */
    public static int Imod(double a, double b) {
        // Cast remainder to int for integer modulo
        if (b != 0) {
            return (int) (a % b);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}