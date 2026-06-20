# Precision

TheiaMath uses high-precision arithmetic to provide more accurate results than standard floating-point calculations.

Precision is managed by the `Precision` class and is used throughout the library wherever `BigDecimal` calculations are performed.

---

## Default Precision

The current precision is:

```text
20 decimal places
```

Example:

```text
3.14159265358979323846
```

This precision is used by:

- Algebra
- Geometry
- Constants

---

## Why Precision Matters

Standard floating-point types (`float` and `double`) cannot exactly represent many decimal values.

Example:

```java
double x = 1.0 / 3.0;

System.out.println(x);
```

Output:

```text
0.3333333333333333
```

TheiaMath uses `BigDecimal` where high precision is required.

Example:

```text
0.33333333333333333333
```

---

## Precision Class

The `Precision` class centralizes precision settings for the entire library.

Example:

```java
import theia.math.internal.Precision;
```

This ensures that all calculations use the same precision rules.

---

## Constants

Mathematical constants are stored with 20 decimal places.

Examples:

| Constant | Value |
| -------- | ----- |
| `PI` | 3.14159265358979323846 |
| `E` | 2.71828182845904523536 | 
| `PHI` | 1.61803398874989484820 | 
| `SQRT2` | 1.41421356237309504880 |

---

## High Precision Example

Calculating the square root of 2:

```java
System.out.println(
    Algebra.sqrt(2)
);
```

Output:

```text
1.41421356237309504880
```

---

## Geometry Example

Calculating the area of a circle with radius 5:

```java
System.out.println(
    Geometry.circleArea(5)
);
```

Output:

```text
78.53981633974483096157
```

---

## Performance Considerations

High precision calculations are generally slower than primitive arithmetic.

Example:

```java
double result = 10.0 / 3.0;
```

is typically faster than:

```java
BigDecimal result =
    new BigDecimal("10")
        .divide(
            new BigDecimal("3"),
            Precision.MATH_CONTEXT
        );
```

However, BigDecimal provides significantly greater accuracy.

---

## Design Goals

TheiaMath precision system is designed to provide:

- Consistent results
- Predictable rounding
- Scientific accuracy
- Geometric accuracy
- Educational clarity

---

## Notes

- Arithmetic methods may use primitive numeric types.
- Algebra uses BigDecimal precision.
- Geometry uses BigDecimal precision.
- Constants are stored with 20 decimal places.
- Precision settings are centralized in the Precision class.

This approach allows TheiaMath to balance simplicity, performance, and numerical accuracy.