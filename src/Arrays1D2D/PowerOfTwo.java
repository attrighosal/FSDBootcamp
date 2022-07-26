package Arrays1D2D;

import java.util.Scanner;

public class PowerOfTwo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] power = new int[size];

    // 1. Using Math.pow
//    for (int i=0; i<size; i++) {
//      power[i] = (int)Math.pow(2, i);
//    }

    // 2. Using Cumulative
//    power[0] = 1; // [1,2,4,8,16]
//    for (int i=1; i<size; i++) {
//      power[i] = power[i-1]*2; // i=2, i-1=1
//    }
    // [1,2,4,8,16,32,64,128]

    // 3. Left Shift
    for (int i=0; i<size; i++) {
      power[i] = (1<<i);
    }

    // Print
    for (int i=0; i<size; i++) {
      System.out.println(power[i]);
    }
  }
}
