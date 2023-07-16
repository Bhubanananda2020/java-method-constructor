package com.bhubanananda.constructor;

/**
 * The Class ParameterizedConstructor.
 * 
 * @ author Bhubanananda
 */
public class ParameterizedConstructor {

	/** The id. */
	int id;

	/** The name. */
	String name;

	/**
	 * Instantiates a new parameterized constructor.
	 *
	 * @param id   the id
	 * @param name the name
	 */
	public ParameterizedConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Display.
	 */
	void display() {
		System.out.println(id + " " + name);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {

		ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(1, "Bhuban");
		parameterizedConstructor.display();
	}
}
