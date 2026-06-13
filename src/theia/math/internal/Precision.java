package theia.math.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Precision {

    // =========================
    // CONFIG GLOBAL
    // =========================

    private static int SCALE = 20;

    private static RoundingMode ROUNDING = RoundingMode.HALF_UP;

    // =========================
    // CONFIGURACIÓN
    // =========================

    public static void setScale(int scale) {
        if (scale <= 0) {
            throw new IllegalArgumentException("Scale must be positive");
        }
        SCALE = scale;
    }

    public static int getScale() {
        return SCALE;
    }

    public static void setRoundingMode(RoundingMode mode) {
        if (mode == null) {
            throw new IllegalArgumentException("Rounding mode cannot be null");
        }
        ROUNDING = mode;
    }

    public static RoundingMode getRoundingMode() {
        return ROUNDING;
    }

    // =========================
    // APLICAR PRECISIÓN
    // =========================

    public static BigDecimal apply(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        return value.setScale(SCALE, ROUNDING);
    }

    public static BigDecimal apply(BigDecimal value, int scale) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        return value.setScale(scale, ROUNDING);
    }

    // =========================
    // NORMALIZACIÓN
    // =========================

    public static BigDecimal normalize(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        return value.stripTrailingZeros();
    }

    // =========================
    // VALIDACIÓN
    // =========================

    public static void requirePositive(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
    }

    public static void requireNonZero(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
    }

    // =========================
    // CONVERSIÓN SEGURA
    // =========================

    public static BigDecimal safe(BigDecimal value) {
        if (value == null) {
            return BigDecimal.ZERO;
        }
        return apply(value);
    }

    private Precision() {
        // Evita instanciación
    }
}