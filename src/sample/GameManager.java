package sample;

import java.util.ArrayList;

public class GameManager {

    static ArrayList<Square> lightSquares;
    static ArrayList<Checker> redCheckers;
    static ArrayList<Checker> blueCheckers;

    public GameManager() {
        lightSquares = new ArrayList<>();
        redCheckers = new ArrayList<>();
        blueCheckers = new ArrayList<>();
    }

    public static void initializeGame() {

    }
}
