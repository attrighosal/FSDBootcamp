package LinkedList;

public class LinkedList {
    
    public Node head;
    
    public void addBegin(int value) {
        Node newNode = new Node(value); // new node
        newNode.next = head; //point next field of the new node to current head
        head = newNode; // point head to the new node
    }
    // TC: O(1) (1+1+1) = 3 = 3*n^0 = n^0 = 1 = O(1)

    public void addEnd(int value) {
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
        }
        else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    // TC: O(n)

    public void deleteBegin() {
        if (head != null) {
            head = head.next;
        }
    }
    // TC: O(1)

    public void deleteEnd() {
        if (head==null || head.next==null) {
            head = null;
        }
        else {
            Node curr = head;
            while(curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }
    // TC: O(n) = 1*n^1 + (-1)*n^0 = 1*n^1 = n^1 = n
    
    public void findMid() {
        if (head==null) {
            System.out.println("List is empty");
        }
        else {
            Node slow = head;
            Node fast = head;
            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Middle element is : "+slow.value);
        }
    }
    // TC: O(n) = n/2 = (1/2)*n^1 = O(n)

    public boolean isEmpty() {
        return head == null;
    }

    public int getBegin() {
        if (isEmpty()) {
            return -1;
        }
        return head.value;
    }

    public void display() {
        System.out.print("LinkedList : ");
        Node curr = head; // 1
        while (curr != null) { // n
            System.out.print(curr.value+" "); // 1*n
            curr = curr.next; // 1*n
        }
        System.out.println();
    }
    // TC : O(2n+1) = 2*n^1+1*n^0 = 2*n^1 = n^1 = n O(n)
}
