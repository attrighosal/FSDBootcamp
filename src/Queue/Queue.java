package Queue;

public class Queue {

    private LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void insert(int element) {
        linkedList.addEnd(element);
    }

    public void delete() {
        if (linkedList.isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            linkedList.deleteBegin();
        }
    }

    public void display() {
        linkedList.display();
    }
}
