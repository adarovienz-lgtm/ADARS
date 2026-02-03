# Core Math Library - OOP Implementation
**Student Name:** Vienz Edhrian O. Adaro

## 1. Class Responsibilities
* **MathOperation (Parent):** Handles the common input value and enforces encapsulation. It serves as the blueprint for all calculations.
* **ArithmeticOperation (Child):** Handles standard math (Add, Subtract, Multiply, Divide) and manages a second operand.
* **GeometryOperation (Child):** Handles shape calculations (Circle Area/Circumference, Rectangle Area/Perimeter). It interprets the input value as a dimension (radius or length).
* **NumberAnalysis (Child):** Handles single-number logic (Prime check, Factorial, Even/Odd).

## 2. Inheritance Structure
The library uses a hierarchical design:
* `MathOperation` (Base Class)
    * `ArithmeticOperation`
    * `GeometryOperation`
    * `NumberAnalysis`

**Why this design?**
[cite_start]This allows all specific operations to reuse the `inputValue` attribute and getter/setter methods from the parent, satisfying the requirement for Code Reuse and Extensibility [cite: 10, 16-19].

## 3. Encapsulation
* All attributes (like `inputValue` and `secondOperand`) are **private**.
* External access is only allowed through **public constructors or methods**.
* [cite_start]Validation logic (like checking for negative radius or division by zero) is hidden inside the methods to protect the data integrity [cite: 20-23].

## 4. Extensibility
If we need to add "Trigonometry" in the future, we simply create a new class:
`public class Trigonometry extends MathOperation`.
[cite_start]We do not need to change the existing code, which follows the Open/Closed Principle [cite: 72-76].
