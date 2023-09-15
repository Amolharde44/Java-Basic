package com.DSA;
//run time polymorphisms

/*
 * Runtime polymorphism, also known as dynamic polymorphism, 
 * occurs when the appropriate method to be called is determined at runtime based on the actual type of the object. 
 * This is achieved through method overriding,
 *  where a subclass provides a specific implementation for a method declared in its superclass.
 */
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
    
}

class Tiger extends Animal
{
	@Override
	void makeSound() {
		
		System.out.println("Tiger voice");
		
	}
}

public class PolymorphismRunTime {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3=new Tiger();

        animal1.makeSound(); // Calls Dog's overridden makeSound method
        animal2.makeSound(); // Calls Cat's overridden makeSound method
        animal3.makeSound();
    }
}
