package com.bhubanananda.method;

/**
 * The Class InstanceBlock.
 *
 * @author Bhubanananda
 */
public class InstanceBlock extends Child {

	/**
	 * Instantiates a new instance block.
	 */
	InstanceBlock() {
		System.out.println();
		System.out.println("InstanceBlock constructor is invoked");
	}

	{
		System.out.println();
		System.out.println("instance initializer block is invoked");
	}

	static {
		System.out.println("static block is invoked");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new InstanceBlock();
	}

}

class Parent {
	Parent() {
		System.out.println();
		System.out.println("parent class constructor invoked");
		System.out.println();
	}

}

class Child extends Parent {
	Child() {
		super();
		System.out.println("child class constructor invoked");
	}
}