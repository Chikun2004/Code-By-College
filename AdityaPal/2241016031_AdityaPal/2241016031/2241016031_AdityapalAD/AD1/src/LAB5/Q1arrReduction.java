package LAB5;

import java.util.Arrays;

public class Q1arrReduction {
	static void ArrayReduction(int []arr,int size) {
       Arrays.sort(arr);
       int count = 1;
       int reduction= arr[0];
       for (int i = 0; i < size; i++) {
    	   if (arr[i] - reduction > 0) {
    	   System.out.println(size - i);
    	   reduction = arr[i];
    	   count += 1;
    	   }
    	   }
    	   System.out.println("Total number of reductions " + count);
    	   }
	public static void main(String[] args) {
		int arr[] = { 5, 1, 1, 1, 2, 3, 5 };
		ArrayReduction(arr, arr.length);
		}
}