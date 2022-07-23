package Recursion;

public class ReverseCount {

  public static int reverseCount(int p, int count) {
    if (p==0) {
      return count;
    }
    return reverseCount(p-1, count+1);
  }

  public static void main(String[] args) {
    int positions = 5;
    int total = reverseCount(5, 0);
    System.out.println(total);
  }
}
// 5 -> 0
// 4 -> 1
// 3 -> 2
// 2 -> 3
// 1 -> 4
// 0 -> 5
