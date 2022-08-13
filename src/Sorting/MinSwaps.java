package Sorting;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class MinSwaps {

    public static int minimumSwaps(int[] arr) {

        Map<Integer, LinkedList<Integer>> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            map.putIfAbsent(arr[i], new LinkedList<>()); // 2 -> []
            map.get(arr[i]).add(i); // [] -> [0]
        } // O(n)

        int[] arrayCopy = Arrays.copyOf(arr, arr.length); // O(n)

        Arrays.sort(arrayCopy); //bs, ss, (ms, qs -> nlogn)

        int minSwaps = 0;

        for (int i=0; i<arr.length; i++) { // O(n)
            if (arr[i] != arrayCopy[i]) {
                int currentPosition = map.get(arrayCopy[i]).getFirst();
                map.get(arr[i]).set(0, currentPosition);
                arr[currentPosition] = arr[i];
                minSwaps++;
            }
            map.get(arrayCopy[i]).removeFirst();
        }

        return minSwaps;
    }
    
    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,5,4,8,2,4};
        int minSwaps = minimumSwaps(arr);
        System.out.println("Minimum Swaps required : "+minSwaps);
    }
}
