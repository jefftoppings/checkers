package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Checker extends Pane {

    Color color;
    Canvas canvas;
    GraphicsContext gc;
    int width = 96, height = 96;

    public Checker(Color color) {
        this.color = color;
        this.canvas = new Canvas(width,height);
        this.gc = canvas.getGraphicsContext2D();
        setWidth(96);
        setHeight(96);
        setPrefWidth(96);
        setPrefHeight(96);
        draw();
    }

    private void draw() {
        gc.clearRect(0,0, width, height);

        gc.setFill(color);
        gc.fillOval(10,10,86,86);
    }
}
