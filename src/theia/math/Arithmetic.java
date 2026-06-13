package theia.math;

public class Arithmetic {

    // SUMA
    public static double Add(double a, double b) {
        return a + b;
    }

    // RESTA
    public static double Sub(double a, double b) {
        return a - b;
    }

    // MULTIPLICACIÓN
    public static double Mul(double a, double b) {
        return a * b;
    }

    // DIVISIÓN
    public static double Div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    // DIVISIÓN ENTERA
    public static int Idiv(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (int) (a / b);
    }

    // RESTO
    public static double Mod(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a % b;
    }

    // RESTO ENTERO
    public static int Imod(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (int) (a % b);
    }
}