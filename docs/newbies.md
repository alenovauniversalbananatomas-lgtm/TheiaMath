# TheiaMath – Newbies Guide

This guide is for beginners who are new to Java and want to explore **TheiaMath** step by step. It explains what the library does, how to set it up, and how to gradually learn its modules.

---

## 1. What is TheiaMath?
TheiaMath is a lightweight Java library for mathematics. It uses `BigDecimal` to ensure **20 decimal places of precision** and includes modules for [arithmetic](docs/arithmetic.md), [algebra](docs/algebra.md), [geometry](docs/geometry.md), and [advanced functions](docs/advanced.md).  

It also provides a **precision engine** and a **custom exception system** to handle errors consistently.

---

## 2. Prerequisites
- Install **Java 8 or higher**.  
- Use an IDE such as IntelliJ IDEA, Eclipse, or VS Code.  
- Basic knowledge of compiling and running Java programs.  

---

## 3. Setup
1. Clone or download the TheiaMath repository.  
2. Place the `src/theia` folder inside your project’s `src` directory.  
3. Ensure your IDE recognizes the package structure:  
   - `theia.math`  
   - `theia.math.exceptions`  
   - `theia.math.internal`  

---

## 4. First Program
Create a file `Main.java`:

```java
import theia.math.Arithmetic;
import theia.math.Algebra;
import theia.math.Geometry;
import theia.math.Advanced;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Arithmetic
        System.out.println(Arithmetic.Add(2, 3)); // 5.0

        // Algebra
        System.out.println(Algebra.Sqrt(new BigDecimal("16"))); // 4

        // Geometry
        System.out.println(Geometry.CircleArea(new BigDecimal("2"))); // ~12.566...

        // Advanced
        System.out.println(Advanced.Sin(new BigDecimal("1.5708"))); // ~1.0
    }
}
```

Compile and run:

```bash 
javac Main.java
java Main
```
---

## 5. Modules Overview 

- **Arithmetic →** basic operations (add, subtract, multiply, divide, modulo).
- **Algebra →** powers, square roots, absolute values, min/max.
- **Geometry →** areas, perimeters, distances.
- **Advanced →** exponential, logarithm, real powers, trigonometry, factorial.
- **Precision →** global scale and rounding configuration.
- **MathException →** custom error handling.

---

## 6. Progressive Learning Path

If you are new to Java and math libraries, follow this path:

1. ### Start with Arithmetic

- Try `Add`, `Subtract`, `Multiply`, `Divide`. 
- Example: `Arithmetic.Divide(10, 3)` → 3.3333333333…

2. ### Move to Algebra

- Experiment with `Pow` and `Sqrt`.
- Example: `Algebra.Pow(new BigDecimal("2"), 10)` → 1024.

3. ### Explore Geometry

- Calculate areas and perimeters.
- Example: `Geometry.RectangleArea(new BigDecimal("5"), new BigDecimal("3"))` → 15.

4. ### Advanced Functions 

- Use `Exp`, `Ln`, `Sin`, `Cos`.
- Example: `Advanced.Ln(new BigDecimal("2.71828"))` → ~1.0.

5. ### Understand Precision

- Change scale with `Precision.setScale(10)` and see how results change.

---

## 7. Practice Exercises

- Compute the area of a circle with radius 5.
- Find the square root of 2 with 20 decimal places.
- Calculate `2^50` using `Algebra.Pow`.
- Evaluate `sin(π/2)` using `Advanced.Sin`.
- Try dividing 1 by 3 and see how precision affects the result.

## 8. Tips for Beginners

- Always use `BigDecimal` for inputs to ensure precision.
- Read the **JavaDoc** comments in each class: they explain parameters, return values, and exceptions.
- Don’t worry if advanced functions look complex — start small and build confidence.
- Use `MathException` to handle errors gracefully (e.g., division by zero, invalid inputs).

---

## 9. Next Steps

- Write unit tests with JUnit to validate your calculations.
- Explore how changing precision affects results.
- Contribute new functions to the library (e.g., tangent, logarithm base 10).