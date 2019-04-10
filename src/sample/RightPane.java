package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RightPane extends VBox {

    float width, height;
    static Label redLeft, blueLeft;

    public RightPane(float width, float height) {
        this.width = width;
        this.height = height;

        setWidth(width);
        setHeight(height);
        setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label title = new Label("Checkers Remaining");
        title.setPrefWidth(width);
        title.setPrefHeight(30);
        title.setFont(new Font("Verdana", 24));
        title.setTextFill(Color.WHITE);
        title.setAlignment(Pos.CENTER);

        redLeft = new Label();
        redLeft.setPrefWidth(width);
        redLeft.setPrefHeight(30);
        redLeft.setFont(new Font("Verdana", 16));
        redLeft.setTextFill(Color.WHITE);
        redLeft.setAlignment(Pos.CENTER);

        blueLeft = new Label();
        blueLeft.setPrefWidth(width);
        blueLeft.setPrefHeight(30);
        blueLeft.setFont(new Font("Verdana", 16));
        blueLeft.setTextFill(Color.WHITE);
        blueLeft.setAlignment(Pos.CENTER);

        updateRemainingCheckers();

        getChildren().addAll(title, redLeft, blueLeft);
    }

    public static void updateRemainingCheckers() {
        redLeft.setText("Red Checkers Remaining: " + GameManager.redCheckers.size());
        blueLeft.setText("Blue Checkers Remaining: " + GameManager.blueCheckers.size());
    }
}