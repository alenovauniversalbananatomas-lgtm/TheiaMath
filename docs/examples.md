# Examples

This document contains practical examples demonstrating how to use TheiaMath.

---

## Basic Arithmetic

```java
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arithmetic.add(10, 5));
        System.out.println(Arithmetic.sub(10, 5));
        System.out.println(Arithmetic.mul(10, 5));
        System.out.println(Arithmetic.div(10, 5));

    }

}
```

Output:

```text
15
5
50
2
```

---

## Integer Division

```java
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arithmetic.Idiv(25, 4));
        System.out.println(Arithmetic.Imod(25, 4));

    }

}
```

Output:

```text
6
1
```

---

## Calculating a Discount

```java
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        double price = 1000;
        double discount = Arithmetic.mul(price, 0.20);

        System.out.println(price - discount);

    }

}
```

Output:

```text
800
```

---

## Circle Area

```java
import theia.math.Geometry;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            Geometry.circleArea(5)
        );

    }

}
```

Output:

```text
78.53981633974483096157
```

---

## Rectangle Area

```java
import theia.math.Geometry;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            Geometry.rectangleArea(10, 4)
        );

    }

}
```

Output:

```text
40
```

---

## Using Mathematical Constants

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

## Calculating a Sphere Volume

```java
import theia.math.Geometry;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            Geometry.sphereVolume(3)
        );

    }

}
```

Output:

```text
113.09733552923255247113
```

---

## Using High Precision Values

```java
import theia.math.Constants;
import theia.math.Geometry;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            Geometry.circleCircumference(10)
        );

        System.out.println(Constants.PI);

    }

}
```

This example demonstrates the use of TheiaMath's 20-decimal precision calculations.

---

## Next Steps

For detailed documentation, see:

- Arithmetic
- Algebra
- Geometry
- Constants
- Precision

These documents explain every method and constant available in TheiaMath.