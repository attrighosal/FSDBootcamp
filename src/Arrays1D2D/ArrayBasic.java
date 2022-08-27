package Arrays1D2D;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        // int[] a = new int[5];
        int[] a = new int[100]; // Created an Array of size 5

        System.out.println(Arrays.toString(a));

        // Assigning Values to the array using for loop
        for (int i=0; i<100; i++) {
            a[i] = i+1; // 0->1
        }

        // Assigning Values using while loop
        int i=0;
        while(i<100) {
            a[i] = i+1;
            i++;
        }

        System.out.println(Arrays.toString(a));
    }
}
