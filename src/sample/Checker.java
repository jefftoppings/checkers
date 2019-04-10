package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Checker extends ImageView {

    Image image;
    String color;

    public Checker(String color) {

        this.color = color;
        image = new Image("/graphics/" + color + "Circle.png");
        setImage(image);
        this.setX(10);
        this.setY(10);
        this.setFitWidth(76);
        this.setFitHeight(76);
        this.setPreserveRatio(true);
    }

    public String getColor() {
        return color;
    }
}
