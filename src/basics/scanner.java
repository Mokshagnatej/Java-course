package basics;

import java.util.Scanner;

/**
 * ============================================================================
 * TOPIC: Basic User Input via Scanner Class
 * FILE: scanner.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Prompt the user for their name (String), age (int), and height (double), read
 * the inputs from the terminal console using `Scanner`, and display a formatted summary.
 *
 * 🧠 MENTAL MODEL & HOW TO BUILD:
 * 1. Import `java.util.Scanner` to bring the input tool into our file.
 * 2. Instantiate a `Scanner` connected to `System.in` (standard keyboard input stream).
 * 3. Use specific methods based on data type:
 *    • `scanner.nextLine()` -> Reads a line of text (String) until user presses Enter.
 *    • `scanner.nextInt()`  -> Reads an integer value.
 *    • `scanner.nextDouble()` -> Reads a floating-point number.
 * 4. Close the scanner with `scanner.close()` to release the operating system stream resource.
 *
 * ⚠️ THE SCANNER NEWLINE GOTCHA:
 * When you call `nextInt()` or `nextDouble()`, Scanner reads only the number digits,
 * leaving the newline character `\n` (from pressing Enter) sitting in the input buffer.
 * If you call `nextLine()` immediately afterwards, it will instantly consume that leftover `\n`
 * and return an empty string!
 * 💡 Fix: Place an extra `scanner.nextLine()` right after `nextInt()` or `nextDouble()` to clear the buffer.
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `Scanner scanner = new Scanner(System.in);` -> Creates scanner instance linked to keyboard input.
 * - `String name = scanner.nextLine();`         -> Captures full line for the user's name.
 * - `int age = scanner.nextInt();`             -> Reads integer token for age.
 * - `double height = scanner.nextDouble();`     -> Reads decimal token for height.
 * - `scanner.close();`                         -> Closes scanner to prevent resource leaks.
 *
 * ============================================================================
 */
public class scanner {

    public static void main(String[] args) {
        // Step 1: Initialize Scanner connected to keyboard input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt and read full text string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Step 3: Prompt and read integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Step 4: Prompt and read decimal number
        System.out.print("Your height (in feet): ");
        double height = scanner.nextDouble();

        // Step 5: Output formatted summary string
        System.out.println("The person name is " + name + ", age is " + age + " years, and height is " + height + " feet.");

        // Step 6: Close scanner resource
        scanner.close();
    }
}