package theia.math;

import java.math.BigDecimal;

public class Constants {

    // =========================
    // PRECISIÓN GLOBAL
    // =========================
    public static final int SCALE = 20;

    // =========================
    // CONSTANTES IRRACIONALES
    // =========================

    // PI
    public static final BigDecimal PI = new BigDecimal(
            "3.14159265358979323846"
    );

    // E (Euler)
    public static final BigDecimal E = new BigDecimal(
            "2.71828182845904523536"
    );

    // PHI (número áureo)
    public static final BigDecimal PHI = new BigDecimal(
            "1.61803398874989484820"
    );

    // RAÍZ DE 2
    public static final BigDecimal SQRT2 = new BigDecimal(
            "1.41421356237309504880"
    );

    // RAÍZ DE 3
    public static final BigDecimal SQRT3 = new BigDecimal(
            "1.73205080756887729352"
    );

    // =========================
    // CONSTANTES RACIONALES
    // =========================

    public static final BigDecimal ONE = BigDecimal.ONE;
    public static final BigDecimal TWO = new BigDecimal("2");
    public static final BigDecimal THREE = new BigDecimal("3");
    public static final BigDecimal FOUR = new BigDecimal("4");
    public static final BigDecimal FIVE = new BigDecimal("5");

    public static final BigDecimal TEN = new BigDecimal("10");
    public static final BigDecimal HUNDRED = new BigDecimal("100");

    // FRACCIONES IMPORTANTES

    public static final BigDecimal HALF = new BigDecimal("0.5");
    public static final BigDecimal THIRD = new BigDecimal("0.33333333333333333333");
    public static final BigDecimal QUARTER = new BigDecimal("0.25");
    public static final BigDecimal TWO_THIRDS = new BigDecimal("0.66666666666666666667");

    // =========================
    // CONSTANTES DE CONVERSIÓN
    // =========================

    public static final BigDecimal DEG_TO_RAD = new BigDecimal(
            "0.01745329251994329577"
    );

    public static final BigDecimal RAD_TO_DEG = new BigDecimal(
            "57.29577951308232087679"
    );

    // =========================
    // UTILIDAD INTERNA
    // =========================

    private Constants() {
        // Evita instanciación
    }
}