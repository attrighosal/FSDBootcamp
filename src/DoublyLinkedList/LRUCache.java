package DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    
    private Map<Integer, Node> map;
    private DoublyLinkedList dll;
    private int size;

    public LRUCache(int size) {
        map = new HashMap<>();
        dll = new DoublyLinkedList();
        this.size = size;
    }

    public int get(int key) {
        // if it is already present in cache we just return 
        if (map.containsKey(key)) {

            // Remove from the dll 
            Node nodeToBeDeleted = map.get(key);
            dll.deleteNode(nodeToBeDeleted);

            // Add at the end
            Node node = dll.addEnd(key);
            map.put(key, node);
            return key;
        }

        // If the cache is full remove the least recently used
        if (map.size()==size) {
            Node deletedNode = dll.deleteBegin();
            map.remove(deletedNode.value);
        }

        // Add a new node in the end
        Node node = dll.addEnd(key);
        map.put(key, node);
        return key;
    }
}
