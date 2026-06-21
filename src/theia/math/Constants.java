package theia.math;

import java.math.BigDecimal;

/**
 * The Constants class defines global mathematical constants
 * for use within the TheiaMath library.
 *
 * <p>Includes irrational numbers (π, e, φ), rational values,
 * common fractions, and conversion factors between degrees
 * and radians.</p>
 *
 * <p>All constants are represented using BigDecimal with
 * 20 decimal places of precision.</p>
 */
public class Constants {

    // =========================
    // GLOBAL PRECISION
    // =========================

    /** Default global scale (20 decimal places). */
    public static final int SCALE = 20;

    // =========================
    // IRRATIONAL CONSTANTS
    // =========================

    /** π (Pi) constant. */
    public static final BigDecimal PI = new BigDecimal("3.14159265358979323846");

    /** e (Euler's number). */
    public static final BigDecimal E = new BigDecimal("2.71828182845904523536");

    /** φ (Golden ratio). */
    public static final BigDecimal PHI = new BigDecimal("1.61803398874989484820");

    /** Square root of 2. */
    public static final BigDecimal SQRT2 = new BigDecimal("1.41421356237309504880");

    /** Square root of 3. */
    public static final BigDecimal SQRT3 = new BigDecimal("1.73205080756887729352");

    // =========================
    // RATIONAL CONSTANTS
    // =========================

    /** Constant 1. */
    public static final BigDecimal ONE = BigDecimal.ONE;

    /** Constant 2. */
    public static final BigDecimal TWO = new BigDecimal("2");

    /** Constant 3. */
    public static final BigDecimal THREE = new BigDecimal("3");

    /** Constant 4. */
    public static final BigDecimal FOUR = new BigDecimal("4");

    /** Constant 5. */
    public static final BigDecimal FIVE = new BigDecimal("5");

    /** Constant 10. */
    public static final BigDecimal TEN = new BigDecimal("10");

    /** Constant 100. */
    public static final BigDecimal HUNDRED = new BigDecimal("100");

    // =========================
    // FRACTIONS
    // =========================

    /** 1/2 (0.5). */
    public static final BigDecimal HALF = new BigDecimal("0.5");

    /** 1/3 (approximate). */
    public static final BigDecimal THIRD = new BigDecimal("0.33333333333333333333");

    /** 1/4 (0.25). */
    public static final BigDecimal QUARTER = new BigDecimal("0.25");

    /** 2/3 (approximate). */
    public static final BigDecimal TWO_THIRDS = new BigDecimal("0.66666666666666666667");

    // =========================
    // CONVERSION CONSTANTS
    // =========================

    /** Degrees to radians conversion factor. */
    public static final BigDecimal DEG_TO_RAD = new BigDecimal("0.01745329251994329577");

    /** Radians to degrees conversion factor. */
    public static final BigDecimal RAD_TO_DEG = new BigDecimal("57.29577951308232087679");

    // =========================
    // INTERNAL UTILITY
    // =========================

    /**
     * Private constructor to prevent instantiation.
     */
    private Constants() {
        // Prevent instantiation of utility class
    }
}