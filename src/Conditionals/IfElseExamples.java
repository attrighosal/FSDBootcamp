package Conditionals;

import java.util.Scanner;

public class IfElseExamples {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Condition check
        if (age>=18) { // True
            System.out.println("Adult");
        }
        else { // age<18
            System.out.println("Not Adult");
        }
        System.out.println("Ending the Program");
    }
}
