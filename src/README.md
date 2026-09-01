# 📂 Source Directory Overview (`src/`)

> **The Engine Room of the Java Course.** This directory contains 12 modular topic packages and standalone root driver files designed to take you from core syntax to object-oriented programming.

---

## 📑 Module Directory Navigation

| Directory / Package | Module Name | Primary Focus | Guide Link |
| :--- | :--- | :--- | :--- |
| [`src/basics/`](file:///Users/honeyreddy/Documents/Java%20course/src/basics/) | **01. Basics** | Program structure, `main()` method, JVM flow, BODMAS | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/basics/README.md) |
| [`src/variables/`](file:///Users/honeyreddy/Documents/Java%20course/src/variables/) | **02. Variables** | 8 primitives, sizes, String concatenation, Stack vs Heap | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/variables/README.md) |
| [`src/type_conversions/`](file:///Users/honeyreddy/Documents/Java%20course/src/type_conversions/) | **03. Type Conversions** | Widening, narrowing `(int)`, expression promotions, overflow | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/type_conversions/README.md) |
| [`src/Operators/`](file:///Users/honeyreddy/Documents/Java%20course/src/Operators/) | **04. Operators** | Arithmetic, `++i` vs `i++`, `&&`, `\|\|`, compound updates | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/Operators/README.md) |
| [`src/input_output/`](file:///Users/honeyreddy/Documents/Java%20course/src/input_output/) | **05. Input & Output** | `Scanner`, token parsing, buffer flush, `printf` | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/input_output/README.md) |
| [`src/conditional_statements/`](file:///Users/honeyreddy/Documents/Java%20course/src/conditional_statements/) | **06. Conditionals** | `if`, `else if`, `switch`, ternary `? :`, arrow switch | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/conditional_statements/README.md) |
| [`src/Loops/`](file:///Users/honeyreddy/Documents/Java%20course/src/Loops/) | **07. Loops** | `for`, `while`, `do-while`, `break`, `continue` | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/Loops/README.md) |
| [`src/math_and_random/`](file:///Users/honeyreddy/Documents/Java%20course/src/math_and_random/) | **08. Math & Random** | `Math.pow`, `sqrt`, rounding, `java.util.Random` | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/math_and_random/README.md) |
| [`src/oop/`](file:///Users/honeyreddy/Documents/Java%20course/src/oop/) | **09. OOP Kickstart** | `class`, `new`, instance methods, Heap allocation | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/oop/README.md) |
| [`src/practice_programs/`](file:///Users/honeyreddy/Documents/Java%20course/src/practice_programs/) | **10. Practice Programs** | Shopping cart, rectangle geometry, multiplication tables | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/practice_programs/README.md) |
| [`src/Arrays/`](file:///Users/honeyreddy/Documents/Java%20course/src/Arrays/) | **11. Arrays** | 1D, 2D matrix, 3D cubes, jagged arrays, for-each loop | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/Arrays/README.md) |
| [`src/methods/`](file:///Users/honeyreddy/Documents/Java%20course/src/methods/) | **12. Methods** | Return types, parameter passing, method overloading | [📖 Read Guide](file:///Users/honeyreddy/Documents/Java%20course/src/methods/README.md) |

---

## 🏛️ Root-Level Java Files (Default Package)

These two files sit directly in `src/` to demonstrate default-package execution and direct OOP instantiation:

### 1. [`classes.java`](file:///Users/honeyreddy/Documents/Java%20course/src/classes.java)
- **Goal**: Demonstrates defining a helper class (`calculator`) with an `add()` method and calling it from a driver `main()` method.
- **Run Command**:
  ```bash
  java -cp out classes
  ```
- **Expected Output**:
  ```text
  Result of addition via Calculator object: 1106.5
  ```

### 2. [`Stack_Heap_data.java`](file:///file:///Users/honeyreddy/Documents/Java%20course/src/Stack_Heap_data.java)
- **Goal**: Demonstrates creating multiple object instances (`obj`, `obj1`) of the same `computer` class in Heap memory, each maintaining independent execution context.
- **Run Command**:
  ```bash
  java -cp out Stack_Heap_data
  ```
- **Expected Output**:
  ```text
  Addition of two numbers is: 30
  num value are:12
  ```

---

## ⚡ Global Build Command

Compile all Java source files across all packages into the `out/` build folder:

```bash
javac -d out $(find src -name "*.java")
```
