# 📂 Source Directory Overview (`src/`)

> **The Engine Room of the Java Course.** Structured into a 3-tier progressive learning architecture: **Beginner**, **Intermediate**, and **Advanced**.

> ⚡ **Fast Access**: [🏠 Main Course README](../Readme.Md) &nbsp;|&nbsp; [📑 Module Directory](../Readme.Md#-fast-access-navigation--all-module-readmes) &nbsp;|&nbsp; [⚡ Quick Start & Run Commands](../Readme.Md#-quick-start--execution-commands)

---

## 📑 3-Tier Progressive Architecture

```
src/
├── beginner/             # Core language fundamentals & basic syntax
├── intermediate/         # Data structures, methods & mini-projects
└── advanced/             # OOP deep-dive, memory layout & architecture
```

---

## 🟢 Tier 1: Beginner Modules (`src/beginner/`)

Foundational building blocks of the Java language.

| Module | Directory | Topics Covered | Guide Link |
| :--- | :--- | :--- | :--- |
| **01. Getting Started** | [`beginner/getting_started/`](beginner/getting_started/) | `class`, `main()`, JVM execution flow, basic print | [📖 Guide](beginner/getting_started/README.md) |
| **02. Input & Output** | [`beginner/input_output/`](beginner/input_output/) | `Scanner`, token parsing, buffer flushing, `printf` | [📖 Guide](beginner/input_output/README.md) |
| **03. Variables & Types** | [`beginner/variables/`](beginner/variables/) | 8 primitives, sizes, String concatenation | [📖 Guide](beginner/variables/README.md) |
| **04. Type Conversion** | [`beginner/type_conversion/`](beginner/type_conversion/) | Widening, narrowing `(int)`, expression promotion, overflow | [📖 Guide](beginner/type_conversion/README.md) |
| **05. Operators** | [`beginner/operators/`](beginner/operators/) | Arithmetic, `++i` vs `i++`, relational, logical `&&`/`\|\|`, OrderDemo | [📖 Guide](beginner/operators/README.md) |
| **06. Math & Random** | [`beginner/math_and_random/`](beginner/math_and_random/) | `Math.pow`, `sqrt`, rounding, `java.util.Random` | [📖 Guide](beginner/math_and_random/README.md) |
| **07. Conditionals** | [`beginner/conditional_statements/`](beginner/conditional_statements/) | `if`, `else if`, switch, ternary `? :`, arrow switch | [📖 Guide](beginner/conditional_statements/README.md) |
| **08. Loops** | [`beginner/loops/`](beginner/loops/) | `for`, `while`, `do-while`, `break`, `continue` | [📖 Guide](beginner/loops/README.md) |

---

## 🟡 Tier 2: Intermediate Modules (`src/intermediate/`)

Practical projects, linear memory data structures, and procedural abstractions.

| Module | Directory | Topics Covered | Guide Link |
| :--- | :--- | :--- | :--- |
| **09. Practice Projects** | [`intermediate/practice_projects/`](intermediate/practice_projects/) | Shopping cart simulation, rectangle geometry, multiplication tables | [📖 Guide](intermediate/practice_projects/README.md) |
| **10. Arrays** | [`intermediate/arrays/`](intermediate/arrays/) | 1D, 2D matrix, 3D cubes, jagged arrays, student object array | [📖 Guide](intermediate/arrays/README.md) |
| **11. Methods** | [`intermediate/methods/`](intermediate/methods/) | Method definitions, returns, parameter passing, overloading | [📖 Guide](intermediate/methods/README.md) |
| **12. Strings** | [`intermediate/strings/`](intermediate/strings/) | String constant pool, immutability, `StringBuilder` *(roadmap)* | [📖 Guide](intermediate/strings/README.md) |
| **13. Exception Handling** | [`intermediate/exception_handling/`](intermediate/exception_handling/) | `try-catch-finally`, checked/unchecked exceptions *(roadmap)* | [📖 Guide](intermediate/exception_handling/README.md) |

---

## 🔴 Tier 3: Advanced Modules (`src/advanced/`)

Object-Oriented Programming deep-dive, enterprise patterns, and runtime memory architecture.

| Module | Directory | Topics Covered | Guide Link |
| :--- | :--- | :--- | :--- |
| **14. OOP Basics & Memory** | [`advanced/oop_basics/`](advanced/oop_basics/) | `class`, `new`, instance methods, Heap allocation, Stack frames | [📖 Guide](advanced/oop_basics/README.md) |
| **15. OOP Pillars** | [`advanced/oop_pillars/`](advanced/oop_pillars/) | Encapsulation, inheritance, polymorphism, abstraction *(roadmap)* | [📖 Guide](advanced/oop_pillars/README.md) |
| **16. Collections** | [`advanced/collections/`](advanced/collections/) | `List`, `Set`, `Map`, `Queue`, iterators & Streams *(roadmap)* | [📖 Guide](advanced/collections/README.md) |
| **17. Generics** | [`advanced/generics/`](advanced/generics/) | Type parameters, bounded wildcards, type erasure *(roadmap)* | [📖 Guide](advanced/generics/README.md) |
| **18. File I/O** | [`advanced/file_io/`](advanced/file_io/) | Byte/character streams, NIO.2 `Files`, serialization *(roadmap)* | [📖 Guide](advanced/file_io/README.md) |
| **19. Multithreading** | [`advanced/multithreading/`](advanced/multithreading/) | `Thread`, `Runnable`, synchronization, `ExecutorService` *(roadmap)* | [📖 Guide](advanced/multithreading/README.md) |
| **20. Capstone Projects** | [`advanced/advanced_projects/`](advanced/advanced_projects/) | Real-world CLI engines and complete systems *(roadmap)* | [📖 Guide](advanced/advanced_projects/README.md) |

---

## ⚡ Global Compilation & Execution

### 1. Build All Programs
Compile all Java source files across all three tiers into the `out/` build folder:

```bash
javac -d out $(find src -name "*.java")
```

### 2. Run Sample Programs

```bash
# Beginner Tier
java -cp out beginner.getting_started.startingstructure
java -cp out beginner.math_and_random.math

# Intermediate Tier
java -cp out intermediate.arrays.Student_array_demo
java -cp out intermediate.practice_projects.shoppingcart

# Advanced Tier
java -cp out advanced.oop_basics.Classes
java -cp out advanced.oop_basics.Stack_Heap_data
```

---

## 🧭 Fast Navigation

| 🏠 Course Master | 🟢 Beginner Modules | 🟡 Intermediate Modules | 🔴 Advanced Modules |
| :---: | :---: | :---: | :---: |
| [Main Readme](../Readme.Md) | [Getting Started](beginner/getting_started/README.md)<br>[Input / Output](beginner/input_output/README.md)<br>[Variables](beginner/variables/README.md)<br>[Conversions](beginner/type_conversion/README.md)<br>[Operators](beginner/operators/README.md)<br>[Math & Random](beginner/math_and_random/README.md)<br>[Conditionals](beginner/conditional_statements/README.md)<br>[Loops](beginner/loops/README.md) | [Practice Projects](intermediate/practice_projects/README.md)<br>[Arrays](intermediate/arrays/README.md)<br>[Methods](intermediate/methods/README.md)<br>[Strings](intermediate/strings/README.md)<br>[Exceptions](intermediate/exception_handling/README.md) | [OOP Basics](advanced/oop_basics/README.md)<br>[OOP Pillars](advanced/oop_pillars/README.md)<br>[Collections](advanced/collections/README.md)<br>[Generics](advanced/generics/README.md)<br>[File I/O](advanced/file_io/README.md)<br>[Multithreading](advanced/multithreading/README.md)<br>[Capstone Projects](advanced/advanced_projects/README.md) |

