package SelfTraning4;

import java.util.Arrays;

import static SelfTraning4.Game.GameScoring.calculateScores;

public class Main {
    public static void main(String[] args) {
        // Example usage of the calculateScores() method
        String input1 = "A";
        String input2 = "ABC";
        String input3 = "ABCBACC";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + Arrays.toString(calculateScores(input1)));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + Arrays.toString(calculateScores(input2)));

        System.out.println("Input: " + input3);
        System.out.println("Output: " + Arrays.toString(calculateScores(input3)));
    }
}
