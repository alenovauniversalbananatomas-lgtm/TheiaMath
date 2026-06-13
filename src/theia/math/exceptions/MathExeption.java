package theia.math.exceptions;

public class MathException extends RuntimeException {

    // Mensaje básico
    public MathException(String message) {
        super(message);
    }

    // Mensaje + causa
    public MathException(String message, Throwable cause) {
        super(message, cause);
    }

    // Error genérico de matemáticas
    public static MathException GeneralError(String operation) {
        return new MathException("Math error in operation: " + operation);
    }

    // División por cero
    public static MathException DivisionByZero() {
        return new MathException("Division by zero is not allowed");
    }

    // Entrada inválida (negativos, dominio inválido, etc.)
    public static MathException InvalidInput(String detail) {
        return new MathException("Invalid input: " + detail);
    }

    // Overflow conceptual (cuando una operación excede límites lógicos)
    public static MathException Overflow() {
        return new MathException("Math overflow detected");
    }

    // Dominio inválido (ej: ln(-1), sqrt(-x))
    public static MathException DomainError(String function) {
        return new MathException("Domain error in function: " + function);
    }
}