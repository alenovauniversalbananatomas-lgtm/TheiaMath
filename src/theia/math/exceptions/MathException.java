package theia.math.exceptions;

/**
 * MathException is a custom runtime exception class
 * for handling mathematical errors in the TheiaMath library.
 *
 * <p>Provides constructors for basic messages and causes,
 * as well as static factory methods for common error types
 * (division by zero, invalid input, overflow, domain errors).</p>
 */
public class MathException extends RuntimeException {

    /**
     * Creates a new MathException with a message.
     *
     * @param message description of the error
     */
    public MathException(String message) {
        super(message);
    }

    /**
     * Creates a new MathException with a message and a cause.
     *
     * @param message description of the error
     * @param cause underlying exception
     */
    public MathException(String message, Throwable cause) {
        super(message, cause);
    }

    // =========================
    // FACTORY METHODS
    // =========================

    /**
     * General math error for unspecified operations.
     *
     * @param operation name of the operation
     * @return MathException instance
     */
    public static MathException GeneralError(String operation) {
        return new MathException("Math error in operation: " + operation);
    }

    /**
     * Division by zero error.
     *
     * @return MathException instance
     */
    public static MathException DivisionByZero() {
        return new MathException("Division by zero is not allowed");
    }

    /**
     * Invalid input error (negative values, domain violations, etc.).
     *
     * @param detail description of invalid input
     * @return MathException instance
     */
    public static MathException InvalidInput(String detail) {
        return new MathException("Invalid input: " + detail);
    }

    /**
     * Overflow error when a calculation exceeds logical limits.
     *
     * @return MathException instance
     */
    public static MathException Overflow() {
        return new MathException("Math overflow detected");
    }

    /**
     * Domain error (e.g., ln(-1), sqrt of negative).
     *
     * @param function name of the function
     * @return MathException instance
     */
    public static MathException DomainError(String function) {
        return new MathException("Domain error in function: " + function);
    }
}
