package sample;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class View extends VBox implements ModelListener{

    Model model;
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

    public void setModel(Model model) {
        this.model = model;
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
                        square = new Square(Main.LIGHT_SQUARE, i, k);
                    } else {
                        square = new Square(Main.DARK_SQUARE, i, k);
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
                        square = new Square(Main.DARK_SQUARE, i, j);
                    } else {
                        square = new Square(Main.LIGHT_SQUARE, i, j);
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
                board.get(i).get(2).setChecker("blue");
                board.get(i).get(6).setChecker("red");
            }
            else {
                // odd row
                // 1, 5, 7
                board.get(i).get(1).setChecker("blue");
                board.get(i).get(5).setChecker("red");
                board.get(i).get(7).setChecker("red");
            }
        }
    }


    public void draw() {

    }

    @Override
    public void modelChanged() {
        draw();
    }
}
