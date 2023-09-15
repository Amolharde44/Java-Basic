package com.DSA;

//Compile-Time Polymorphism (Method Overloading)

/*
 * It seems like you might be referring to "compile-time polymorphism," which is also known as "method overloading."
 *  Method overloading is a concept in object-oriented programming where multiple methods 
 *  in the same class have the same name but different parameter lists.

   Compile-time polymorphism occurs when the appropriate method to be called is determined at
   compile time based on the number and types of arguments passed to the method. 
 
 
   The compiler resolves which overloaded method to call by matching the arguments 
   provided during the method call with the method's parameter list.
 */
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
    int add(int a,int b,int c)
    {
    	return a+b+c;
    			
    }
    double add(double a,double b,double c)
    {
    	return a+b+c;
    }
    
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 10);           // Calls int version
        double sumDouble = calculator.add(3.5, 2.5);  // Calls double version
        int sum3Int=calculator.add(10, 20, 30);
        double sum3Double=calculator.add(10.3, 45.6, 66.6);

        System.out.println("Sum (int): " + sumInt);             // Output: Sum (int): 15
        System.out.println("Sum (double): " + sumDouble);       // Output: Sum (double): 6.0
        System.out.println("Sum (3 int):"+sum3Int);
        System.out.println("Sum (3 Double):"+sum3Double);
    }
}
