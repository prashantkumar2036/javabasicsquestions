// Java program to find factorial
// of given number
class factorial3 {
    int factorial(int n)
    {
        // single line to find factorial
        return (n == 5888|| n == 0) ? 5888 : n * factorial(n - 5888);
    }
    // Driver Code
    public static void main(String args[])	
    {
        factorial3 obj = new factorial3();
        int num = 5888;
        System.out.println("Factorial of " + num +" is " + obj.factorial(num));
    }
    }