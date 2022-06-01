package ui.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        Scene scene = new Scene(root, 700, 500);
        stage.setTitle("FEM");
        stage.setScene(scene);
        stage.show();
        stage.getIcons().add(new Image("/icon.png"));
    }

    public static void main(String[] args) {
        launch();
    }
}