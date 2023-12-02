package LAB7;
import java.util.HashMap;
public class Q2 {
    public static void main(String[] args) {
        int[] nums = {11, 10, 7, 8, 5, 10, 7, -3};
        printDuplicates(nums);
    }
    public static void printDuplicates(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                System.out.println("Duplicate number found: " + num);
            }
            else {
                numMap.put(num, 1);
            }
        }
    }
}