package type_conversions;

/**
 * ============================================================================
 * TOPIC: Explicit Type Casting & Byte Overflow Mechanics
 * FILE: byteconversion.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand how to cast an `int` (32 bits) down into a `byte` (8 bits), and explore
 * what happens when the integer value fits within byte range vs when it overflows.
 *
 * 🧠 MENTAL MODEL & 8-BIT SIGNED INTEGER OVERFLOW:
 * - A `byte` is 8 bits signed two's complement, with a range of `-128` to `+127`.
 * - If `int a = 12;`, 12 fits within [-128, 127], so `(byte) a` is cleanly `12`.
 * - If `int overflow = 130;`:
 *     • Binary of 130: `...00000000 10000010`
 *     • The lower 8 bits extracted: `10000010`
 *     • Most significant bit is `1` (negative in 2's complement) -> evaluates to `-126`.
 *     • Formula: `Value = (value + 128) % 256 - 128`
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `int a = 12;`       -> 32-bit integer holding 12.
 * - `byte k = (byte) a;` -> Extracts lower 8 bits. Since 12 is in [-128, 127], k = 12.
 * - `int big = 130;`    -> Exceeds byte max limit 127.
 * - `byte wrapped = (byte) big;` -> Wraps around to -126.
 *
 * 📊 DRY RUN TRACE:
 * | Variable | Original Type | Original Value | Cast Expression | Resulting Value | Reason |
 * | :------- | :------------ | :------------- | :-------------- | :-------------- | :----- |
 * | `a`      | `int`         | 12             | `(byte) a`      | `12`            | Fits inside [-128, 127] |
 * | `big`    | `int`         | 130            | `(byte) big`    | `-126`          | 8-bit two's complement wrap |
 * ============================================================================
 */
public class byteconversion {

    public static void main(String[] args) {
        // Case 1: Value within valid byte range [-128, 127]
        int a = 12;
        byte k = (byte) a;
        System.out.println("Casting int 12 to byte: " + k); // Outputs: 12

        // Case 2: Value exceeding byte range -> Demonstrates modular wrap-around (overflow)
        int big = 130;
        byte wrapped = (byte) big;
        System.out.println("Casting int 130 to byte (overflow wrap-around): " + wrapped); // Outputs: -126
    }
}