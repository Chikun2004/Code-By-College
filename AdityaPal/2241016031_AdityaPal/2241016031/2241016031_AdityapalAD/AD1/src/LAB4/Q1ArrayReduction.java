package LAB4;

import java.util.*;

public class Q1ArrayReduction {
	static void arrayReduction(int[]arr,int size) {
		Arrays.sort(arr);
		int c = 1;
		int red = arr[0];
		for(int i =0;i<size;i++) {
			if(arr[i]-red > 0) {
				red = arr[i];
				c+=1;
			}
		  }
	    System.out.println("Total No. of reduction:-"+c);
	}
	    public static void main(String[] args) {
	      int arr[] = {5,3,1,1,2,4};
	      arrayReduction(arr,arr.length);
	    }
	}