package oop;

/**
 * ============================================================================
 * TOPIC: Object-Oriented Programming (OOP) — Classes, Objects & Methods
 * FILE: Classes.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand how to define a blueprint `class` (Calculator), instantiate an
 * `object` in Heap memory using `new`, and invoke instance methods with parameters
 * to return computed values.
 *
 * 🧠 MENTAL MODEL:
 * 1. **Class (Blueprint)**: Like an architectural floor plan for a house.
 *    Defines what properties and behaviors exist.
 * 2. **Object (Instance)**: The physical house constructed from the blueprint.
 *    Lives in Heap memory at a specific address.
 * 3. **Method (Behavior)**: An action the object can perform.
 *
 * 🔍 MEMORY LAYOUT (Stack vs Heap):
 * ```
 *   STACK MEMORY                         HEAP MEMORY
 *  +-----------------------+            +-------------------------+
 *  | main() frame:         |            | Calculator Object:      |
 *  |  - num1 = 782.3       |            |  - Methods: add()       |
 *  |  - num2 = 324.2       |            |  - Address: @0x7a8b     |
 *  |  - cal (ref) -------->|----------->|                         |
 *  |  - result = 1106.5    |            +-------------------------+
 *  +-----------------------+
 * ```
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `class Calculator`: Blueprint containing the `add` method.
 * - `public double add(double n1, double n2)`:
 *     • `public`: Accessible by caller.
 *     • `double`: Returns a double-precision float to the caller.
 *     • `double n1, double n2`: Parameter variables holding inputs.
 * - `Calculator cal = new Calculator();`:
 *     • `new Calculator()`: Allocates memory on the Heap for a new object.
 *     • `cal`: Reference variable on the Stack pointing to the new object.
 * - `cal.add(num1, num2)`: Jumps to `add()` method, passes values, returns sum.
 *
 * 📊 DRY RUN TRACE:
 * | Step | Line of Code                      | Stack Variable State | Heap State | Console Output |
 * | :--- | :-------------------------------- | :------------------- | :--------- | :------------- |
 * | 1    | `double num1 = 782.3;`            | `num1 = 782.3`       | -          | (none)         |
 * | 2    | `double num2 = 324.2;`            | `num2 = 324.2`       | -          | (none)         |
 * | 3    | `Calculator cal = new ...`        | `cal -> @HeapObj`    | Allocates  | (none)         |
 * | 4    | `cal.add(782.3, 324.2)`           | Calculates sum       | -          | (none)         |
 * | 5    | `result = 1106.5`                 | `result = 1106.5`    | -          | (none)         |
 * | 6    | `System.out.println(result)`      | -                    | -          | `1106.5`       |
 * ============================================================================
 */

// 1. Blueprint Class
class Calculator {

    // Method definition: Takes two double arguments, returns their sum
    public double add(double n1, double n2) {
        double r = n1 + n2;
        return r; // Sends value back to caller
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }
}

// 2. Driver / Runner Class containing the main method
public class Classes {

    public static void main(String[] args) {
        double num1 = 782.3;
        double num2 = 324.2;

        // Instantiate object from blueprint
        Calculator cal = new Calculator();

        // Invoke method on object and capture returned value
        double result = cal.add(num1, num2);
        System.out.println("Result of addition via Calculator object: " + result);

        double product = cal.multiply(10.5, 4.0);
        System.out.println("Result of multiplication via Calculator object: " + product);
    }
}
