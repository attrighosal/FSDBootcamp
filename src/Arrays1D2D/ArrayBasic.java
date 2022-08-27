package Arrays1D2D;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        // int[] a = new int[5];
        int[] a = new int[100]; // Created an Array of size 5

        System.out.println(Arrays.toString(a)); // [0,0,0,0,......0]

        // Assigning Values to the array using for loop
        for (int i=0; i<100; i++) {
            a[i] = i+1; //
        }

        System.out.println(Arrays.toString(a)); // [1,2,3,4,5,....100]

        for (int i=0; i<100; i++) {
            System.out.println(a[i]);
        }

        // Assigning Values using while loop
        int i=0;
        while(i<100) {
            a[i] = i+1;
            i++;
        }


    }
}
