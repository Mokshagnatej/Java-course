package beginner.conditional_statements;
/**
 * ============================================================================
 * TOPIC: The Java Switch Statement (Traditional & Modern Enhanced Switch)
 * FILE: switch_operator.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Map a numeric day code (1 to 7) to its corresponding weekday name ("Monday" through
 * "Sunday"), handling invalid inputs gracefully using `default`.
 *
 * 🧠 MENTAL MODEL & HOW SWITCH WORKS:
 * - A `switch` expression jumps directly (using a jump table / hash) to the matching
 *   `case` label matching the switch variable.
 * - Supported types: `byte`, `short`, `char`, `int`, `String`, and `enum`.
 *
 * ⚠️ THE CRITICAL 'break;' RULE (Fall-Through):
 * In traditional switch, if you omit `break;`, execution will "fall through" into the
 * subsequent case statements regardless of whether their condition matches!
 *
 * 🔍 MODERN JAVA (Java 14+ Enhanced Arrow Switch):
 * Modern Java allows `case 1 -> System.out.println("Monday");` which eliminates fall-through
 * and does NOT require `break;`.
 *
 * 📊 DRY RUN TRACE (n = 3):
 * | Evaluation | Matched Case | Action Executed | Hit Break? | Next Step |
 * | :--------- | :----------- | :-------------- | :--------- | :-------- |
 * | Match `n=3`| `case 3:`    | Prints "Wednesday" | Yes (`break;`) | Exit switch block immediately |
 * ============================================================================
 */
public class switch_operator {

    public static void main(String[] args) {
        int n = 3;

        // --- Traditional Switch with 'break' ---
        System.out.println("--- 1. Traditional Switch Statement ---");
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // --- Modern Java 14+ Enhanced Arrow Switch ---
        System.out.println("\n--- 2. Modern Enhanced Arrow Switch ---");
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
