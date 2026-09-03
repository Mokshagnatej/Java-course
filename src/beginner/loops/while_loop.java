package beginner.loops;
/**
 * ============================================================================
 * TOPIC: Java While Loop & Nested Pre-Condition Iteration
 * FILE: while_loop.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Print a name hierarchy repeating 5 times using a `while` loop, with an inner
 * `while` loop generating a sub-token on each repetition.
 *
 * 🧠 MENTAL MODEL & WHILE LOOP ANATOMY:
 * - A `while (condition)` loop checks the condition **BEFORE** running the loop body.
 * - If condition is initially `false`, the body executes **0 times**.
 * - **Crucial Rule**: The loop counter variable MUST be manually updated inside the loop
 *   body (`i++`), or the loop will run infinitely!
 *
 * 🔍 CODE STEP-BY-STEP:
 * 1. Initialize counter `int i = 1;` outside the loop.
 * 2. Check `while (i <= 5)`.
 * 3. Inside, initialize inner counter `int j = 1;`.
 * 4. Run inner loop, increment `j++`.
 * 5. Increment outer counter `i++`.
 *
 * 📊 DRY RUN TRACE (First 2 Iterations):
 * | Outer `i` | Condition `i <= 5` | Print Statement | Inner `j` | Condition `j <= 1` | Inner Print | Next `i` |
 * | :-------- | :----------------- | :-------------- | :-------- | :----------------- | :---------- | :------- |
 * | 1         | true               | "Honey 1"       | 1         | true               | "Reddy 1"   | 2        |
 * | 2         | true               | "Honey 2"       | 1         | true               | "Reddy 1"   | 3        |
 * ============================================================================
 */
public class while_loop {

    public static void main(String[] args) {
        int i = 1; // Step 1: Outer counter initialization

        while (i <= 5) { // Step 2: Outer condition check
            System.out.println("Honey " + i);

            int j = 1; // Step 3: Inner counter initialization
            while (j <= 1) { // Step 4: Inner condition check
                System.out.println("  Reddy " + j);
                j++; // Step 5: Inner increment
            }

            i++; // Step 6: Outer increment
        }
    }
}
