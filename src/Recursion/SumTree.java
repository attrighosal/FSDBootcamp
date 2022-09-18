package Recursion;

import java.util.Arrays;

public class SumTree {

    public static void printSumTree(int[] array) {
        if (array.length>1) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i] + array[i + 1];
            }
            printSumTree(newArray);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void recursiveOptimisedPrintSumTree(int[] array, int length) {
        // Recursive calls
        if (length>1) {
            for (int i=0; i<length-1; i++) {
                array[i] += array[i+1];
            }
            recursiveOptimisedPrintSumTree(array, length-1);
            for (int i=length-2; i>=0; i--) {
                array[i] -= array[i+1];
            }
        }

        // Printing the array
        System.out.print("[");
        for (int i=0; i<length; i++) {
            System.out.print(array[i]);
            if (i<length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void optimisedPrintSumTree(int[] array) {
        recursiveOptimisedPrintSumTree(array, array.length);
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
//        printSumTree(array);
        optimisedPrintSumTree(array);
    }
}

/*
Input - 1 2 3 4 5
Output

[48] = recursion 5

[20, 28] = recursion 4

[8, 12, 16] = recursion 3

[3, 5, 7, 9] = recursion 2

[1, 2, 3, 4, 5]  = recursion 1

 */
