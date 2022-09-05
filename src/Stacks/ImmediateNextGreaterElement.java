package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class ImmediateNextGreaterElement {

    public static int[] immediateNextGreater(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<array.length; i++) {
            while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                array[stack.pop()] = array[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            array[stack.pop()] = -1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2,4,3,5,6};
        int[] nextGreaterArray = immediateNextGreater(array);
        System.out.println("Immediate Next Greater Array : "+ Arrays.toString(nextGreaterArray));
    }
}
