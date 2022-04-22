// Java program to Print Mirror Lower Star Triangle Pattern
// using While loop
// Main Class
class lowerstar2{
	// Main driver method
	public static void main(String[] args)
	{
		// Declare and initialize variable to
		// Size of the triangle
		int number = 7;
		int m = number;
		int n;
		// Outer loop 1
		// prints the first half triangle
		// Till condition holds true
		while (m > 0) {
			n = 0;
			// Inner loop 1
			// prints space until n++ < number - m is false
			while (n++ < number - m) {
				// print whitespace
				System.out.print(" ");
			}
			n = 0;
			// Inner loop 2
			// Prints star until n++ < (m * 2) - 1 is false
			while (n++ < (m * 2) - 1) {
				// Print star
				System.out.print("*");
			}
			// Ending line after each row
			System.out.println();
			// Decrementing by one
			m--;
		}
		m = 1;
		// Outer loop 2
		// prints the second half triangle
		while (m <= number) {
			n = 0;
			// Inner loop 1
			// prints space until n++ < number - m is false
			while (n++ < number - m) {
				// Print whitespace
				System.out.print(" ");
			}
			n = 0;
			// Inner loop 2
			// Prints star until n++ < (m * 2) - 1 is false
			while (n++ < (m * 2) - 1) {
				// print star
				System.out.print("*");
			}
			// Ending line after each row
			System.out.println();
			m++;
		}
	}
}
