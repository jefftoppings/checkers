package sample;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class View extends VBox implements ModelListener{

    GameManager model;
    InteractionModel iModel;
    float width, height;
    ArrayList<ArrayList<Square>> board;

    public View(float width, float height) {
        this.width = width;
        this.height = height;
        setWidth(width);
        setHeight(height);
        board = new ArrayList<>();
        drawSquares();
        initialCheckerLayout();
    }

    public void setiModel(InteractionModel iModel) {
        this.iModel = iModel;
    }

    private void drawSquares() {

        for (int i=0; i<8; i++) {
            if (i % 2 == 0) {
                // construct even row
                ArrayList<Square> evenRow = new ArrayList<>();
                for (int k = 0; k < 8; k++) {
                    Square square;
                    if (k % 2 == 0) {
                        square = new Square(Main.LIGHT_SQUARE, i, k, this);
                        GameManager.lightSquares.add(square);
                    } else {
                        square = new Square(Main.DARK_SQUARE, i, k, this);
                    }
                    evenRow.add(square);
                }
                board.add(evenRow);
            }

            else {
                // construct odd row
                ArrayList<Square> oddRow = new ArrayList<>();
                for (int j = 0; j < 8; j++) {
                    Square square;
                    if (j % 2 == 0) {
                        square = new Square(Main.DARK_SQUARE, i, j, this);
                    } else {
                        square = new Square(Main.LIGHT_SQUARE, i, j, this);
                        GameManager.lightSquares.add(square);
                    }
                    oddRow.add(square);
                }
                board.add(oddRow);
            }
        }

        // update children
        addChildrenToView();
    }

    private void addChildrenToView() {
        for (ArrayList<Square> a : board) {
            HBox row = new HBox();
            row.setPrefWidth(width);
            row.setPrefHeight(96);

            for (Square s : a) {
                row.getChildren().add(s);
            }

            getChildren().add(row);
        }
    }

    private void initialCheckerLayout() {
        for (int i=0; i<8; i++) {
            if (i % 2 == 0) {
                // even row
                // 0, 2, 6
                board.get(i).get(0).setChecker("blue");
                GameManager.blueCheckers.add(board.get(i).get(0).getChecker());
                board.get(i).get(2).setChecker("blue");
                GameManager.blueCheckers.add(board.get(i).get(2).getChecker());
                board.get(i).get(6).setChecker("red");
                GameManager.redCheckers.add(board.get(i).get(6).getChecker());

            }
            else {
                // odd row
                // 1, 5, 7
                board.get(i).get(1).setChecker("blue");
                GameManager.blueCheckers.add(board.get(i).get(1).getChecker());
                board.get(i).get(5).setChecker("red");
                GameManager.redCheckers.add(board.get(i).get(5).getChecker());
                board.get(i).get(7).setChecker("red");
                GameManager.redCheckers.add(board.get(i).get(7).getChecker());
            }
        }
    }


    public void draw() {

    }

    @Override
    public void modelChanged() {
        draw();
    }

    public void drawSelected() {
        // change color
        iModel.populateValidMoves();
        for (Square s : iModel.validMoves) {
            s.setColor(Color.PURPLE);
        }
    }

    public void redrawBoard() {
        iModel.validMoves.clear();

        for (Square s : GameManager.lightSquares) {
            s.setColor(Main.LIGHT_SQUARE);
        }
    }
}
