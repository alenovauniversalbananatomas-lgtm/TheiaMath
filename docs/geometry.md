# Geometry

The `Geometry` class provides common geometric formulas with high precision using `BigDecimal`.

All calculations use the precision defined by `Precision.java`.

---

## Overview

Supported operations:

| Method | Description |
| ------ | ----------- |
| `circleArea()` | Area of a circle |
| `circleCircumference()` | Circumference of a circle |
| `rectangleArea()` | Area of a rectangle |
| `rectanglePerimeter()` | Perimeter of a rectangle |
| `triangleArea()` | Area of a triangle |
| `cubeVolume()` | Volume of a cube |
| `sphereVolume()` | Volume of a sphere |
| "cylinderVolume()` | Volume of a cylinder |

---

## Circle Area

Calculates the area of a circle.

Formula:

```text
A = πr²
```

Example:

```java
Geometry.circleArea(5);
```

Result:

```text
78.53981633974483096157
```

---

## Circle Circumference

Calculates the circumference of a circle.

Formula:

```text
C = 2πr
```

Example:

```java
Geometry.circleCircumference(5);
```

Result:

```text
31.41592653589793238460
```

---

## Rectangle Area

Calculates the area of a rectangle.

Formula:

```text
A = length × width
```

Example:

```java
Geometry.rectangleArea(8, 4);
```

Result:

```text
32
```

---

## Rectangle Perimeter

Calculates the perimeter of a rectangle.

Formula:

```text
P = 2(length + width)
```

Example:

```java
Geometry.rectanglePerimeter(8, 4);
```

Result:

```text
24
```

---

## Triangle Area

Calculates the area of a triangle.

Formula:

```text
A = (base × height) / 2
```

Example:

```java
Geometry.triangleArea(10, 6);
```

Result:

```text
30
```

---

## Cube Volume

Calculates the volume of a cube.

Formula:

```text
V = side³
```

Example:

```java
Geometry.cubeVolume(4);
```

Result:

```text
64
```

---

## Sphere Volume

Calculates the volume of a sphere.

Formula:

```text
V = (4/3)πr³
```

Example:

```java
Geometry.sphereVolume(3);
```

Result:

```text 
113.09733552923255247113
```

---

## Cylinder Volume

Calculates the volume of a cylinder.

Formula:

```text
V = πr²h
```

Example:

```java
Geometry.cylinderVolume(3, 10);
```

Result:

```text
282.74333882308138092892
```

---

## Common Use Cases

### Room Area

```java
Geometry.rectangleArea(5, 4);
```

Result:

```text
20
```

### Circular Garden

```java
Geometry.circleArea(7);
```

Used to estimate land coverage.

### Water Tank Volume

```java
Geometry.cylinderVolume(2, 5);
```

Used to estimate tank capacity.

---

## Notes

- Geometry methods are static.
- Calculations use `BigDecimal`.
- Precision is controlled by `Precision.java`.
- Invalid dimensions may throw a `MathException`.

Example:

```java
BigDecimal area = Geometry.circleArea(10);
```

No object creation is required.