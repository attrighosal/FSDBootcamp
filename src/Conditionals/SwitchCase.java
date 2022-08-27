package Conditionals;

public class SwitchCase {

    public static void main(String[] args) {

        int month = 2;

        // Else If Ladder
        /*
        if (month==1) {
            System.out.println("January");
        }
        else if (month==2) {
            System.out.println("February");
        }
        else if (month==3) {
            System.out.println("March");
        }
        // ... 12
        else {
            System.out.println("Incorrect input");
        }
        */

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
                // add all 12 cases
            default:
                System.out.println("Incorrect Input");
        }
        System.out.println("End");
    }
}
