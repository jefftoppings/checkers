package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Square extends VBox {

    Color color;
    int row, col;
    Checker checker;
    View view;

    public Square(Color color, int row, int col, View view) {
        this.view = view;
        this.color = color;
        this.row = row;
        this.col = col;
        this.checker = null;
//        this.setOnMouseClicked(this::handleClicked);
        setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        setPrefWidth(96);
        setPrefHeight(96);
        setAlignment(Pos.CENTER);
    }

//    private void handleClicked(MouseEvent mouseEvent) {
//        System.out.println("Clicked - Row: " + row + " Col: " + col);
//    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void setChecker(String color) {
        assert color.equals("blue") || color.equals("red");
        this.getChildren().clear();
        if (color.equals("blue")) {
            this.checker = new Checker("blue", this);
        }
        else {
            this.checker = new Checker("red", this);
        }
        this.getChildren().add(this.checker);
    }

    public Checker getChecker() {
        return checker;
    }

    public void removeChecker() {
        this.getChildren().removeAll();
        this.checker = null;
    }

    public boolean isEmpty() {
        return this.checker == null;
    }
}
