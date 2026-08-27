# Java Practice — Quick Revision Guide

A compact repository of small, focused Java example files meant for rapid review and practice.

## Project overview

This repo contains short, standalone example programs grouped by topic (basics, variables, operators, conditionals, loops, conversions, I/O, math, and practice programs). Each file demonstrates one concept or common pitfall to help you revise quickly before interviews or exams.

## Quick start — Compile & run (cross-platform)

1. Make sure Java (JDK) is installed. Check:

   ```bash
   java -version
   javac -version
   ```

2. Compile a single example and run it from the repo root. Example:

   ```bash
   javac src/basics/startingstructure.java
   java -cp src basics.startingstructure
   ```

   Note: Some examples are packaged differently; if a `.java` file includes a package statement, use the package-aware `-d` option for javac and run with the package-qualified class name.

3. Recommended (IDE): Open the project in IntelliJ IDEA, VS Code (with Java extensions), or another Java IDE and run examples directly for faster iteration.

## Quick refresher (10 minutes)

If time is short, inspect these files first:

- `src/basics/startingstructure.java` — Java skeleton: class + main.
- `src/variables/variables.java` — primitives and variables.
- `src/Operators/increment.java` — prefix vs postfix increments.
- `src/conditional_statements/if_else_if.java` — chained conditions.
- `src/Loops/For_loop.java` — loop syntax and common off-by-one traps.
- `src/type_conversions/Typepromotions.java` — implicit promotions and casts.

These cover the core mental model: structure → values → operators → decisions → repetition → conversions.

## Suggested learning order

1. Basics (program skeleton, main method)
2. Variables and types
3. Operators (arithmetic, relational, logical)
4. Conditional statements (`if`, `switch`)
5. Loops (`for`, `while`, `do-while`)
6. I/O and utility classes (Scanner, Math)
7. Type conversions and promotions
8. Practice programs — combine concepts

## Topic map (examples)

- Basics: `src/basics/startingstructure.java`, `src/basics/scanner.java`
- Variables: `src/variables/variables.java`
- Operators: `src/Operators/*` (arithmetic, increment, logical, relational)
- Conditionals: `src/conditional_statements/*` (`if`, `switch`, ternary)
- Loops: `src/Loops/*` (`For_loop.java`, `while_loop.java`)
- Conversions: `src/type_conversions/*`
- Math & Random: `src/math_and_random/*`
- Practice programs: `src/practice_programs/*`

(Refer to individual files for comments and common beginner mistakes.)

## Roadmap (short)

- Add unit-tested examples for edge cases (next sprint).
- Add a short quiz or flashcards per topic.
- Provide a CONTRIBUTING.md with guidelines to add new examples.

## License & maintainer

- License: (please confirm) — add an explicit LICENSE file (MIT recommended) if you want permissive reuse.
- Maintainer: Mokshag Natej — add contact or GitHub profile link if desired.

## Running tips

- Prefer an IDE for quick runs. For CLI: compile with `javac` and run with `java -cp`.
- If a file has a package, compile with `javac -d . <path>` and run using the package-qualified class name.

## Contributing

Contributions welcome. Keep examples small, focused, and well-commented. Add tests or a short description that explains the teaching point.

---

(README updated to add installation/run steps, overview, roadmap, and license/maintainer notes.)
