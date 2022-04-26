package JAVA_CONVERSION;
// Java program to Convert Number in Characters

// Importing input output classes
import java.io.*;

// Main class
public class inttochar {
	
	// Method 1
	// To convert numbers to characters
	static void NumbertoCharacter(int n)
	{
		// Initially declaring and initializing
		// reverse of number and remainder to zero
		int rev = 0, r = 0;

		// If number is positive
		while (n > 0) {
		
		// For reversal of number

			// The remainder will give
			// the last digit of the number
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		while (rev > 0) {

			// Extract the first digit
			// of the reversed number
			r = rev % 10;

			// Match it with switch case
			switch (r) {
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
			case 0:
				System.out.print("zero ");
				break;
				
			// Default case when above switch cases holds false
			default:
				System.out.print("InValid ");
				break;
			}

			// Divide the number by 10
			// to get the next number
			rev = rev / 10;
		}
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Custom input integer
		int n = 12345;
		
		// Calling the above function(Method1)
		NumbertoCharacter(n);
	}
}
