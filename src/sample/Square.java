package sample;

import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Square extends VBox {

    Color color;
    int row, col;

    public Square(Color color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
        this.setOnMouseClicked(this::handleClicked);
        setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        setPrefWidth(96);
        setPrefHeight(96);
    }

    private void handleClicked(MouseEvent mouseEvent) {
        System.out.println("Clicked - Row: " + row + " Col: " + col);
    }
}
