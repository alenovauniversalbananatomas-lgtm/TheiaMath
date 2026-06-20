# Changelog

All notable changes to TheiaMath will be documented in this file.

The format is inspired by Keep a Changelog and Semantic Versioning.

---

[1.0.0] - 2026-06-20

## Added

### Arithmetic

- Addition (`add`)
- Subtraction (`sub`)
- Multiplication (`mul`)
- Division (`div`)
- Integer division (`Idiv`)
- Remainder (`mod`)
- Integer remainder (`Imod`)

### Algebra

- High-precision algebraic operations using "BigDecimal"
- Shared precision system through "Precision.java"

### Geometry

- Circle area calculations
- Circle circumference calculations
- Rectangle area calculations
- Rectangle perimeter calculations
- Triangle area calculations
- Cube volume calculations
- Sphere volume calculations
- Cylinder volume calculations

### Constants

Added mathematical constants with 20 decimal places:

- PI
- E
- PHI
- SQRT2
- SQRT3
- LN2
- LN10

### Exceptions

- `MathException`

### Internal

- `Precision.java`
- Centralized precision management

### Documentation

Added:

- installation.md
- getting-started.md
- arithmetic.md
- algebra.md
- geometry.md
- constants.md
- examples.md
- precision.md
- changelog.md

---

## Future Plans

[1.1.0]

Planned features:

- Additional algebraic functions
- More geometric formulas
- Additional mathematical constants
- Improved documentation
- Performance optimizations

---

## Versioning

TheiaMath follows Semantic Versioning:

```text
MAJOR.MINOR.PATCH
```

Examples:

```text
1.0.0
1.1.0
1.1.1
2.0.0
```

Meaning:

- MAJOR: incompatible API changes
- MINOR: new functionality
- PATCH: bug fixes and improvements