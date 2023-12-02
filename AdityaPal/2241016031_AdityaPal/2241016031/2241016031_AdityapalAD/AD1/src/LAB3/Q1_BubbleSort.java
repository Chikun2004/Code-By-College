package LAB3;

public class Q1_BubbleSort {
	void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        Q1_BubbleSort sc = new Q1_BubbleSort(); 
        int arr[] = { 45,34,67,78,70,87 }; 
        sc.bubbleSort(arr); 
        System.out.println("Sorted Array:"); 
        sc.printArray(arr); 
    }
}