package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        int swaps = 0;

        int n = arr.length; // 1
        for (int i=0; i<n; i++) { // n
            for (int p1=0, p2=1; p2<n-i; p1++, p2++) {
                if (arr[p1]>arr[p2]) {
                    int temp = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = temp;
                    swaps++;
                }
            }
            // if (arr[n-i-1]==target) count++;
        }
        System.out.println(swaps);
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,4,8,2,4};

        int[] sortedArr = bubbleSort(arr);

        System.out.println(Arrays.toString(sortedArr));
    }
}
