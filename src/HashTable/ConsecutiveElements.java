package HashTable;

import java.util.HashSet;

public class ConsecutiveElements {

    public static boolean findIfConsecutive(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int minimum = array[0];
        for (int element: array) {
            set.add(element);
            minimum = Math.min(minimum, element);
        }

        int maximum = minimum + array.length-1;

        for (int i=minimum; i<=maximum; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[] {18,23,20,19,21};//{5,6,4,2,3,1};
        boolean isConsecutive = findIfConsecutive(array);
        System.out.println("Is Consecutive : "+isConsecutive);
    }
}
