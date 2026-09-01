# 🔧 Module 12: Methods & Method Overloading

> **Mastering Reusable Code Blocks in Java.** Learn how to define, invoke, and overload methods to write modular, maintainable, and DRY (Don't Repeat Yourself) code.

---

## 📑 Table of Contents
1. [What You'll Learn](#1-what-youll-learn)
2. [Core Concept: What is a Method?](#2-core-concept-what-is-a-method)
3. [Real-World Analogy](#3-real-world-analogy)
4. [Method Anatomy & Syntax Breakdown](#4-method-anatomy--syntax-breakdown)
5. [Void Methods vs Return Methods](#5-void-methods-vs-return-methods)
6. [Method Invocation & Call Stack Flow](#6-method-invocation--call-stack-flow)
7. [Method Overloading (Compile-Time Polymorphism)](#7-method-overloading-compile-time-polymorphism)
8. [Overloading Resolution Rules](#8-overloading-resolution-rules)
9. [Line-by-Line File Guides](#9-line-by-line-file-guides)
10. [Common Pitfalls & Traps](#10-common-pitfalls--traps)

---

## 1. What You'll Learn

After completing this module, you will be able to:

- [ ] Define methods with proper return types, parameters, and access modifiers
- [ ] Distinguish between `void` methods and value-returning methods
- [ ] Understand the method call stack and how control flow jumps between methods
- [ ] Use method overloading to create multiple methods with the same name but different parameter lists
- [ ] Avoid common method design mistakes

---

## 2. Core Concept: What is a Method?

A **method** is a named, reusable block of code that performs a specific task. Methods let you:
- **Avoid repetition**: Write the logic once, call it many times.
- **Organize code**: Break complex programs into smaller, manageable pieces.
- **Improve readability**: Method names describe what the code does.

```java
// Defining a method:
public int add(int n1, int n2) {
    return n1 + n2;
}

// Calling (invoking) the method:
int result = add(10, 20);  // result = 30
```

---

## 3. Real-World Analogy

Think of a method like a **vending machine**:

```
   ┌─────────────────────────────────┐
   │       VENDING MACHINE           │
   │       (Method Name: add)        │
   │                                 │
   │  INSERT: Coin 1 (n1 = 10)  ──► │
   │  INSERT: Coin 2 (n2 = 20)  ──► │  ← Parameters (Input)
   │                                 │
   │  ⚙️ Internal Process:           │  ← Method Body (Hidden)
   │     n1 + n2 = 30               │
   │                                 │
   │  DISPENSE: 30              ◄── │  ← Return Value (Output)
   └─────────────────────────────────┘
```

- **Parameters** = what you insert (inputs)
- **Method Body** = the internal mechanism (logic)
- **Return Value** = what comes out (output)
- A `void` method is like pressing a button that plays music — it does something but doesn't hand anything back to you.

---

## 4. Method Anatomy & Syntax Breakdown

```java
// AccessModifier  ReturnType  MethodName  (ParameterList)
   public          String      getflower   (double cost)   {
       // Method Body: executable statements
       if (cost == 10)
           return "flowers";       // Returns a String value to the caller
       else
           return "pay only 10 rupees";
   }
```

| Component | Purpose | Examples |
| :--- | :--- | :--- |
| **Access Modifier** | Controls who can call this method | `public`, `private`, `protected` |
| **Return Type** | Data type of the value sent back to the caller | `int`, `double`, `String`, `void` (nothing) |
| **Method Name** | Identifier used to invoke/call the method | `add`, `getflower`, `musicplaying` |
| **Parameters** | Input variables received from the caller | `(int n1, int n2)`, `(double cost)` |
| **Method Body** | The actual logic enclosed in `{ }` | Statements, expressions, `return` |
| **Return Statement** | Sends a value back and exits the method | `return n1 + n2;` |

---

## 5. Void Methods vs Return Methods

### `void` Methods — Perform an action, return nothing:
```java
public void musicplaying() {
    System.out.println("Music playing!!!");
    // No return statement needed (implicitly returns nothing)
}

// Calling it:
work.musicplaying();  // Prints to console, no value captured
```

### Value-Returning Methods — Perform an action AND send back a result:
```java
public String getflower(double cost) {
    if (cost == 10) return "flowers";
    else return "pay only 10 rupees";
}

// Calling it:
String result = work.getflower(49);  // result = "pay only 10 rupees"
```

### Comparison Table:

| Feature | `void` Method | Return Method |
| :--- | :--- | :--- |
| **Return Type** | `void` | `int`, `double`, `String`, etc. |
| **Has `return` statement?** | Optional (no value) | **Required** (must return matching type) |
| **Can be used in expressions?** | ❌ No | ✅ Yes (`int x = add(1,2)`) |
| **Best for** | Actions (printing, logging, modifying state) | Computations (calculations, lookups) |

---

## 6. Method Invocation & Call Stack Flow

When a method is called, the JVM pushes a new **stack frame** onto the call stack. When the method returns, its frame is popped off.

```mermaid
sequenceDiagram
    participant Main as main() frame
    participant Method as add() frame

    Main->>Method: Call add(10, 20)
    Note over Method: n1 = 10, n2 = 20
    Note over Method: Compute r = 30
    Method-->>Main: return 30
    Note over Main: result = 30
```

### Stack Frame Visualization:

```mermaid
flowchart TD
    subgraph STACK["Call Stack (grows upward)"]
        direction BT
        F1["main() frame\n• work (ref) → @Heap\n• flowers = 'pay only 10 rupees'"]
        F2["getflower() frame\n• cost = 49\n• return 'pay only 10 rupees'"]
    end
    F1 --> F2

    style STACK fill:#E8EAF6,stroke:#3F51B5
    style F2 fill:#FFF9C4,stroke:#FBC02D
```

> When `getflower()` finishes, its frame is **destroyed** and control returns to `main()`.

---

## 7. Method Overloading (Compile-Time Polymorphism)

**Method overloading** means defining multiple methods with the **same name** but **different parameter lists**. The compiler decides which version to call based on the arguments you pass.

```java
class Computer {
    // Version 1: Three int parameters
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Version 2: Two int parameters
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Version 3: Two double parameters
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}
```

```mermaid
flowchart TD
    CALL["cal.add(...)"] --> CHECK{"How many args? What types?"}
    CHECK -- "3 ints: add(10, 20, 30)" --> V1["Version 1: add(int, int, int)\nReturns 60"]
    CHECK -- "2 ints: add(10, 20)" --> V2["Version 2: add(int, int)\nReturns 30"]
    CHECK -- "2 doubles: add(10.2, 20.5)" --> V3["Version 3: add(double, double)\nReturns 30.7"]

    style CALL fill:#E1F5FE,stroke:#03A9F4
    style CHECK fill:#FFF9C4,stroke:#FBC02D
    style V1 fill:#C8E6C9,stroke:#4CAF50
    style V2 fill:#C8E6C9,stroke:#4CAF50
    style V3 fill:#C8E6C9,stroke:#4CAF50
```

---

## 8. Overloading Resolution Rules

The compiler matches the method call to the correct overloaded version by checking:

| Rule # | Criteria | ✅ Valid Overload | ❌ NOT Valid |
| :--- | :--- | :--- | :--- |
| 1 | **Different number of parameters** | `add(int, int)` vs `add(int, int, int)` | — |
| 2 | **Different parameter types** | `add(int, int)` vs `add(double, double)` | — |
| 3 | **Different parameter order** | `process(int, String)` vs `process(String, int)` | — |
| 4 | **Return type alone** | — | `int add(int a)` vs `double add(int a)` ❌ |

> [!IMPORTANT]
> **Return type alone does NOT distinguish overloaded methods.** The compiler only looks at the method name + parameter list (called the **method signature**) to resolve which method to call.

---

## 9. Line-by-Line File Guides

| File | Concepts Covered | Expected Output | Command to Run |
| :--- | :--- | :--- | :--- |
| [`Demo_class.java`](file:///Users/honeyreddy/Documents/Java%20course/src/methods/Demo_class.java) | `void` method (`musicplaying`), value-returning method (`getflower`), conditional returns, object creation | `Music playing!!!`<br>`pay only 10 rupees` | `java -cp out methods.Demo_class` |
| [`MethodOverloading.java`](file:///Users/honeyreddy/Documents/Java%20course/src/methods/MethodOverloading.java) | Three overloaded `add()` methods with different parameter counts and types | `Addition of three numbers is: 60`<br>`Addition of two numbers is: 30`<br>`Addition of two decimal numbers is: 30.7` | `java -cp out methods.MethodOverloading` |

### Dry-Run Trace: `Demo_class.java`

```java
computer work = new computer();
work.musicplaying();
String flowers = work.getflower(49);
System.out.println(flowers);
```

| Step | Action | Stack State | Output |
| :--- | :--- | :--- | :--- |
| 1 | `new computer()` → allocate on Heap | `work → @HeapObj` | — |
| 2 | Call `musicplaying()` → void method | Push `musicplaying()` frame | `Music playing!!!` |
| 3 | `musicplaying()` returns → pop frame | Back in `main()` | — |
| 4 | Call `getflower(49)` → cost = 49 | Push `getflower()` frame | — |
| 5 | `cost == 10`? → `false` | — | — |
| 6 | `cost < 10`? → `false` | — | — |
| 7 | `else` → return `"pay only 10 rupees"` | Pop `getflower()` frame | — |
| 8 | `flowers = "pay only 10 rupees"` | `flowers → "pay only 10 rupees"` | — |
| 9 | `println(flowers)` | — | `pay only 10 rupees` |

### Dry-Run Trace: `MethodOverloading.java`

| Step | Method Called | Arguments | Resolved Version | Return Value | Output |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | `cal.add(10, 20, 30)` | 3 ints | `add(int, int, int)` | `60` | `Addition of three numbers is: 60` |
| 2 | `cal.add(10, 20)` | 2 ints | `add(int, int)` | `30` | `Addition of two numbers is: 30` |
| 3 | `cal.add(10.2, 20.5)` | 2 doubles | `add(double, double)` | `30.7` | `Addition of two decimal numbers is: 30.7` |

---

## 10. Common Pitfalls & Traps

> [!CAUTION]
> ### 1. Forgetting to `return` in All Code Paths
> If a method has a return type, **every possible execution path** must end with a `return`:
> ```java
> public String getGrade(int score) {
>     if (score >= 90) return "A";
>     else if (score >= 80) return "B";
>     // ❌ Compile error! What if score < 80? No return statement!
> }
> ```

> [!WARNING]
> ### 2. Confusing Overloading with Overriding
> - **Overloading** = Same class, same method name, **different parameters** (compile-time)
> - **Overriding** = Subclass redefines a parent method with the **same signature** (runtime)
> These are completely different OOP concepts!

> [!WARNING]
> ### 3. Ignoring the Return Value
> If a method returns a value, you should capture it:
> ```java
> cal.add(10, 20);  // ⚠️ The result 30 is computed but thrown away!
> int result = cal.add(10, 20);  // ✅ Capture and use the result
> ```
