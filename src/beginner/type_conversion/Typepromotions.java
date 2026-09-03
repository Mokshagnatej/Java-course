package beginner.type_conversion;
/**
 * ============================================================================
 * TOPIC: Java Automatic Type Promotion in Expressions
 * FILE: Typepromotions.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand why multiplying two `byte` variables cannot be stored directly into a `byte`
 * without explicit casting, and how Java automatically promotes smaller types to `int`.
 *
 * 🧠 MENTAL MODEL & PROMOTION RULES:
 * 1. Whenever Java evaluates an arithmetic expression (`+`, `-`, `*`, `/`), all operands
 *    smaller than `int` (`byte`, `short`, `char`) are **automatically promoted to `int`** (32-bit).
 * 2. Why? To prevent arithmetic overflow during intermediate calculations.
 * 3. Rule hierarchy during evaluation:
 *    • If any operand is `double`, the entire expression becomes `double`.
 *    • Else if any operand is `float`, the entire expression becomes `float`.
 *    • Else if any operand is `long`, the entire expression becomes `long`.
 *    • Otherwise, all operands are promoted to `int`.
 *
 * 🔍 CODE WALKTHROUGH & COMPILATION TRAP:
 * ```java
 * byte a = 10;
 * byte b = 30;
 * // byte c = a * b; // ❌ COMPILE ERROR: a * b promotes to int (300). Cannot put int into byte!
 * int result = a * b; // ✅ VALID: result can hold 32-bit integer.
 * byte c = (byte)(a * b); // ✅ VALID WITH CAST (but note: 300 overflows byte max 127!).
 * ```
 *
 * 📊 DRY RUN TRACE:
 * | Variable | Data Type | Value | After Promotion |
 * | :------- | :-------- | :---- | :-------------- |
 * | `a`      | `byte`    | 10    | `int` 10        |
 * | `b`      | `byte`    | 30    | `int` 30        |
 * | `a * b`  | `int`     | 300   | Evaluated as 32-bit int |
 * | `result` | `int`     | 300   | Stored cleanly in 32-bit `result` |
 * ============================================================================
 */
public class Typepromotions {

    public static void main(String[] args) {
        // Step 1: Declare two byte primitives (range: -128 to 127)
        byte a = 10;
        byte b = 30;

        // Step 2: In expression 'a * b', both 'a' and 'b' are promoted to int.
        // Result of 10 * 30 is 300 (which exceeds byte limit 127).
        int result = a * b;

        // Step 3: Output the computed product
        System.out.println("Result of byte multiplication promoted to int: " + result);
    }
}