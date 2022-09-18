package HashTable;

import java.util.HashMap;
import java.util.Map;

public class EqualOneAndZeros {

    public static int findLongestEqualCount(int[] array) {
        int count = 0, longestSubArray = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        countMap.put(0, -1);

        for (int i=0; i<array.length; i++) {
            count = array[i] == 1 ? count + 1 : count - 1;
            if (countMap.containsKey(count)) {
                longestSubArray = Math.max(longestSubArray, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }
        return longestSubArray;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,0,1,1,1,0,0};
        int longestEqual = findLongestEqualCount(array);
        System.out.println("Length of Longest Sub array with equal number of zeros and ones : "+longestEqual);
    }
}
