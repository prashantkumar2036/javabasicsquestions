// Java Program to Check if Given Integer is Odd or Even
// Using Bitwise XOR
// Importing required classes
// Main class
public class evenorodd4{
	// Main driver method
	public static void main(String[] args)
	{
		// Declare and initializing integer variable
		int num = 99;
		// Condition Check
		// if number^1 increments by 1 then its even number,
		// else odd
		if ((num ^ 1) == num + 1) {
			// Print statement
			System.out.println("Number is Even");
		}
		else {
			// Print statement
			System.out.println("Number is Odd");
		}
	}
}
