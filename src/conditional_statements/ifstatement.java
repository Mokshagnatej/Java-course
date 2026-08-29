package conditional_statements;

import java.util.Scanner;

/**
 * ============================================================================
 * TOPIC: Java If-Else Decision Branching & String/Age Validation
 * FILE: ifstatement.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Prompt the user for name, age, and student status. Evaluate three distinct
 * decision groups using `if`, `else if`, and `else` constructs:
 *   1. Name validation (empty string check)
 *   2. Age tier classification (Senior Citizen >=60, Adult >=18, Minor <18)
 *   3. Student boolean confirmation
 *
 * 🧠 MENTAL MODEL & DECISION TREES:
 * - An `if (condition)` executes its code block ONLY if the condition is `true`.
 * - In an `if - else if - else` ladder, conditions are checked from TOP to BOTTOM.
 *   As soon as ONE condition evaluates to `true`, its block runs and all remaining
 *   branches are skipped!
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `if (name.isEmpty())` : Calls String method `isEmpty()` to check if length == 0.
 * - `else if (age >= 18)` : Only evaluated if `age < 60`. Ensures 18-59 is an adult.
 * - `if (isStudent)`      : Direct boolean check without needing `== true`.
 *
 * 📊 DRY RUN TRACE (Input: name="Honey", age=22, isStudent=true):
 * | Group | Condition Evaluated     | Result | Branch Executed        | Output Printed             |
 * | :---- | :---------------------- | :----- | :--------------------- | :------------------------- |
 * | 1     | `name.isEmpty()`        | false  | `else`                 | "Hello Honey!"             |
 * | 2     | `age >= 60` (22 >= 60)  | false  | Next check             | -                          |
 * | 2     | `age >= 18` (22 >= 18)  | true   | `else if (age >= 18)`  | "your adult"               |
 * | 3     | `isStudent`             | true   | `if (isStudent)`       | "Your are a student!"      |
 * ============================================================================
 */
public class ifstatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Step 1: Gather User Inputs ---
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // --- Group 1: String Validation ---
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }

        // --- Group 2: Multi-Branch Age Categorization ---
        if (age >= 60) {
            System.out.println("your a senior citizen");
        } else if (age >= 18) {
            System.out.println("your adult");
        } else {
            System.out.println("your not an adult 👦🏻");
        }

        // --- Group 3: Direct Boolean Flag Branching ---
        if (isStudent) {
            System.out.println("Your are a student!");
        } else {
            System.out.println("Your not a student!");
        }

        scanner.close();
    }
}
