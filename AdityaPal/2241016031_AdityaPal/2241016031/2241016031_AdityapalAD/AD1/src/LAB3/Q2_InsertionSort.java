package LAB3;

public class Q2_InsertionSort {
	 void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        int arr[] = {34,43,26,76,89,69,56};
	      Q2_InsertionSort sc = new Q2_InsertionSort();
	        sc.sort(arr);
	        System.out.println("Sorted Array:");
	        printArray(arr);
	    }
}
	        
	        
	        