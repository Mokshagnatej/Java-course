package beginner.operators;
/**
 * ============================================================================
 * TOPIC: Operator Precedence & Order of Operations (PEMDAS / BODMAS)
 * FILE: OrderDemo.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand how Java evaluates complex mathematical expressions containing
 * parentheses, multiplication, division, addition, and subtraction.
 *
 * 🧠 MENTAL MODEL & PRECEDENCE HIERARCHY:
 * Java follows strict operator precedence rules:
 *   1. P / B : Parentheses `()` - Highest precedence, evaluated first.
 *   2. M / D : Multiplication `*`, Division `/`, Modulo `%` - Evaluated Left to Right.
 *   3. A / S : Addition `+`, Subtraction `-` - Evaluated Left to Right.
 *
 * ⚠️ CRITICAL GOTCHA (Integer Division):
 * In Java, when dividing two integers (e.g. `6 / 5`), integer division occurs:
 * the fractional part is truncated, resulting in `1` instead of `1.2`.
 *
 * 🔍 STEP-BY-STEP EVALUATION OF: `10 + 3 * 2 / (8 - 3)`
 *   • Step 1 (Parentheses): `(8 - 3)` evaluates to `5`.
 *       -> Expression becomes: `10 + 3 * 2 / 5`
 *   • Step 2 (Multiplication): `3 * 2` evaluates to `6`.
 *       -> Expression becomes: `10 + 6 / 5`
 *   • Step 3 (Integer Division): `6 / 5` evaluates to `1` (integer truncated).
 *       -> Expression becomes: `10 + 1`
 *   • Step 4 (Addition): `10 + 1` evaluates to `11`.
 *   • Step 5 (Widening to double): Assigned to `double result`, becomes `11.0`.
 *
 * 📊 DRY RUN TRACE:
 * | Sub-Expression | Operation         | Intermediate Value | Remaining Expression |
 * | :------------- | :---------------- | :----------------- | :------------------- |
 * | (8 - 3)        | Subtraction (in ())| 5                  | 10 + 3 * 2 / 5       |
 * | 3 * 2          | Multiplication    | 6                  | 10 + 6 / 5           |
 * | 6 / 5          | Integer Division  | 1                  | 10 + 1               |
 * | 10 + 1         | Addition          | 11                 | 11.0 (as double)     |
 * ============================================================================
 */
public class OrderDemo {

    public static void main(String[] args) {
        // Evaluate expression following precedence rules
        double result = 10 + 3 * 2 / (8 - 3);

        // Print final evaluated result to the console
        System.out.println("The result is: " + result); // Outputs: The result is: 11.0
    }
}