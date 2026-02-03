{\rtf1\ansi\ansicpg1252\cocoartf2867
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 Core Math Library - OOP Implementation\
Student Name: Vienz Edhrian O. Adaro\
\
1. Class Responsibilities\
   - MathOperation (Parent): Handles the common input value and enforces encapsulation. It serves as the blueprint for all calculations.\
   - ArithmeticOperation (Child): Handles standard math (Add, Subtract, Multiply, Divide) and manages a second operand.\
   - GeometryOperation (Child): Handles shape calculations (Circle Area/Circumference, Rectangle Area/Perimeter). It interprets the input value as a dimension (radius or length).\
   - NumberAnalysis (Child): Handles single-number logic (Prime check, Factorial, Even/Odd).\
\
2. Inheritance Structure\
   The library uses a hierarchical design:\
   MathOperation (Base Class)\
      |--> ArithmeticOperation\
      |--> GeometryOperation\
      |--> NumberAnalysis\
\
   Why this design? \
   This allows all specific operations to reuse the 'inputValue' attribute and getter/setter methods from the parent, satisfying the requirement for Code Reuse and Extensibility.\
\
3. Encapsulation\
   - All attributes (like 'inputValue' and 'secondOperand') are private.\
   - External access is only allowed through public constructors or methods.\
   - Validation logic (like checking for negative radius or division by zero) is hidden inside the methods to protect the data integrity.\
\
4. Extensibility (Problem 5)\
   If we need to add 'Trigonometry' in the future, we simply create a new class:\
   'public class Trigonometry extends MathOperation'.\
   We do not need to change the existing code, which follows the Open/Closed Principle.}