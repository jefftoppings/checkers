package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int HEIGHT = 768;
    public static final int WIDTH = 1366;

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane root = new BorderPane();

        primaryStage.setTitle("Jeff's Checkers");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
