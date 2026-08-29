package math_and_random;

/**
 * ============================================================================
 * TOPIC: The Java Math Class & Mathematical Functions
 * FILE: math.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Utilize Java's built-in `java.lang.Math` class to access mathematical constants
 * (PI, Euler's number E) and perform standard calculations like square roots,
 * powers, absolute values, rounding, and finding extremes.
 *
 * 🧠 MENTAL MODEL:
 * - `Math` is a **utility class** in the default `java.lang` package (automatically imported).
 * - All methods and constants in `Math` are `static`, meaning you call them directly
 *   on the class name: `Math.methodName()`.
 *
 * 🔍 MATH METHODS CHEATSHEET:
 * | Method | Input Parameters | Return Type | Description |
 * | :--- | :--- | :--- | :--- |
 * | `Math.PI` | Constant | `double` | Ratio of circle circumference to diameter (~3.14159) |
 * | `Math.E` | Constant | `double` | Base of natural logarithms (~2.71828) |
 * | `Math.pow(a, b)` | `double a, double b` | `double` | Calculates $a^b$ ($a$ raised to power $b$) |
 * | `Math.sqrt(x)` | `double x` | `double` | Calculates $\sqrt{x}$ (Square root) |
 * | `Math.abs(x)` | `int / double` | same type | Returns positive magnitude $|x|$ |
 * | `Math.max(a, b)`| `a, b` | same type | Returns the larger of two numbers |
 * | `Math.min(a, b)`| `a, b` | same type | Returns the smaller of two numbers |
 * | `Math.round(x)`| `double / float` | `long / int` | Rounds to nearest whole integer |
 * ============================================================================
 */
public class math {

    public static void main(String[] args) {
        // 1. Fundamental Constants
        System.out.println("--- 1. Math Constants ---");
        System.out.println("Math.PI : " + Math.PI); // ~3.141592653589793
        System.out.println("Math.E  : " + Math.E);  // ~2.718281828459045

        // 2. Power and Roots
        System.out.println("\n--- 2. Powers and Roots ---");
        double power = Math.pow(2, 5); // 2^5 = 32.0
        System.out.println("Math.pow(2, 5)   : " + power);

        double root = Math.sqrt(64.0);  // sqrt(64) = 8.0
        System.out.println("Math.sqrt(64.0)  : " + root);

        // 3. Absolute Value (Magnitude)
        System.out.println("\n--- 3. Absolute Values & Extremes ---");
        int negativeNumber = -45;
        System.out.println("Math.abs(-45)    : " + Math.abs(negativeNumber)); // 45

        // 4. Max and Min
        System.out.println("Math.max(25, 80) : " + Math.max(25, 80)); // 80
        System.out.println("Math.min(25, 80) : " + Math.min(25, 80)); // 25

        // 5. Rounding, Ceiling, Floor
        System.out.println("\n--- 4. Rounding Utilities ---");
        System.out.println("Math.round(5.6)  : " + Math.round(5.6)); // 6
        System.out.println("Math.floor(5.9)  : " + Math.floor(5.9)); // 5.0
        System.out.println("Math.ceil(5.1)   : " + Math.ceil(5.1));  // 6.0
    }
}
