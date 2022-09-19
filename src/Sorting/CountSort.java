package Sorting;

import java.util.Arrays;

public class CountSort {

    public static int[] countSort(int[] array) {

        int[] count = new int[10];
        for(int element: array) {
            count[element]++;
        }

        int index = 0;
        for (int i=0; i<count.length; i++) {
            while (count[i]>0) {
                array[index++] = i;
                count[i]--;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,9,8,2,5,8,1,3,6,4};
        int[] sortedArray = countSort(array);
        System.out.println("count Sorted Array : "+ Arrays.toString(sortedArray));
    }
}
