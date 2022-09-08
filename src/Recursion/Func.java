package Recursion;

public class Func {

    public static void fun(int x) {
        if (x > 0) { // 3
            fun(--x); // x=2
            System.out.print(x + " "); // print 2
            fun(x--); // x=1
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}

/*
fun (3)

fun(3) = fun(2) [x=2] fun(2) = [x=0] [x=1] [x=0] [x=2] [x=0] [x=1] [x=0]

fun(2) = fun(1) [x=1] fun(1) = [x=0] [x=1] [x=0]

fun(1) = fun(0) [x=0] fun(0) = [x=0]
 */
