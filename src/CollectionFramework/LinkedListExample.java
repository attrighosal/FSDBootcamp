package CollectionFramework;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(6);
        ll.add(1, 3);
        System.out.println(ll);
    }
}