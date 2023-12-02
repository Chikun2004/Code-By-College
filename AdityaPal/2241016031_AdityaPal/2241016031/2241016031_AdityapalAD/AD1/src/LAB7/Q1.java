package LAB7;
//Finding First repeated element in an Array
import java.util.HashMap;
public class Q1 {
    public static void main(String[] args) {
        int[] nums = {11,10,7,8,5,10,7,-3};
        System.out.println(findRepeated(nums));
    }
    public static int findRepeated(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                return num;
            } else {
                numMap.put(num, 1);
            }
        }
        return -1;
    }
}
