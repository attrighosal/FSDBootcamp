package Arrays1D2D;

import java.util.Scanner;

public class Example {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt(); // 5000
    int[] a = new int[size]; // create size 5000
    // 5000 -> 2000

    for (int i=0; i<size; i++) {
      a[i] = i+1;
    }
    // [0,0,0,0,0] -> [1,2,3,4,5]

    for (int i=0; i<size; i++) {
      System.out.println(a[i]);
    }
    // print

    // Directly initialise
    int[] b = new int[] {1,2,3,4,5};

  }
}
