package operators;

/**
 * ============================================================================
 * TOPIC: Java Augmented / Compound Assignment Operators (+=, -=, *=, /=, %=)
 * FILE: augmentedassigment.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Perform in-place arithmetic updates on a variable in a concise, readable format
 * and understand the built-in implicit casting provided by compound assignment.
 *
 * 🧠 MENTAL MODEL:
 * Compound operators combine an arithmetic operation with assignment:
 *   • `x += y` is equivalent to `x = (type of x)(x + y)`
 *   • `x -= y` is equivalent to `x = (type of x)(x - y)`
 *   • `x *= y` is equivalent to `x = (type of x)(x * y)`
 *   • `x /= y` is equivalent to `x = (type of x)(x / y)`
 *   • `x %= y` is equivalent to `x = (type of x)(x % y)`
 *
 * 💡 HIDDEN SUPERPOWER (Implicit Type Casting):
 * Unlike standard assignment `b = b + 1` (which requires explicit casting if `b` is `byte`),
 * `b += 1` automatically casts the result back to `byte` under the hood!
 *
 * 📊 DRY RUN TRACE (Initial num = 100):
 * | Operation  | Statement   | Equivalent Longhand | Variable Value |
 * | :--------- | :---------- | :------------------ | :------------- |
 * | Initial    | `num = 100` | -                   | 100            |
 * | Add        | `num += 20` | `num = num + 20`    | 120            |
 * | Subtract   | `num -= 10` | `num = num - 10`    | 110            |
 * | Multiply   | `num *= 2`  | `num = num * 2`     | 220            |
 * | Divide     | `num /= 4`  | `num = num / 4`     | 55             |
 * | Modulo     | `num %= 10` | `num = num % 10`    | 5              |
 * ============================================================================
 */
public class augmentedassigment {

    public static void main(String[] args) {
        int num = 100;
        System.out.println("Starting value: " + num);

        // 1. Compound Addition (+=)
        num += 20; // num = 100 + 20 = 120
        System.out.println("After num += 20: " + num);

        // 2. Compound Subtraction (-=)
        num -= 10; // num = 120 - 10 = 110
        System.out.println("After num -= 10: " + num);

        // 3. Compound Multiplication (*=)
        num *= 2;  // num = 110 * 2 = 220
        System.out.println("After num *= 2:  " + num);

        // 4. Compound Division (/=)
        num /= 4;  // num = 220 / 4 = 55
        System.out.println("After num /= 4:  " + num);

        // 5. Compound Modulus (%=)
        num %= 10; // num = 55 % 10 = 5
        System.out.println("After num %= 10: " + num);

        // Implicit casting bonus demonstration:
        byte b = 50;
        b += 10; // Automatically cast back to byte! (no compile error)
        System.out.println("Byte after b += 10: " + b);
    }
}
