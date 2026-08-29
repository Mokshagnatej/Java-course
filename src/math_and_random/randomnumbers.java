package math_and_random;

import java.util.Random;

/**
 * ============================================================================
 * TOPIC: Generating Pseudo-Random Numbers (java.util.Random)
 * FILE: randomnumbers.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Generate pseudo-random values across different types (bounded integers,
 * floating-point percentages, booleans) for games, simulations, and random sampling.
 *
 * 🧠 MENTAL MODEL:
 * - `java.util.Random` uses an algorithm (Linear Congruential Generator / Xoroshiro)
 *   to generate sequences of statistically uniform pseudo-random values.
 * - In Java 17+, `random.nextInt(origin, bound)` generates an integer $N$ such that:
 *   $$\text{origin} \le N < \text{bound}$$
 *   (The origin is inclusive, the bound is exclusive).
 *
 * 🔍 COMMON RANDOM PATTERNS:
 * | Goal | Code Pattern | Output Range |
 * | :--- | :--- | :--- |
 * | 6-Sided Dice Roll | `random.nextInt(1, 7)` | 1, 2, 3, 4, 5, 6 |
 * | Random 0 to 99 | `random.nextInt(100)` | 0 to 99 |
 * | Coin Flip (Boolean) | `random.nextBoolean()` | `true` (Heads) / `false` (Tails) |
 * | Random Percentage | `random.nextDouble()` | 0.0 to 1.0 (e.g. `0.7423...`) |
 * ============================================================================
 */
public class randomnumbers {

    public static void main(String[] args) {
        // Step 1: Create Random generator instance
        Random random = new Random();

        // 1. Generate bounded integer in range [10, 200) -> 10 to 199 inclusive
        int number = random.nextInt(10, 200);
        System.out.println("Random integer between 10 and 199: " + number);

        // 2. Dice roll simulation: Range [1, 7) -> 1 to 6
        int diceRoll = random.nextInt(1, 7);
        System.out.println("Simulated 6-sided dice roll: " + diceRoll);

        // 3. Random coin flip (boolean)
        boolean coinFlip = random.nextBoolean();
        System.out.println("Coin flip (true = Heads, false = Tails): " + (coinFlip ? "Heads" : "Tails"));

        // 4. Random decimal fraction [0.0, 1.0)
        double randomPercent = random.nextDouble();
        System.out.printf("Random probability fraction: %.4f%n", randomPercent);
    }
}
