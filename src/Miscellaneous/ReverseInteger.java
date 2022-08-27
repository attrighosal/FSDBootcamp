package Miscellaneous;

public class ReverseInteger {

    public static int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int rem = x%10;
            r = r*10 + rem;
            x = x/10;
        }
        return r;
    }

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE; // 2147483647 -> 7463847412 (int) = 0
        int r = reverse(x);
        System.out.println(r);
    }
}
