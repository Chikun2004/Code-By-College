package LAB6;
//Linear Search without Recursion
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20, 30, 40, 50, 60};
        int n = array.length;
        int x = 40;
        int res = linearSearch(array, n, x);
        if (res == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + res);
    }

    static int linearSearch(int[] array, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
	}
}
