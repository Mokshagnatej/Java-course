# Java Practice Repo — Fast Self-Revision Guide

## Quick refresher (10 minutes)

If you only have a few minutes before an interview or exam, reread these first:

- `src/basics/startingstructure.java` — Java skeleton: `class` + `main`. Why: every Java program starts here.
- `src/variables/variables.java` — variables and primitive types. Why: every expression depends on stored values.
- `src/Operators/increment.java` — `++` and `--`. Why: this is a classic exam trap.
- `src/conditional_statements/if_else_if.java` — decision-making flow. Why: conditions are the core of logic.
- `src/Loops/For_loop.java` — loop syntax and control flow. Why: loops are the next most common interview topic.
- `src/type_conversions/Typepromotions.java` — implicit type conversion. Why: many bugs come from narrowing/widening confusion.

These six files cover the mental model most quickly: structure -> values -> operators -> decisions -> repetition -> conversions.

## Suggested learning order

1. `basics` — Start with the Java skeleton and console output. Reason: you need a valid program structure before anything else works.
2. `variables` — Learn how data is stored. Reason: operators, conditions, and loops all depend on variables.
3. `Operators` — Learn arithmetic, comparison, logical, and assignment operators. Reason: conditions and loop logic are built from these operators.
4. `conditional_statements` — Learn `if`, `else if`, ternary, and `switch`. Reason: decisions use the operators you just learned.
5. `Loops` — Learn `for`, `while`, and `do-while`. Reason: repetition is built on decision checks and counters.
6. `input_output` and `math_and_random` — Learn reading input and using built-in helpers. Reason: real programs need user interaction and numeric functions.
7. `type_conversions` — Learn widening, narrowing, and promotion. Reason: conversion rules matter once you combine values of different types.
8. `practice_programs` — Use the exercises as review. Reason: these tie together earlier concepts and show where they break in real programs.

## Topic map

### Basics

- `src/basics/startingstructure.java`
  - Key concept: The Java program structure: `class` + `public static void main(String[] args)`.
  - Common beginner mistake: forgetting the `main` method signature or braces, which prevents the program from running.

- `src/basics/scanner.java`
  - Key concept: Reading user input from the console with `Scanner`.
  - Common beginner mistake: forgetting to import `java.util.Scanner` or calling `nextInt()`/`nextLine()` in the wrong sequence.

- `src/basics/OrderDemo.java`
  - Key concept: Operator precedence and evaluation order.
  - Common beginner mistake: assuming Java evaluates left-to-right without respecting precedence rules.

### Variables

- `src/variables/variables.java`
  - Key concept: Variables store values of specific types and can be printed or combined.
  - Common beginner mistake: using the wrong type for a value, especially with `double` vs `int`.

### Operators

- `src/Operators/arithmeticoperator.java`
  - Key concept: Arithmetic operators (`+`, `-`, `*`, `/`, `%`).
  - Common beginner mistake: confusing integer division with floating-point division.

- `src/Operators/augmentedassigment.java`
  - Key concept: Shorthand assignment operators like `+=`, `-=`, `*=`, `/=`.
  - Common beginner mistake: thinking `x += 2` is different from `x = x + 2` in a confusing way; it is not, but it is easy to misuse with casts or precedence.

- `src/Operators/increment.java`
  - Key concept: Prefix and postfix increment/decrement (`++`, `--`).
  - Common beginner mistake: assuming `i++` and `++i` always behave the same inside expressions.

- `src/Operators/logicaloperator.java`
  - Key concept: Logical operators (`&&`, `||`, `!`) combine boolean conditions.
  - Common beginner mistake: misunderstanding `||` (OR) vs `&&` (AND), or forgetting that `!` reverses a condition.

- `src/Operators/Relationaloperator.java`
  - Key concept: Comparison operators (`==`, `!=`, `>`, `<`, `>=`, `<=`).
  - Common beginner mistake: using `==` with strings or objects instead of comparing their contents with `.equals()`.

### Type conversions

- `src/type_conversions/byteconversion.java`
  - Key concept: Converting between primitive numeric types, especially byte-sized values.
  - Common beginner mistake: narrowing conversion without checking overflow or range limits.

- `src/type_conversions/Floatconversion.java`
  - Key concept: Converting to and from floating-point types.
  - Common beginner mistake: losing precision or assuming all decimals can be represented exactly.

- `src/type_conversions/Typepromotions.java`
  - Key concept: Java automatically promotes operands to a wider type in expressions.
  - Common beginner mistake: forgetting that `byte * byte` is not a `byte` result unless you cast it intentionally.

### Math and random numbers

- `src/math_and_random/math.java`
  - Key concept: Using the built-in `Math` class for common calculations.
  - Common beginner mistake: expecting `Math.round()` and casting to behave the same in every numeric case.

- `src/math_and_random/randomnumbers.java`
  - Key concept: Generating random values using Java’s random utilities.
  - Common beginner mistake: thinking `Math.random()` gives a random integer by default when it actually gives a double in `[0.0, 1.0)`.

### Input and output

- `src/input_output/ScannerInput.java`
  - Key concept: Reading different data types from standard input and printing a summary.
  - Common beginner mistake: mixing `nextInt()`/`nextDouble()` with `nextLine()` and losing input that was not consumed correctly.

### Conditional statements

- `src/conditional_statements/ifstatement.java`
  - Key concept: Basic `if` decision-making.
  - Common beginner mistake: using `=` instead of `==` in the condition.

- `src/conditional_statements/ifelse_statement.java`
  - Key concept: `if-else` branches for two-way decisions.
  - Common beginner mistake: forgetting the `else` branch or writing conditions that are too broad.

- `src/conditional_statements/if_else_if.java`
  - Key concept: Chained conditions with `else if`.
  - Common beginner mistake: assuming only one `if` block runs when multiple conditions could be true.

- `src/conditional_statements/switch_operator.java`
  - Key concept: Multi-way branching with `switch`.
  - Common beginner mistake: forgetting `break` and letting execution fall through to later cases.

- `src/conditional_statements/Ternary_operator.java`
  - Key concept: Compact `condition ? value1 : value2` expression.
  - Common beginner mistake: overusing the ternary operator in complex logic, making code harder to read.

### Loops

- `src/Loops/For_loop.java`
  - Key concept: `for` loop for known iteration counts.
  - Common beginner mistake: off-by-one errors in the loop condition or update step.

- `src/Loops/while_loop.java`
  - Key concept: `while` loop runs while a condition stays true.
  - Common beginner mistake: writing a condition that never changes, causing an infinite loop.

- `src/Loops/Do_while_loop.java`
  - Key concept: `do-while` runs at least once before checking the condition.
  - Common beginner mistake: forgetting that the body runs once even when the condition starts false.

### Practice programs

- `src/practice_programs/calculaterectangle.java`
  - Key concept: Applying formulas to a small real-world problem.
  - Common beginner mistake: mixing units or forgetting to handle numeric input correctly.

- `src/practice_programs/for_loop.java`
  - Key concept: Repetition with a loop in a practical example.
  - Common beginner mistake: using the wrong loop condition or update expression, which changes the number of iterations.

- `src/practice_programs/shoppingcart.java`
  - Key concept: Combining input, variables, conditionals, and output in one flow.
  - Common beginner mistake: treating variables as permanent state when the program logic needs to update them repeatedly.

## Quick concept comparison

| Topic | Correct idea | Common confusion |
| --- | --- | --- |
| `++i` vs `i++` | `++i` increments before use; `i++` increments after use | Assuming both always produce the same result in expressions |
| `==` vs `.equals()` | `==` compares references for objects; `.equals()` compares value/content | Using `==` with strings |
| `while` vs `do-while` | `while` checks before running; `do-while` runs once before checking | Forgetting `do-while` always executes the body at least once |
| `if` vs `switch` | `if` handles conditions; `switch` handles discrete cases | Forgetting `break` in `switch` |
| `int` vs `double` | `int` stores whole numbers; `double` stores decimal values | Expecting decimal division from integer operands |

## Minimal revision path

If you want a compact review for a test:

- Read: `startingstructure.java`, `variables.java`, `Relationaloperator.java`, `if_else_if.java`, `For_loop.java`, `Typepromotions.java`
- Then ask: can I declare a variable, compare values, branch on conditions, repeat work, and convert types without mistakes?

That covers the main Java grammar that most beginner questions depend on.

## Run the examples

Open any `.java` file in IntelliJ or another Java IDE and run it directly. Most files in this repo are standalone examples, so the learning goal is to inspect the logic and then retype the same pattern from memory.
