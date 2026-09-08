# 🧶 Module 12: Java Strings

> **Mastering Text Manipulation in Java.** Learn how Java handles text, the immutability of Strings, and the most common methods to manipulate them.

> ⚡ **Fast Access**: [🏠 Course Master Readme](../../../Readme.Md) &nbsp;|&nbsp; [📂 Source Directory](../../README.md) &nbsp;|&nbsp; [⬅️ Previous: Methods](../methods/README.md) &nbsp;|&nbsp; [➡️ Next: OOP Basics](../../advanced/oop_basics/README.md) &nbsp;|&nbsp; [📁 Folder Files](./)

---

## 📑 Table of Contents
1. [What You'll Learn](#1-what-youll-learn)
2. [Core Concept: Strings are Immutable](#2-core-concept-strings-are-immutable)
3. [The String Pool](#3-the-string-pool)
4. [Common String Methods](#4-common-string-methods)
5. [📝 Full Code Walkthrough](#-full-code-walkthrough)
6. [Common Pitfalls & Traps](#6-common-pitfalls--traps)

---

## 1. What You'll Learn

After completing this module, you will be able to:

- [ ] Create and manipulate `String` objects
- [ ] Understand why Strings are immutable in Java
- [ ] Use common string methods like `length()`, `charAt()`, `indexOf()`, `toUpperCase()`, and `concat()`
- [ ] Chain string methods together cleanly

---

## 2. Core Concept: Strings are Immutable

In Java, a `String` is an object that represents a sequence of characters. 
The most important concept to understand about Strings is that they are **immutable**. This means that once a String object is created in memory, its state cannot be modified.

When you perform an operation that seems to modify a String (like making it uppercase or concatenating it), Java actually **creates a brand new String object** and returns it, leaving the original String completely unchanged.

---

## 3. The String Pool

To save memory, Java stores all literal Strings (Strings created with double quotes `"..."`) in a special area of the Heap memory called the **String Pool**.
If you create two String variables with the exact same literal text, they will point to the exact same object in the String Pool!

---

## 4. Common String Methods

| Method | What it does | Example (`String s = "Hello";`) | Result |
| :--- | :--- | :--- | :--- |
| `length()` | Returns number of characters | `s.length()` | `5` |
| `charAt(index)` | Returns character at index | `s.charAt(1)` | `'e'` |
| `indexOf(char)` | Returns first index of char | `s.indexOf('o')` | `4` |
| `toUpperCase()` | Converts to uppercase | `s.toUpperCase()` | `"HELLO"` |
| `toLowerCase()` | Converts to lowercase | `s.toLowerCase()` | `"hello"` |
| `concat(str)` | Appends string to the end | `s.concat(" World")` | `"Hello World"` |
| `equals(str)` | Compares contents exactly | `s.equals("hello")` | `false` |

---

## 📝 Full Code Walkthrough

### 📄 `src/intermediate/strings/Demo_string.java`

**Purpose:** Teaches common String methods — `concat`, `toUpperCase`, `length`, `charAt`, and `indexOf`.

**▶️ Run:** `java -cp out intermediate.strings.Demo_string`

```java
package intermediate.strings;

public class Demo_string {
    public static void main(String[]args){
        String name = "Honey";
        System.out.println( name.concat("Reddy"));
        System.out.println( name.concat("Reddy").toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('e'));
    }
}
```

**Line-by-line explanation:**

| Line | Code | What it does |
| :--- | :--- | :--- |
| 5 | `String name = "Honey";` | Creates a String with the text "Honey". Strings are **immutable** in Java — once created, the original string never changes. All methods return NEW strings. |
| 6 | `name.concat("Reddy")` | **`concat()`** joins another string to the end. Returns `"HoneyReddy"`. The original `name` is still `"Honey"` — it's unchanged! |
| 7 | `name.concat("Reddy").toUpperCase()` | **Method chaining**: first `concat` produces `"HoneyReddy"`, then **`toUpperCase()`** converts ALL characters to uppercase → `"HONEYREDDY"`. |
| 8 | `name.length()` | **`length()`** returns the number of characters in the string. `"Honey"` has 5 characters, so it returns `5`. (Note: for Strings it's `length()` with parentheses; for arrays it's `.length` without.) |
| 9 | `name.charAt(0)` | **`charAt(index)`** returns the single character at that position. Index 0 is the first character → `'H'`. |
| 10 | `name.indexOf('e')` | **`indexOf(char)`** returns the position (index) of the FIRST occurrence of that character. `'e'` first appears at index 3 in `"Honey"` (H=0, o=1, n=2, e=3). |

> 🔑 **Concept:** Strings are **immutable** — methods like `concat()` and `toUpperCase()` return NEW strings without changing the original. Common methods: `length()` for size, `charAt(i)` for a specific character, `indexOf(c)` for finding a character's position, `concat()` for joining, `toUpperCase()` for capitalization.

**⚠️ Common beginner mistakes:**
- Thinking `name.toUpperCase()` changes `name` — it doesn't! You need `name = name.toUpperCase()` to save the result.
- Confusing array's `.length` (property, no parentheses) with String's `.length()` (method, with parentheses).

---

## 6. Common Pitfalls & Traps

> [!WARNING]
> ### 1. Comparing Strings with `==`
> Never use `==` to compare the *text* of two strings! `==` checks if they are the exact same object in memory. Always use `.equals()` to check if the text is the same.
> ```java
> String a = new String("hello");
> String b = new String("hello");
> System.out.println(a == b);      // false! (different objects)
> System.out.println(a.equals(b)); // true! (same text)
> ```

> [!CAUTION]
> ### 2. The `.length` vs `.length()` Mix-up
> - **Arrays** have a property: `arr.length` (no parentheses)
> - **Strings** have a method: `str.length()` (requires parentheses)

---

## 🧭 Fast Navigation

| 🏠 Course Master | 📂 Source Hub | ⬅️ Previous Module | ➡️ Next Module | 📁 Browse Folder |
| :---: | :---: | :---: | :---: | :---: |
| [Main Readme](../../../Readme.Md) | [src/ Overview](../../README.md) | [⬅️ Methods](../methods/README.md) | [OOP Basics ➡️](../../advanced/oop_basics/README.md) | [📁 `strings/`](./) |
