package DoublyLinkedList;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }

    public void addBegin(int value) {
        
        Node newNode = new Node(value);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public Node addEnd(int value) {

        Node newNode = new Node(value);
        newNode.next = tail;
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        return newNode;
    }

    public Node deleteBegin() {
        if (!isEmpty()) {
            Node node = head.next;
            head.next = head.next.next;
            head.next.prev = head;
            return node;
        }
        return null;
    }

    public void deleteEnd() {
        if (!isEmpty()) {
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }
    }

    public void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void display() {
        System.out.print("LinkedList: ");
        Node curr = head.next;
        while(curr != tail) {
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        System.out.print("Reversed LinkedList: ");
        Node curr = tail.prev;
        while(curr != head) {
            System.out.print(curr.value+" ");
            curr = curr.prev;
        }
        System.out.println();
    }
}
