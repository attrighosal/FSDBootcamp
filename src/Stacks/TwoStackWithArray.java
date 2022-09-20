package Stacks;

public class TwoStackWithArray {

    private int size;
    private int[] arr;
    private int top1;
    private int top2;

    public TwoStackWithArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top1 = -1;
        this.top2 = size;
    }

    public boolean isFull() {
        return top1+1==top2;
    }

    public void push1(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top1] = data;
    }

    public void push2(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[--top2] = data;
    }

    public int pop1() {
        if (top1==-1) {
            System.out.println("Stack underflow !!");
            return -1;
        }
        top1--;
        return arr[top1+1];
    }

    public int pop2() {
        if (top2==size) {
            System.out.println("Stack underflow !!");
            return -1;
        }
        top2++;
        return arr[top2-1];
    }
}
