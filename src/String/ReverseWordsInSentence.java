package String;

import java.util.Arrays;

public class ReverseWordsInSentence {

    public static String reverseWordsInSentence(String sentence) {
        // 1. Split the sentence into words
        String[] words = sentence.split("\\s"); // ["I", "love", "java"]

        // 2. Reverse each individual word
        StringBuilder reverse = new StringBuilder(); // sentence

        for (String word: words) {
            StringBuilder sb = new StringBuilder(word); // Creating string builder of the word
            sb.reverse(); // reversing the word

            // 3. Join back into a sentence
            reverse.append(sb); // adding the reversed word
            reverse.append(" ");
        }

        return reverse.toString();
    }

    public static void main(String[] args) {
        String sentence = "I love java";
        String reversed = reverseWordsInSentence(sentence);
        System.out.println(reversed);
    }
}
