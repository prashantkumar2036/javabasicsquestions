// Java Program to Check if Given Integer is Odd or Even
// Using Bitwise OR
// Importing required classes
// Main class
public class evenorodd2{
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing integer variable
		// to be checked
		int n = 100;
		// Condition check
		// if n|1 if greater than n then this number is even
		if ((n | 1) > n) {
			// Print statement
			System.out.println("Number is Even");
		}
		else {
			// Print statement
			System.out.println("Number is Odd");
		}
	}
}
