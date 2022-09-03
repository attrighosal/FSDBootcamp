package Stacks;

public class StackWithArray {

    private int size;
    private int[] arr;
    private int top;

    public StackWithArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (top==size-1) {
            System.out.println("Stack Overflow !!");
        }
        else {
            top++;
            arr[top] = element;
        }
    }

    public int peek() {
        if (top==-1) {
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return arr[top];
        }
    }

    public int pop() {
        if (top==-1) {
            System.out.println("Stack underflow !!");
            return -1;
        }
        else {
            top--;
            return arr[top+1];
        }
    }
}
