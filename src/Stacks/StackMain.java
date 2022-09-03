package Stacks;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("===================== Stack with Array ===================================");
        StackWithArray stackWithArray = new StackWithArray(5);

        System.out.println(stackWithArray.peek());
        stackWithArray.push(5);
        System.out.println(stackWithArray.peek());
        stackWithArray.push(2);
        System.out.println(stackWithArray.peek());
        stackWithArray.push(4);
        System.out.println(stackWithArray.peek());
        stackWithArray.push(10);
        System.out.println(stackWithArray.peek());
        stackWithArray.push(11);
        System.out.println(stackWithArray.peek());
        stackWithArray.push(12);

        System.out.println("Popped element : "+stackWithArray.pop());
        System.out.println("Popped element : "+stackWithArray.pop());
        System.out.println("Popped element : "+stackWithArray.pop());
        System.out.println("Popped element : "+stackWithArray.pop());
        System.out.println("Popped element : "+stackWithArray.pop());
        System.out.println("Popped element : "+stackWithArray.pop());


        System.out.println("===================== Stack with ArrayList ===================================");
        StackWithArrayList stackWithArrayList = new StackWithArrayList();

        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(5);
        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(2);
        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(4);
        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(10);
        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(11);
        System.out.println(stackWithArrayList.peek());
        stackWithArrayList.push(12);
        System.out.println(stackWithArrayList.peek());

        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());
        System.out.println("Popped element : "+stackWithArrayList.pop());

        System.out.println("===================== Stack with LinkedList ===================================");
        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();

        System.out.println(stackWithLinkedList.peek());
        stackWithLinkedList.push(5);
        System.out.println(stackWithLinkedList.peek());
        stackWithLinkedList.push(2);
        System.out.println(stackWithLinkedList.peek());
        stackWithLinkedList.push(4);
        System.out.println(stackWithLinkedList.peek());

        System.out.println("Popped element : "+stackWithLinkedList.pop());
        System.out.println("Popped element : "+stackWithLinkedList.pop());
        System.out.println("Popped element : "+stackWithLinkedList.pop());
        System.out.println("Popped element : "+stackWithLinkedList.pop());

        System.out.println("===================== Stack from Java Util ===================================");
        Stack<Integer> stack = new Stack<>();

//        System.out.println(stack.peek());
        stack.push(5);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.peek());

        System.out.println("Popped element : "+stack.pop());
        System.out.println("Popped element : "+stack.pop());
        System.out.println("Popped element : "+stack.pop());
//        System.out.println("Popped element : "+stack.pop());
    }
}
