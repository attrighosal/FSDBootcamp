package String;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static boolean checkIfAnagrams(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        // Store the count of each character using hashmap
        for (int i=0; i<word1.length(); i++) {
            char c = word1.charAt(i);
            int initialCount = count.getOrDefault(c, 0);
            count.put(c, initialCount+1);
        }

        // Remove characters for word 2
        for (int i=0; i<word2.length(); i++) {
            char c = word2.charAt(i);
            int currentCount = count.getOrDefault(c, 0);
            int newCount = currentCount-1;
            if (newCount==0) {
                count.remove(c);
            }
            else {
                count.put(c, newCount);
            }
        }

        return count.isEmpty();
    }

    public static void main(String[] args) {
        String word1 = "dog", word2 = "god";
        boolean isAnagram = checkIfAnagrams(word1, word2);
        System.out.println("Is Anagram : "+isAnagram);
    }
}
