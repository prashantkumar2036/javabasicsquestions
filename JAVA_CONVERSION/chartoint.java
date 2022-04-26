package JAVA_CONVERSION;
// Java program to convert
// char to int using ASCII value

class chartoint{
	public static void main(String[] args)
	{

		// Initializing a character(ch)
		char ch = '3';
		System.out.println("char value: " + ch);

		// Converting ch to it's int value
		int a = ch - '0';
		System.out.println("int value: " + a);
	}
}
