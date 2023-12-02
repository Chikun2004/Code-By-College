package LAB7;
import java.util.HashSet;
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        int missing = findMissingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }
    public static int findMissingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}