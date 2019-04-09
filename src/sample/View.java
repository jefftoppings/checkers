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
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setiModel(InteractionModel iModel) {
        this.iModel = iModel;
    }

    private void drawSquares() {

        for (int i=0; i<4; i++) {
            // construct even row
            ArrayList<Square> evenRow = new ArrayList<>();
            for (int k = 0; k < 8; k++) {
                Square square;
                if (k % 2 == 0) {
                    square = new Square(Main.LIGHT_SQUARE);
                } else {
                    square = new Square(Main.DARK_SQUARE);
                }
                evenRow.add(square);
            }

            // construct odd row
            ArrayList<Square> oddRow = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                Square square;
                if (j % 2 == 0) {
                    square = new Square(Main.DARK_SQUARE);
                } else {
                    square = new Square(Main.LIGHT_SQUARE);
                }
                oddRow.add(square);
            }

            // add to board
            board.add(evenRow);
            board.add(oddRow);
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

    public void draw() {

    }

    @Override
    public void modelChanged() {
        draw();
    }
}
