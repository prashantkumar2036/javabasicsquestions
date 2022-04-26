package JAVA_CONVERSION;
// Java program to Decimal to binary conversion
// using bitwise operator
// Size of an integer is assumed to be 32 bits

class dectobin2 {
	// Function that convert Decimal to binary
	public void decToBinary(int n)
	{
		// Size of an integer is assumed to be 32 bits
		for (int i = 31; i >= 0; i--) {
			int k = n >> i;
			if ((k & 1) > 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}

class dectobin {
	// driver code
	public static void main(String[] args)
	{
		dectobin g = new dectobin();
		int n = 32;
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		g.dectobin2(n);
	}

    private void dectobin2(int n) {
    }
}
// This code is contributed by mits
