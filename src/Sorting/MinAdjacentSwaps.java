package Sorting;

public class MinAdjacentSwaps {

    public static int merge(int[] array, int begin, int mid, int end) {

        int p1 = begin, p2 = mid+1, size=end-begin+1,k=0,swaps=0;
        int[] mergedArray = new int[size];
        while(p1 <= mid && p2 <= end) {
            if (array[p1]<=array[p2]) {
                mergedArray[k++] = array[p1++];
            }
            else {
                swaps += mid-p1+1;
                mergedArray[k++] = array[p2++];
            }
        }

        while (p1 <= mid) {
            mergedArray[k++] = array[p1++];
        }

        while (p2 <= end) {
            mergedArray[k++] = array[p2++];
        }

        for (int i=begin, j=0; i<=end; i++, j++) {
            array[i] = mergedArray[j];
        }

        return swaps;
    }

    public static int mergeSort(int[] array, int begin, int end) {

        int swaps = 0;
        if (begin<end) {
            int mid = (begin+end)/2;      // divide
            swaps += mergeSort(array, begin, mid); // left = 0 -> mid
            swaps += mergeSort(array, mid+1, end); // right = mid+1 -> end
            swaps += merge(array, begin, mid, end); // merge
        }
        return swaps;
    }

    public static int countMinAdjacentSwaps(int[] array) {
        return mergeSort(array, 0, array.length-1);
    }

    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,4,8,2,4};
        int minSwaps = countMinAdjacentSwaps(array);
        System.out.println("Minimum Adjacent Swaps : " + minSwaps);
    }
}
