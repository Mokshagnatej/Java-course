package type_conversions;

/**
 * ============================================================================
 * TOPIC: Explicit Narrowing Casting (Float to Integer Truncation)
 * FILE: Floatconversion.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Convert a floating-point decimal (`float`) into a whole number (`int`) using
 * explicit type casting `(int)`, and understand why decimal truncation occurs.
 *
 * 🧠 MENTAL MODEL & NARROWING CASTING:
 * - **Widening (Implicit)**: Small type -> Larger type (e.g. `int` -> `double`). Safe, automatic.
 * - **Narrowing (Explicit)**: Large type -> Smaller type (e.g. `float` -> `int`). Requires cast `(int)`.
 * - When casting `float` (32-bit floating point) to `int` (32-bit integer), Java **truncates**
 *   everything after the decimal point (it does NOT round!).
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - Line 32: `float a = 5.6f;`
 *     • `f` suffix tells compiler this is a 32-bit single-precision float (default decimal is double).
 * - Line 35: `int b = (int) a;`
 *     • Explicit cast `(int)` forces the float value `5.6` to be converted to integer `5`.
 *     • The `.6` is permanently discarded (truncated towards zero).
 * - Line 38: `System.out.println(b);`
 *     • Prints `5`.
 *
 * 📊 DRY RUN TRACE:
 * | Variable | Original Type | Original Value | Cast Target | Resulting Value | Reason / Action |
 * | :------- | :------------ | :------------- | :---------- | :-------------- | :-------------- |
 * | `a`      | `float`       | `5.6f`         | -           | `5.6`           | Initialized float |
 * | `b`      | `int`         | -              | `(int) a`   | `5`             | Decimal `.6` truncated |
 * ============================================================================
 */
public class Floatconversion {

    public static void main(String[] args) {
        // Step 1: Declare a float with 'f' literal suffix
        float a = 5.6f;

        // Step 2: Explicitly cast float to int (truncates decimal portion)
        int b = (int) a;

        // Step 3: Print converted integer value
        System.out.println("Original float: " + a);
        System.out.println("Truncated integer after (int) cast: " + b);
    }
}