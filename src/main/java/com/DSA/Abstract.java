package com.DSA;

//Abstract class representing a general shape
abstract class Shape {
	abstract void draw();

	abstract void area();

}

abstract class Math {
	abstract void add(int a, int b);

	abstract void sub(int a, int b);

	abstract void mul(int a, int b);

	abstract void div(int a, int b);

}



//Concrete class implementing the Shape abstract class
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		int r = 10;
		System.out.println("Area of circle:" + (2 * 3.142 * r * r));

	}

}

//Concrete class implementing the Shape abstract class
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}

	@Override
	void area() {
		int a = 10;
		int b = 20;
		System.out.println("Area of rectangle:" + (a * b));

		// TODO Auto-generated method stub

	}
}

class MathOp extends Math {

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Additon of a+b:" + (a + b));

	}

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Subtraction of a-b:" + (a - b));

	}

	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multification of a*b:" + (a * b));

	}

	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Division of a/b:" + (a / b));

	}

}

public class Abstract {
	public static void main(String[] args) {
		
		
		
		Circle circle = new Circle();
		
		
		Rectangle rectangle = new Rectangle();
		
		
		MathOp math = new MathOp();

		math.add(10, 20);
		math.div(20, 10);
		math.mul(10, 20);
		math.sub(10, 20);

		circle.draw(); // Output: Drawing a circle
		rectangle.draw(); // Output: Drawing a rectangle
		circle.area();
		rectangle.area();
	}
}
