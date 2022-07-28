package Recursion;

public class Fibonacci {

  public static int fib(int n) {
    if (n<=1) { // 1
      return n; // 1
    }
    return fib(n-1)+fib(n-2); //1
  }
  // 1+1 = 2 * 5 = 10

  public static void main(String[] args) {
    int n = 3;
    int ans = fib(n);
    System.out.println(ans);
  }
}

// if n==0 -> 0
// if n==1 -> 1
// n==2 -> fib(2) -> fib(1)+fib(0) -> 1+0 =
