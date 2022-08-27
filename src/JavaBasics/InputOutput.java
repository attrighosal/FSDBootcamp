package JavaBasics;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat(); // 1.1234567
        double c = sc.nextDouble(); // 1.123456789012345
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
