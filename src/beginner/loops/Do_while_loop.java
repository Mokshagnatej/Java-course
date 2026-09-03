package beginner.loops;
/**
 * ============================================================================
 * TOPIC: Java Do-While Loop — Post-Condition Guaranteed Execution
 * FILE: Do_while_loop.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Demonstrate that a `do-while` loop executes its body **at least once**, even when
 * the termination condition is `false` from the very start.
 *
 * 🧠 MENTAL MODEL:
 * - `for` and `while` are **Entry-Controlled Loops**: Condition checked first.
 * - `do-while` is an **Exit-Controlled Loop**: Body runs first, condition checked at the end.
 *
 * 🔍 CODE WALKTHROUGH:
 * 1. Variable `i` is initialized to `6`.
 * 2. The `do { ... }` block executes unconditionally:
 *    • Prints `6`.
 *    • Increments `i` from `6` to `7`.
 * 3. The `while (i <= 5)` condition is tested:
 *    • `7 <= 5` evaluates to `false`.
 * 4. Loop terminates after exactly 1 execution.
 *
 * 📊 COMPARISON OF MINIMUM EXECUTIONS:
 * | Loop Type   | Min Executions (Condition initially False) | Syntax Semicolon Needed? |
 * | :---------- | :------------------------------------------ | :----------------------- |
 * | `for`       | 0                                           | No                       |
 * | `while`     | 0                                           | No                       |
 * | `do-while`  | **1**                                       | **Yes (`while(...);`)**  |
 * ============================================================================
 */
public class Do_while_loop {

    public static void main(String[] args) {
        int i = 6;

        // Guaranteed to execute at least once:
        do {
            System.out.println("Current value of i: " + i); // Prints 6
            i++; // i becomes 7
        } while (i <= 5); // 7 <= 5 is false -> Loop exits

        System.out.println("Loop terminated. Final i = " + i);
    }
}
