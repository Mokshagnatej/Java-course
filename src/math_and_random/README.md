# 🎲 Module 08: Math & Random Number Utilities

> **Mastering the Math API & Randomization in Java.** Learn how to perform complex mathematical formulas, powers, roots, trigonometry, rounding, and pseudo-random number generation using Java's built-in utilities.

---

## 📑 Table of Contents
1. [What You'll Learn](#1-what-youll-learn)
2. [Keywords & Definitions Glossary](#2-keywords--definitions-glossary)
3. [How I Code & What is the Use (Mental Model)](#3-how-i-code--what-is-the-use-mental-model)
4. [The Complete `Math` Class Reference](#4-the-complete-math-class-reference)
5. [Rounding Methods Comparison (`round` vs `floor` vs `ceil`)](#5-rounding-methods-comparison)
6. [Pseudo-Random Generation with `java.util.Random`](#6-pseudo-random-generation-with-javautilrandom)
7. [Real-World Formulas & Examples](#7-real-world-formulas--examples)
8. [Line-by-Line File Guides](#8-line-by-line-file-guides)
9. [Dry-Run & Tracing Exercises](#9-dry-run--tracing-exercises)
10. [Common Pitfalls & Traps](#10-common-pitfalls--traps)

---

## 1. What You'll Learn

After completing this module, you will be able to:

- [ ] Use `Math.PI` and `Math.E` mathematical constants
- [ ] Calculate square roots (`Math.sqrt`) and exponents (`Math.pow`)
- [ ] Differentiate between `Math.round()`, `Math.floor()`, and `Math.ceil()`
- [ ] Generate bounded random integers, doubles, and booleans using `java.util.Random`
- [ ] Translate complex mathematical equations into clean Java expressions

---

## 2. Keywords & Definitions Glossary

| Keyword / Class | Category | Definition & Meaning | Code Syntax Example |
| :--- | :--- | :--- | :--- |
| `Math` | Standard Class | Built-in utility class in `java.lang` containing static math methods. No `new` needed. | `Math.sqrt(25)` |
| `Random` | Standard Class | Pseudo-random number generator in `java.util` package. Requires instantiation with `new`. | `Random r = new Random();` |
| `static` | Modifier | In `Math`, all methods are static, meaning they belong to the class and are called directly. | `Math.pow(2, 3)` |
| `nextInt()` | Method | Returns a uniformly distributed pseudo-random `int` value. | `rand.nextInt(1, 7)` |
| `nextDouble()` | Method | Returns a random `double` between `0.0` (inclusive) and `1.0` (exclusive). | `rand.nextDouble()` |

---

## 3. How I Code & What is the Use (Mental Model)

### What is the Use?
1. **Financial & Engineering Calculations**: Calculating areas, distances, compound interest, roots.
2. **Game Development & Simulations**: Rolling dice, shuffling cards, spawning enemies at random positions.
3. **Security & Tokens**: Generating temporary codes, OTPs, or testing datasets.

### How I Call Math vs Random:
- `Math` is **static**: You call methods directly on the class (`Math.sqrt()`). You NEVER do `new Math()`.
- `Random` is an **instantiable class**: You MUST create an object (`Random rand = new Random()`) before generating numbers.

---

## 4. The Complete `Math` Class Reference

```mermaid
graph LR
    subgraph MATH_CLASS["Math Methods"]
        EXP["Powers & Roots\npow(a,b), sqrt(x)"]
        ROUND["Rounding\nround(x), floor(x), ceil(x)"]
        COMP["Extremes\nmax(a,b), min(a,b), abs(x)"]
        CONST["Constants\nMath.PI, Math.E"]
    end

    style MATH_CLASS fill:#E1F5FE,stroke:#03A9F4
```

| Method | Parameters | Return Type | What it Does | Example |
| :--- | :--- | :--- | :--- | :--- |
| `Math.PI` | Constant | `double` | Circle constant $\pi \approx 3.14159265$ | `Math.PI` |
| `Math.E` | Constant | `double` | Natural log base $e \approx 2.71828$ | `Math.E` |
| `Math.pow(a, b)` | `double a, double b` | `double` | Calculates $a^b$ ($a$ to the power of $b$) | `Math.pow(2, 5)` → `32.0` |
| `Math.sqrt(x)` | `double x` | `double` | Calculates $\sqrt{x}$ | `Math.sqrt(64)` → `8.0` |
| `Math.abs(x)` | `int / double` | same type | Absolute value $|x|$ | `Math.abs(-45)` → `45` |
| `Math.max(a, b)`| `a, b` | same type | Returns larger of $a$ and $b$ | `Math.max(25, 80)` → `80` |
| `Math.min(a, b)`| `a, b` | same type | Returns smaller of $a$ and $b$ | `Math.min(25, 80)` → `25` |
| `Math.round(x)`| `double / float` | `long / int` | Rounds to nearest whole integer | `Math.round(5.6)` → `6` |
| `Math.floor(x)`| `double` | `double` | Rounds DOWN to whole integer | `Math.floor(5.9)` → `5.0` |
| `Math.ceil(x)` | `double` | `double` | Rounds UP to whole integer | `Math.ceil(5.1)` → `6.0` |

---

## 5. Rounding Methods Comparison

```mermaid
flowchart TD
    NUM["Number: 5.6"] --> R["Math.round(5.6) ──► 6 (nearest integer)"]
    NUM --> F["Math.floor(5.6) ──► 5.0 (rounds DOWN towards -∞)"]
    NUM --> C["Math.ceil(5.6)  ──► 6.0 (rounds UP towards +∞)"]

    style NUM fill:#FFF9C4,stroke:#FBC02D
    style R fill:#C8E6C9,stroke:#4CAF50
    style F fill:#E3F2FD,stroke:#2196F3
    style C fill:#FFE0B2,stroke:#FF9800
```

| Input Value | `Math.round()` | `Math.floor()` | `Math.ceil()` |
| :---: | :---: | :---: | :---: |
| `5.1` | `5` | `5.0` | `6.0` |
| `5.5` | `6` | `5.0` | `6.0` |
| `5.9` | `6` | `5.0` | `6.0` |
| `-2.3` | `-2` | `-3.0` | `-2.0` |

---

## 6. Pseudo-Random Generation with `java.util.Random`

```java
import java.util.Random;

Random rand = new Random();

// 1. Random integer in range [min, max] inclusive (Java 17+):
int diceRoll = rand.nextInt(1, 7); // Generates 1, 2, 3, 4, 5, or 6

// 2. Random decimal between 0.0 and 1.0:
double probability = rand.nextDouble();

// 3. Random coin flip:
boolean coinHeads = rand.nextBoolean();
```

---

## 7. Real-World Formulas & Examples

### 1. Distance Formula: $d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$
```java
double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
```

### 2. Hypotenuse of a Right Triangle: $c = \sqrt{a^2 + b^2}$
```java
double a = 3.0, b = 4.0;
double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // c = 5.0
```

### 3. Circle Area: $Area = \pi r^2$
```java
double radius = 5.0;
double area = Math.PI * Math.pow(radius, 2);
```

---

## 8. Line-by-Line File Guides

| File | Concepts Covered | Expected Console Output | Command to Run |
| :--- | :--- | :--- | :--- |
| [`math.java`](file:///Users/honeyreddy/Documents/Java%20course/src/math_and_random/math.java) | `Math.PI`, `Math.E`, `sqrt`, `pow`, `abs`, `round`, `floor`, `ceil` | Prints values for all standard math functions and constants | `java -cp out math_and_random.math` |
| [`randomnumbers.java`](file:///Users/honeyreddy/Documents/Java%20course/src/math_and_random/randomnumbers.java) | `Random.nextInt(origin, bound)`, dice rolls, booleans | Generates random numbers, simulated dice rolls, and flags | `java -cp out math_and_random.randomnumbers` |

---

## 9. Dry-Run & Tracing Exercises

### Trace `math.java` Computations:

| Expression | Inner Operation | Mathematical Meaning | Result |
| :--- | :--- | :--- | :--- |
| `Math.pow(2, 5)` | $2^5$ | $2 \times 2 \times 2 \times 2 \times 2$ | `32.0` |
| `Math.sqrt(64.0)` | $\sqrt{64}$ | Square root of 64 | `8.0` |
| `Math.abs(-45)` | $|-45|$ | Magnitude without sign | `45` |
| `Math.max(25, 80)`| $\max(25, 80)$ | Greater of two numbers | `80` |
| `Math.round(5.6)` | Round to whole | Nearest integer | `6` |
| `Math.floor(5.9)` | Round down | Floor integer | `5.0` |
| `Math.ceil(5.1)` | Round up | Ceiling integer | `6.0` |

---

## 10. Common Pitfalls & Traps

> [!CAUTION]
> ### 1. Don't use `^` for Exponents in Java!
> In Java, `^` is the **Bitwise XOR operator**, NOT exponentiation!
> ```java
> int result = 2 ^ 3;         // Result is 1 (XOR: 0010 ^ 0011 = 0001), NOT 8!
> double result = Math.pow(2, 3); // Result is 8.0 ✅
> ```

> [!WARNING]
> ### 2. `Math.pow()` always returns `double`
> Even if you pass integers:
> ```java
> int result = Math.pow(2, 3);       // ❌ Compile error: double cannot fit into int
> int result = (int) Math.pow(2, 3); // ✅ Explicit cast to int
> ```
