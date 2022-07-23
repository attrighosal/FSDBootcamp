package Recursion;

public class MethodStack {

  public static int add(int a, int b){
    return a+b;
  }


  public static void main(String[] args) {
    int a = 5;
    int b = 4;
    int sum = add(a,b);
    System.out.println(sum);
  }
}
