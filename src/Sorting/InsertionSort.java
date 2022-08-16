package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {

        for (int i=1; i<arr.length; i++) {

            if (arr[i]<arr[i-1]) {

                int currentElement = arr[i];

                // 1. Find the right place for arr[i]
                int rightPosition = i-1;
                while(rightPosition>0 && arr[rightPosition-1]>currentElement) {
                    rightPosition--;
                }

                // 2. Right shift all the elements from the right position
                for (int j=i-1; j>=rightPosition; j--) {
                    arr[j+1] = arr[j];
                }

                // 3. Add the arr[i] to the right position
                arr[rightPosition] = currentElement;
            }
        }
        return arr;
    }

    public static int addUsingInsertionSort(int[] incompleteSortedArray, int size, int element) {

        // Code for insertion
        int rightPosition = size;
        while(rightPosition>0 && incompleteSortedArray[rightPosition-1]>element) {
            incompleteSortedArray[rightPosition] = incompleteSortedArray[rightPosition-1];
            rightPosition--;
        }
        incompleteSortedArray[rightPosition] = element;

        return size+1;
    }



    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,4,8,2,4};
        int[] sortedArray = insertionSort(array);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));

        int[] incompleteSortedArray = new int[] {2,2,3,4,4,5,8,0,0,0}; // {1,2,2,3,4,4,5,8,0,0}
        int size = 7;
        size = addUsingInsertionSort(incompleteSortedArray, size, 1);
        System.out.println("Adding new element using Insertion Sort : " + Arrays.toString(incompleteSortedArray));
        size = addUsingInsertionSort(incompleteSortedArray, size, 6);
        System.out.println("Adding new element using Insertion Sort : " + Arrays.toString(incompleteSortedArray));
        size = addUsingInsertionSort(incompleteSortedArray, size, 10);
        System.out.println("Adding new element using Insertion Sort : " + Arrays.toString(incompleteSortedArray));
    }
}