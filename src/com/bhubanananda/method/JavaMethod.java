package com.bhubanananda.method;

/**
 * The Class JavaMethod.
 * 
 * @ author Bhubanananda
 */
public class JavaMethod {

	/**
	 * Display without return type.
	 */
	void displayWithoutReturnType() {
		System.out.println("Inside displayWithoutReturnType");
	}

	/**
	 * Display with return type.
	 *
	 * @return the string
	 */
	String displayWithReturnType() {
		System.out.println("Inside displayWithReturnType");
		return "Inside display without return type";
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		JavaMethod javaMethod = new JavaMethod();
		String displayWithReturnType = javaMethod.displayWithReturnType();
		System.out.println(displayWithReturnType); // using return value of method
		System.out.println();
		javaMethod.displayWithoutReturnType();
	}
}
