package Conditionals;

import java.util.Scanner;

public class IfElseIfLadder {

    public static void main(String[] args) {
        // age 0 to 12 = child
        // age 13 to 19 = TeenAger
        // age 20 to 60 = Adult
        // age>60 = Senior Citizen

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Else If Ladder
        if (age>=0 && age<=12) {
            System.out.println("Child");
        }
        else if (age>12 && age<=19) {
            System.out.println("TeenAger");
        }
        else if (age>19 && age<60) {  // <60 <=59 [59,58,57,....,20]
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");
        }
    }
}
