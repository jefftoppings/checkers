package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class View extends Pane {

    Controller controller;
    Model model;
    float width, height;
    Canvas canvas;
    GraphicsContext gc;

    public View(float width, float height) {
        this.width = width;
        this.height = height;
        canvas = new Canvas(width, height);
        gc = canvas.getGraphicsContext2D();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
