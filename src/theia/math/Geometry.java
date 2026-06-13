package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Geometry {

    private static final int SCALE = 20;

    private static final BigDecimal PI = new BigDecimal(
            "3.14159265358979323846"
    );

    // ÁREA DE CUADRADO
    public static BigDecimal SquareArea(BigDecimal side) {
        return side.multiply(side);
    }

    // ÁREA DE RECTÁNGULO
    public static BigDecimal RectangleArea(BigDecimal width, BigDecimal height) {
        return width.multiply(height);
    }

    // ÁREA DE CÍRCULO
    public static BigDecimal CircleArea(BigDecimal radius) {
        return PI.multiply(radius).multiply(radius)
                .setScale(SCALE, RoundingMode.HALF_UP);
    }

    // PERÍMETRO DE CÍRCULO
    public static BigDecimal CirclePerimeter(BigDecimal radius) {
        return PI.multiply(radius).multiply(new BigDecimal("2"))
                .setScale(SCALE, RoundingMode.HALF_UP);
    }

    // DISTANCIA ENTRE DOS PUNTOS (2D)
    public static BigDecimal Distance(
            BigDecimal x1, BigDecimal y1,
            BigDecimal x2, BigDecimal y2
    ) {
        BigDecimal dx = x2.subtract(x1);
        BigDecimal dy = y2.subtract(y1);

        BigDecimal dx2 = dx.multiply(dx);
        BigDecimal dy2 = dy.multiply(dy);

        BigDecimal sum = dx2.add(dy2);

        return sqrt(sum);
    }

    // RAÍZ CUADRADA (Newton interno)
    private static BigDecimal sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Negative value");
        }

        BigDecimal x = value;
        BigDecimal two = new BigDecimal("2");

        for (int i = 0; i < 50; i++) {
            x = x.add(value.divide(x, SCALE, RoundingMode.HALF_UP))
                 .divide(two, SCALE, RoundingMode.HALF_UP);
        }

        return x.setScale(SCALE, RoundingMode.HALF_UP);
    }
}