package practice_programs;

/**
 * ============================================================================
 * TOPIC: Practical Program — Dynamic Multiplication Table Generator
 * FILE: for_loop.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Generate a complete, formatted multiplication mathematical table for the
 * number `17` from multiplier `1` to `10` using a `for` loop.
 *
 * 🧠 MENTAL MODEL & LOOP LOGIC:
 *   • We have a fixed base: `number = 17`.
 *   • We have a multiplier `i` that increments from `1` up to `10` (`i <= 10`).
 *   • At each step $i$:
 *       $$\text{result} = \text{number} \times i$$
 *       Print: `17 x i = result`
 *
 * 📊 DRY RUN TRACE:
 * | Iteration `i` | Condition `i <= 10` | Computation `17 * i` | Output Line Printed | Next `i` |
 * | :------------ | :------------------ | :------------------- | :------------------ | :------- |
 * | 1             | true                | 17 * 1 = 17          | 17 x 1 = 17         | 2        |
 * | 2             | true                | 17 * 2 = 34          | 17 x 2 = 34         | 3        |
 * | 3             | true                | 17 * 3 = 51          | 17 x 3 = 51         | 4        |
 * | ...           | ...                 | ...                  | ...                 | ...      |
 * | 10            | true                | 17 * 10 = 170        | 17 x 10 = 170       | 11       |
 * | 11            | false               | -                    | (Loop terminates)   | -        |
 * ============================================================================
 */
public class for_loop {

    public static void main(String[] args) {
        int number = 17;

        System.out.println("--- Multiplication Table for " + number + " ---");

        // Loop runs 10 times from i = 1 to i = 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%2d x %2d = %3d%n", number, i, result);
        }
    }
}
