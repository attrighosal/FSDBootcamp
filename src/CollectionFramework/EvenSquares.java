package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquares {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // [1,2,3,4,5]

        // 1. For loop
        ArrayList<Integer> squares1 = new ArrayList<>();
        for (int i=0; i<arr.size(); i++) {
            int element = arr.get(i);
            if ((element*element)%2 == 0) {
                squares1.add(element*element);
            }
        }

        System.out.println("For Loop Result : "+squares1);

        // 2. Extended For Loop
        ArrayList<Integer> squares2 = new ArrayList<>();
        for (int element : arr) {
            if ((element*element)%2 == 0) {
                squares2.add(element*element);
            }
        }

        System.out.println("Extended For Loop Result : "+squares2);

        // 3. For Each Loop
        ArrayList<Integer> squares3 = new ArrayList<>();
        arr.forEach(x -> {
            if ((x*x)%2 == 0) {
                squares3.add(x*x);
            }
        });

        System.out.println("For Each Loop Result : "+squares3);

        // 4. Stream API
        List<Integer> squares4 = arr.stream().filter(x -> x%2==0).map(x -> x*x).collect(Collectors.toList());
        System.out.println("Stream API Result : "+squares4);
    }
}
