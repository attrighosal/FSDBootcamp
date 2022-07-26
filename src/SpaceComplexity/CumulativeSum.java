package SpaceComplexity;

import java.util.Arrays;

public class CumulativeSum {

  public static int[] cumulativeSum(int[] arr) {
    int[] cSum = new int[arr.length]; // n
    cSum[0] = arr[0];
    for (int i=1; i< arr.length; i++) { // 1
      cSum[i] = cSum[i-1]+arr[i];
    }
    return cSum;
  }
  // Space = n+1 = O(n)

  public static void main(String[] args) {
    int[] arr = new int[] {1,2,4,8,3,9,5};
    int[] cSum = cumulativeSum(arr);
    System.out.println(Arrays.toString(cSum));
  }
}
