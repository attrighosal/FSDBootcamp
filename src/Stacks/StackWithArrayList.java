package Stacks;

import java.util.ArrayList;
import java.util.List;

public class StackWithArrayList {

    List<Integer> arrayList;

    public StackWithArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public void push(int element) {
        arrayList.add(element);
    }

    public int peek() {
        if (arrayList.isEmpty()) {
            System.out.println("The stack is Empty !!");
            return -1;
        }
        return arrayList.get(arrayList.size()-1);
    }

    public int pop() {
        if (arrayList.isEmpty()) {
            System.out.println("Stack Underflow !!");
            return -1;
        }
        int lastElement = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return lastElement;
    }
}
