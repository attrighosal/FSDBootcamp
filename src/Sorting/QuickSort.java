package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] array, int begin, int end) {

        int b = begin, e=end-1;
        while (b<=e) {
            if (array[end]>=array[b]) {
                b++;
            }
            else {
                int temp = array[b];
                array[b] = array[e];
                array[e] = temp;
                e--;
            }
        }

        int temp = array[b];
        array[b] = array[end];
        array[end] = temp;

        return b;
    }

    public static void quickSort(int[] array, int begin, int end) {

        if (begin<end) {
            int position = partition(array, begin, end);
            quickSort(array, begin, position-1);
            quickSort(array, position+1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,4,8,2,4};
        quickSort(array, 0, array.length-1);
        System.out.println("Quick Sorted Array : " + Arrays.toString(array));
    }
}
