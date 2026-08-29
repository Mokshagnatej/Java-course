package operators;

/**
 * ============================================================================
 * TOPIC: Java Relational / Comparison Operators
 * FILE: Relationaloperator.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Compare two numeric values and produce a boolean result (`true` or `false`)
 * using comparison operators: `<`, `>`, `==`, `!=`, `<=`, `>=`.
 *
 * 🧠 MENTAL MODEL:
 * Relational operators evaluate relationships between two expressions:
 *   • `<`  : Less than (e.g. `10 < 40` is `true`)
 *   • `>`  : Greater than (e.g. `10 > 40` is `false`)
 *   • `==` : Equality check (e.g. `10 == 40` is `false`)
 *   • `!=` : Not Equal to (e.g. `10 != 40` is `true`)
 *   • `<=` : Less than or equal to (e.g. `10 <= 40` is `true`)
 *   • `>=` : Greater than or equal to (e.g. `10 >= 40` is `false`)
 *
 * ⚠️ COMMON TRAP (Assignment vs Equality):
 * - Single equals `=` is for **assignment** (`x = 5`).
 * - Double equals `==` is for **equality comparison** (`x == 5`).
 *
 * ============================================================================
 */
public class Relationaloperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 40;

        System.out.println("Comparing a = " + a + " and b = " + b + ":");

        // 1. Less than (<)
        System.out.println("a < b  (10 < 40)  : " + (a < b));  // true

        // 2. Greater than (>)
        System.out.println("a > b  (10 > 40)  : " + (a > b));  // false

        // 3. Equal to (==)
        System.out.println("a == b (10 == 40) : " + (a == b)); // false

        // 4. Not Equal to (!=)
        System.out.println("a != b (10 != 40) : " + (a != b)); // true

        // 5. Less than or equal to (<=)
        System.out.println("a <= b (10 <= 40) : " + (a <= b)); // true

        // 6. Greater than or equal to (>=)
        System.out.println("a >= b (10 >= 40) : " + (a >= b)); // false
    }
}