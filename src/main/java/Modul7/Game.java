package Modul7;

import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType gameType) {
        String fileName;
        int numOfPlayersPerTeam;

        // Determine the file name and number of players per team based on the game type
        switch (gameType) {
            case SOCCER:
                fileName = "soccer.txt";
                numOfPlayersPerTeam = 11;
                break;
            case HOCKEY:
                fileName = "hockey.txt";
                numOfPlayersPerTeam = 6;
                break;
            case RUGBY:
                fileName = "rugby.txt";
                numOfPlayersPerTeam = 15;
                break;
            default:
                throw new IllegalArgumentException("Invalid game type");
        }

        // Create a new file with the name of the game type and write the number of players per team to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(Integer.toString(numOfPlayersPerTeam));
            writer.close();
            System.out.println("File \"" + fileName + "\" created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}


