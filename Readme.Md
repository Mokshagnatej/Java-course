# ☕ Java Mastery & Core Fundamentals — Complete Logic & Revision Guide

[![Java](https://img.shields.io/badge/Java-17%2B%20%7C%2021%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Platform](https://img.shields.io/badge/Platform-macOS%20%7C%20Linux%20%7C%20Windows-blue?style=for-the-badge&logo=apple&logoColor=white)](https://github.com/)
[![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-brightgreen?style=for-the-badge)](https://github.com/)
[![Dependencies](https://img.shields.io/badge/Dependencies-Zero%20(Pure%20JDK)-orange?style=for-the-badge)](https://github.com/)
[![License](https://img.shields.io/badge/License-MIT-lightgrey?style=for-the-badge)](LICENSE)

> **Welcome! 🎉** This is a beginner-friendly Java learning repository. Every program here is explained **line by line** — every keyword, every symbol, every concept — so you can learn Java just by reading this README. No prior programming experience needed!

---

## 📑 Table of Contents

- [🟢 Module 01 — Getting Started (Basics)](#-module-01--getting-started-basics)
- [🟢 Module 02 — Variables & Data Types](#-module-02--variables--data-types)
- [🟢 Module 03 — Type Conversions & Casting](#-module-03--type-conversions--casting)
- [🟢 Module 04 — Operators](#-module-04--operators)
- [🟢 Module 05 — Input and Output](#-module-05--input-and-output)
- [🟢 Module 06 — Conditional Statements](#-module-06--conditional-statements)
- [🟢 Module 07 — Loops](#-module-07--loops)
- [🟢 Module 08 — Math and Random Numbers](#-module-08--math-and-random-numbers)
- [🟡 Module 09 — Practice Projects](#-module-09--practice-projects)
- [🟡 Module 10 — Arrays](#-module-10--arrays)
- [🟡 Module 11 — Methods](#-module-11--methods)
- [🟡 Module 12 — Strings](#-module-12--strings)
- [🔴 Module 13 — OOP Basics (Classes & Objects)](#-module-13--oop-basics-classes--objects)
- [⚡ Quick Start & Execution Commands](#-quick-start--execution-commands)
- [📖 Java Keyword & Term Glossary (A–Z)](#-java-keyword--term-glossary-az)

---

## ⚡ Quick Start & Execution Commands

### 1. Compile All Files at Once:
```bash
javac -d out $(find src -name "*.java")
```

### 2. Run Any Program:
```bash
# Example: run the starting structure program
java -cp out beginner.getting_started.startingstructure
```

> Each section below includes the exact run command for that file. 🚀

---

## 🟢 Module 01 — Getting Started (Basics)

> **What you'll learn:** The very first thing every Java programmer writes — the structure of a Java program, how the computer knows where to start, and how to show text on the screen.

---

### 📄 `src/beginner/getting_started/startingstructure.java`

**Purpose:** Teaches the minimum structure every Java program needs — a class, a main method, and how to print text to the screen.

**▶️ Run:** `java -cp out beginner.getting_started.startingstructure`

```java
package beginner.getting_started;

public class startingstructure {

    public static void main(String[] args) {
        System.out.println("jaffa is good boy");
        System.out.println("really as a very great person!");
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 1 | `package beginner.getting_started;` | **`package`** is a keyword that tells Java which folder this file belongs to. Think of it like a file cabinet drawer label. Here it says "this file lives inside the `beginner/getting_started` folder." The semicolon `;` at the end is required — it tells Java "this instruction is complete." |
| 3 | `public class startingstructure {` | **`public`** means this class can be seen and used by anyone (including the Java system itself). **`class`** is the keyword that creates a "blueprint" — in Java, ALL your code must live inside a class. **`startingstructure`** is the name we chose for this class (it must match the filename). The opening curly brace `{` starts the class body. |
| 5 | `public static void main(String[] args) {` | This is the **entry point** — the exact line where Java starts running your program. Let's break down every word: **`public`** = accessible from anywhere (the Java system needs to call this). **`static`** = Java can run this method without creating an object first (don't worry about objects yet!). **`void`** = this method doesn't send back any value when it finishes. **`main`** = a special name that Java looks for — it's like the "Start" button. **`String[] args`** = a container that can hold text values passed from the command line (we'll learn about arrays later — for now just know it must be there). |
| 6 | `System.out.println("jaffa is good boy");` | **`System`** = a built-in Java class that gives access to system features. **`out`** = the standard output stream (your terminal/screen). **`println`** = a method that **prints** a line of text and then moves the cursor to the **next line** ("print-line"). The text inside the double quotes `"..."` is a **String literal** — the exact text that gets displayed. |
| 7 | `System.out.println("really as a very great person!");` | Same as above — prints the second message on a new line. |
| 8 | `}` | Closes the `main` method. |
| 9 | `}` | Closes the `startingstructure` class. |

> 🔑 **Concept:** Every Java program needs at least one class and a `public static void main(String[] args)` method. This method is where Java starts running your code, line by line, top to bottom.

**⚠️ Common beginner mistakes:**
- Forgetting the semicolon `;` at the end of a statement — Java will show an error.
- Spelling `main` wrong (e.g., `Main` or `mian`) — Java won't find the entry point and your program won't run.

---

## 🟢 Module 02 — Variables & Data Types

> **What you'll learn:** How to store information (numbers, text, true/false values) in named containers called variables, and how to combine text together.

---

### 📄 `src/beginner/variables/variables.java`

**Purpose:** Teaches how to create variables of different types — integers, decimals, booleans, and strings — and how to combine them with `+`.

**▶️ Run:** `java -cp out beginner.variables.variables`

```java
package beginner.variables;

public class variables {

    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);

        double height = 3.53234;
        System.out.println(height);

        Boolean isMale = true;
        System.out.println(isMale);

        if (isMale) {
            System.out.println("your male");
        } else {
            System.out.println("your not a male");
        }

        String name = "sai";
        System.out.println(name);

        String name2 = "nandini";
        System.out.println(name2);

        System.out.println(name + "love" + name2);

        System.out.println("your name is " + name + " " + "your height is " + height + " " + " your age is " + age);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 1 | `package beginner.variables;` | Declares this file belongs to the `beginner.variables` folder/namespace. |
| 3 | `public class variables {` | Creates a public class named `variables`. |
| 5 | `public static void main(String[] args) {` | The program entry point (explained in Module 01). |
| 6 | `int age = 20;` | **`int`** is a keyword for a data type that stores **whole numbers** (no decimals). It uses 32 bits of memory and can hold values from about -2 billion to +2 billion. **`age`** is the variable name we chose. **`=`** is the **assignment operator** — it puts the value on the right (`20`) into the variable on the left (`age`). |
| 7 | `System.out.println(age);` | Prints the value stored in `age`, which is `20`. |
| 9 | `double height = 3.53234;` | **`double`** is a data type for **decimal numbers** (floating-point). It uses 64 bits and can store very precise decimals. We use `double` instead of `int` because height has decimal places. |
| 10 | `System.out.println(height);` | Prints `3.53234`. |
| 12 | `Boolean isMale = true;` | **`Boolean`** (with a capital B) is the **wrapper class** version of the primitive `boolean` type. It stores either `true` or `false` — nothing else. Here it wraps `true` into an object. (The lowercase `boolean` would also work and is more common.) |
| 13 | `System.out.println(isMale);` | Prints `true`. |
| 15 | `if (isMale) {` | **`if`** is a keyword that checks a condition. If what's inside the parentheses is `true`, the code inside the curly braces runs. Since `isMale` is `true`, Java enters this block. |
| 16 | `System.out.println("your male");` | Prints this message because the condition was `true`. |
| 17 | `} else {` | **`else`** provides an alternative block that runs ONLY if the `if` condition was `false`. |
| 18 | `System.out.println("your not a male");` | This line would run if `isMale` were `false`. |
| 21 | `String name = "sai";` | **`String`** is a reference type (not a primitive like `int`) that holds a sequence of characters (text). The text must be enclosed in **double quotes** `"..."`. |
| 22 | `System.out.println(name);` | Prints `sai`. |
| 24 | `String name2 = "nandini";` | Another String variable holding different text. |
| 27 | `System.out.println(name + "love" + name2);` | The **`+` operator** here acts as **string concatenation** — it joins (glues) pieces of text together. Result: `sailovenandini`. Notice there are no spaces unless you add them inside the quotes. |
| 29 | `System.out.println("your name is " + name + " " + ...);` | Multiple concatenations that combine text and variable values into one long sentence. Java automatically converts `height` (double) and `age` (int) to text when joining them with a String using `+`. |

> 🔑 **Concept:** Variables are named containers that hold data. Each variable has a **type** that tells Java what kind of data it can hold: `int` for whole numbers, `double` for decimals, `boolean` for true/false, and `String` for text. The `+` operator joins strings together (concatenation).

**⚠️ Common beginner mistakes:**
- Using `=` (assignment) when you mean `==` (comparison). `age = 20` stores 20 in age; `age == 20` checks if age equals 20.
- Forgetting that `String` starts with a capital S — it's a class, not a primitive type.

---

## 🟢 Module 03 — Type Conversions & Casting

> **What you'll learn:** What happens when Java automatically changes one number type to another, and how to force a conversion yourself.

---

### 📄 `src/beginner/type_conversion/Typepromotions.java`

**Purpose:** Teaches that when you do math with small types like `byte`, Java automatically upgrades them to `int` to prevent overflow.

**▶️ Run:** `java -cp out beginner.type_conversion.Typepromotions`

```java
package beginner.type_conversion;

public class Typepromotions {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;

        int result = a * b;

        System.out.println("Result of byte multiplication promoted to int: " + result);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 1 | `package beginner.type_conversion;` | This file belongs to the `type_conversion` folder. |
| 3 | `public class Typepromotions {` | Creates a class named `Typepromotions`. |
| 6 | `byte a = 10;` | **`byte`** is the smallest integer type in Java — it uses only 8 bits of memory and can hold values from -128 to 127. Here we store `10` in it. |
| 7 | `byte b = 30;` | Another byte variable holding `30`. |
| 9 | `int result = a * b;` | Here's the key lesson: even though `a` and `b` are both `byte`, when Java multiplies them (`a * b`), it **automatically promotes** (upgrades) both values to `int` (32-bit) before doing the math. This is called **type promotion**. The result of `10 * 30 = 300`, which is way bigger than byte's maximum of 127! That's exactly why Java promotes to int — to avoid overflow. We store the result in an `int` variable because the result IS an int. |
| 11 | `System.out.println("Result..." + result);` | Prints `300`. The `+` here concatenates the text string with the number. |

> 🔑 **Concept:** When Java does arithmetic (`+`, `-`, `*`, `/`) on small types like `byte`, `short`, or `char`, it automatically promotes them to `int` first. This prevents accidental overflow during calculations.

**⚠️ Common beginner mistakes:**
- Trying to store the result back in a `byte` like `byte c = a * b;` — this won't compile because `a * b` produces an `int`, and an `int` can't fit into a `byte` without explicit casting.

---

### 📄 `src/beginner/type_conversion/Floatconversion.java`

**Purpose:** Teaches how to manually convert a decimal number (`float`) to a whole number (`int`) using casting, and shows that the decimal part gets chopped off (not rounded).

**▶️ Run:** `java -cp out beginner.type_conversion.Floatconversion`

```java
package beginner.type_conversion;

public class Floatconversion {

    public static void main(String[] args) {
        float a = 5.6f;

        int b = (int) a;

        System.out.println("Original float: " + a);
        System.out.println("Truncated integer after (int) cast: " + b);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `float a = 5.6f;` | **`float`** is a data type for decimal numbers using 32 bits of memory. The **`f`** suffix after `5.6` is required — without it, Java treats `5.6` as a `double` (64-bit), which is bigger than `float`, and you'd get a compile error. |
| 8 | `int b = (int) a;` | **`(int)`** is called a **type cast**. It's an explicit instruction telling Java: "I know this might lose data, but convert this float to an int anyway." When you cast `5.6` to int, Java **truncates** (chops off) everything after the decimal point. So `5.6` becomes `5` — NOT `6`. Java does NOT round, it just removes the decimal portion. This is called **narrowing conversion** because you're going from a bigger type to a smaller one. |
| 10-11 | `System.out.println(...)` | Prints the original value `5.6` and the truncated value `5`. |

> 🔑 **Concept:** **Narrowing conversion** (going from a bigger type to a smaller type, like `float` → `int`) must be done explicitly with a cast `(targetType)`. Java truncates — it does NOT round.

**⚠️ Common beginner mistakes:**
- Forgetting the `f` suffix on float literals: `float x = 5.6;` will fail because `5.6` defaults to `double`.
- Expecting `(int) 5.9` to give `6` — it gives `5` (truncation, not rounding).

---

### 📄 `src/beginner/type_conversion/byteconversion.java`

**Purpose:** Teaches what happens when you cast a large number into a `byte` — the value wraps around (overflow) because byte can only hold -128 to 127.

**▶️ Run:** `java -cp out beginner.type_conversion.byteconversion`

```java
package beginner.type_conversion;

public class byteconversion {

    public static void main(String[] args) {
        int a = 12;
        byte k = (byte) a;
        System.out.println("Casting int 12 to byte: " + k);

        int big = 130;
        byte wrapped = (byte) big;
        System.out.println("Casting int 130 to byte (overflow wrap-around): " + wrapped);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int a = 12;` | Stores the number 12 as a 32-bit integer. |
| 7 | `byte k = (byte) a;` | Casts `12` to a `byte`. Since 12 is within the byte range (-128 to 127), the value stays `12` with no data loss. |
| 8 | `System.out.println(...)` | Prints `12`. |
| 10 | `int big = 130;` | Stores `130` — this is BIGGER than byte's maximum of 127. |
| 11 | `byte wrapped = (byte) big;` | Casts `130` to a `byte`. Since 130 exceeds 127, Java takes only the lower 8 bits of the binary representation. The result **wraps around** to `-126`. This is called **overflow**. In binary: 130 = `10000010`, and when read as a signed 8-bit number using two's complement, that equals -126. |
| 12 | `System.out.println(...)` | Prints `-126` — a surprising result for beginners! |

> 🔑 **Concept:** When you cast a value that's too big for the target type, it **overflows** and wraps around. A `byte` can only hold -128 to 127, so casting 130 wraps to -126. Always check if your value fits before casting!

---

## 🟢 Module 04 — Operators

> **What you'll learn:** How to do math, compare values, combine conditions, and use shortcut operators in Java.

---

### 📄 `src/beginner/operators/arithmeticoperator.java`

**Purpose:** Teaches the five basic math operators: addition, subtraction, multiplication, division, and modulus (remainder).

**▶️ Run:** `java -cp out beginner.operators.arithmeticoperator`

```java
package beginner.operators;

public class arithmeticoperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        int sum = a + b;
        System.out.println("Addition (10 + 4): " + sum);

        int diff = a - b;
        System.out.println("Subtraction (10 - 4): " + diff);

        int prod = a * b;
        System.out.println("Multiplication (10 * 4): " + prod);

        int quotient = a / b;
        System.out.println("Integer Division (10 / 4): " + quotient);

        int remainder = a % b;
        System.out.println("Modulus/Remainder (10 % 4): " + remainder);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6-7 | `int a = 10; int b = 4;` | Creates two integer variables to use in our calculations. |
| 9 | `int sum = a + b;` | **`+`** (addition operator) adds the values of `a` and `b`. Result: `14`. |
| 12 | `int diff = a - b;` | **`-`** (subtraction operator) subtracts `b` from `a`. Result: `6`. |
| 15 | `int prod = a * b;` | **`*`** (multiplication operator) multiplies `a` by `b`. Result: `40`. |
| 18 | `int quotient = a / b;` | **`/`** (division operator) divides `a` by `b`. **Critical:** when both sides are `int`, Java does **integer division** — it chops off the decimal. `10 / 4 = 2` (not 2.5!). The `.5` is gone forever. |
| 21 | `int remainder = a % b;` | **`%`** (modulus/remainder operator) gives the **remainder** after dividing `a` by `b`. `10 ÷ 4 = 2 remainder 2`, so the result is `2`. This is very useful for checking if a number is even/odd: `n % 2 == 0` means even. |

> 🔑 **Concept:** Java has five arithmetic operators: `+` (add), `-` (subtract), `*` (multiply), `/` (divide), `%` (remainder). When dividing two integers, Java **truncates** the decimal — use `double` if you need the full result.

**⚠️ Common beginner mistakes:**
- Expecting `10 / 4` to give `2.5` — with two ints, you get `2`. Use `10.0 / 4` to get `2.5`.
- Confusing `/` (division/quotient) with `%` (remainder/modulus).

---

### 📄 `src/beginner/operators/increment.java`

**Purpose:** Teaches the difference between `i++` (postfix: use then increase) and `++i` (prefix: increase then use).

**▶️ Run:** `java -cp out beginner.operators.increment`

```java
package beginner.operators;

public class increment {

    public static void main(String[] args) {
        int m = 5;
        System.out.println("Initial m: " + m);

        m++;
        System.out.println("After m++: " + m);

        m--;
        System.out.println("After m--: " + m);

        int a = 10;
        int postResult = a++;
        System.out.println("Postfix Assignment: postResult = " + postResult + ", a = " + a);

        int b = 10;
        int preResult = ++b;
        System.out.println("Prefix Assignment: preResult = " + preResult + ", b = " + b);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int m = 5;` | Starts `m` at 5. |
| 9 | `m++;` | **`++`** is the **increment operator** — it adds 1 to the variable. `m` goes from 5 to 6. When used alone on a line, postfix (`m++`) and prefix (`++m`) do the same thing. |
| 12 | `m--;` | **`--`** is the **decrement operator** — it subtracts 1. `m` goes from 6 back to 5. |
| 15-16 | `int a = 10; int postResult = a++;` | Here's where it gets tricky! **Postfix `a++`** means: "Give me the current value of `a` FIRST (so `postResult` gets `10`), THEN increase `a` by 1 (so `a` becomes `11`)." |
| 19-20 | `int b = 10; int preResult = ++b;` | **Prefix `++b`** means: "Increase `b` by 1 FIRST (so `b` becomes `11`), THEN give me the new value (so `preResult` gets `11`)." |

> 🔑 **Concept:** `x++` (postfix) = use the value first, then increment. `++x` (prefix) = increment first, then use the value. This difference only matters when the expression is part of a larger statement (like an assignment).

**⚠️ Common beginner mistakes:**
- Thinking `y = x++` and `y = ++x` give the same result — they don't! With `x = 10`: postfix gives `y = 10`, prefix gives `y = 11`.

---

### 📄 `src/beginner/operators/augmentedassigment.java`

**Purpose:** Teaches shortcut operators like `+=`, `-=`, `*=`, `/=`, `%=` that update a variable in one step.

**▶️ Run:** `java -cp out beginner.operators.augmentedassigment`

```java
package beginner.operators;

public class augmentedassigment {

    public static void main(String[] args) {
        int num = 100;
        System.out.println("Starting value: " + num);

        num += 20;
        System.out.println("After num += 20: " + num);

        num -= 10;
        System.out.println("After num -= 10: " + num);

        num *= 2;
        System.out.println("After num *= 2:  " + num);

        num /= 4;
        System.out.println("After num /= 4:  " + num);

        num %= 10;
        System.out.println("After num %= 10: " + num);

        byte b = 50;
        b += 10;
        System.out.println("Byte after b += 10: " + b);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int num = 100;` | Starts with `100`. |
| 9 | `num += 20;` | **`+=`** is the **compound addition operator**. It's a shortcut for `num = num + 20`. Result: `120`. |
| 12 | `num -= 10;` | **`-=`** is shortcut for `num = num - 10`. `120 - 10 = 110`. |
| 15 | `num *= 2;` | **`*=`** is shortcut for `num = num * 2`. `110 * 2 = 220`. |
| 18 | `num /= 4;` | **`/=`** is shortcut for `num = num / 4`. `220 / 4 = 55` (integer division). |
| 21 | `num %= 10;` | **`%=`** is shortcut for `num = num % 10`. `55 % 10 = 5` (remainder). |
| 24-25 | `byte b = 50; b += 10;` | **Hidden superpower:** Compound operators include an **implicit cast**. Writing `b = b + 10` would fail (because `b + 10` becomes an `int`), but `b += 10` automatically casts the result back to `byte`! |

> 🔑 **Concept:** Compound assignment operators (`+=`, `-=`, `*=`, `/=`, `%=`) are shortcuts that perform an operation AND assign the result back to the variable in one step. They also automatically handle type casting.

---

### 📄 `src/beginner/operators/Relationaloperator.java`

**Purpose:** Teaches comparison operators that produce `true` or `false` results.

**▶️ Run:** `java -cp out beginner.operators.Relationaloperator`

```java
package beginner.operators;

public class Relationaloperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 40;

        System.out.println("Comparing a = " + a + " and b = " + b + ":");

        System.out.println("a < b  (10 < 40)  : " + (a < b));
        System.out.println("a > b  (10 > 40)  : " + (a > b));
        System.out.println("a == b (10 == 40) : " + (a == b));
        System.out.println("a != b (10 != 40) : " + (a != b));
        System.out.println("a <= b (10 <= 40) : " + (a <= b));
        System.out.println("a >= b (10 >= 40) : " + (a >= b));
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6-7 | `int a = 10; int b = 40;` | Two integers to compare. |
| 11 | `(a < b)` | **`<`** (less than) checks if `a` is smaller than `b`. `10 < 40` is `true`. |
| 12 | `(a > b)` | **`>`** (greater than) checks if `a` is bigger than `b`. `10 > 40` is `false`. |
| 13 | `(a == b)` | **`==`** (equal to) checks if both values are the same. `10 == 40` is `false`. **WARNING:** This is NOT the same as `=` which is assignment! |
| 14 | `(a != b)` | **`!=`** (not equal to) checks if the values are different. `10 != 40` is `true`. |
| 15 | `(a <= b)` | **`<=`** (less than or equal to). `10 <= 40` is `true`. |
| 16 | `(a >= b)` | **`>=`** (greater than or equal to). `10 >= 40` is `false`. |

> 🔑 **Concept:** Relational (comparison) operators compare two values and always return a `boolean` result (`true` or `false`). They are essential for making decisions with `if` statements.

**⚠️ Common beginner mistakes:**
- Using `=` (assignment) instead of `==` (comparison): `if (x = 5)` is wrong, `if (x == 5)` is correct.

---

### 📄 `src/beginner/operators/logicaloperator.java`

**Purpose:** Teaches how to combine multiple true/false conditions using AND (`&&`), OR (`||`), and NOT (`!`).

**▶️ Run:** `java -cp out beginner.operators.logicaloperator`

```java
package beginner.operators;

public class logicaloperator {

    public static void main(String[] args) {
        int a = 19;
        int b = 23;

        double c = 23.4;
        double d = 32.3;

        boolean orResult = (a < b || c > d);
        System.out.println("(a < b || c > d): " + orResult);

        boolean andResult = (a < b && c > d);
        System.out.println("(a < b && c > d): " + andResult);

        boolean notResult = !(a < b);
        System.out.println("!(a < b): " + notResult);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6-9 | Variable declarations | Creates two `int` variables and two `double` variables to use in conditions. |
| 12 | `(a < b \|\| c > d)` | **`\|\|`** is the **logical OR** operator. It returns `true` if **at least one** side is true. Here: `19 < 23` is `true`, so the whole thing is immediately `true` — Java doesn't even check the right side! This is called **short-circuit evaluation**. |
| 15 | `(a < b && c > d)` | **`&&`** is the **logical AND** operator. It returns `true` ONLY if **both** sides are true. Here: `19 < 23` is `true` BUT `23.4 > 32.3` is `false`, so the result is `false`. |
| 18 | `!(a < b)` | **`!`** is the **logical NOT** operator. It flips the boolean value. `a < b` is `true`, so `!true` becomes `false`. |

> 🔑 **Concept:** Logical operators combine boolean conditions: `&&` (AND) needs both true, `||` (OR) needs at least one true, `!` (NOT) flips the value. Java uses **short-circuit evaluation** — if the answer is already determined from the left side, it skips checking the right side.

---

### 📄 `src/beginner/operators/OrderDemo.java`

**Purpose:** Teaches operator precedence — the order in which Java evaluates math operations (PEMDAS/BODMAS).

**▶️ Run:** `java -cp out beginner.operators.OrderDemo`

```java
package beginner.operators;

public class OrderDemo {

    public static void main(String[] args) {
        double result = 10 + 3 * 2 / (8 - 3);

        System.out.println("The result is: " + result);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `double result = 10 + 3 * 2 / (8 - 3);` | This line demonstrates **operator precedence**. Java evaluates in this order: **Step 1:** Parentheses first: `(8 - 3) = 5`. **Step 2:** Multiplication: `3 * 2 = 6`. **Step 3:** Division: `6 / 5 = 1` (integer division — both 6 and 5 are ints!). **Step 4:** Addition: `10 + 1 = 11`. **Step 5:** The int value `11` is widened to `double` → `11.0` and stored in `result`. |
| 8 | `System.out.println(...)` | Prints `The result is: 11.0`. |

> 🔑 **Concept:** Java follows PEMDAS/BODMAS: **P**arentheses first, then **M**ultiplication/**D**ivision (left to right), then **A**ddition/**S**ubtraction (left to right). Integer division truncates the result!

---

## 🟢 Module 05 — Input and Output

> **What you'll learn:** How to read information typed by the user on the keyboard using `Scanner`.

---

### 📄 `src/beginner/input_output/scanner.java`

**Purpose:** Teaches how to use the `Scanner` class to read a person's name, age, and height from the keyboard.

**▶️ Run:** `java -cp out beginner.input_output.scanner`

```java
package beginner.input_output;
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Your height (in feet): ");
        double height = scanner.nextDouble();

        System.out.println("The person name is " + name + ", age is " + age + " years, and height is " + height + " feet.");

        scanner.close();
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 2 | `import java.util.Scanner;` | **`import`** is a keyword that brings in classes from other packages so you can use them. **`java.util.Scanner`** is a built-in class that lets you read input from the keyboard. Without this import, Java wouldn't know what `Scanner` is. |
| 7 | `Scanner scanner = new Scanner(System.in);` | **`new`** is a keyword that creates a new object in memory (on the Heap). **`Scanner(System.in)`** creates a Scanner that is connected to **`System.in`** — the standard input stream (your keyboard). The variable `scanner` (lowercase) is a reference that points to this new Scanner object. |
| 9 | `System.out.print("Enter your name: ");` | **`print`** (without `ln`) prints text WITHOUT moving to a new line — the cursor stays on the same line, so the user's input appears right after the colon. |
| 10 | `String name = scanner.nextLine();` | **`nextLine()`** reads an entire line of text that the user types (everything until they press Enter). The text is stored in the `name` variable. |
| 13 | `int age = scanner.nextInt();` | **`nextInt()`** reads the next integer number the user types. If the user types letters instead of a number, the program will crash with an error. |
| 16 | `double height = scanner.nextDouble();` | **`nextDouble()`** reads the next decimal number. |
| 18 | `System.out.println(...)` | Prints a formatted summary combining all the variables with text using `+` concatenation. |
| 20 | `scanner.close();` | **`close()`** releases the input stream resource. It's good practice to close a Scanner when you're done with it to free up system resources. |

> 🔑 **Concept:** The `Scanner` class reads user input from the keyboard. Use `nextLine()` for text, `nextInt()` for whole numbers, and `nextDouble()` for decimals. Always `import java.util.Scanner` at the top and `close()` the scanner when done.

**⚠️ Common beginner mistakes:**
- **The newline bug:** After calling `nextInt()` or `nextDouble()`, a hidden newline character `\n` is left in the buffer. If you call `nextLine()` right after, it reads that empty newline instead of waiting for input. Fix: add an extra `scanner.nextLine();` to flush the buffer after reading a number.

---

### 📄 `src/beginner/input_output/ScannerInput.java`

**Purpose:** Another example of reading multiple types of input — reinforces the Scanner pattern.

**▶️ Run:** `java -cp out beginner.input_output.ScannerInput`

```java
package beginner.input_output;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Your height (in feet): ");
        double height = scanner.nextDouble();

        System.out.println("The person name is " + name + ", his age is " + age + " years, and his height is " + height + " feet.");

        scanner.close();
    }
}
```

**Line-by-line explanation:**

This file follows the same pattern as `scanner.java` above. The key steps are:

1. **Import** Scanner → **Create** a Scanner object → **Prompt** the user → **Read** the input → **Display** the result → **Close** the scanner.

The important Scanner methods used here:
- `scanner.nextLine()` → reads a full line of text (String)
- `scanner.nextInt()` → reads a whole number (int)
- `scanner.nextDouble()` → reads a decimal number (double)

> 🔑 **Concept:** The 4-step input pattern: (1) Create Scanner, (2) Print a prompt, (3) Read input with the matching method, (4) Close the Scanner. Always read the String FIRST before numbers to avoid the newline buffer issue.

---

## 🟢 Module 06 — Conditional Statements

> **What you'll learn:** How to make your program choose different paths based on conditions — if this is true, do this; otherwise, do that.

---

### 📄 `src/beginner/conditional_statements/ifstatement.java`

**Purpose:** Teaches `if`, `else if`, and `else` with real input — validates a name, classifies age into categories, and checks student status.

**▶️ Run:** `java -cp out beginner.conditional_statements.ifstatement`

```java
package beginner.conditional_statements;
import java.util.Scanner;

public class ifstatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (age >= 60) {
            System.out.println("your a senior citizen");
        } else if (age >= 18) {
            System.out.println("your adult");
        } else {
            System.out.println("your not an adult 👦🏻");
        }

        if (isStudent) {
            System.out.println("Your are a student!");
        } else {
            System.out.println("Your not a student!");
        }

        scanner.close();
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 2 | `import java.util.Scanner;` | Imports the Scanner class for reading keyboard input. |
| 10 | `String name = scanner.nextLine();` | Reads the user's name as a full line of text. |
| 13 | `int age = scanner.nextInt();` | Reads the user's age as an integer. |
| 16 | `boolean isStudent = scanner.nextBoolean();` | **`nextBoolean()`** reads either `true` or `false` from the keyboard. **`boolean`** (lowercase) is the primitive type that holds only `true` or `false`. |
| 18 | `if (name.isEmpty()) {` | **`isEmpty()`** is a String method that returns `true` if the string has zero characters. This checks if the user pressed Enter without typing anything. |
| 20 | `} else {` | The `else` block runs when the `if` condition is `false` — meaning the name is NOT empty. |
| 24 | `if (age >= 60) {` | **`>=`** means "greater than or equal to." Checks if age is 60 or older. |
| 26 | `} else if (age >= 18) {` | **`else if`** adds another condition to check — BUT only if the previous `if` was false. This creates a **ladder**: Java checks conditions from top to bottom, and the FIRST true condition wins. Since we already know `age < 60` (the first check failed), this checks if age is 18-59. |
| 28 | `} else {` | If BOTH conditions above were false, the person is under 18. |
| 32 | `if (isStudent) {` | You can use a `boolean` variable directly in an `if` — no need to write `if (isStudent == true)`. If `isStudent` holds `true`, this block runs. |

> 🔑 **Concept:** `if-else if-else` creates a decision ladder. Conditions are checked top to bottom — the FIRST true condition runs, and all remaining branches are skipped. You can use `boolean` variables directly in `if` conditions without `== true`.

---

### 📄 `src/beginner/conditional_statements/ifelse_statement.java`

**Purpose:** Teaches the simplest two-way decision — if one thing is true, do A; otherwise, do B.

**▶️ Run:** `java -cp out beginner.conditional_statements.ifelse_statement`

```java
package beginner.conditional_statements;

public class ifelse_statement {

    public static void main(String[] args) {
        int x = 12;
        int y = 30;

        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than y");
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6-7 | `int x = 12; int y = 30;` | Creates two integer variables. |
| 9 | `if (x > y) {` | Checks if `x` (12) is greater than `y` (30). `12 > 30` is `false`, so Java skips this block. |
| 11 | `} else {` | Since the `if` was false, Java runs the `else` block. |
| 12 | `System.out.println("x is less than y");` | Prints this message. |

> 🔑 **Concept:** `if-else` creates a **binary fork** — exactly ONE of the two blocks will always run. If the condition is true, the `if` block runs; if false, the `else` block runs.

---

### 📄 `src/beginner/conditional_statements/if_else_if.java`

**Purpose:** Teaches the difference between a chained `if-else if` (only one branch runs) and independent `if` statements (each is checked separately).

**▶️ Run:** `java -cp out beginner.conditional_statements.if_else_if`

```java
package beginner.conditional_statements;

public class if_else_if {

    public static void main(String[] args) {
        int h = 49;
        int b = 234;
        double c = 134.0;

        if (h > b) {
            System.out.println("honey");
            System.out.println("come in");
        } else if (b > c) {
            System.out.println("gundu");
            System.out.println("come in");
        }

        if (c < h) {
            System.out.println("complete");
        }

        System.out.println("complete");
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6-8 | Variable declarations | `h = 49` (int), `b = 234` (int), `c = 134.0` (double). |
| 10 | `if (h > b)` | Checks `49 > 234` → `false`. Skips this block. |
| 13 | `else if (b > c)` | Only checked because the first `if` was false. Checks `234 > 134.0` → `true`! Java automatically converts `b` (int 234) to double for comparison with `c`. Prints "gundu" and "come in". |
| 18 | `if (c < h)` | This is a **separate, independent** `if` — NOT connected to the chain above. Checks `134.0 < 49` → `false`. Skips. |
| 22 | `System.out.println("complete");` | This line is NOT inside any `if` — it always runs no matter what. |

> 🔑 **Concept:** Chained `if-else if` blocks are **mutually exclusive** — only the first true branch executes. Independent `if` statements (without `else`) are evaluated separately — multiple can run.

---

### 📄 `src/beginner/conditional_statements/Ternary_operator.java`

**Purpose:** Teaches the ternary operator `? :` — a shortcut for simple if-else decisions in one line.

**▶️ Run:** `java -cp out beginner.conditional_statements.Ternary_operator`

```java
package beginner.conditional_statements;

public class Ternary_operator {

    public static void main(String[] args) {
        int h = 3;

        String parity = (h % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + h + " is: " + parity);

        int marks = 75;
        String examResult = (marks >= 40) ? "Passed" : "Failed";
        System.out.println("Exam status: " + examResult);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int h = 3;` | A number to test for even/odd. |
| 8 | `String parity = (h % 2 == 0) ? "even" : "odd";` | This is the **ternary operator** — the syntax is: `(condition) ? valueIfTrue : valueIfFalse`. Breaking it down: `h % 2` gives the remainder when dividing by 2 (`3 % 2 = 1`). `1 == 0` is `false`. Since false, the value after the `:` is chosen → `"odd"`. |
| 11-12 | `String examResult = (marks >= 40) ? "Passed" : "Failed";` | `75 >= 40` is `true`, so `"Passed"` is selected. |

> 🔑 **Concept:** The ternary operator `(condition) ? valueIfTrue : valueIfFalse` is a compact one-line replacement for a simple if-else that assigns a value. The `?` means "then" and the `:` means "otherwise."

---

### 📄 `src/beginner/conditional_statements/switch_operator.java`

**Purpose:** Teaches the `switch` statement — a cleaner way to handle multiple specific value checks instead of many `if-else if` chains.

**▶️ Run:** `java -cp out beginner.conditional_statements.switch_operator`

```java
package beginner.conditional_statements;

public class switch_operator {

    public static void main(String[] args) {
        int n = 3;

        System.out.println("--- 1. Traditional Switch Statement ---");
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        System.out.println("\n--- 2. Modern Enhanced Arrow Switch ---");
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int n = 3;` | The value to match against. |
| 8 | `switch (n) {` | **`switch`** is a keyword that takes a variable and jumps directly to the matching `case`. It's cleaner than writing `if (n == 1) ... else if (n == 2) ...` over and over. |
| 10 | `case 1:` | **`case`** defines a specific value to match. If `n` equals `1`, execution starts here. |
| 12 | `break;` | **`break`** is crucial! It tells Java to EXIT the switch block immediately. Without `break`, Java would "fall through" and keep running the NEXT case's code too, even though it doesn't match! |
| 31 | `default:` | **`default`** is like `else` — it runs when NO case matches. Here, it catches any number that isn't 1-7. |
| 37 | `case 1 -> System.out.println("Monday");` | This is the **modern arrow switch** (Java 14+). The **`->`** arrow syntax automatically prevents fall-through — no `break` needed! Much cleaner. |

> 🔑 **Concept:** `switch` matches a variable against specific values (cases). Traditional switch needs `break;` to prevent fall-through. Modern arrow switch (`->`) is cleaner and doesn't need `break`. Use `default` to handle unexpected values.

**⚠️ Common beginner mistakes:**
- Forgetting `break;` in traditional switch — this causes **fall-through** where multiple cases run when you only wanted one.

---

## 🟢 Module 07 — Loops

> **What you'll learn:** How to repeat code multiple times — for a known number of times, while a condition is true, or at least once.

---

### 📄 `src/beginner/loops/For_loop.java`

**Purpose:** Teaches the `for` loop — repeating code a set number of times — and nested loops (a loop inside a loop).

**▶️ Run:** `java -cp out beginner.loops.For_loop`

```java
package beginner.loops;

public class For_loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);

            for (int j = 1; j <= 1; j++) {
                System.out.println("  Task " + j + ": Review Java Notes");
            }
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `for (int i = 1; i <= 5; i++) {` | The **`for`** loop has three parts separated by semicolons: **(1) Initialization** `int i = 1` — creates a counter variable `i` starting at 1, runs once. **(2) Condition** `i <= 5` — checked BEFORE each iteration; if `false`, the loop stops. **(3) Update** `i++` — runs AFTER each iteration, increases `i` by 1. So this loop runs 5 times with i = 1, 2, 3, 4, 5. |
| 7 | `System.out.println("Day " + i);` | Prints the current day number. On the first pass, prints "Day 1". |
| 9 | `for (int j = 1; j <= 1; j++) {` | A **nested loop** (loop inside a loop). This inner loop runs completely for EACH iteration of the outer loop. Here it only runs once (`j` goes from 1 to 1). Think of it like a clock: the outer loop is the hour hand, the inner loop is the minute hand — the minute hand completes a full cycle for every tick of the hour hand. |
| 10 | `System.out.println("  Task " + j + ...);` | Prints the task for each day. The two spaces `"  "` at the start create indentation to visually show it's inside the day. |

> 🔑 **Concept:** A `for` loop repeats code a known number of times. It has three parts: initialization, condition, and update. Nested loops run the inner loop completely for each iteration of the outer loop.

**⚠️ Common beginner mistakes:**
- Off-by-one errors: using `<` when you mean `<=`, or starting at 0 when you mean 1.
- Forgetting that `i++` runs AFTER the body, not before.

---

### 📄 `src/beginner/loops/while_loop.java`

**Purpose:** Teaches the `while` loop — repeating code as long as a condition remains true.

**▶️ Run:** `java -cp out beginner.loops.while_loop`

```java
package beginner.loops;

public class while_loop {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Honey " + i);

            int j = 1;
            while (j <= 1) {
                System.out.println("  Reddy " + j);
                j++;
            }

            i++;
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int i = 1;` | Initialize the counter OUTSIDE the loop (unlike `for` where it's in the header). |
| 8 | `while (i <= 5) {` | **`while`** checks the condition BEFORE each iteration. If `i <= 5` is `true`, the loop body runs. If it's `false` from the start, the body runs **zero times**. |
| 9 | `System.out.println("Honey " + i);` | Prints the current value of `i`. |
| 11-14 | Inner while loop | Another while loop nested inside. `j` starts at 1, prints "Reddy 1", then `j++` makes `j = 2`, and `2 <= 1` is false so it stops. |
| 17 | `i++;` | **CRITICAL:** You must manually increment the counter! If you forget this line, `i` stays at 1 forever and the loop runs infinitely — your program will freeze. |

> 🔑 **Concept:** A `while` loop checks its condition FIRST. If the condition is false from the beginning, the loop body never runs (zero iterations). You must manually update the counter variable inside the loop body — forgetting this creates an infinite loop!

**⚠️ Common beginner mistakes:**
- Forgetting `i++` inside the loop body — this creates an infinite loop that never ends.

---

### 📄 `src/beginner/loops/Do_while_loop.java`

**Purpose:** Teaches the `do-while` loop — runs the code at least once, then checks the condition.

**▶️ Run:** `java -cp out beginner.loops.Do_while_loop`

```java
package beginner.loops;

public class Do_while_loop {

    public static void main(String[] args) {
        int i = 6;

        do {
            System.out.println("Current value of i: " + i);
            i++;
        } while (i <= 5);

        System.out.println("Loop terminated. Final i = " + i);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int i = 6;` | Start at 6 — notice this is ALREADY greater than 5! |
| 8 | `do {` | **`do`** starts a do-while loop. The body inside `{ }` runs FIRST, before any condition is checked. |
| 9 | `System.out.println("Current value of i: " + i);` | Prints `6`. This line executes even though `i` is already past the limit! That's the whole point of do-while. |
| 10 | `i++;` | Increments `i` from 6 to 7. |
| 11 | `} while (i <= 5);` | NOW the condition is checked: `7 <= 5` is `false`, so the loop stops. **Important:** notice the semicolon `;` after the closing parenthesis — this is required for do-while (but not for regular while). |
| 13 | `System.out.println("Loop terminated. Final i = " + i);` | Prints that `i` is now 7. The loop body ran exactly **once**. |

> 🔑 **Concept:** A `do-while` loop runs the body FIRST, then checks the condition. This guarantees **at least one execution**, even if the condition is false from the start. Perfect for menus or "try at least once" scenarios.

**⚠️ Common beginner mistakes:**
- Forgetting the semicolon `;` after `while(condition);` — `do-while` requires it, unlike regular `while`.

---

## 🟢 Module 08 — Math and Random Numbers

> **What you'll learn:** How to use Java's built-in math functions and generate random numbers.

---

### 📄 `src/beginner/math_and_random/math.java`

**Purpose:** Teaches the `Math` class — Java's built-in toolkit for mathematical operations like square roots, powers, rounding, and constants like PI.

**▶️ Run:** `java -cp out beginner.math_and_random.math`

```java
package beginner.math_and_random;

public class math {

    public static void main(String[] args) {
        System.out.println("--- 1. Math Constants ---");
        System.out.println("Math.PI : " + Math.PI);
        System.out.println("Math.E  : " + Math.E);

        System.out.println("\n--- 2. Powers and Roots ---");
        double power = Math.pow(2, 5);
        System.out.println("Math.pow(2, 5)   : " + power);

        double root = Math.sqrt(64.0);
        System.out.println("Math.sqrt(64.0)  : " + root);

        System.out.println("\n--- 3. Absolute Values & Extremes ---");
        int negativeNumber = -45;
        System.out.println("Math.abs(-45)    : " + Math.abs(negativeNumber));

        System.out.println("Math.max(25, 80) : " + Math.max(25, 80));
        System.out.println("Math.min(25, 80) : " + Math.min(25, 80));

        System.out.println("\n--- 4. Rounding Utilities ---");
        System.out.println("Math.round(5.6)  : " + Math.round(5.6));
        System.out.println("Math.floor(5.9)  : " + Math.floor(5.9));
        System.out.println("Math.ceil(5.1)   : " + Math.ceil(5.1));
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 7 | `Math.PI` | **`Math`** is a built-in class in `java.lang` (automatically imported — no `import` needed). **`PI`** is a constant (approximately 3.14159). Since `Math` methods are **`static`**, you call them directly on the class name — no need to create an object. |
| 8 | `Math.E` | Euler's number (approximately 2.71828), used in natural logarithms. |
| 11 | `Math.pow(2, 5)` | **`pow`** raises a number to a power: 2⁵ = 32.0. Takes two `double` arguments and returns a `double`. |
| 14 | `Math.sqrt(64.0)` | **`sqrt`** calculates the square root: √64 = 8.0. |
| 19 | `Math.abs(-45)` | **`abs`** returns the absolute value (removes the negative sign): |-45| = 45. |
| 21 | `Math.max(25, 80)` | **`max`** returns the larger of two numbers: 80. |
| 22 | `Math.min(25, 80)` | **`min`** returns the smaller of two numbers: 25. |
| 25 | `Math.round(5.6)` | **`round`** rounds to the nearest whole number: 6. |
| 26 | `Math.floor(5.9)` | **`floor`** rounds DOWN to the nearest whole number: 5.0 (always goes lower). |
| 27 | `Math.ceil(5.1)` | **`ceil`** (ceiling) rounds UP to the nearest whole number: 6.0 (always goes higher). |

> 🔑 **Concept:** The `Math` class provides ready-to-use math functions. All methods are `static`, so you call them as `Math.methodName()` — no object creation needed. Key methods: `pow`, `sqrt`, `abs`, `max`, `min`, `round`, `floor`, `ceil`.

---

### 📄 `src/beginner/math_and_random/randomnumbers.java`

**Purpose:** Teaches how to generate random numbers using the `Random` class — useful for games, simulations, and dice rolls.

**▶️ Run:** `java -cp out beginner.math_and_random.randomnumbers`

```java
package beginner.math_and_random;
import java.util.Random;

public class randomnumbers {

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(10, 200);
        System.out.println("Random integer between 10 and 199: " + number);

        int diceRoll = random.nextInt(1, 7);
        System.out.println("Simulated 6-sided dice roll: " + diceRoll);

        boolean coinFlip = random.nextBoolean();
        System.out.println("Coin flip (true = Heads, false = Tails): " + (coinFlip ? "Heads" : "Tails"));

        double randomPercent = random.nextDouble();
        System.out.printf("Random probability fraction: %.4f%n", randomPercent);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 2 | `import java.util.Random;` | Imports the `Random` class. Unlike `Math`, `Random` is NOT automatically available — you must import it. |
| 7 | `Random random = new Random();` | Unlike `Math` (which is all static), `Random` requires creating an **object** using **`new`**. This object is your random number generator. |
| 9 | `random.nextInt(10, 200)` | **`nextInt(origin, bound)`** generates a random integer where `origin` is **inclusive** (10 CAN appear) and `bound` is **exclusive** (200 CANNOT appear). So this gives a number from 10 to 199. |
| 12 | `random.nextInt(1, 7)` | Simulates a dice roll: generates 1, 2, 3, 4, 5, or 6 (7 is excluded). |
| 15 | `random.nextBoolean()` | **`nextBoolean()`** returns either `true` or `false` randomly — like flipping a coin. |
| 16 | `(coinFlip ? "Heads" : "Tails")` | Uses the ternary operator to convert the boolean to a readable string. |
| 18 | `random.nextDouble()` | **`nextDouble()`** returns a random decimal between 0.0 (inclusive) and 1.0 (exclusive). |
| 19 | `System.out.printf("...%.4f%n", randomPercent);` | **`printf`** is formatted printing. **`%.4f`** means "print a decimal number with 4 digits after the decimal point." **`%n`** is a platform-independent newline. |

> 🔑 **Concept:** `Random` generates pseudo-random values. Use `nextInt(min, max)` for integers (max is exclusive!), `nextBoolean()` for true/false, and `nextDouble()` for decimals. Unlike `Math`, you need to create a `Random` object with `new`.

---

## 🟡 Module 09 — Practice Projects

> **What you'll learn:** How to combine everything from Modules 01-08 into real, useful programs.

---

### 📄 `src/intermediate/practice_projects/shoppingcart.java`

**Purpose:** A complete interactive shopping cart that reads an item name, price, and quantity from the user, then prints a formatted receipt with the total cost.

**▶️ Run:** `java -cp out intermediate.practice_projects.shoppingcart`

```java
package intermediate.practice_projects;
import java.util.Scanner;

public class shoppingcart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        float price;
        char currency = '₹';
        double total;

        System.out.print("What do you want to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price per item: ");
        price = scanner.nextFloat();

        System.out.print("How many " + item + " do you want: ");
        int quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n--- Order Summary ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Payable: %c%.2f%n", currency, total);

        scanner.close();
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 9 | `String item;` | Declares a String variable without assigning a value yet — it will be filled later from user input. |
| 10 | `float price;` | **`float`** is a 32-bit decimal type. Used here for the unit price. |
| 11 | `char currency = '₹';` | **`char`** is a data type that holds a **single character** (16-bit Unicode). Notice single quotes `'...'` for chars vs double quotes `"..."` for strings. `₹` is the Indian Rupee symbol. |
| 12 | `double total;` | Will hold the calculated total cost. |
| 15 | `item = scanner.nextLine();` | Reads the item name from the user. |
| 18 | `price = scanner.nextFloat();` | **`nextFloat()`** reads a 32-bit floating-point number from keyboard input. |
| 21 | `int quantity = scanner.nextInt();` | Reads the quantity as an integer. |
| 23 | `total = price * quantity;` | Calculates total. `float * int` → Java promotes `quantity` to float for the multiplication, then widens the result to `double` for assignment. |
| 28 | `System.out.printf("Total Payable: %c%.2f%n", currency, total);` | **`printf`** uses format specifiers: **`%c`** = character (prints the ₹ symbol), **`%.2f`** = decimal number with 2 decimal places, **`%n`** = new line. The values after the format string fill in the `%` placeholders in order. |

> 🔑 **Concept:** This program combines Scanner input, multiple data types (`String`, `float`, `char`, `int`, `double`), arithmetic, and formatted output (`printf`) into a real-world mini-application. `printf` with format specifiers gives you precise control over output formatting.

---

### 📄 `src/intermediate/practice_projects/calculaterectangle.java`

**Purpose:** A geometry calculator that reads width and height from the user and computes the area and perimeter of a rectangle.

**▶️ Run:** `java -cp out intermediate.practice_projects.calculaterectangle`

```java
package intermediate.practice_projects;
import java.util.Scanner;

public class calculaterectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle (in cm): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle (in cm): ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("\n--- Rectangle Metrics ---");
        System.out.printf("Area: %.2f sq.cm%n", area);
        System.out.printf("Perimeter: %.2f cm%n", perimeter);

        scanner.close();
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 10 | `double width = scanner.nextDouble();` | Reads width as a double (allows decimal values like 12.5). |
| 13 | `double height = scanner.nextDouble();` | Reads height as a double. |
| 15 | `double area = width * height;` | Area formula: width × height. For width=12.5 and height=4.0, area = 50.0. |
| 16 | `double perimeter = 2 * (width + height);` | Perimeter formula: 2 × (width + height). Parentheses ensure addition happens before multiplication. |
| 19 | `System.out.printf("Area: %.2f sq.cm%n", area);` | **`%.2f`** formats the double to show exactly 2 decimal places (e.g., `50.00`). |

> 🔑 **Concept:** Real programs combine input, formulas, and formatted output. `printf` with `%.2f` lets you control how many decimal places to show — perfect for measurements and money.

---

### 📄 `src/intermediate/practice_projects/for_loop.java`

**Purpose:** Generates a multiplication table for the number 17 using a `for` loop with formatted output.

**▶️ Run:** `java -cp out intermediate.practice_projects.for_loop`

```java
package intermediate.practice_projects;

public class for_loop {

    public static void main(String[] args) {
        int number = 17;

        System.out.println("--- Multiplication Table for " + number + " ---");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%2d x %2d = %3d%n", number, i, result);
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 6 | `int number = 17;` | The base number for the multiplication table. |
| 10 | `for (int i = 1; i <= 10; i++) {` | Loops from 1 to 10 (the multipliers). |
| 11 | `int result = number * i;` | Calculates `17 × i` for each iteration. |
| 12 | `System.out.printf("%2d x %2d = %3d%n", ...);` | **`%2d`** means "print an integer using at least 2 character spaces" (right-aligned). **`%3d`** uses 3 spaces. This creates neatly aligned columns in the output. |

> 🔑 **Concept:** `printf` format specifiers like `%2d` and `%3d` control column width, making output neatly aligned. This is useful for tables, receipts, and reports.

---

## 🟡 Module 10 — Arrays

> **What you'll learn:** How to store multiple values in a single variable using arrays — like a row of numbered boxes.

---

### 📄 `src/intermediate/arrays/demo_array.java`

**Purpose:** Teaches the simplest way to create an array with preset values and access a specific element by its index.

**▶️ Run:** `java -cp out intermediate.arrays.demo_array`

```java
package intermediate.arrays;
public class demo_array {
    public static void main(String[]args){
        int nums[] = {1, 2, 3, 4, 5,7};
        System.out.println(nums[3]);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 4 | `int nums[] = {1, 2, 3, 4, 5, 7};` | Creates an **array** — a fixed-size container that holds multiple values of the same type. **`int nums[]`** declares an array of integers (you can also write `int[] nums`). The `{1, 2, 3, 4, 5, 7}` is an **array initializer** that creates the array and fills it with these 6 values in one step. |
| 5 | `System.out.println(nums[3]);` | **`nums[3]`** accesses the element at **index 3**. Arrays are **zero-indexed** in Java: the first element is `nums[0]`, the second is `nums[1]`, etc. So `nums[3]` is the FOURTH element, which is `4`. |

> 🔑 **Concept:** Arrays store multiple values of the same type. Indexing starts at **0** (not 1!). So in an array of 6 elements, valid indexes are 0 through 5.

**⚠️ Common beginner mistakes:**
- Trying to access `nums[6]` in a 6-element array — valid indexes are 0 to 5. Index 6 causes `ArrayIndexOutOfBoundsException`.
- Forgetting that arrays start at index 0, not 1.

---

### 📄 `src/intermediate/arrays/array_of_elments.java`

**Purpose:** Teaches how to create an empty array with `new`, fill it manually, and loop through it.

**▶️ Run:** `java -cp out intermediate.arrays.array_of_elments`

```java
package intermediate.arrays;
public class array_of_elments {
    public static void main(String[]args){
        int nums[] = new int[4];
        nums[0] = 18;
        nums[1] = 32;
        nums[2] = 42;
        nums[3] = 13;

        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 4 | `int nums[] = new int[4];` | **`new int[4]`** allocates memory for an array of 4 integers on the Heap. All values start as `0` (the default for `int`). The `[4]` specifies the size — once created, the size CANNOT change. |
| 5-8 | `nums[0] = 18;` etc. | Fills each position individually using the **index** in square brackets. `nums[0]` is the first slot, `nums[3]` is the last. |
| 10 | `for(int i=0; i<4; i++){` | Loops from `i=0` to `i=3` (4 iterations). Note: `i < 4` (not `<=`) because the last valid index is 3. |
| 11 | `System.out.println(nums[i]);` | Prints each element using `i` as the index. When `i=0`, prints `nums[0]` (18); when `i=1`, prints `nums[1]` (32); etc. |

> 🔑 **Concept:** `new int[size]` creates an empty array of a fixed size. You then fill it using indexes. Use a `for` loop with `i < array.length` to safely iterate through all elements.

---

### 📄 `src/intermediate/arrays/multi_dimensional_array.java`

**Purpose:** Teaches 2D arrays (like a table/grid), random number filling, and the enhanced for-each loop.

**▶️ Run:** `java -cp out intermediate.arrays.multi_dimensional_array`

```java
package intermediate.arrays;
public class multi_dimensional_array {
    public static void main(String[]args){
        int nums[][]= new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums [i][j] = (int) (Math.random() * 100);
            }
        }
        for(int n[] : nums ){
            for(int m:n){
                System.out.print(m + "");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 4 | `int nums[][] = new int[3][4];` | Creates a **2D array** — think of it as a table with 3 rows and 4 columns. `nums[0]` is the first row (an array of 4 ints), `nums[2][3]` is the element in row 2, column 3. |
| 5-9 | Nested `for` loops | The outer loop goes through rows (0 to 2), the inner loop goes through columns (0 to 3). Each cell is filled with a random number. |
| 8 | `(int) (Math.random() * 100)` | **`Math.random()`** returns a random `double` between 0.0 and 1.0. Multiplying by 100 gives 0.0 to 99.99..., and casting to `(int)` truncates to a whole number 0-99. |
| 10 | `for(int n[] : nums)` | This is the **enhanced for-each loop**. The syntax `for(type variable : array)` reads as "for each element in the array." Here, `n` takes the value of each ROW (which is itself an `int[]` array) one at a time. No index variable needed! |
| 11 | `for(int m : n)` | For each individual integer `m` in the current row `n`. |
| 12 | `System.out.print(m + "");` | **`print`** (without `ln`) prints without a newline — values appear on the same line. |
| 14 | `System.out.println();` | Prints an empty newline to start a new row in the output. |

> 🔑 **Concept:** 2D arrays are arrays of arrays — like a table with rows and columns. The enhanced for-each loop (`for(type var : array)`) is a simpler way to iterate without managing index variables.

---

### 📄 `src/intermediate/arrays/three_dimensional_array.java`

**Purpose:** Teaches 3D arrays — like multiple layers of 2D tables stacked together.

**▶️ Run:** `java -cp out intermediate.arrays.three_dimensional_array`

```java
package intermediate.arrays;
public class three_dimensional_array {
    public static void main(String[]args){
        int nums[][][] = new int[3][4][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int[][] layer : nums) {
            for (int[] row : layer) {
                for (int val : row) System.out.print(val + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 4 | `int nums[][][] = new int[3][4][5];` | Creates a **3D array** — 3 layers, each containing a 4×5 grid. Think of it as 3 pages, each with a 4-row, 5-column table. Total cells: 3 × 4 × 5 = 60. |
| 6 | `nums.length` | **`.length`** is a property (not a method — no parentheses!) that returns the size of the array. For the outermost dimension, it's 3. |
| 7 | `nums[i].length` | Returns the length of the second dimension (4). |
| 8 | `nums[i][j].length` | Returns the length of the third dimension (5). |
| 14 | `for (int[][] layer : nums)` | Each `layer` is a 2D array (`int[][]`). |
| 15 | `for (int[] row : layer)` | Each `row` within a layer is a 1D array (`int[]`). |
| 16 | `for (int val : row)` | Each `val` is a single integer in the row. |

> 🔑 **Concept:** Multi-dimensional arrays can have as many dimensions as you need. Use `.length` to safely get the size of each dimension. The for-each loop handles nested arrays naturally.

---

### 📄 `src/intermediate/arrays/jagged_array.java`

**Purpose:** Teaches jagged arrays — 2D arrays where each row can have a different number of columns.

**▶️ Run:** `java -cp out intermediate.arrays.jagged_array`

```java
package intermediate.arrays;

public class jagged_array {
    public static void main(String[]args){
        int nums [][] = new int[3] [];
        nums[0] = new int [3];
        nums[1] = new int [6];
        nums[2] = new int [4];

        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]: nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 5 | `int nums[][] = new int[3][];` | Creates a 2D array with 3 rows, but **leaves the columns undefined** (notice `[]` with no number). Each row will be assigned its own size separately. |
| 6 | `nums[0] = new int[3];` | Row 0 gets 3 columns. |
| 7 | `nums[1] = new int[6];` | Row 1 gets 6 columns — different from row 0! |
| 8 | `nums[2] = new int[4];` | Row 2 gets 4 columns. This creates a "jagged" shape (not a perfect rectangle). |
| 11 | `nums[i].length` | This is crucial for jagged arrays — each row has a DIFFERENT length, so you must use `nums[i].length` (not a hardcoded number) to avoid going out of bounds. |

> 🔑 **Concept:** Jagged arrays have rows of different lengths. Always use `.length` to check each row's size individually. This is useful when data naturally has uneven rows (like a tournament bracket).

---

### 📄 `src/intermediate/arrays/Student_array_demo.java`

**Purpose:** Teaches how to create an array of **objects** (not just numbers) — storing Student records in an array.

**▶️ Run:** `java -cp out intermediate.arrays.Student_array_demo`

```java
package intermediate.arrays;
class Student{
    int rollno;
    String name;
    int marks;
}
public class Student_array_demo {
    public static void main(String[]args){

        Student s1 = new Student();
        s1.rollno =1;
        s1.name = "honey";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name = "Honvith";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno =3;
        s3.name = "gundu";
        s3.marks = 66;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0;i<students.length;i++){
            System.out.println(students[i].rollno +"."+ students[i].name +" :"+  students[i].marks);
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 2-6 | `class Student { ... }` | Defines a **class** (blueprint) called `Student` with three fields: `rollno` (int), `name` (String), `marks` (int). Each field is called an **instance variable** — every Student object will have its own copy. |
| 10 | `Student s1 = new Student();` | Creates a new `Student` object on the Heap using **`new`**. The variable `s1` holds a **reference** (memory address) pointing to this object. |
| 11-13 | `s1.rollno = 1;` etc. | The **dot operator `.`** accesses the fields of the object. `s1.rollno = 1` sets the rollno field of the s1 object to 1. |
| 24 | `Student students[] = new Student[3];` | Creates an array that holds 3 **Student references** (not actual Student data — just pointers to Student objects). |
| 25-27 | `students[0] = s1;` etc. | Puts references to the Student objects into the array slots. |
| 30 | `students[i].rollno` | First `students[i]` gets the Student reference at index `i`, then `.rollno` accesses that student's roll number. |

> 🔑 **Concept:** Arrays can hold objects, not just primitive numbers. An array of objects stores **references** (pointers) to objects on the Heap. Access object fields through the array using `array[index].field`.

---

### 📄 `src/intermediate/arrays/enchance_for_loop_for_array_string.java`

**Purpose:** Teaches the enhanced for-each loop with an array of Student objects — a cleaner way to iterate.

**▶️ Run:** `java -cp out intermediate.arrays.enchance_for_loop_for_array_string`

```java
package intermediate.arrays;

public class enchance_for_loop_for_array_string {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Honey";
        s1.rollno = 21;
        s1.marks = 76;

        Student s2 = new Student();
        s2.rollno = 22;
        s2.name = "Honvith";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 23;
        s3.name = "Gundu";
        s3.marks = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

       System.out.println("no"+" "+"name"+" "+"marks");
       System.out.println("￬"+ "    "+"￬"+"    "+"￬");
        for(Student stud : students){
            System.out.println(stud.rollno + " " + stud.name + ":" + stud.marks);
        }
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 5-23 | Creating students and array | Same pattern as `Student_array_demo.java` — creates 3 Student objects and puts them in an array. |
| 25-26 | Header printing | Prints a table header with column names and arrow symbols. |
| 27 | `for(Student stud : students){` | **Enhanced for-each loop**: `stud` takes the value of each Student object in the array, one at a time. No need for an index variable `i` — this is cleaner when you just need to go through every element. The loop reads as: "for each Student `stud` in the `students` array." |
| 28 | `stud.rollno + " " + stud.name + ":" + stud.marks` | Accesses each student's fields directly through the `stud` variable. |

> 🔑 **Concept:** The enhanced for-each loop (`for(Type var : array)`) is the simplest way to iterate through every element in an array. It's cleaner than a traditional `for` loop when you don't need the index number.

---

## 🟡 Module 11 — Methods

> **What you'll learn:** How to organize code into reusable blocks called methods — so you don't repeat the same code over and over.

---

### 📄 `src/intermediate/methods/Demo_class.java`

**Purpose:** Teaches void methods (that perform an action but don't return a value) and methods that return different values based on conditions.

**▶️ Run:** `java -cp out intermediate.methods.Demo_class`

```java
package intermediate.methods;
class computer{
    public void musicplaying(){
        System.out.println("Music playing!!!");
    }
    public String getflower(double cost){
      if(cost ==10)
        return "flowers";
      else if (cost <10 ) {
          return "Flower were 10 rupees";
      }
      else
          return "pay only 10 rupees";
    }
}
public class Demo_class {

    public static void main(String[]args){
        computer work = new computer();

        work.musicplaying();
        String flowers = work.getflower(49);
        System.out.println(flowers);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 2 | `class computer {` | Defines a class called `computer` — a blueprint with methods. |
| 3 | `public void musicplaying(){` | **`void`** means this method does NOT return any value — it just performs an action (printing). When called, it prints the message and that's it. |
| 6 | `public String getflower(double cost){` | This method **returns** a `String`. **`double cost`** is a **parameter** — a variable that receives a value when the method is called. The return type `String` means this method MUST send back a String value using `return`. |
| 7-13 | `if/else if/else` with `return` | **`return`** exits the method immediately and sends back a value. Each branch returns a different string based on the cost. When `cost == 10`, returns "flowers". When `cost < 10`, returns a different message. Otherwise, returns "pay only 10 rupees". |
| 19 | `computer work = new computer();` | Creates an object from the `computer` class. |
| 21 | `work.musicplaying();` | Calls the void method — it prints "Music playing!!!" but doesn't return anything. |
| 22 | `String flowers = work.getflower(49);` | Calls `getflower` with `49` as the argument. Since `49 != 10` and `49 is not < 10`, the `else` branch runs, returning `"pay only 10 rupees"`. This returned string is stored in `flowers`. |

> 🔑 **Concept:** Methods are reusable blocks of code. **`void`** methods perform actions without returning values. Methods with a return type (like `String`, `int`, `double`) MUST use `return` to send a value back to the caller. **Parameters** let you pass data into methods.

---

### 📄 `src/intermediate/methods/MethodOverloading.java`

**Purpose:** Teaches method overloading — having multiple methods with the SAME name but different parameters.

**▶️ Run:** `java -cp out intermediate.methods.MethodOverloading`

```java
package intermediate.methods;

class OverloadCalculator {
    public int add(int n1,int n2,int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public double add(double n1,double n2)
    {
        return n1 + n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args){

        OverloadCalculator cal = new OverloadCalculator();
        int r1 = cal.add(10, 20, 30);
        System.out.println("Addition of three numbers is: " + r1);
        int r2 = cal.add(10, 20);
        System.out.println("Addition of two numbers is: " + r2);
        double r3 = cal.add(10.2, 20.5);
        System.out.println("Addition of two decimal numbers is: " + r3);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 3 | `class OverloadCalculator {` | A class with THREE methods all named `add` — this is **method overloading**. |
| 4 | `public int add(int n1, int n2, int n3)` | Version 1: takes **3 int** parameters, returns their sum as an `int`. |
| 8 | `public int add(int n1, int n2)` | Version 2: takes **2 int** parameters. Same name `add`, but a different **method signature** (different number of parameters). |
| 12 | `public double add(double n1, double n2)` | Version 3: takes **2 double** parameters and returns a `double`. Different parameter types = different signature. |
| 21 | `cal.add(10, 20, 30)` | Java sees 3 `int` arguments and automatically picks Version 1. |
| 23 | `cal.add(10, 20)` | Java sees 2 `int` arguments and picks Version 2. |
| 25 | `cal.add(10.2, 20.5)` | Java sees 2 `double` arguments and picks Version 3. |

> 🔑 **Concept:** **Method overloading** means defining multiple methods with the same name but different parameter lists (different number of parameters, or different parameter types). Java automatically picks the right version based on the arguments you pass. This is a form of **compile-time polymorphism**.

---

## 🟡 Module 12 — Strings

> **What you'll learn:** How to manipulate text using String methods like concatenation, uppercase conversion, finding characters, and more.

---

### 📄 `src/intermediate/strings/Demo_string.java`

**Purpose:** Teaches common String methods — `concat`, `toUpperCase`, `length`, `charAt`, and `indexOf`.

**▶️ Run:** `java -cp out intermediate.strings.Demo_string`

```java
package intermediate.strings;

public class Demo_string {
    public static void main(String[]args){
        String name = "Honey";
        System.out.println( name.concat("Reddy"));
        System.out.println( name.concat("Reddy").toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('e'));
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 5 | `String name = "Honey";` | Creates a String with the text "Honey". Strings are **immutable** in Java — once created, the original string never changes. All methods return NEW strings. |
| 6 | `name.concat("Reddy")` | **`concat()`** joins another string to the end. Returns `"HoneyReddy"`. The original `name` is still `"Honey"` — it's unchanged! |
| 7 | `name.concat("Reddy").toUpperCase()` | **Method chaining**: first `concat` produces `"HoneyReddy"`, then **`toUpperCase()`** converts ALL characters to uppercase → `"HONEYREDDY"`. |
| 8 | `name.length()` | **`length()`** returns the number of characters in the string. `"Honey"` has 5 characters, so it returns `5`. (Note: for Strings it's `length()` with parentheses; for arrays it's `.length` without.) |
| 9 | `name.charAt(0)` | **`charAt(index)`** returns the single character at that position. Index 0 is the first character → `'H'`. |
| 10 | `name.indexOf('e')` | **`indexOf(char)`** returns the position (index) of the FIRST occurrence of that character. `'e'` first appears at index 3 in `"Honey"` (H=0, o=1, n=2, e=3). |

> 🔑 **Concept:** Strings are **immutable** — methods like `concat()` and `toUpperCase()` return NEW strings without changing the original. Common methods: `length()` for size, `charAt(i)` for a specific character, `indexOf(c)` for finding a character's position, `concat()` for joining, `toUpperCase()` for capitalization.

**⚠️ Common beginner mistakes:**
- Thinking `name.toUpperCase()` changes `name` — it doesn't! You need `name = name.toUpperCase()` to save the result.
- Confusing array's `.length` (property, no parentheses) with String's `.length()` (method, with parentheses).

---

## 🔴 Module 13 — OOP Basics (Classes & Objects)

> **What you'll learn:** The foundation of Object-Oriented Programming — how to create blueprints (classes), build objects from them, and understand how memory works (Stack vs Heap).

---

### 📄 `src/advanced/oop_basics/Classes.java`

**Purpose:** Teaches how to define a class with methods, create an object using `new`, and call methods on that object.

**▶️ Run:** `java -cp out advanced.oop_basics.Classes`

```java
package advanced.oop_basics;

class Calculator {

    public double add(double n1, double n2) {
        double r = n1 + n2;
        return r;
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }
}

public class Classes {

    public static void main(String[] args) {
        double num1 = 782.3;
        double num2 = 324.2;

        Calculator cal = new Calculator();

        double result = cal.add(num1, num2);
        System.out.println("Result of addition via Calculator object: " + result);

        double product = cal.multiply(10.5, 4.0);
        System.out.println("Result of multiplication via Calculator object: " + product);
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 3 | `class Calculator {` | Defines a **class** — a blueprint that describes what a Calculator can do. It's like an architectural plan: it defines the structure but doesn't build anything yet. No `public` keyword here because only ONE class per file can be `public` (and it must match the filename). |
| 5 | `public double add(double n1, double n2) {` | A method inside the Calculator class. **`double`** (before the method name) is the **return type** — it tells you this method sends back a `double` value. **`double n1, double n2`** are **parameters** — placeholder variables that receive values when the method is called. |
| 6 | `double r = n1 + n2;` | Adds the two parameters and stores the result in a local variable `r`. |
| 7 | `return r;` | **`return`** sends the value of `r` back to whoever called this method, and exits the method. |
| 10-12 | `public double multiply(...)` | Another method that multiplies two numbers. `return n1 * n2;` returns the result directly without a temporary variable. |
| 21 | `Calculator cal = new Calculator();` | This is the key OOP line: **`new Calculator()`** creates a new Calculator **object** (instance) in Heap memory. **`cal`** is a **reference variable** stored on the Stack — it holds the memory address of the object on the Heap. Think of `cal` as a remote control that points to the actual Calculator. |
| 23 | `double result = cal.add(num1, num2);` | The **dot operator `.`** calls the `add` method on the `cal` object. The values `782.3` and `324.2` are passed as arguments. The method runs, calculates `1106.5`, and returns it. The returned value is stored in `result`. |
| 26 | `cal.multiply(10.5, 4.0)` | Calls the `multiply` method on the same object. Returns `42.0`. |

> 🔑 **Concept:** A **class** is a blueprint; an **object** is a living instance created from that blueprint using `new`. Objects live in **Heap** memory, while reference variables (like `cal`) live on the **Stack** and point to the Heap. Methods define the behaviors an object can perform.

---

### 📄 `src/advanced/oop_basics/Stack_Heap_data.java`

**Purpose:** Teaches that multiple objects created from the same class are **independent** — each has its own copy of data in Heap memory.

**▶️ Run:** `java -cp out advanced.oop_basics.Stack_Heap_data`

```java
package advanced.oop_basics;

class computer{
    int num1 = 8;
    int num2 = 4;
public int add1(int num1,int num2){
    return num1+num2;
}
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class Stack_Heap_data {
    public static void main(String[]args){
       computer obj = new computer();
       computer obj1 = new computer();
       obj.add(10, 20);
       obj1.add1(8,4);
       System.out.println("Addition of two numbers is: " + obj.add(10, 20));
       System.out.println("num value are:"+ obj.add1(8,4));
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 3 | `class computer {` | Defines a class with two **instance variables** (`num1 = 8`, `num2 = 4`) and two methods. |
| 4-5 | `int num1 = 8; int num2 = 4;` | **Instance variables** — every `computer` object gets its OWN copy of these variables. Changing them in one object doesn't affect another. |
| 6 | `public int add1(int num1, int num2){` | Note: the parameter names `num1` and `num2` **shadow** (hide) the instance variables with the same names. Inside this method, `num1` refers to the parameter, not the instance variable. |
| 9 | `public int add(int n1, int n2){` | Uses different parameter names (`n1`, `n2`) to avoid shadowing. |
| 15 | `computer obj = new computer();` | Creates the FIRST computer object on the Heap. `obj` points to it. |
| 16 | `computer obj1 = new computer();` | Creates a SECOND, completely separate computer object. `obj1` points to this new one. Both objects have their own `num1` and `num2`. |
| 17 | `obj.add(10, 20);` | Calls `add` on `obj`, passing 10 and 20. Returns 30, but the result isn't stored anywhere (it's discarded). |
| 19 | `System.out.println(... + obj.add(10, 20));` | Calls `add` again and this time uses the returned value (30) in the print statement. |
| 20 | `obj.add1(8, 4)` | Calls `add1` with 8 and 4 as arguments. Returns `12`. |

> 🔑 **Concept:** Each `new` creates a separate, independent object on the Heap. Two objects from the same class have their own copies of instance variables — they don't share data. References on the Stack (`obj`, `obj1`) point to different objects on the Heap.

---

## 📖 Java Keyword & Term Glossary (A–Z)

> Every keyword and term used in this repository, alphabetized with a one-line definition.

| Keyword / Term | Definition |
| :--- | :--- |
| `boolean` | A primitive data type that holds only `true` or `false`. |
| `Boolean` | The wrapper class version of `boolean` — stores true/false as an object. |
| `break` | Exits the current loop or switch block immediately. |
| `byte` | An 8-bit signed integer type that holds values from -128 to 127. |
| `case` | Defines a specific value to match inside a `switch` statement. |
| `char` | A 16-bit data type that holds a single Unicode character (e.g., `'A'`, `'₹'`). |
| `class` | A blueprint that defines the structure (variables) and behavior (methods) of objects. |
| `close()` | A method that releases system resources (like closing a Scanner's input stream). |
| `concat()` | A String method that joins another string to the end, returning a new string. |
| `continue` | Skips the rest of the current loop iteration and jumps to the next one. |
| `default` | The fallback branch in a switch block, executed when no `case` matches. |
| `do` | Starts a do-while loop where the body runs at least once before checking the condition. |
| `double` | A 64-bit floating-point data type for high-precision decimal numbers. |
| `else` | An alternative code block that runs when the `if` condition is false. |
| `else if` | Adds additional conditions to check in an if-else chain. |
| `final` | Makes a variable constant — its value cannot be changed after assignment. |
| `float` | A 32-bit floating-point data type for decimal numbers (requires `f` suffix). |
| `for` | A loop with initialization, condition, and update in one line — ideal for counting. |
| `if` | Executes a block of code only when a specified boolean condition is true. |
| `import` | Brings classes from other packages into the current file so you can use them. |
| `int` | A 32-bit signed integer type for whole numbers (approx. -2 billion to +2 billion). |
| `isEmpty()` | A String method that returns `true` if the string has zero characters. |
| `length` | A property of arrays that returns the number of elements (no parentheses). |
| `length()` | A String method that returns the number of characters (with parentheses). |
| `main` | The special method name that the JVM looks for as the program's starting point. |
| `Math` | A built-in utility class with static methods for math operations (sqrt, pow, abs, etc.). |
| `new` | Allocates memory on the Heap for a new object or array. |
| `nextBoolean()` | Scanner method that reads a `true` or `false` value from input. |
| `nextDouble()` | Scanner method that reads a 64-bit decimal number from input. |
| `nextFloat()` | Scanner method that reads a 32-bit decimal number from input. |
| `nextInt()` | Scanner method that reads a 32-bit integer from input. |
| `nextLine()` | Scanner method that reads an entire line of text from input. |
| `package` | Declares the namespace (folder) this file belongs to, preventing name conflicts. |
| `print()` | Outputs text to the console WITHOUT moving to a new line. |
| `printf()` | Formatted printing with placeholders like `%d` (int), `%f` (decimal), `%s` (string). |
| `println()` | Outputs text to the console AND moves to a new line. |
| `public` | An access modifier that makes a class, method, or variable accessible from anywhere. |
| `Random` | A class from `java.util` for generating pseudo-random numbers. |
| `return` | Exits the current method and optionally sends a value back to the caller. |
| `Scanner` | A class from `java.util` that reads user input from the keyboard or other streams. |
| `static` | Associates a method/field with the class itself — callable without creating an object. |
| `String` | A reference type that represents a sequence of characters (text), enclosed in `"..."`. |
| `switch` | A multi-way branch that matches a variable against specific `case` values. |
| `System.in` | The standard input stream — typically the keyboard. |
| `System.out` | The standard output stream — typically the terminal/console screen. |
| `this` | A reference keyword pointing to the current object instance. |
| `void` | Specifies that a method does not return any value. |
| `while` | A loop that checks its condition before each iteration; runs zero or more times. |

---

## 🤝 Contributing & License

### How to Contribute
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/new-example`).
3. Commit your changes (`git commit -m "Add new example with line-by-line guide"`).
4. Push to the branch (`git push origin feature/new-example`).
5. Open a Pull Request.

### License
This project is open source and available under the [MIT License](LICENSE).

---

> **🎉 You made it!** If you've read through all of this, you've covered the core fundamentals of Java. Keep coding, keep experimenting, and don't be afraid to make mistakes — that's how every great programmer learned! Happy coding! ☕🚀
