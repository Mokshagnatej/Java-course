# 🧬 Module 17: Java Generics & Type Safety

> **Mastering Compile-Time Type Safety, Generic Architecture & Wildcards in Java.** Write flexible, reusable code that eliminates `ClassCastException` and leverages the JVM's type system.

> ⚡ **Fast Access**: [🏠 Course Master Readme](../../../Readme.Md) &nbsp;|&nbsp; [📂 Source Directory](../../README.md) &nbsp;|&nbsp; [⬅️ Previous: Collections](../collections/README.md) &nbsp;|&nbsp; [➡️ Next: File I/O](../file_io/README.md) &nbsp;|&nbsp; [📁 Folder Files](./)

---

## 🎯 Key Concepts & Curriculum Roadmap

- **Generic Classes & Interfaces**: Defining parameter types: `class Box<T>`, `interface Repository<T, ID>`.
- **Generic Methods**: Type inference and standalone generic method syntax `<T> void print(T item)`.
- **Bounded Type Parameters**: Upper bounds restricting parameter types (`<T extends Number>`).
- **Wildcards & PECS Principle**: Unbounded (`?`), upper bounded (`? extends T`), lower bounded (`? super T`), **P**roducer **E**xtends, **C**onsumer **S**uper.
- **Type Erasure Mechanics**: How the JVM strips generics at compilation to maintain backwards compatibility.
- **Array Limitations & Heap Pollution**: Why generic arrays are not permitted (`new T[]`) and `@SafeVarargs`.

---

## 🧭 Fast Navigation

| 🏠 Course Master | 📂 Source Hub | ⬅️ Previous Module | ➡️ Next Module | 📁 Browse Folder |
| :---: | :---: | :---: | :---: | :---: |
| [Main Readme](../../../Readme.Md) | [src/ Overview](../../README.md) | [⬅️ Collections](../collections/README.md) | [File I/O ➡️](../file_io/README.md) | [📁 `generics/`](./) |
