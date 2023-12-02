package LAB2;
//Recursive Java program to find minimum 
import java.util.*; 

class two {  
	public static int findMinRec(int A[], int n) 
	{ 
	if(n == 1) 
		return A[0]; 
		
		return Math.min(A[n-1], findMinRec(A, n-1)); 
	} 
	 public static int findMaxRec(int A[], int n) 
	    { 
	      if(n == 1) 
	        return A[0]; 
	          
	        return Math.max(A[n-1], findMaxRec(A, n-1)); 
	    } 
	public static void main(String args[]) 
	{ 
		int A[] = {-1,-4,3,4,5,5,5}; 
		int n = A.length; 
		System.out.println(findMinRec(A, n)); 
		System.out.println(findMaxRec(A, n));
	} 
} 
