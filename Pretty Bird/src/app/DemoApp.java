package app;

import birds.BirdPane;
import javafx.application.Application;
import javafx.stage.Stage;

public class DemoApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception
    {
        BirdPane.startBird(primaryStage);
    }   
}