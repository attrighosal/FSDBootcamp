package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySorting {

    public static int[] frequencySort(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int element : arr) {
            int initialCount = count.getOrDefault(element, 0);
            count.put(element, initialCount+1);
        }
        int[][] countArray = new int[count.size()][2];

        int row = 0;
        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            int element = entry.getKey();
            int eCount = entry.getValue();
            countArray[row][0] = element;
            countArray[row][1] = eCount;
            row++;
        }

        Arrays.sort(countArray, (a,b) -> {
            if (a[1]==b[1]) {
                return a[0]-b[0];
            }
            return b[1]-a[1];
        });

        int k=0;
        for (int i=0; i<countArray.length; i++) {
            int element = countArray[i][0];
            int eCount = countArray[i][1];
            for (int j=0; j<eCount; j++) {
                arr[k++] = element;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,3,5,4,4,6};
        int[] sortedArray = frequencySort(arr);
        System.out.println("Frequency Sorted Array : " + Arrays.toString(sortedArray));
    }
}

// https://leetcode.com/problems/add-two-numbers/
