package Recursion;

import java.util.Arrays;

public class Permutations {

    public static void recursivePrintPermutations(int[] array, boolean[] visited, int[] permutations, int level) {

        if (level >= array.length) {
            System.out.println(Arrays.toString(permutations));
            return;
        }
        for (int i=0; i<array.length; i++) {
            if (!visited[i]) {
                permutations[level] = array[i];
                visited[i] = true;
                recursivePrintPermutations(array, visited, permutations, level+1);
                visited[i] = false;
            }
        }
    }

    public static void printPermutations(int[] array) {
        boolean[] visited = new boolean[array.length];
        int[] permutations = new int[array.length];
        recursivePrintPermutations(array, visited, permutations, 0);
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3};
        printPermutations(array);
    }
}
