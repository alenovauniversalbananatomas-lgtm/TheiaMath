# Getting Started 

Welcome to TheiaMath!

This guide will help you write your first program using the TheiaMath library.

---

## Hello, TheiaMath

Create a file named `Main.java`:

```java
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arithmetic.add(10, 5));

    }

}
```

Compile:

```bash
javac -cp .:TheiaMath.jar Main.java
```

Run:

```bash
java -cp .:TheiaMath.jar Main
```

Output:

```text
15
```

---

## Integer Operations

TheiaMath provides dedicated integer methods prefixed with `I`.

Example:

```java
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arithmetic.Idiv(10, 3));
        System.out.println(Arithmetic.Imod(10, 3));

    }

}
```

Output:

```text
3
1
```

---

## Decimal Operations

```java 
import theia.math.Arithmetic;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arithmetic.div(10, 3));

    }

}
```

Output:

```text 
3.33333333333333333333
```

---

## Using Constants

```java
import theia.math.Constants;

public class Main {

    public static void main(String[] args) {

        System.out.println(Constants.PI);

    }

}
```

Output:

```text
3.14159265358979323846
```

---

## Next Steps

Continue with the documentation:

- Arithmetic
- Algebra
- Geometry
- Constants
- Precision
- Examples

These sections provide detailed explanations and usage examples for each component of TheiaMath.