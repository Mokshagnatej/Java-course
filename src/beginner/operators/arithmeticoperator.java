package beginner.operators;
/**
 * ============================================================================
 * TOPIC: Java Basic Arithmetic Operators (+, -, *, /, %)
 * FILE: arithmeticoperator.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Perform fundamental mathematical operations between numeric variables and
 * understand integer division vs remainder (modulo).
 *
 * 🧠 MENTAL MODEL & OPERATOR DEFINITIONS:
 * - `+` (Addition)       : Adds two values.
 * - `-` (Subtraction)    : Subtracts the right operand from the left operand.
 * - `*` (Multiplication) : Multiplies two values.
 * - `/` (Division)       : Divides left operand by right. Truncates decimal if both are integers!
 * - `%` (Modulo)         : Returns the division REMAINDER (useful for even/odd checks, clock math).
 *
 * 🔍 DRY RUN TRACE (a = 10, b = 4):
 * | Operation        | Expression | Evaluation Math | Result Stored |
 * | :--------------- | :--------- | :-------------- | :------------ |
 * | Addition         | `a + b`    | 10 + 4          | 14            |
 * | Subtraction      | `a - b`    | 10 - 4          | 6             |
 * | Multiplication   | `a * b`    | 10 * 4          | 40            |
 * | Integer Division | `a / b`    | 10 / 4          | 2 (truncated) |
 * | Modulo/Remainder | `a % b`    | 10 % 4 (10-8=2) | 2             |
 * ============================================================================
 */
public class arithmeticoperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        // 1. Addition (+)
        int sum = a + b;
        System.out.println("Addition (10 + 4): " + sum); // 14

        // 2. Subtraction (-)
        int diff = a - b;
        System.out.println("Subtraction (10 - 4): " + diff); // 6

        // 3. Multiplication (*)
        int prod = a * b;
        System.out.println("Multiplication (10 * 4): " + prod); // 40

        // 4. Integer Division (/) -> Truncates fractional part!
        int quotient = a / b;
        System.out.println("Integer Division (10 / 4): " + quotient); // 2

        // 5. Modulus (%) -> Gives remainder
        int remainder = a % b;
        System.out.println("Modulus/Remainder (10 % 4): " + remainder); // 2
    }
}
