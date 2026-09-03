package beginner.input_output;
import java.util.Scanner;

/**
 * ============================================================================
 * TOPIC: Standard Terminal Input / Output & Multi-Type Reading
 * FILE: ScannerInput.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Prompt and read three distinct data types from user interaction:
 *   1. Text string (Name)
 *   2. Integer number (Age)
 *   3. Floating-point decimal (Height)
 * and generate a clean formatted summary message.
 *
 * 🧠 MENTAL MODEL & THE 4-STEP INPUT PATTERN:
 *   Step 1: Create a `Scanner` bound to keyboard stream `System.in`.
 *   Step 2: Print a helpful prompt using `System.out.print()` (keeps cursor on same line).
 *   Step 3: Read the input using the matching scanner method (`nextLine`, `nextInt`, `nextDouble`).
 *   Step 4: Close the scanner stream (`scanner.close()`) to avoid resource leaks.
 *
 * 🔍 SCANNER METHODS CHEATSHEET:
 * | Method            | Return Type | Description                                 |
 * | :---------------- | :---------- | :------------------------------------------ |
 * | `nextLine()`      | `String`    | Reads entire line including spaces up to \n |
 * | `next()`          | `String`    | Reads a single word token (stops at space)  |
 * | `nextInt()`       | `int`       | Reads next 32-bit integer token             |
 * | `nextDouble()`    | `double`    | Reads next 64-bit floating point token      |
 * | `nextBoolean()`   | `boolean`   | Reads next boolean ('true' / 'false')       |
 *
 * 📊 SAMPLE INTERACTIVE SESSION TRACE:
 * Enter your name: Honey
 * Enter your age: 22
 * Your height (in feet): 5.9
 * Console Output: The person name is Honey, his age is 22 years, and his height is 5.9 feet.
 * ============================================================================
 */
public class ScannerInput {

    public static void main(String[] args) {
        // Step 1: Open scanner attached to standard input stream
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Step 3: Read Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Step 4: Read Double input
        System.out.print("Your height (in feet): ");
        double height = scanner.nextDouble();

        // Step 5: Display combined output
        System.out.println("The person name is " + name + ", his age is " + age + " years, and his height is " + height + " feet.");

        // Step 6: Close scanner
        scanner.close();
    }
}
