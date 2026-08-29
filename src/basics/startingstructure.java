package basics;

/**
 * ============================================================================
 * TOPIC: Java Program Anatomy & Entry Point
 * FILE: startingstructure.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Understand the minimal structure of an executable Java application, how the
 * Java Virtual Machine (JVM) finds and executes code, and how to print text
 * to the terminal.
 *
 * 🧠 MENTAL MODEL & LOGIC:
 * 1. Java is strictly object-oriented: All code must live inside a `class`.
 * 2. The JVM searches specifically for a method with the signature:
 *    `public static void main(String[] args)` as the program's ignition key.
 * 3. Execution starts at line 1 of `main()` and proceeds sequentially line by line.
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - Line 1: `package basics;` -> Tells Java this file belongs to the 'basics' namespace folder.
 * - Line 22: `public class startingstructure {` -> Declares a publicly accessible class.
 * - Line 24: `public static void main(String[] args) {`
 *     • `public`      : Accessible from anywhere (JVM outside the package can call it).
 *     • `static`      : Can be executed without creating an object of the class first.
 *     • `void`        : Returns no value when it finishes executing.
 *     • `main`        : The exact name the JVM looks for as the entry point.
 *     • `String[] args`: Array of command-line string arguments passed when starting the program.
 * - Line 26: `System.out.println(...);`
 *     • `System`      : Standard built-in Java class containing system utilities.
 *     • `out`         : The standard output stream (the terminal console).
 *     • `println`     : Method that prints the message followed by a newline (\n).
 *
 * 📊 DRY RUN TRACE:
 * | Step | Instruction                          | Output to Console                    |
 * | :--- | :----------------------------------- | :----------------------------------- |
 * | 1    | JVM launches & calls `main()`        | (none)                               |
 * | 2    | Print "jaffa is good boy"            | jaffa is good boy                    |
 * | 3    | Print "really as a very great person!"| really as a very great person!       |
 * | 4    | Reaches end of main()                | Process exits with code 0            |
 * ============================================================================
 */
public class startingstructure {

    public static void main(String[] args) {
        // Line 1: Print first message to console with automatic newline
        System.out.println("jaffa is good boy");

        // Line 2: Print second message to console with automatic newline
        System.out.println("really as a very great person!");
    }
}
