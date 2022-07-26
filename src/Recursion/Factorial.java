package Recursion;

public class Factorial {

  public static int linearFactorial(int n) {
    int fact = 1; // 1
    for (int i = 1; i <= n; i++) { // 1+n+n
      fact = fact * i; // 1*n
    }
    return fact; // 1
  }
  // Time = 1+1+n+n+n+1 = 3n+3 = 3n = n = O(n)
  // Space = 1+1 = 2 = O(2) = O(1)

  public static int recursiveFactorial(int n) {
    if (n==1) { // 1
      return 1;
    }
    return n*recursiveFactorial(n-1); // 1
  }
  // Time = 2*n = O(2*n) = O(n)
  // Space = 0*n^0 = O(1)*n = O(n)

  public static void main(String[] args) {
    int n = 5;
    int factorial = linearFactorial(n);
    System.out.println(factorial);
  }
}
