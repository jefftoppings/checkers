package sample;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class GameManager {

    static ArrayList<Square> lightSquares;
    static ArrayList<Checker> redCheckers;
    static ArrayList<Checker> blueCheckers;
    static boolean redTurn = true;
    static boolean blueTurn = false;

    public GameManager() {
        lightSquares = new ArrayList<>();
        redCheckers = new ArrayList<>();
        blueCheckers = new ArrayList<>();
    }

    public static void initializeGame() {

    }

    public static void deselectAll() {
        for (Checker c : redCheckers) {
            if (c.state != Checker.State.READY) {
                c.state = Checker.State.READY;
                c.image = new Image("/graphics/redCircle.png");
                c.setImage(c.image);
            }
        }
        for (Checker c : blueCheckers) {
            if (c.state != Checker.State.READY) {
                c.state = Checker.State.READY;
                c.image = new Image("/graphics/blueCircle.png");
                c.setImage(c.image);
            }
        }
    }
}
