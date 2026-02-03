/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class NumberAnalysis extends MathOperation {

    public NumberAnalysis(double number) {
        super(number);
    }

    public String checkEvenOdd() {
        if (getInputValue() % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public long computeFactorial() {
        int n = (int) getInputValue();
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isPrime() {
        int n = (int) getInputValue();
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
