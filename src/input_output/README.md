# ⌨️ Module 05: Java Terminal Input & Output

> **Mastering Standard Console I/O in Java.** Learn how to build interactive command-line interfaces using `java.util.Scanner` and formatted printing.

---

## 📑 Table of Contents
1. [Core Concept: Streams in Java (`System.in` & `System.out`)](#1-core-concept-streams-in-java)
2. [The Complete Scanner API Cheatsheet](#2-the-complete-scanner-api-cheatsheet)
3. [The Newline Buffer Skips Trap & Solution](#3-the-newline-buffer-skips-trap--solution)
4. [Formatting Output (`print` vs `println` vs `printf`)](#4-formatting-output)
5. [Line-by-Line File Guides](#5-line-by-line-file-guides)

---

## 1. Core Concept: Streams in Java

Java handles input and output through **streams** (continuous sequences of data):
- `System.in`: Standard InputStream connected to keyboard input.
- `System.out`: Standard PrintStream connected to terminal output console.
- `System.err`: Standard error stream for error messages.

```mermaid
flowchart LR
    K["Keyboard Input"] -->|"byte stream"| SIN["System.in"]
    SIN -->|"parsed tokens"| SC["Scanner"]
    SC -->|"typed variables"| APP["Your Java App"]
    APP -->|"strings / chars"| SOUT["System.out"]
    SOUT -->|"text"| CON["Terminal Console"]

    style K fill:#E0F7FA,stroke:#00BCD4
    style SC fill:#FFF9C4,stroke:#FBC02D
    style APP fill:#C8E6C9,stroke:#4CAF50
    style CON fill:#FFECB3,stroke:#FFA000
```

---

## 2. The Complete Scanner API Cheatsheet

| Method | What it reads | Example Input | Returned Value |
| :--- | :--- | :--- | :--- |
| `nextLine()` | Full line up to ENTER | `John Doe` | `"John Doe"` (`String`) |
| `next()` | Single whitespace-delimited word | `John Doe` | `"John"` (`String`) |
| `nextInt()` | 32-bit Integer | `42` | `42` (`int`) |
| `nextLong()` | 64-bit Integer | `1234567890` | `1234567890L` (`long`) |
| `nextFloat()` | Single-precision Float | `3.14` | `3.14f` (`float`) |
| `nextDouble()`| Double-precision Float | `99.99` | `99.99` (`double`) |
| `nextBoolean()`| Boolean true/false | `true` | `true` (`boolean`) |

---

## 3. The Newline Buffer Skips Trap & Solution

### Why it happens:
When reading numbers (`nextInt()`, `nextDouble()`), Scanner parses only the number digits. The newline character `\n` generated when the user pressed Enter stays behind in the buffer.

```java
// ❌ WRONG: Next call to nextLine() reads empty newline and skips!
int age = scanner.nextInt();
String address = scanner.nextLine(); // SKIPPED!

// ✅ RIGHT: Flush buffer before reading next line
int age = scanner.nextInt();
scanner.nextLine(); // Consumes the leftover '\n'
String address = scanner.nextLine(); // Correctly waits for user input!
```

---

## 4. Formatting Output

Java provides three printing methods:
1. `System.out.print()`: Prints text without moving to a new line.
2. `System.out.println()`: Prints text and appends a newline `\n`.
3. `System.out.printf()`: Formats strings using format specifiers (e.g. `%s` for String, `%d` for integer, `%.2f` for 2 decimal places).

```java
String item = "Coffee";
double price = 4.50;
System.out.printf("Item: %-10s | Price: $%.2f%n", item, price);
// Output: Item: Coffee     | Price: $4.50
```

---

## 5. Line-by-Line File Guides

| File | Concepts Covered | Command to Run |
| :--- | :--- | :--- |
| [`ScannerInput.java`](file:///Users/honeyreddy/Documents/Java%20course/src/input_output/ScannerInput.java) | Interactive multi-type terminal reading pattern | `java -cp out input_output.ScannerInput` |
