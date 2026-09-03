package beginner.conditional_statements;
/**
 * ============================================================================
 * TOPIC: Two-Way Decision Making (if - else)
 * FILE: ifelse_statement.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Compare two integer variables `x` and `y`, evaluate whether `x` is strictly greater
 * than `y`, and execute one of two mutually exclusive code blocks.
 *
 * 🧠 MENTAL MODEL:
 * The `if-else` construct creates a binary fork in the execution road:
 *   • If `condition` is `true`  -> Execute `if` block.
 *   • If `condition` is `false` -> Execute `else` block.
 * Exactly ONE of the two blocks is guaranteed to execute.
 *
 * 🔍 DRY RUN TRACE (x = 12, y = 30):
 * | Step | Expression | Sub-Evaluation | Boolean Result | Action Taken |
 * | :--- | :--------- | :------------- | :------------- | :----------- |
 * | 1    | `x > y`    | `12 > 30`      | `false`        | Skip `if` block, execute `else` block |
 * | 2    | Output     | -              | -              | Prints: `x is less than y` |
 * ============================================================================
 */
public class ifelse_statement {

    public static void main(String[] args) {
        int x = 12;
        int y = 30;

        // Check if x is strictly greater than y
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than y");
        }
    }
}