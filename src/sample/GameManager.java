package sample;

import java.util.ArrayList;

public class GameManager {

    ArrayList<Square> lightSquares;
    ArrayList<Checker> redCheckers;
    ArrayList<Checker> blueCheckers;

    public GameManager() {
        lightSquares = new ArrayList<>();
        redCheckers = new ArrayList<>();
        blueCheckers = new ArrayList<>();
    }

}
