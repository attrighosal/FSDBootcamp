package LinkedList;

public class Main {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Head : "+ll.head);

        ll.addEnd(0);
        // [0]
        ll.display();
        
        ll.addBegin(1);
        ll.addBegin(2);
        ll.addBegin(3);
        // [3,2,1,0]
        ll.display();

        ll.addEnd(4);
        ll.addEnd(5);
        // [3,2,1,0,4,5]
        ll.display();

        ll.deleteBegin();
        // [2,1,0,4,5]
        ll.display();
        ll.findMid();

        ll.deleteEnd();
        // [2,1,0,4] 
        ll.display();
        ll.findMid();

        // mid = (beg+end)/2 // (0+3)/2 = 1
    }
}
