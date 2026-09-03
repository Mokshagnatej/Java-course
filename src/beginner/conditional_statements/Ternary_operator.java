package beginner.conditional_statements;
/**
 * ============================================================================
 * TOPIC: The Java Ternary Operator (? :) — Inline Decision Making
 * FILE: Ternary_operator.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Use the ternary operator to check if an integer number is Even or Odd in a single,
 * elegant line of code instead of writing a verbose 5-line `if-else` block.
 *
 * 🧠 MENTAL MODEL & TERNARY SYNTAX:
 * - Syntax: `variable = (condition) ? valueIfTrue : valueIfFalse;`
 * - How it evaluates:
 *   1. Evaluate `(condition)`.
 *   2. If `true`, returns `valueIfTrue`.
 *   3. If `false`, returns `valueIfFalse`.
 *
 * 🔍 EVEN / ODD LOGIC (Modulo % 2):
 * - If `h % 2 == 0`: The number divides by 2 with 0 remainder -> **Even**.
 * - Otherwise: -> **Odd**.
 *
 * 📊 DRY RUN TRACE (h = 3):
 * | Step | Expression | Math Evaluation | Boolean Result | Selected Branch | Assigned Result |
 * | :--- | :--------- | :-------------- | :------------- | :-------------- | :-------------- |
 * | 1    | `h % 2 == 0` | `3 % 2` = 1 -> `1 == 0` | `false` | Right of `:` | `"odd"` |
 * ============================================================================
 */
public class Ternary_operator {

    public static void main(String[] args) {
        int h = 3;

        // Ternary operator checking even/odd parity
        String parity = (h % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + h + " is: " + parity); // The number 3 is: odd

        // Example 2: Checking pass/fail threshold
        int marks = 75;
        String examResult = (marks >= 40) ? "Passed" : "Failed";
        System.out.println("Exam status: " + examResult); // Passed
    }
}
