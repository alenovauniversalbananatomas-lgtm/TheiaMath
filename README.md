![TheiaMath Logo](assets/logo.png)

# TheiaMath

TheiaMath is a lightweight Java mathematical library focused on precision (20 decimal places), modular arithmetic, algebra, geometry, and advanced operations. It provides a structured API for calculations using BigDecimal and a unified precision system.

## Features

- Arithmetic operations (sum, subtraction, multiplication, division, modulo)
- Algebra with BigDecimal precision
- Geometry utilities
- Advanced mathematical tools
- Centralized precision control (20 decimals default)
- Custom MathException system

## Structure

- `theia.math` → core operations
- `theia.math.exceptions` → custom exceptions
- `theia.math.internal` → precision engine and internal utilities

## Precision System

All calculations use a global precision system based on BigDecimal, configurable via `Precision.java`.

Default precision: 20 decimal places.

## License

MIT License

---

Made with Theia Math Engine
