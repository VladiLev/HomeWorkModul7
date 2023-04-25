package SelfTraning3;

public class Main {
    public static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                // If two consecutive characters are the same, return true
                return true;
            }
        }
        // If no two consecutive characters are the same, return false
        return false;
    }

    public static void main(String[] args) {
        // Example usage of the doubleLetters() method
        String word1 = "loop";
        String word2 = "yummy";
        String word3 = "orange";
        String word4 = "munchkin";

        System.out.println("Input: " + word1);
        System.out.println("Output: " + doubleLetters(word1));

        System.out.println("Input: " + word2);
        System.out.println("Output: " + doubleLetters(word2));

        System.out.println("Input: " + word3);
        System.out.println("Output: " + doubleLetters(word3));

        System.out.println("Input: " + word4);
        System.out.println("Output: " + doubleLetters(word4));
    }

}
