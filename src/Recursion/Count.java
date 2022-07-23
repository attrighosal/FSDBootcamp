package Recursion;

public class Count {

  public static int count(int p) {
    if (p==0) {
      return 0;
    }
    return 1+count(p-1);
  }

  public static void main(String[] args) {
    int positions = 5;
    int result = count(positions);
    System.out.println(result);
  }
}
