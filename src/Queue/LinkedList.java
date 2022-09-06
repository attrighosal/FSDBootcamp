package Queue;

import LinkedList.Node;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addEnd(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void deleteBegin() {
        if (!isEmpty()) {
            head = head.next;
            if (isEmpty()) {
                tail = null;
            }
        }
    }

    public boolean isEmpty() {
        return head==null;
    }

    public void display() {
        System.out.print("Values : ");
        Node curr = head; // 1
        while (curr != null) { // n
            System.out.print(curr.value+" "); // 1*n
            curr = curr.next; // 1*n
        }
        System.out.println();
    }
}
