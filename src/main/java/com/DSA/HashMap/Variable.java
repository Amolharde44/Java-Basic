package com.DSA.HashMap;

/*
 * Variable in Java
 * 	A variable in is a container that holds a value.which can be of various type such as Integer,String,boolean...........
 * There are three type of variable
 * 1.Local Variable
 * 2.Instance Variable
 * 3.Static Variable
 * 
 */
public class Variable {

	
	static int staticVariable = 1;  //Declare  and initialization Variable
	int instanceVariable; //declare Variable 
	
	
	//declaration of variable
	
	/*
	 * data_type varibale_name=value;
	 * 
	 * data_type variable_name;  ----->declare variable
	 * variable_name=2;    ---------->initialize variable
	 */

	int localVariable() {
		int a = 3;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable obj1 = new Variable();
        obj1.localVariable();
		obj1.instanceVariable = 2;
		System.out.println(staticVariable);

		System.out.println(obj1.instanceVariable);
		System.out.println( obj1.localVariable());

	}

}
