/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class ArithmeticOperation extends MathOperation {
    private double secondOperand;

    public ArithmeticOperation(double firstOperand, double secondOperand) {
        super(firstOperand); 
        this.secondOperand = secondOperand;
    }

    public double add() {
        return getInputValue() + secondOperand;
    }

    public double subtract() {
        return getInputValue() - secondOperand;
    }

    public double multiply() {
        return getInputValue() * secondOperand;
    }

    public double divide() {
        if (secondOperand == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return getInputValue() / secondOperand;
    }
}
