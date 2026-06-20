# Arithmetic

The `Arithmetic` class provides basic mathematical operations for both decimal and integer values.

## Overview

Supported operations:

| Method | Description |
|---------|-------------|
| add() | Addition |
| sub() | Subtraction |
| mul() | Multiplication |
| div() | Division |
| Idiv() | Integer division |
| mod() | Remainder |
| Imod() | Integer remainder |

## Addition 

Adds two numbers.

```java 
Arithmetic.add(10, 5);
```

Result:

```text
15
```

## Subtraction 

Subtracts the second value from the first.

```java
Arithmetic.sub(10, 5); 
```

Result:

```text
5
```

## Multiplication 

Multiplies two numbers.

```java 
Arithmetic.mul(10, 5);
```

Result:

```text
50
```

## Division

Performs decimal division.

```java
Arithmetic.div(10, 3);
```

Result:

```text
3.33333333333333333333
```

If the divisor is zero, a `MathException` is thrown.

## Integer Division

Returns only the integer part of a division.

```java
Arithmetic.Idiv(10, 3);
```

Result:

```text
3
```

Example:

```java 
Arithmetic.Idiv(25, 4);
```

Result:

```text
6
```

## Remainder 

Returns the remainder of a division.

```java
Arithmetic.mod(10, 3);
```

Result:

```text
1
```

## Integer Remainder

Returns the integer remainder of a division.

```java
Arithmetic.Imod(25, 4);
```

Result:

```text 
1
```

## Common Use Cases

### Percentages

```java
double percentage = Arithmetic.mul(50, 0.15);
```

Result:

```text 
7.5
```

### Splitting Objects

```java
Arithmetic.Idiv(25, 4);
```

Result:

```text
6
```

### Determining Leftovers

```java
Arithmetic.Imod(25, 4);
```

Result:

```text
1
```

## Notes 

- Methods beginning with `I` operate on integers.
- Division by zero throws a `MathException`.
- Arithmetic methods are static and do not require object instantiation.

Example:

```java
double result = Arithmetic.add(5, 3);
```

No `new Arithmetic()` is required.