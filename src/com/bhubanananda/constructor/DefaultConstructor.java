package com.bhubanananda.constructor;

/**
 * The Class DefaultConstructor.
 * 
 * @ author Bhubanananda
 */
public class DefaultConstructor {

	/** The id. */
	int id;

	/** The name. */
	String name;

	/**
	 * Display.
	 */
	void display() {
		System.out.println(id + " " + name);
	}

	/**
	 * Instantiates a new default constructor.
	 */
	public DefaultConstructor() {
		super();
		System.out.println("inside default constructor");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DefaultConstructor defaultConstructor = new DefaultConstructor();
		defaultConstructor.display();
	}

}
