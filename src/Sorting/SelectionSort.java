package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {

        int n = arr.length;
        for (int i=0; i<n; i++) {

            // Finding the minimum element 
            int min = arr[i], minIndex=i;
            for (int j=i+1; j<n; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // swap the minimum element with the first element of the unsorted array
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
    
    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,5,8,2,4};

        int[] sortedArr = selectionSort(arr);

        System.out.println(Arrays.toString(sortedArr));
    }
}
