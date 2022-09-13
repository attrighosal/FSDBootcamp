package HashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Messi");
        hashMap.put(7, "Ronaldo");
        hashMap.put(11, "Neymar");
        hashMap.put(7, "Cavani");
        hashMap.put(null, null);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("=========================================================");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Messi");
        linkedHashMap.put(7, "Ronaldo");
        linkedHashMap.put(11, "Neymar");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("=========================================================");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Messi");
        treeMap.put(7, "Ronaldo");
        treeMap.put(11, "Neymar");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
/*
thread1 = attri
thread2 = ghosal

non thread safe string = agttos
thread safe string = attri ghosal

[1,3,4] beg=0, end=2, mid=1, target=2
[1,3,4] beg=0, end=0, mid=0
[1,3,4] beg=1, end=0, mid=0
 */
