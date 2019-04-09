package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class View extends Pane implements ModelListener{

    Model model;
    InteractionModel iModel;
    float width, height;
    Canvas canvas;
    GraphicsContext gc;

    public View(float width, float height) {
        this.width = width;
        this.height = height;
        setWidth(width);
        setHeight(height);
        canvas = new Canvas(width, height);
        gc = canvas.getGraphicsContext2D();
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setiModel(InteractionModel iModel) {
        this.iModel = iModel;
    }

    public void draw() {

    }

    @Override
    public void modelChanged() {
        draw();
    }
}
