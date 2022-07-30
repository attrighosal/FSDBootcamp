package Arrays1D2D;

public class SubArraySum {

  public static boolean isSubArraySum(int[] arr, int target) {
    int start=0, end=0, sum=arr[0];
    while(end<arr.length) {
      if (target==sum) {
        return true;
      }
      else if (sum<target) {
        end++; // end = 6+1=7 (7) -> [0,6]
        if (end>= arr.length) {
          break;
        }
        sum += arr[end];
      }
      else  {
        sum -= arr[start];
        start++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4,2,8,6};
    int target = 15;
    boolean isPresent = isSubArraySum(arr, target);
    System.out.println(isPresent);
  }
}
