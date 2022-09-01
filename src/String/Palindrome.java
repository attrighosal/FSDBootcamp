package String;

public class Palindrome {

    public static boolean checkIfPalindrome(String word) {
        int beg=0, end=word.length()-1;
        while (beg<end) {
            if (word.charAt(beg) != word.charAt(end)) {
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = checkIfPalindrome(word);
        System.out.println("Is Palindrome : "+isPalindrome);
    }
}

/*
wow -> true
madam -> true
deed -> true
noon -> true

wind -> false
close -> false
 */