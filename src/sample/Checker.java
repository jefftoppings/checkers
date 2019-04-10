package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Checker extends ImageView {

    Image image;
    String color;
    Square square;
    protected enum State {
            SELECTED, READY, DRAGGING
    }
    State state;

    public Checker(String color, Square square) {

        this.color = color;
        this.square = square;
        this.state = State.READY;
        image = new Image("/graphics/" + color + "Circle.png");
        setImage(image);
        this.setX(10);
        this.setY(10);
        this.setFitWidth(76);
        this.setFitHeight(76);
        this.setPreserveRatio(true);
        this.setOnMouseClicked(this::handleClicked);
    }

    private void handleClicked(MouseEvent mouseEvent) {
        switch (state) {
            case READY:
                GameManager.deselectAll();
                if (color.equals("blue")) {
                    image = new Image("/graphics/blueCircleSelected.png");
                    this.setImage(image);
                }
                else {
                    image = new Image("/graphics/redCircleSelected.png");
                    this.setImage(image);
                }
                state = State.SELECTED;
                square.view.iModel.selectedChecker = this;
                square.view.drawSelected();
                break;

            case SELECTED:
                resetCircleColor();
                state = State.READY;
                square.view.iModel.selectedChecker = null;
                square.view.redrawBoard();
                break;
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
