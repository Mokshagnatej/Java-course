package conditional_statements;

/**
 * ============================================================================
 * TOPIC: Multi-Condition Decision Ladders (if - else if - else) vs Sequential 'if's
 * FILE: if_else_if.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand the critical difference between:
 *   1. Chained `if - else if` (Mutually exclusive: only the FIRST true condition executes).
 *   2. Independent `if` statements (Each is evaluated separately regardless of prior checks).
 *
 * 🧠 MENTAL MODEL:
 * - Chained Ladder:
 *     `if (C1) { ... } else if (C2) { ... }`
 *     If `C1` is true, Java executes C1's block and SKIPS C2 entirely.
 * - Independent Ifs:
 *     `if (C1) { ... }`
 *     `if (C2) { ... }`
 *     Both `C1` and `C2` are independently evaluated.
 *
 * 🔍 DRY RUN TRACE (h = 49, b = 234, c = 134.0):
 * | Block | Condition | Evaluation | Result | Output Generated |
 * | :---- | :-------- | :--------- | :----- | :--------------- |
 * | 1     | `h > b`   | `49 > 234` | false  | (none)           |
 * | 1     | `b > c`   | `234 > 134`| true   | "gundu", "come in" |
 * | 2     | `c < h`   | `134 < 49` | false  | (none)           |
 * | 3     | Always    | -          | -      | "complete"       |
 * ============================================================================
 */
public class if_else_if {

    public static void main(String[] args) {
        int h = 49;
        int b = 234;
        double c = 134.0;

        // Block 1: Chained ladder (mutually exclusive)
        if (h > b) {
            System.out.println("honey");
            System.out.println("come in");
        } else if (b > c) {
            System.out.println("gundu");
            System.out.println("come in");
        }

        // Block 2: Independent 'if' check
        if (c < h) {
            System.out.println("complete");
        }

        // Block 3: Unconditional sequential statement
        System.out.println("complete");
    }
}
