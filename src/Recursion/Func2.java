package Recursion;

public class Func2 {

    public static int fun(int n) {
        int x = 1, k;
        if (n == 1) {
            return x;
        } else {
            for (k = 1; k < n; ++k) {
                x += fun(k) * fun(n - k);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fun(4));
    }
}

/*
    fun(1) = 1
    fun(2) = 2 (x=x+fun(1)*fun(1)=1+1*1=2)
    fun(3) = 1+1*2+2*1 = 5
    [x=1
    +fun(1)*fun(2)
    +fun(2)*fun(1)]
    fun(4) = [
     x = 1
     + fun(1)*fun(3) = 1*5 = 5
     + fun(2)*fun(2) = 2*2 = 4
     + fun(3)*fun(1) = 5*1 = 5
    ]  = 15
 */
