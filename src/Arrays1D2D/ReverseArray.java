package Arrays1D2D;

import java.util.Arrays;

public class ReverseArray {

  public static int[] reverseArray(int[] arr) {
    int n=arr.length; // 1
    for (int i=0; i<n/2; i++) { // 1+n/2+n/2
      int temp = arr[i]; // 3*n/2
      arr[i] = arr[n-i-1];
      arr[n-i-1] = temp;
    }
    return arr;// 1
  }
  // TC : 1+1+n/2+n/2+3n/2 = 2+ 5*n/2 = (5/2)*n = O(n)
  // SC : 3 = O(1)

  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4,5};
    int[] reversed = reverseArray(arr);
    System.out.println(Arrays.toString(reversed));
  }
}
