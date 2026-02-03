/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Core Math Library OOP Demo ===");

        // --- 1. Arithmetic Operations ---
        System.out.println("\n[Arithmetic Operations]");
        // Test Case 2.1: Addition
        ArithmeticOperation mathCalc = new ArithmeticOperation(15, 10);
        System.out.println("Addition (15 + 10): " + mathCalc.add());
        System.out.println("Subtraction (15 - 10): " + mathCalc.subtract());
        System.out.println("Multiplication (15 * 10): " + mathCalc.multiply());
        System.out.println("Division (15 / 10): " + mathCalc.divide());

        // Test Case 2.2: Division by Zero
        ArithmeticOperation divZero = new ArithmeticOperation(20, 0);
        System.out.print("Division by Zero Test: ");
        divZero.divide(); 

        // --- 2. Geometry Operations ---
        System.out.println("\n[Geometry Operations]");
        // Test Case 3.1: Circle (Area & Circumference)
        GeometryOperation circle = new GeometryOperation(5); 
        System.out.printf("Circle Area (r=5): %.2f%n", circle.computeCircleArea());
        System.out.printf("Circle Circumference (r=5): %.2f%n", circle.computeCircleCircumference());

        // Rectangle (Area & Perimeter)
        GeometryOperation rect = new GeometryOperation(10); // Length = 10
        System.out.println("Rectangle Area (10x5): " + rect.computeRectangleArea(5));
        System.out.println("Rectangle Perimeter (10x5): " + rect.computeRectanglePerimeter(5));

        // Test Case 3.2: Invalid Dimension
        GeometryOperation invalidGeo = new GeometryOperation(-3);
        System.out.print("Invalid Radius Test: ");
        invalidGeo.computeCircleArea(); 

        // --- 3. Number Analysis ---
        System.out.println("\n[Number Analysis]");
        // Test Case 4.1 & 4.2: Prime Check
        NumberAnalysis num7 = new NumberAnalysis(7);
        System.out.println("Is 7 Prime? " + num7.isPrime()); // Expected: true
        
        NumberAnalysis num10 = new NumberAnalysis(10);
        System.out.println("Is 10 Prime? " + num10.isPrime()); // Expected: false

        // Even or Odd Check
        System.out.println("Is 10 Even/Odd? " + num10.checkEvenOdd());

        // Test Case 4.3: Factorial
        NumberAnalysis factCheck = new NumberAnalysis(5);
        System.out.println("Factorial of 5: " + factCheck.computeFactorial());
    }
}