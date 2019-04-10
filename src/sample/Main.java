package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int HEIGHT = 768;
    public static final int WIDTH = 1366;
    private static final int VIEW_WIDTH = 768;
    private static final int SIDEPANE_WIDTH = 299;
    public static Color LIGHT_SQUARE = Color.rgb(242, 196, 146);
    public static Color DARK_SQUARE = Color.rgb(132,60,12);
    public static Color LIGHT_SQUARE_SELECTED = Color.ORANGERED;

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane root = new BorderPane();
        root.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        // add components
        View view = new View(VIEW_WIDTH, HEIGHT);
        SidePane leftPane = new SidePane(SIDEPANE_WIDTH, HEIGHT, "Player 1");
        SidePane rightPane = new SidePane(SIDEPANE_WIDTH, HEIGHT, "Player 2");

        // add components to root
        root.setCenter(view);
        root.setLeft(leftPane);
        root.setRight(rightPane);

        // set up references

        primaryStage.setTitle("Jeff's Checkers");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
