package ClassandOject;

/*
 * What is class
 * A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes.
 * It is a user-defined blueprint or prototype from which objects are created.
 * For example, Student is a class while a particular student named Amol ,Ruturaj is an object.
 * Properties of Java Classes
   Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
   Class does not occupy memory.
   Class is a group of variables of different data types and a group of methods.
   A Class in Java can contain:
   Data member
   Method
   Constructor
   Nested Class
   Interface
 * 
 * What is object
 * Java Objects
   An object in Java is a basic unit of Object-Oriented Programming and represents real-life entities.
   Objects are the instances of a class that are created to use the attributes and methods of a class. 
   A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of : 

   State: It is represented by attributes of an object. It also reflects the properties of an object.
   Behavior: It is represented by the methods of an object. It also reflects the response of an object with other objects.
   Identity: It gives a unique name to an object and enables one object to interact with other objects.
 * 
 */
//declare class for Pen
class Pen {

	// declare data for class
	// data member
	String color;
	String type;

	// declare member (method in class)
	public void write() {

		System.out.println("write something...");

	}

	// method of color
	public void color() {

		System.out.println(this.color);
	}

	// method for type

	public void type() {
		// TODO Auto-generated method stub
		System.out.println(this.type);
	}
}

class Student

{
	// declare data for class Stuent
	// properties of student
	String rollno;
	String name;
	String div;

	public void studentInfo() {
		System.out.println("roll no of student:-" + this.rollno);
		System.out.println("name od the student:-" + this.name);
		System.out.println("div of the student:-" + this.div);
	}
}

public class OOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object 1 of Pen
		Pen pen1 = new Pen();

		// object 2 of pen
		Pen pen2 = new Pen();

		pen1.color = "Blue";
		pen1.type = "Ball pen";

		pen2.color = "red";
		pen2.type = "Gel pen";

		pen1.write();
		pen1.color();
		pen2.color();
		pen1.type();
		pen2.type();

		// object for student class
		Student stu = new Student(); // new keyword --Allocate new space for store object on memory heap

		stu.name = "Amol";
		stu.rollno = "1";
		stu.div = "A";

		Student stu1 = new Student();
		stu1.name = "Ruturaj";
		stu1.rollno = "2";
		stu1.div = "A";

		stu.studentInfo();
		stu1.studentInfo();

	}

}
