package SelfTraning2;

public class Main {
    public static String nameShuffle(String name) {
        // Split the input string by space to get the first and last name as separate words
        String[] nameArray = name.split(" ");
        if (nameArray.length != 2) {
            // If the input does not contain exactly two words, return an error message
            return "Error: Input should contain exactly two words for first and last name.";
        }

        // Swap the first and last name by concatenating them in reverse order with a space in between
        String shuffledName = nameArray[1] + " " + nameArray[0];
        return shuffledName;
    }

    public static void main(String[] args) {
        // Example usage of the nameShuffle() method
        String name1 = "Donald Trump";
        String name2 = "Rosie O'Donnell";
        String name3 = "Seymour Butts";

        System.out.println("Input: " + name1);
        System.out.println("Output: " + nameShuffle(name1));

        System.out.println("Input: " + name2);
        System.out.println("Output: " + nameShuffle(name2));

        System.out.println("Input: " + name3);
        System.out.println("Output: " + nameShuffle(name3));
    }

}
