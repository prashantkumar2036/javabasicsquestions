// Java program to Print Reverse Pyramid Star Pattern
// Using do-while loop
// Main Class
public class reversepattern3 {
	// Main driver method
	public static void main(String[] args)
	{
		// Declare and initialize variable to
		// Size of the pyramid
		int number = 7;
		int i = number, j;
		// Outer loop iterate until i > 0 is false
		do {
			j = 0;
			// First inner do-while loop
			do {
				// Prints space until j++ < number - i is
				// false
				System.out.print(" ");
			} while (j++ < number - i);
			j = 0;
			// Second inner do-while loop
			// Inner loop prints star
			// until j++ < i * 2 - 2 is false
			do {
				// print star
				System.out.print("*");
			}
			while (j++ < i * 2 - 2);
			// Print whitespace
			System.out.println("");
		}
		// while of outer 'do-while' loop
		while (--i > 0);
	}
}
