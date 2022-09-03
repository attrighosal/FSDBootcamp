package Stacks;

import LinkedList.LinkedList;

public class StackWithLinkedList {

    private LinkedList ll;

    public StackWithLinkedList() {
        this.ll = new LinkedList();
    }

    public void push(int element) {
        ll.addBegin(element);
    }

    public int peek() {
        if (ll.isEmpty()) {
            System.out.println("The stack is Empty !!");
        }
        return ll.getBegin();
    }

    public int pop() {
        if (ll.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedElement = ll.getBegin();
        ll.deleteBegin();
        return poppedElement;
    }
}
