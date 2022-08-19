package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] array, int begin, int mid, int end) {
        // left -> (begin, mid)
        // right -> (mid+1, end)
        int p1 = begin, p2 = mid+1, size=end-begin+1,k=0; // [0,3] [4,6] -> 0, 3, 6 = 6-0+1 = 7
        // [4,5] [6,6] -> 4, 5, 6 = 6-4+1 = 3
        // [4,5] [2,3] -> [2,3,_,_] k=1
        int[] mergedArray = new int[size];
        while(p1 <= mid && p2 <= end) {
            if (array[p1]<=array[p2]) {
                mergedArray[k++] = array[p1++];
            }
            else {
                mergedArray[k++] = array[p2++];
            }
        }

        while (p1 <= mid) {
            mergedArray[k++] = array[p1++];
        }

        while (p2 <= end) {
            mergedArray[k++] = array[p2++];
        }

        for (int i=begin, j=0; i<=end; i++, j++) { // [2,3,4,5,2,4,8] [2,2,3,4,4,5,8]
            array[i] = mergedArray[j];
        }
    }

    public static int[] mergeSort(int[] array, int begin, int end) {

        if (begin<end) {
            int mid = (begin+end)/2;      // divide
            mergeSort(array, begin, mid); // left = 0 -> mid
            mergeSort(array, mid+1, end); // right = mid+1 -> end
            merge(array, begin, mid, end); // merge
        }
        return array;
    }
    
    public static void main(String[] args) {
        
        int[] array = new int[] {2,3,5,4,8,2,4}; //
        int[] sortedArray = mergeSort(array, 0, array.length-1);
        System.out.println("Merge Sorted Array : " + Arrays.toString(sortedArray));
    }
}
