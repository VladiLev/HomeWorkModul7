package SelfTraning4;

import java.util.Arrays;

public class Game {


    public class GameScoring {
        public static int[] calculateScores(String input) {
            // Create an array to store the scores for each player
            int[] scores = new int[3];

            // Loop through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                // Get the current character
                char c = input.charAt(i);

                // Increment the score for the corresponding player
                switch (c) {
                    case 'A':
                        scores[0]++;
                        break;
                    case 'B':
                        scores[1]++;
                        break;
                    case 'C':
                        scores[2]++;
                        break;
                    default:
                        // Ignore other characters
                        break;
                }
            }

            // Return the array of scores
            return scores;
        }


    }

}
