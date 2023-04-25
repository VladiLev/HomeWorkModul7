package Modul7;

import static Modul7.Game.writeNumOfPlayersPerTeam;

public class Main {
    public static void main(String[] args) {

        writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
    }
}
