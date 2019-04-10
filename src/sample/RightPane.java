package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RightPane extends VBox {

    float width, height;

    public RightPane(float width, float height) {
        this.width = width;
        this.height = height;

        setWidth(width);
        setHeight(height);
        setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));


        Label title = new Label("");
        title.setPrefWidth(width);
        title.setPrefHeight(30);
        title.setFont(new Font("Verdana", 24));
        title.setTextFill(Color.WHITE);
        title.setAlignment(Pos.CENTER);

        getChildren().add(title);
    }
}