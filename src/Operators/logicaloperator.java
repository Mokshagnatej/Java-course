package operators;

/**
 * ============================================================================
 * TOPIC: Java Logical Operators (&&, ||, !) & Short-Circuit Evaluation
 * FILE: logicaloperator.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Combine multiple boolean conditions using Logical AND (`&&`), Logical OR (`||`),
 * and Logical NOT (`!`), and understand how short-circuit evaluation saves execution time.
 *
 * 🧠 MENTAL MODEL & TRUTH TABLES:
 *
 * 1. Logical AND (`&&`): Returns `true` ONLY if BOTH conditions are true.
 *    • `true && true`   -> `true`
 *    • `true && false`  -> `false`
 *    • `false && ...`   -> `false` (Short-circuited! Right side is never evaluated).
 *
 * 2. Logical OR (`||`): Returns `true` if AT LEAST ONE condition is true.
 *    • `true || ...`    -> `true`  (Short-circuited! Right side is never evaluated).
 *    • `false || true`  -> `true`
 *    • `false || false` -> `false`
 *
 * 3. Logical NOT (`!`): Inverts the boolean value.
 *    • `!true`  -> `false`
 *    • `!false` -> `true`
 *
 * 🔍 DRY RUN TRACE:
 * Given: `a = 19`, `b = 23`, `c = 23.4`, `d = 32.3`
 * Expression: `(a < b || c > d)`
 *   • Left condition: `a < b` -> `19 < 23` -> `true`
 *   • Because left condition of `||` is `true`, result is immediately `true` (Short-circuit)!
 * ============================================================================
 */
public class logicaloperator {

    public static void main(String[] args) {
        int a = 19;
        int b = 23;

        double c = 23.4;
        double d = 32.3;

        // 1. Logical OR (||) example
        // (19 < 23 is true) || (23.4 > 32.3 is false) => true
        boolean orResult = (a < b || c > d);
        System.out.println("(a < b || c > d): " + orResult); // true

        // 2. Logical AND (&&) example
        // (19 < 23 is true) && (23.4 > 32.3 is false) => false
        boolean andResult = (a < b && c > d);
        System.out.println("(a < b && c > d): " + andResult); // false

        // 3. Logical NOT (!) example
        // !(19 < 23) => !true => false
        boolean notResult = !(a < b);
        System.out.println("!(a < b): " + notResult); // false
    }
}