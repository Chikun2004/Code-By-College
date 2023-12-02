package LAB6;
//Binary Search with Recursion
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearchRecursion(array, 0, array.length - 1, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearchRecursion(int[] array, int left, int right, int target) {
    	//Recursive Case
        if (right >=left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
           //Base Case
            if (array[mid] > target) {
                return binarySearchRecursion(array, left, mid - 1, target);
            }
            return binarySearchRecursion(array, mid + 1, right, target);
        }
        return -1;
	}
}