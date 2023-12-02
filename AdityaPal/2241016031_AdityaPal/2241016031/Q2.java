package LAB6;
//Linear Search with Recursion
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {20, 30, 40, 50, 60};
	        int n = array.length;
	        int x = 40;
	        int res = linearSearch(array, 0, x, n);
	        if (res == -1)
	            System.out.println("Element not present in the array");
	        else
	            System.out.println("Element found at index " + res);
	    }
	    static int linearSearch(int[] array, int start, int x, int n) {
	    	//Base Case
	        if (start == n) {
	            return -1;
	        }
	        //Recursive Case
	        if (array[start] == x) {
	            return start;
	        }
	        return linearSearch(array, start + 1, x, n);
		}
	}