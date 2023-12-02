package LAB7;
//Given a list n numbers,find the element Which appears Maximum number of times
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 2, 2, 1, 4, 2, 2, 1);
        findMaxOccurrenceElement(list);
    }
    public static void findMaxOccurrenceElement(List<Integer> list) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int maxElement = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println("Element which appears maximum number of times: " + maxElement);
        System.out.println("Maximum number of times it appears: " + maxCount);
    }
}