package Sorting;

import LinkedList.Node;

public class SortedLinkedList {

    private Node head;

    public SortedLinkedList(int[] arr) {
        for (int element: arr) {
            add(element);
        }
    }

    private void addBegin(int element) {
        Node newNode = new Node(element); // new node
        newNode.next = head; //point next field of the new node to current head
        head = newNode; // point head to the new node
    }

    public void add(int element) {
        if (head==null || element<=head.value) {
            addBegin(element);
        }
        else {
            Node curr = head;
            while(curr.next!=null && curr.next.value<=element) {
                curr = curr.next;
            }
            Node newNode = new Node(element);
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public void display() {
        System.out.print("Sorted LinkedList : ");
        Node curr = head; // 1
        while (curr != null) { // n
            System.out.print(curr.value+" "); // 1*n
            curr = curr.next; // 1*n
        }
        System.out.println();
    }

}