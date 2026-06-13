package theia.math;

public class Arithmetic {

    public static double Add(double a, double b) {
        return a + b;
    }

    public static double Sub(double a, double b) {
        return a - b;
    }

    public static double Mul(double a, double b) {
        return a * b;
    }

    public static double Div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public static int Idiv(double a, double b) {
        if (b != 0) {
            return (int) (a / b);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public static double Mod(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public static int Imod(double a, double b) {
        if (b != 0) {
            return (int) (a % b);
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}