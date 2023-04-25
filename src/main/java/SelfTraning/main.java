package SelfTraning;

public class main {
    public static int[] correctStream(String[] userTypedArray, String[] correctArray) {
        int[] result = new int[userTypedArray.length]; // Initialize the result array with the same length as input arrays

        for (int i = 0; i < userTypedArray.length; i++) {
            if (userTypedArray[i].equals(correctArray[i])) {
                result[i] = 1; // If the words match, set the result to 1
            } else {
                result[i] = -1; // If the words do not match, set the result to -1
            }
        }

        return result;
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
        // Example usage of the correctStream() method
        String[] userTypedArray = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correctArray = {"cat", "blue", "sky", "umbrella", "paddy"};
        int[] result = correctStream(userTypedArray, correctArray);

        // Print the resulting array
        System.out.print("Output: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static String nameShuffle(String name) {
        String[] nameArray = name.split(" "); // Split the input string by space to get the first and last name as separate words
        if (nameArray.length != 2) {
            // If the input does not contain exactly two words, return an error message
            return "Error: Input should contain exactly two words for first and last name.";
        }

        // Swap the first and last name by concatenating them in reverse order with a space in between
        String shuffledName = nameArray[1] + " " + nameArray[0];
        return shuffledName;
    }



}
