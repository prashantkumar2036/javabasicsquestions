package JAVA_;
// Java Program to Illustrate That an instance of Abstract
// Class Can not be created
// Class 1
// Abstract class
abstract class base {
	abstract void fun();
}
// Class 2
class Derived extends base {
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
// Class 3
// Main class
class Main {
	// Main driver method
	public static void main(String args[])
	{
		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();
		// We can have references of Base type.
		base b = new Derived();
		b.fun();
	}
}
