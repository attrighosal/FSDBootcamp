package Recursion;

public class Atoi {

    public static int recursiveAtoi(String number, int index, int integer) {
        if (index>=number.length()) {
            return integer;
        }
        if (number.charAt(index) < '0' || number.charAt(index)>'9') {
            return -1;
        }
        int digit = number.charAt(index)-'0';
        integer = integer*10+digit;
        return recursiveAtoi(number, index+1, integer);
    }

    public static int atoi(String number) {
        return recursiveAtoi(number, 0, 0);
    }

    public static void main(String[] args) {
        String number = "12345";
        int integer = atoi(number);
        System.out.println(integer);
    }
}
/*
12345

recursion 1 = 0th index, integer = integer*10 + 1 = 1

recursion 2 ("12345", 1, 1) = integer = integer*10+digit = 1*10+2 = 12

recursion 2 ("12345", 2, 12) = integer = integer*10+digit = 12*10+3 = 123


'1'-'0' = 49-48=1
'2'-0' = 50-48=2
 */
