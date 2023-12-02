package LAB2;
import java.util.*;
public class eight{
		public static int findSmallestPositiveMissingNumber(int[] arr) {
			  if (arr.length == 0) {
			    return 1;
			  }
			  boolean hasPositiveNumber = false;
			  int smallestPositiveNumber = Integer.MAX_VALUE;
			  for (int i = 0; i < arr.length; i++) {
			    if (arr[i] > 0) {
			      hasPositiveNumber = true;
			      smallestPositiveNumber = Math.min(smallestPositiveNumber, arr[i]);
			    }
			  }

			  if (!hasPositiveNumber) {
			    return 1;
			  }

			  if (smallestPositiveNumber == 1) {
			    return 2;
			  }

			  return smallestPositiveNumber - 1;
			}
		public static void main(String[] args) {
		     System.out.println();	
	}

}
