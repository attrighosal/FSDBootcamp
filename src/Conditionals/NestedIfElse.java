package Conditionals;

public class NestedIfElse {

    public static void main(String[] args) {
        int age = 20;
        String bloodGroup = "A+";

        if (age>=18) {
            if (bloodGroup.equals("O+")) {
                System.out.println("Can Donate");
            }
            else {
                System.out.println("Can Consume");
            }
        }
        else {
            System.out.println("Can't Donate, Can't Consume");
        }
        System.out.println("End");
    }
}
