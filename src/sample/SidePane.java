package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class SidePane extends VBox {

    float width, height;
    String playerName;

    public SidePane(float width, float height, String playerName) {
        this.width = width;
        this.height = height;
        this.playerName = playerName;

        setWidth(width);
        setHeight(height);
        setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label name = new Label(playerName);
        name.setPrefWidth(width);
        name.setPrefHeight(30);
        name.setFont(new Font("Verdana", 24));
        name.setTextFill(Color.WHITE);
        name.setAlignment(Pos.CENTER);

        getChildren().add(name);
    }
}
