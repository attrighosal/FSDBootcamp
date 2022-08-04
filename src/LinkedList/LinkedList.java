package LinkedList;

public class LinkedList {
    
    public Node head;
    
    public void add(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }
}
