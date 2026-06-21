package theia.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Geometry class provides geometric calculations
 * with high precision using BigDecimal.
 *
 * <p>Includes area and perimeter formulas for common shapes,
 * as well as distance calculation in 2D space.</p>
 *
 * <p>All results are scaled to 20 decimal places by default.</p>
 */
public class Geometry {

    // Default scale for precision (20 decimal places)
    private static final int SCALE = Constants.SCALE;

    /**
     * Computes the area of a square.
     *
     * @param side length of the square's side
     * @return area of the square
     */
    public static BigDecimal SquareArea(BigDecimal side) {
        // Area = side^2
        return side.multiply(side);
    }

    /**
     * Computes the area of a rectangle.
     *
     * @param width rectangle width
     * @param height rectangle height
     * @return area of the rectangle
     */
    public static BigDecimal RectangleArea(BigDecimal width, BigDecimal height) {
        // Area = width * height
        return width.multiply(height);
    }

    /**
     * Computes the area of a circle.
     *
     * @param radius circle radius
     * @return area of the circle
     */
    public static BigDecimal CircleArea(BigDecimal radius) {
        // Area = π * r^2
        return Constants.PI.multiply(radius).multiply(radius)
                .setScale(SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Computes the perimeter (circumference) of a circle.
     *
     * @param radius circle radius
     * @return perimeter of the circle
     */
    public static BigDecimal CirclePerimeter(BigDecimal radius) {
        // Perimeter = 2 * π * r
        return Constants.PI.multiply(radius).multiply(Constants.TWO)
                .setScale(SCALE, RoundingMode.HALF_UP);
    }

    /**
     * Computes the Euclidean distance between two points in 2D space.
     *
     * @param x1 x-coordinate of first point
     * @param y1 y-coordinate of first point
     * @param x2 x-coordinate of second point
     * @param y2 y-coordinate of second point
     * @return distance between (x1, y1) and (x2, y2)
     */
    public static BigDecimal Distance(
            BigDecimal x1, BigDecimal y1,
            BigDecimal x2, BigDecimal y2
    ) {
        // dx = x2 - x1, dy = y2 - y1
        BigDecimal dx = x2.subtract(x1);
        BigDecimal dy = y2.subtract(y1);

        // sum = dx^2 + dy^2
        BigDecimal sum = dx.multiply(dx).add(dy.multiply(dy));

        // sqrt(sum) → Euclidean distance
        return sqrt(sum);
    }

    /**
     * Internal square root implementation using Newton's method.
     *
     * @param value input value
     * @return square root of value
     * @throws ArithmeticException if value is negative
     */
    private static BigDecimal sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new ArithmeticException("Negative value");
        }

        // Initial approximation
        BigDecimal x = value;
        BigDecimal two = Constants.TWO;

        // Iterative refinement (50 iterations)
        for (int i = 0; i < 50; i++) {
            x = x.add(value.divide(x, SCALE, RoundingMode.HALF_UP))
                 .divide(two, SCALE, RoundingMode.HALF_UP);
        }

        return x.setScale(SCALE, RoundingMode.HALF_UP);
    }
}