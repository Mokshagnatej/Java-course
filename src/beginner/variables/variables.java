package beginner.variables;
/**
 * ============================================================================
 * TOPIC: Java Variables, Primitive Data Types & String Concatenation
 * FILE: variables.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Declare, initialize, manipulate, and display different types of variables:
 * integers (`int`), floating-point decimals (`double`), booleans (`Boolean` / `boolean`),
 * and text strings (`String`), along with conditional checks and string concatenation.
 *
 * 🧠 MENTAL MODEL & MEMORY ALLOCATION:
 * - A **variable** is a named storage location in computer memory (RAM).
 * - **Data Type**: Tells Java how much memory to allocate and what kind of values can fit.
 *
 * | Variable Name | Type      | Memory Size | What it stores                           |
 * | :------------ | :-------- | :---------- | :--------------------------------------- |
 * | `age`         | `int`     | 32 bits     | Whole integer numbers (`20`)             |
 * | `height`      | `double`  | 64 bits     | High precision decimal numbers (`3.532`)|
 * | `isMale`      | `Boolean` | Reference   | Wrapper object holding `true`/`false`    |
 * | `name`        | `String`  | Reference   | Object in String Constant Pool (`"sai"`) |
 *
 * 🔍 STRING CONCATENATION WITH `+`:
 * In Java, when `+` is used between strings or a string and numbers, it acts as
 * the **concatenation operator** (joins them together as text).
 *
 * 📊 DRY RUN TRACE:
 * | Line / Action                     | Variable State                     | Console Output                         |
 * | :-------------------------------- | :--------------------------------- | :------------------------------------- |
 * | Declare & init `int age = 20`     | `age = 20`                         | (none)                                 |
 * | Print `age`                       | `age = 20`                         | `20`                                   |
 * | Declare `double height = 3.53234` | `height = 3.53234`                 | (none)                                 |
 * | Print `height`                    | `height = 3.53234`                 | `3.53234`                              |
 * | Declare `Boolean isMale = true`   | `isMale = true`                    | (none)                                 |
 * | `if (isMale)` branch evaluates    | Condition is `true`                | `your male`                            |
 * | String `name = "sai"`             | `name = "sai"`                     | `sai`                                  |
 * | String `name2 = "nandini"`        | `name2 = "nandini"`                | `nandini`                              |
 * | Print concatenated string         | Combined into one String           | `sailovenandini`                       |
 * | Print formatted sentence          | Multiple concatenations            | `your name is sai your height is ...`  |
 * ============================================================================
 */
public class variables {

    public static void main(String[] args) {
        // 1. Integer primitive (whole numbers)
        int age = 20;
        System.out.println(age);

        // 2. Double-precision floating point primitive (decimals)
        double height = 3.53234;
        System.out.println(height);

        // 3. Boolean data type (true / false logic flag)
        Boolean isMale = true;
        System.out.println(isMale);

        // 4. Conditional check based on the boolean variable
        if (isMale) {
            System.out.println("your male");
        } else {
            System.out.println("your not a male");
        }

        // 5. String reference type (sequences of characters)
        String name = "sai";
        System.out.println(name);

        String name2 = "nandini";
        System.out.println(name2);

        // 6. String concatenation using '+'
        System.out.println(name + "love" + name2);

        // 7. Multi-variable combined string output
        System.out.println("your name is " + name + " " + "your height is " + height + " " + " your age is " + age);
    }
}
