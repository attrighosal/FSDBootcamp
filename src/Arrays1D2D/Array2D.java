package Arrays1D2D;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {

        // int[] a = new int[size]; definition without initialisation
        // int[] a = new int[] {1,2,3,4,5}; definition with initialisation
        // int[][] a = new int[3][5];
        // int[][] a = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        int[][] a = new int[3][5];
        int value = 1;

        for (int i=0; i<3; i++) { // rows = 0,1,2
            // Accessing col1 clo2 col3 col4 col5
            for (int j=0; j<5; j++) { // cols = 0,1,2,3,4
                // (0,0), (0,1), (0,2), (0,3), (0,4)
                // (1,0), (1,1), (1,2), (1,3), (1,4)
                // (2,0), (2,1), (2,2), (2,3), (2,4)
                a[i][j] = value; // (0,0) -> value(1) value++(2), (0,1)->value(2)
                value++;
            }
        }


        // Display 2D Array
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
