
![logo](assets/file_00000000b304720e9032a9e47b275474.png)

# TheiaMath

**TheiaMath** is a lightweight Java mathematical library designed for **high‑precision calculations** (20 decimal places).  
It provides modular tools for [arithmetic](ca://s?q=Arithmetic_module_in_TheiaMath), [algebra](ca://s?q=Algebra_module_in_TheiaMath), [geometry](ca://s?q=Geometry_module_in_TheiaMath), and [advanced operations](ca://s?q=Advanced_module_in_TheiaMath), all built on `BigDecimal` with a unified precision system.

---

## Features
- **Arithmetic operations** → addition, subtraction, multiplication, division, modulo.  
- **Algebra utilities** → powers, square roots, absolute values, min/max, rounding.  
- **Geometry functions** → areas, perimeters, distances in 2D space.  
- **Advanced tools** → exponential, natural logarithm, real powers, trigonometric functions, factorial.  
- **Precision control** → centralized scale and rounding configuration (default: 20 decimals, `HALF_UP`).  
- **Custom exceptions** → unified error handling with `MathException`.  

---

## Project Structure
- `theia.math` → core operations (Arithmetic, Algebra, Geometry, Advanced).  
- `theia.math.exceptions` → custom exception system.  
- `theia.math.internal` → precision engine and internal utilities.  

---

## Precision System
All calculations rely on a global precision engine:
- Default scale: **20 decimal places**.  
- Configurable rounding mode (default: `HALF_UP`).  
- Validation and normalization helpers to ensure consistent results.  

---

## Quick Start
```java
import theia.math.Arithmetic;
import theia.math.Algebra;
import theia.math.Geometry;
import theia.math.Advanced;
import java.math.BigDecimal;

public class Demo {
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
javac Demo.java
java Demo
```

---

## Documentation 

- Beginners: see [newbies.md](https://github.com/alenovauniversalbananatomas-lgtm/TheiaMath/blob/documentation/docs/newbies.md) for a step‑by‑step guide.
- Quick setup: see [getting-started.md](https://github.com/alenovauniversalbananatomas-lgtm/TheiaMath/blob/documentation/docs/getting-started.md) .Detailed references: check the docs/ folder.

---

## License 

MIT License — free to use, modify, and distribute.








