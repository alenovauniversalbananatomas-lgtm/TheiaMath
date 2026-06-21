
# TheiaMath

**TheiaMath** is a lightweight Java mathematical library designed for high‑precision calculations (20 decimal places). It provides modular tools for arithmetic, algebra, geometry, and advanced operations, all built on `BigDecimal` with a unified precision system.

## Features
- Arithmetic operations: addition, subtraction, multiplication, division, modulo  
- Algebra utilities: powers, square roots, absolute values, min/max, rounding  
- Geometry functions: areas, perimeters, distances in 2D space  
- Advanced tools: exponential, natural logarithm, real powers, trigonometric functions, factorial  
- Precision control: centralized scale and rounding configuration (default: 20 decimals, HALFUP)  
- Custom exceptions: unified error handling with `MathException` 

## Project Structure
- `theia.math` → core operations (Arithmetic, Algebra, Geometry, Advanced)  
- `theia.math.exceptions` → custom exception system  
- `theia.math.internal` → precision engine and internal utilities  

## Precision System
All calculations rely on a global precision engine:  
- Default scale: 20 decimal places  
- Configurable rounding mode (default: `HALF_UP`)  
- Validation and normalization helpers to ensure consistent results  

## Quick Start
```java
import theia.math.Arithmetic;
import theia.math.Algebra;
import theia.math.Geometry;
import theia.math.Advanced;
import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Arithmetic.Add(2, 3)); // 5.0
        System.out.println(Algebra.Sqrt(new BigDecimal("16"))); // 4
        System.out.println(Geometry.CircleArea(new BigDecimal("2"))); // ~12.566...
        System.out.println(Advanced.Sin(new BigDecimal("1.5708"))); // ~1.0
    }
}
```

## License
MIT License — free to use, modify, and distribute.


