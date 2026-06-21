package theia.math.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Precision class manages global precision and rounding
 * settings for the TheiaMath library.
 *
 * <p>Provides methods to configure scale and rounding mode,
 * apply precision to values, normalize results, validate inputs,
 * and safely convert values.</p>
 *
 * <p>This class is internal and should be used by other
 * components of TheiaMath to ensure consistent precision.</p>
 */
public class Precision {

    // =========================
    // GLOBAL CONFIGURATION
    // =========================

    /** Default scale (number of decimal places). */
    private static int SCALE = 20;

    /** Default rounding mode (HALF_UP). */
    private static RoundingMode ROUNDING = RoundingMode.HALF_UP;

    // =========================
    // CONFIGURATION METHODS
    // =========================

    /**
     * Sets the global scale (decimal places).
     *
     * @param scale positive integer scale
     * @throws IllegalArgumentException if scale <= 0
     */
    public static void setScale(int scale) {
        if (scale <= 0) {
            throw new IllegalArgumentException("Scale must be positive");
        }
        SCALE = scale;
    }

    /**
     * Returns the current global scale.
     *
     * @return scale value
     */
    public static int getScale() {
        return SCALE;
    }

    /**
     * Sets the global rounding mode.
     *
     * @param mode rounding mode (cannot be null)
     * @throws IllegalArgumentException if mode is null
     */
    public static void setRoundingMode(RoundingMode mode) {
        if (mode == null) {
            throw new IllegalArgumentException("Rounding mode cannot be null");
        }
        ROUNDING = mode;
    }

    /**
     * Returns the current global rounding mode.
     *
     * @return rounding mode
     */
    public static RoundingMode getRoundingMode() {
        return ROUNDING;
    }

    // =========================
    // APPLY PRECISION
    // =========================

    /**
     * Applies global precision to a value.
     *
     * @param value input BigDecimal
     * @return value scaled with global settings
     * @throws IllegalArgumentException if value is null
     */
    public static BigDecimal apply(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return value.setScale(SCALE, ROUNDING);
    }

    /**
     * Applies custom scale with global rounding mode.
     *
     * @param value input BigDecimal
     * @param scale custom scale
     * @return value scaled with custom scale
     * @throws IllegalArgumentException if value is null
     */
    public static BigDecimal apply(BigDecimal value, int scale) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return value.setScale(scale, ROUNDING);
    }

    // =========================
    // NORMALIZATION
    // =========================

    /**
     * Normalizes a value by stripping trailing zeros.
     *
     * @param value input BigDecimal
     * @return normalized value
     * @throws IllegalArgumentException if value is null
     */
    public static BigDecimal normalize(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return value.stripTrailingZeros();
    }

    // =========================
    // VALIDATION
    // =========================

    /**
     * Ensures a value is positive (> 0).
     *
     * @param value input BigDecimal
     * @throws IllegalArgumentException if value is null or <= 0
     */
    public static void requirePositive(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
    }

    /**
     * Ensures a value is non-zero.
     *
     * @param value input BigDecimal
     * @throws IllegalArgumentException if value is null or == 0
     */
    public static void requireNonZero(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
    }

    // =========================
    // SAFE CONVERSION
    // =========================

    /**
     * Safely converts a value, returning zero if null.
     *
     * @param value input BigDecimal
     * @return value scaled, or zero if null
     */
    public static BigDecimal safe(BigDecimal value) {
        if (value == null) {
            return BigDecimal.ZERO;
        }
        return apply(value);
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private Precision() {
        // Prevent instantiation of utility class
    }
}