package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Advanced class provides transcendental and advanced
 * mathematical operations using BigDecimal for high precision.
 *
 * <p>Includes exponential, natural logarithm, real power,
 * trigonometric functions (sin, cos), absolute value,
 * and factorial.</p>
 *
 * <p>All results are scaled to 20 decimal places by default.</p>
 */
public class Advanced {

    // Default scale for precision (20 decimal places)
    private static final int SCALE = Constants.SCALE;

    /**
     * Approximates the exponential function e^x using a Taylor series.
     *
     * @param x exponent value
     * @return e^x approximation
     */
    public static BigDecimal Exp(BigDecimal x) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        // Series expansion: sum of x^n / n!
        for (int i = 1; i < 50; i++) {
            term = term.multiply(x)
                       .divide(new BigDecimal(i), SCALE, RoundingMode.HALF_UP);
            result = result.add(term);
        }

        return result.setScale(SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Approximates the natural logarithm (ln) using Newton's method.
     *
     * @param x input value (must be > 0)
     * @return ln(x) approximation
     * @throws ArithmeticException if x <= 0
     */
    public static BigDecimal Ln(BigDecimal x) {
        if (x.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ArithmeticException("Invalid input");
        }

        // Initial guess
        BigDecimal guess = x;
        BigDecimal eToGuess;

        for (int i = 0; i < 40; i++) {
            eToGuess = Exp(guess);
            // Newton iteration: g = g - (e^g - x)/e^g
            guess = guess.subtract(
                    eToGuess.subtract(x)
                            .divide(eToGuess, SCALE, RoundingMode.HALF_UP)
            );
        }

        return guess.setScale(SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Computes a real power x^y using the identity x^y = e^(y * ln(x)).
     *
     * @param base positive base
     * @param exp real exponent
     * @return base^exp
     * @throws ArithmeticException if base <= 0
     */
    public static BigDecimal Pow(BigDecimal base, BigDecimal exp) {
        if (base.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ArithmeticException("Base must be positive");
        }

        // x^y = e^(y * ln(x))
        BigDecimal ln = Ln(base);
        BigDecimal product = exp.multiply(ln);

        return Exp(product);
    }

    /**
     * Approximates the sine function using a Taylor series.
     *
     * @param x angle in radians
     * @return sin(x) approximation
     */
    public static BigDecimal Sin(BigDecimal x) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal term = x;

        int sign = 1;

        // Series expansion: alternating odd powers
        for (int i = 1; i < 20; i += 2) {
            if (sign == 1) {
                result = result.add(term);
            } else {
                result = result.subtract(term);
            }

            // Next term: multiply by x^2 / ((i+1)(i+2))
            term = term.multiply(x)
                       .multiply(x)
                       .divide(new BigDecimal(i + 1)
                       .multiply(new BigDecimal(i + 2)), SCALE, RoundingMode.HALF_UP);

            sign *= -1;
        }

        return result.setScale(SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Approximates the cosine function using the identity cos(x) = sin(x + π/2).
     *
     * @param x angle in radians
     * @return cos(x) approximation
     */
    public static BigDecimal Cos(BigDecimal x) {
        // cos(x) = sin(x + π/2)
        return Sin(x.add(Constants.PI.divide(Constants.TWO, SCALE, RoundingMode.HALF_UP)));
    }

    /**
     * Returns the absolute value of a BigDecimal.
     *
     * @param x input value
     * @return absolute value of x
     */
    public static BigDecimal Abs(BigDecimal x) {
        if (x.compareTo(BigDecimal.ZERO) < 0) {
            return x.negate();
        } else {
            return x;
        }
    }

    /**
     * Computes the factorial of an integer n.
     *
     * @param n non-negative integer
     * @return n! as BigDecimal
     * @throws ArithmeticException if n < 0
     */
    public static BigDecimal Fact(int n) {
        if (n < 0) {
            throw new ArithmeticException("Negative factorial");
        }

        BigDecimal result = BigDecimal.ONE;

        // Iterative multiplication from 2 to n
        for (int i = 2; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }

        return result;
    }
}