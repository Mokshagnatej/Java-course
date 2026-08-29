package operators;

/**
 * ============================================================================
 * TOPIC: Prefix vs Postfix Increment (++) & Decrement (--) Operators
 * FILE: increment.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand the critical difference between:
 *   1. Postfix Increment / Decrement: `m++`, `m--` (Use first, modify later)
 *   2. Prefix Increment / Decrement: `++m`, `--m` (Modify first, use later)
 *
 * 🧠 MENTAL MODEL:
 * - `m++` (Postfix): "Give me the current value of `m` right now for this statement,
 *   then increment `m` by 1 immediately after."
 * - `++m` (Prefix): "Increment `m` by 1 right now, then give me the newly updated value."
 *
 * 🔍 DETAILED COMPARISON TABLE:
 * | Syntax  | Name              | Timing of Change               | Example (`x = 5; y = ...`) | Resulting `y` | Resulting `x` |
 * | :------ | :---------------- | :----------------------------- | :------------------------- | :------------ | :------------ |
 * | `x++`   | Postfix Increment | Value used, then x increases   | `y = x++;`                 | 5             | 6             |
 * | `++x`   | Prefix Increment  | x increases, then value used   | `y = ++x;`                 | 6             | 6             |
 * | `x--`   | Postfix Decrement | Value used, then x decreases   | `y = x--;`                 | 5             | 4             |
 * | `--x`   | Prefix Decrement  | x decreases, then value used   | `y = --x;`                 | 4             | 4             |
 *
 * ============================================================================
 */
public class increment {

    public static void main(String[] args) {
        // --- 1. Basic In-Place Increment & Decrement ---
        int m = 5;
        System.out.println("Initial m: " + m); // 5

        m++; // Increments m to 6
        System.out.println("After m++: " + m); // 6

        m--; // Decrements m back to 5
        System.out.println("After m--: " + m); // 5

        // --- 2. Postfix in Assignment vs Expression ---
        int a = 10;
        int postResult = a++; // Assigns 10 to postResult, then 'a' becomes 11
        System.out.println("Postfix Assignment: postResult = " + postResult + ", a = " + a); // postResult=10, a=11

        // --- 3. Prefix in Assignment vs Expression ---
        int b = 10;
        int preResult = ++b; // Increments 'b' to 11 first, then assigns 11 to preResult
        System.out.println("Prefix Assignment: preResult = " + preResult + ", b = " + b); // preResult=11, b=11
    }
}
