# Algebra

The `Algebra` class provides advanced mathematical operations with high precision using `BigDecimal`.

All calculations use the precision defined by `Precision.java`.

---

## Overview

Supported operations:

| Method | Description |
| ------ | ----------- |
| `pow()`| Power |
| `sqrt()`| Square root |
| `abs()`| Absolute value | 
| `factorial()`| Factorial | 
| `gcd()`| Greatest common divisor |
| `lcm()`| Least common multiple |

---

## Power

Raises a number to a given exponent.

```java
Algebra.pow(2, 10);
```

Result:

```text
1024
```

---

## Square Root

Returns the square root of a number.

```java
Algebra.sqrt(25);
```

Result:

```text 
5
```

Example:

```java
Algebra.sqrt(2);
```

Result:

```text
1.41421356237309504880
```

---

## Absolute Value

Returns the non-negative value of a number.

```java 
Algebra.abs(-15);
```

Result:

```text
15
```

---

## Factorial

Computes the factorial of a non-negative integer.

```java 
Algebra.factorial(5);
```

Result:

```text
120
```

Example:

```java
Algebra.factorial(10);
```

Result:

```text
3628800
```

---

## Greatest Common Divisor (GCD)

Returns the greatest common divisor of two integers.

```java
Algebra.gcd(48, 18);
```

Result:

```text
6
```

---

## Least Common Multiple (LCM)

Returns the least common multiple of two integers.

```java 
Algebra.lcm(12, 18);
```

Result:

```text
36
```

---

High Precision Calculations

TheiaMath uses `BigDecimal` internally for algebraic calculations.

Example:

```java
Algebra.sqrt(2);
```

Output:

```text
1.41421356237309504880
```

This allows calculations with significantly higher precision than standard floating-point arithmetic.

---

## Common Use Cases

### Scientific Calculations

```java
Algebra.pow(10, 6);
```

Result:

```text
1000000
```

### Geometric Calculations

```java
Algebra.sqrt(144);
```

Result:

```text
12
```

### Number Theory

```java
Algebra.gcd(120, 84);
```

Result:

```text
12
```

---

## Notes

- Algebra methods are static.
- High precision calculations use `BigDecimal`.
- Precision is controlled by the `Precision` class.
- Invalid operations throw a `MathException`.

Example:

```java
BigDecimal result = Algebra.sqrt(2);
```

No object creation is required.