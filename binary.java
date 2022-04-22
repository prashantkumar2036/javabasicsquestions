// java program to add two binary strings
public class binary 
{
	// Function to add two binary strings
	static String add_Binary(String x, String y)
	{
		// Initializing result
		String res = "";
		// Initializing digit sum
		int d = 0;
		// Traversing both the strings starting
		// from the last characters
		int k = x.length() - 1, l = y.length() - 1;
		while (k >= 0 || l >= 0 || d == 1) 
			//What is while loop example?
					//A "While" Loop is used to repeat a specific block of code an unknown number of times, 
					//until a condition is met. 
					//For example, if we want to ask a user for a number between 1 and 10, 
					//we don't know how many times the user may enter a larger number, 
					//so we keep asking "while the number is not between 1 and 10".
		{
			// Computing the sum of last
			// digits and the carry
			d += ((k >= 0) ? x.charAt(k) - '0' : 0);
			d += ((l >= 0) ? y.charAt(l) - '0' : 0);
			// When the current digit's sum is either
			// 1 or 3 then add 1 to the result
			res = (char)(d % 2 + '0') + res;
			// Computing carry
			d /= 2;
			// Moving to the next digits
			k--;
			l--;
		}
		return res;
	}
	// The Driver code
	public static void main(String args[])
	{
		String x = "011011", y = "1010111";
		System.out.print(add_Binary(x, y));
	}
}
