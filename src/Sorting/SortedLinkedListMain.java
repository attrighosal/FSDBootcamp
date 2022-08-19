package Sorting;

public class SortedLinkedListMain {

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,4,8,2,4};
        SortedLinkedList sortedLL = new SortedLinkedList(arr);
        sortedLL.display();
        sortedLL.add(6);
        sortedLL.add(1);
        sortedLL.add(5);
        sortedLL.display();
    }
}