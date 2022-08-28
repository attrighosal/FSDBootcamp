package CollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // int[] arr = new int[100];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // Extended For loop
        for (int element : arr) {
            System.out.println(element);
            System.out.println(element*element);
        }

        System.out.println("=============================================");

        // For Each Loop with Lambda Expression
        arr.forEach(x -> {
            System.out.println(x);
            System.out.println(x*x);
        }); // 1 4 9 16 25

        /*
        1
        1
        2
        4
        3
        9
        4
        16
        5
        25
         */
    }
}
