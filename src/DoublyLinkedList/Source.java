package DoublyLinkedList;

public class Source {
    
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.display();

        dll.addBegin(1);
        dll.addBegin(2);
        dll.display();
        dll.displayReverse();

        dll.addEnd(4);
        dll.display();
        dll.displayReverse();
    }
}
