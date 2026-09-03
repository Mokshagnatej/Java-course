package intermediate.practice_projects;
import java.util.Scanner;

/**
 * ============================================================================
 * TOPIC: Practical Mini-Project — Geometry Area & Perimeter Calculator
 * FILE: calculaterectangle.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Prompt the user for the width and height dimensions of a rectangle, apply the
 * mathematical geometry formula: $\text{Area} = \text{width} \times \text{height}$,
 * and compute the result with double-precision decimal accuracy.
 *
 * 🧠 MENTAL MODEL & PROBLEM SOLVING WORKFLOW:
 *   1. **Input Phase**: Read `width` and `height` from keyboard as `double`.
 *   2. **Processing Phase**: Compute $\text{area} = \text{width} \times \text{height}$
 *      and $\text{perimeter} = 2 \times (\text{width} + \text{height})$.
 *   3. **Output Phase**: Present clean results with appropriate measurement units ($cm^2$).
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `Scanner scanner = new Scanner(System.in);` -> Connects to standard input.
 * - `double width = scanner.nextDouble();`       -> Reads width as double.
 * - `double height = scanner.nextDouble();`      -> Reads height as double.
 * - `area = width * height;`                    -> Performs multiplication.
 * - `System.out.printf(...)`                     -> Formats floating point values to 2 decimals.
 *
 * 📊 DRY RUN TRACE (width = 12.5, height = 4.0):
 * | Variable  | Value | Unit |
 * | :-------- | :---- | :--- |
 * | `width`   | 12.5  | cm   |
 * | `height`  | 4.0   | cm   |
 * | `area`    | 50.0  | cm²  |
 * | `perimeter` | 33.0 | cm   |
 * ============================================================================
 */
public class calculaterectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt and read dimensions
        System.out.print("Enter the width of the rectangle (in cm): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle (in cm): ");
        double height = scanner.nextDouble();

        // Step 2: Calculate Geometric Area and Perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Step 3: Display Results
        System.out.println("\n--- Rectangle Metrics ---");
        System.out.printf("Area: %.2f sq.cm%n", area);
        System.out.printf("Perimeter: %.2f cm%n", perimeter);

        // Step 4: Close scanner
        scanner.close();
    }
}
