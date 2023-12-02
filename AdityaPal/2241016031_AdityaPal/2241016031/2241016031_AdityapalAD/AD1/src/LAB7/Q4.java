package LAB7;
//Given an Array Of Integers,find the element pair with the minimum/Maximum difference
import java.util.HashMap;
public class Q4 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 19, 10, 33, 4};
        int[] minPair = findMinDifferencePair(array);
        int[] maxPair = findMaxDifferencePair(array);
        System.out.println("Minimum Difference Pair: ");
        System.out.println("Element 1: " + minPair[0] + ", Element 2: " + minPair[1]);
        System.out.println("Maximum Difference Pair: ");
        System.out.println("Element 1: " + maxPair[0] + ", Element 2: " + maxPair[1]);
    }
    public static int[] findMinDifferencePair(int[] array) {
        int[] pair = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                pair[0] = num;
                pair[1] = map.get(num);
                return pair;
            }
            map.put(num, num);
        }
        return pair;
    }
    public static int[] findMaxDifferencePair(int[] array) {
        int[] pair = new int[2];
        int minElement = array[0];
        int maxDifference = array[1] - array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] - minElement > maxDifference) {
                maxDifference = array[i] - minElement;
                pair[0] = minElement;
                pair[1] = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return pair;
    }
}