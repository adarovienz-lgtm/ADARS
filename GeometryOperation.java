/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class GeometryOperation extends MathOperation {
    
    public GeometryOperation(double dimension) {
        super(dimension);
    }

    public double computeCircleArea() {
        double r = getInputValue();
        if (r < 0) {
            System.out.println("Error: Radius cannot be negative.");
            return 0;
        }
        return Math.PI * r * r;
    }

    public double computeCircleCircumference() {
        double r = getInputValue();
        if (r < 0) return 0;
        return 2 * Math.PI * r;
    }

    public double computeRectangleArea(double width) {
        double length = getInputValue();
        if (length < 0 || width < 0) {
            System.out.println("Error: Dimensions cannot be negative.");
            return 0;
        }
        return length * width;
    }
    
    public double computeRectanglePerimeter(double width) {
        double length = getInputValue(); // Length is stored in parent
        if (length < 0 || width < 0) {
            System.out.println("Error: Dimensions cannot be negative.");
            return 0;
        }
        return 2 * (length + width);
    }
}