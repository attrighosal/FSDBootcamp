package DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Messi");
        map.put(7, "Ronaldo");
        System.out.println(map.get(10));
        System.out.println(map.get(7));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsKey(11));
    }
}
