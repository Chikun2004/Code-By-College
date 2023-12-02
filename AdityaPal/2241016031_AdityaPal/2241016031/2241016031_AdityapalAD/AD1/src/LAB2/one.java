package LAB2;
//**************USING RECURENCES************//
//1.sum of n numbers
//2.Finding maximum and minimum
//3.Factorial of a number
//4.Generating nth fibonacci number
//5.Finding the GCD
//6.CONVERSION FROM DECIMAL TO HEXADECIMAL EQUIVALENT NUMBER
//7.COMPUTING NTH POWER OF A NUMBERS
//8.SMALLEST POSITIVE MISSING NUMBER
public class one
{ 
	public static int recurSum(int n) 
	{ 
		if (n <= 1) 
			return n; 
		return n + recurSum(n - 1); 
	} 
	public static void main(String args[]) 
	{ 
		int n = 17; 
		System.out.println(recurSum(n)); 
	} 
}