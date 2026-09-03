package beginner.loops;
/**
 * ============================================================================
 * TOPIC: Java For Loop & Nested Loop Iteration
 * FILE: For_loop.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Iterate through a 5-day schedule (Days 1 to 5) and for each day, print the day
 * header and the associated task/schedule items using a nested for-loop.
 *
 * 🧠 MENTAL MODEL & THE 3-PART FOR LOOP:
 * `for (initialization; terminationCondition; updateStep) { body }`
 *   1. **Initialization** (`int i = 1`): Runs once before loop starts.
 *   2. **Condition** (`i <= 5`): Checked before EVERY iteration. If false, loop terminates.
 *   3. **Body**: Code inside `{}` executes.
 *   4. **Update** (`i++`): Increments counter, then jumps back to Step 2.
 *
 * 🔁 NESTED LOOPS MENTAL MODEL (Clock Analogy):
 * - Outer loop `i` is like the **Hour hand** (moves slowly, 1 tick per full cycle of inner).
 * - Inner loop `j` is like the **Minute hand** (runs through all its iterations for every single tick of outer).
 *
 * 📊 DRY RUN TRACE (First 2 Days):
 * | Outer `i` | Condition `i <= 5` | Print Day | Inner `j` | Condition `j <= 1` | Print Task | Inner Update | Outer Update |
 * | :-------- | :----------------- | :-------- | :-------- | :----------------- | :--------- | :----------- | :----------- |
 * | 1         | true               | "Day 1"   | 1         | true               | "1 Monday" | j becomes 2  | i becomes 2  |
 * | 2         | true               | "Day 2"   | 1         | true               | "1 Monday" | j becomes 2  | i becomes 3  |
 * ============================================================================
 */
public class For_loop {

    public static void main(String[] args) {
        // Outer Loop: Iterates through 5 days
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);

            // Inner Loop: Iterates through tasks within each day
            for (int j = 1; j <= 1; j++) {
                System.out.println("  Task " + j + ": Review Java Notes");
            }
        }
    }
}
