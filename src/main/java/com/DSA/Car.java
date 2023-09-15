package com.DSA;

public class Car {

	// Attributes
    String brand;
    String model;
    int year;

    // Methods
    void start() {
        System.out.println("The " + brand + " " + model + " is starting.");
    }

    void stop() {
        System.out.println("The " + brand + " " + model + " is stopping.");
    }




    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car();
        Car car2 = new Car();

        // Assigning values to attributes
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2022;

        // Calling methods on objects
        car1.start(); // Output: The Toyota Camry is starting.
        car2.stop();  // Output: The Honda Civic is stopping.
    }
}

