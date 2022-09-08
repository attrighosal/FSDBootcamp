package LinkedList;


import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.addEnd(4);
        ll.addEnd(2);
        ll.addEnd(5);

        Map<Integer, Integer> map = new HashMap<>();
        Node curr = ll.head;
        boolean duplicate = false;
        while (curr != null) {
            if (map.containsKey(curr.value)) {
                duplicate = true;
                break;
            }
            map.put(curr.value, 0);
            curr = curr.next;
        }

        System.out.println(duplicate);
    }
}
