package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("aanmelding.fxml"));
        primaryStage.setTitle("HU-aanmeldingsformulier voor studenten");
        primaryStage.setScene(new Scene(root, 525, 320));
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        
        launch(args);
    }
}
