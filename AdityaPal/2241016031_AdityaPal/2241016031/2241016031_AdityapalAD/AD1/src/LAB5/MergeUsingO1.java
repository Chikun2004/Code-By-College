package LAB5;
import java.util.PriorityQueue;

public class MergeUsingO1{
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : arr1) {
            minHeap.add(num);
        }
        
        for (int num : arr2) {
            minHeap.add(num);
        }
        
        for (int i = 0; i < n + m; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        
        int[] merged = mergeSortedArrays(arr1, arr2);
        
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
