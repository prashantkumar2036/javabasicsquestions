// Java program to print Mirror Lower Star Triangle Pattern
// using Do-while loop
// Main class
class lowerstar3{
	// Main driver method
	public static void main(String[] args)
	{
		// Declare variable with the
		// Size of the triangle
		int number = 7;
		int m = number;
		int n;
		// Outer loop 1
		// prints the first half triangle
		do {
			n = 0;
			// Inner loop 1
			// prints space until n++ < number - m is false
			do {
				// Print whitespaces
				System.out.print(" ");
			} 
			while (n++ < number - m);
			n = 0;
			// Inner loop 2
			// prints star until n++ < m * 2 - 2 is false
			do {
				// Print star
				System.out.print("*");
			}
			while (n++ < m * 2 - 2);
			System.out.println("");
		}
		// Condition check for do-while
		while (--m > 0);
		m = 1;
		// Outer loop 2
		// prints the second half triangle
		do {
			n = 0;
			// Inner loop 1
			// prints space until n++ < (number - m) is
			// false
			do {
				// Print whitespace
				System.out.print(" ");
			} 
			while (n++ < (number - m));
			n = 0;
			// Inner loop 2
			// prints star until n++ < (m * 2) - 2 is false
			do {
				// Print star
				System.out.print("*");
			}
			while (n++ < (m * 2) - 2);
			System.out.println("");
		}
		// Condition check for do-while
		while (++m <= number);
	}
}
