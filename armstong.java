// JAVA program to find Armstrong
// numbers between two integers
class armstrong
{
	// Function to print Armstrong
	// Numbers between two integers
	static void ArmstrongNum(int l, int h)
	{
		for (int j = l + 1; j < h; ++j) 
			//A for loop is a control flow statement for specifying iteration,
			//which allows code to be executed repeatedly. 
			//A for loop has two parts: a header specifying the iteration, 
			//and a body which is executed once per iteration.
		{
			// Calculating number of digits
			int y = j;
			int N = 0;
			while (y != 0) {
				y /= 10;
				N++;
			}
			// Calculating the sum of nth
			// power of all the digits
			int sum_power = 0;
			y = j;
			while (y != 0) 
			{
				int d = y % 10;
				sum_power += Math.pow(d, N);
				y /= 10;
			}
			// Checking if the current number
			// i is equal to the sum of nth
			// power of all the digits
			if (sum_power == j)
				System.out.print(j + " ");
		}
	}
	// The Driver code
	public static void main(String args[])
	{
		int n1 = 50;
		int n2 = 500;
		System.out.println("the numbers are");
		ArmstrongNum(n1, n2);
	}
}
