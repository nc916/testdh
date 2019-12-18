package com.neet.DiamondHunter.MapViewer;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Main class of Map Viewer application.
 * The launching of the application depends on this class.
 *
 */
public class MapView extends Application {

    /**
     * Sets the stage and injects FXML and CSS properties into the application.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MapViewInterface.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("MapView_style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Diamond Hunter Map Viewer");
            primaryStage.show();
            primaryStage.setResizable(false);
            primaryStage.sizeToScene();
            primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

                @Override
                public void handle(WindowEvent event) {
                    /*
                     * The 'X' close JavaFX application thread but not Swing thread.
                     * This enforces the entire application to end its process.
                     */
                    System.exit(0);
                }

            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}