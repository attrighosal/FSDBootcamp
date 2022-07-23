package Recursion;

public class ArraySum {

  public static int linearSum(int[] arr) {
    int sum = 0;
    for (int i=0; i<arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int recursiveSum(int[] arr, int position) {
    if (position==arr.length) {
      return 0;
    }
    return arr[position] + recursiveSum(arr, position+1);
  }

  public static void main(String[] args) {
    int[] arr = new int[] {2,5,3,1,4,5,6,8};

    int sum = linearSum(arr);
    int rSum = recursiveSum(arr, 0);
    System.out.println(sum + " " + rSum);
  }
}
