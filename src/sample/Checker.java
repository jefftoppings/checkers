package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Checker extends ImageView {

    Image image;
    String color;
    Square square;
    boolean selected;

    public Checker(String color, Square square) {

        this.color = color;
        this.square = square;
        this.selected = false;
        image = new Image("/graphics/" + color + "Circle.png");
        setImage(image);
        this.setX(10);
        this.setY(10);
        this.setFitWidth(76);
        this.setFitHeight(76);
        this.setPreserveRatio(true);
        this.setOnMouseClicked(this::handleClicked);
        this.setOnMouseDragged(this::handleDrag);
    }

    private void handleDrag(MouseEvent mouseEvent) {
    }

    private void handleClicked(MouseEvent mouseEvent) {
        if (!selected) {
            selected = true;
            if (color.equals("blue")) {
                image = new Image("/graphics/blueCircleSelected.png");
                this.setImage(image);
            }
            else {
                image = new Image("/graphics/redCircleSelected.png");
                this.setImage(image);
            }
        }
        else {
            selected = false;
            resetCircleColor();
        }
    }

    private void resetCircleColor() {
        image = new Image("/graphics/" + color + "Circle.png");
        this.setImage(image);
    }

    public String getColor() {
        return color;
    }
}
