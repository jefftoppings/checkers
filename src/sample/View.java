package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
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
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setiModel(InteractionModel iModel) {
        this.iModel = iModel;
    }

    private void drawSquares() {

    }

    public void draw() {

    }

    @Override
    public void modelChanged() {
        draw();
    }
}
