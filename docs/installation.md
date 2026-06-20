# Installation

## Requirements

Before installing TheiaMath, ensure that the following prerequisites are met:

- Java 8 or later
- `TheiaMath.jar`

---

## Integrating TheiaMath into a Project

To use TheiaMath in your application, place `TheiaMath.jar` either in your project root directory or in a dedicated library folder.

Example project structure:

```text
Project/
├── src/
│   └── Main.java
├── lib/
│   └── TheiaMath.jar
```

Compile your project using the following command:

```bash
javac -cp .:lib/TheiaMath.jar Main.java
```

Run the application:

```bash
java -cp .:lib/TheiaMath.jar Main
```

## Usage Example

```java
import theia.math.Arithmetic;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arithmetic.add(5, 3));
    }
}
```

Expected output:

```text
8
```

---

## Global Installation 

Alternatively, you can place `TheiaMath.jar` in a shared library location and add it to your Java classpath.

Example:

```bash
export CLASSPATH=$CLASSPATH:/path/to/TheiaMath.jar
```

Once configured, TheiaMath classes can be imported and used in any Java project that references the specified classpath.

---

## Version 

Current release: v1.0.0