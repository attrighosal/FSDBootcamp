package Recursion;

public class UniqueDigitSum {

    public static int backtrackCount(int previousElement, int n, int sum) {
        int count = 0;
        for(int i=previousElement+1; sum+i<=n; i++) { // i = [1,2,3,4,5,6]
            if (sum+i==n) {
                count++;
            }
            else {
                count += backtrackCount(i, n, sum+i);
            }
        }
        return count;
    }

    public static int countSumCombinations(int n) {
        return backtrackCount(0,n, 0);
    }

    public static void main(String[] args) {
        int n=6;
        int count = countSumCombinations(n);
        System.out.println(count);
    }
}
/*
 6 = (1,2,3) (1,5) (2,4) (6)
 10 = (1,2,3,4) (1,2,7) (1,3,6) (1,4,5) (1,9) (2,3,5) (2,8) (3,7) (4,6) (10)
 */
