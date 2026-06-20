# Constants

The `Constants` class provides mathematical constants with a precision of 20 decimal places.

These constants can be used in scientific, engineering, educational, and geometric calculations.

---

## Overview

| Constant | Description |
| -------- | ----------- |
| `PI` | Ratio of a circle's circumference to its diameter |
| `E` | Euler's number |
| `PHI` | Golden ratio |
| `SQRT2` | Square root of 2 | 
| `SQRT3` | Square root of 3 |
| `LN2` | Natural logarithm of 2 |
| `LN10`| Natural logarithm of 10 |

---

## PI

Archimedes' constant.

Value:

```text
3.14159265358979323846
```

Example:

```java
System.out.println(Constants.PI);
```

Applications:

- Circle area
- Circle circumference
- Trigonometry
- Physics

LaTeX:

```latex
\pi
``` 

---

## E

Euler's number.

Value:

```text
2.71828182845904523536
```

Example:

```java
System.out.println(Constants.E);
```

Applications:

- Exponential functions
- Natural logarithms
- Growth and decay models

LaTeX:

```latex
e
```

---

## PHI

Golden ratio.

Value:

```text
1.61803398874989484820
```

Example:

```java
System.out.println(Constants.PHI);
```

Applications:

- Geometry
- Architecture
- Art
- Number theory

LaTeX:

```latex
\varphi
```

---

## SQRT2

Square root of 2.

Value:

```text
1.41421356237309504880
```

Example:

```java
System.out.println(Constants.SQRT2);
```

Applications:

- Geometry
- Right triangles
- Diagonal calculations

LaTeX:

```latex
\sqrt{2}
```

---

## SQRT3

Square root of 3.

Value:

```text
1.73205080756887729353
```

Example:

```text
System.out.println(Constants.SQRT3);
```

Applications:

- Equilateral triangles
- Hexagonal geometry

LaTeX:

```latex
\sqrt{3}
```

---

## LN2

Natural logarithm of 2.

Value:

```text
0.69314718055994530942
```

Example:

```java
System.out.println(Constants.LN2);
```

LaTeX:

```latex
\ln(2)
```

---

## LN10

Natural logarithm of 10.

Value:

```text
2.30258509299404568402
```

Example:

```java
System.out.println(Constants.LN10);
```

LaTeX:

```latex
\ln(10)
```

---

## Example

```java
import theia.math.Constants;

public class Main {

    public static void main(String[] args) {

        System.out.println(Constants.PI);
        System.out.println(Constants.E);
        System.out.println(Constants.PHI);

    }

}
```

Output:

```text
3.14159265358979323846
2.71828182845904523536
1.61803398874989484820
```

---

## Notes

- All constants use 20 decimal places.
- Constants are immutable.
- No object creation is required.

Example:

```java
BigDecimal radius = Constants.PI;
```

The values can be used directly in calculations throughout TheiaMath.