package Arrays1D2D;

public class MaximumElement {

  public static int findMax(int[] arr) {
    int max = arr[0]; // 1
    for (int i=1; i<arr.length; i++) {// 1+n+n
      if (arr[i]>max) { // 1*n
        max = arr[i]; // 1*n
      }
    }
    return max; // 1
  }
  // [1,2,3,4,5,6,7,8,9,10]
  // TC: 2+4n = 4n = O(n)
  // SC : 2 = O(1)

  public static void main(String[] args) {
    int[] arr = new int[] {1,5,3,6,8,2,10};
    int max = findMax(arr);
    System.out.println(max);
  }
}
