package Searching;

public class SquareRoot {

    public static int squareRoot(int x) {
        int beg=1, end=x, result=1;
        while(beg<=end) {
            int mid = (beg+end)/2;
            if (mid*mid==x) {
                return mid;
            }
            else if (mid*mid>x) {
                end = mid-1;
            }
            else {
                beg = mid+1; //beg = 6
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 26;
        int s = squareRoot(x);
        System.out.println("Square Root="+s);
    }
}
// 3.46 -> floor (3) ceil (4)
