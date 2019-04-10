package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LeftPane extends VBox {

    float width, height;
    Label turnLabel;

    public LeftPane(float width, float height) {
        this.width = width;
        this.height = height;

        setWidth(width);
        setHeight(height);
        setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));


        turnLabel = new Label();
        updateTurnLabel();
        turnLabel.setPrefWidth(width);
        turnLabel.setPrefHeight(30);
        turnLabel.setFont(new Font("Verdana", 24));
        turnLabel.setTextFill(Color.WHITE);
        turnLabel.setAlignment(Pos.CENTER);

        getChildren().add(turnLabel);

    }

    private void updateTurnLabel() {
        if (GameManager.redTurn) {
            turnLabel.setText("Red's Turn");
        }
        else {
            turnLabel.setText("Blue's Turn");
        }
    }
}
