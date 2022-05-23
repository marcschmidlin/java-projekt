package start;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD:src/main/java/start/start.java
        FXMLLoader fxmlLoader = new FXMLLoader(start.class.getResource("../../../ui/login/logingui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
=======
        FXMLLoader fxmlLoader = new FXMLLoader(start.class.getResource("logingui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setTitle("Ausgaben Tracker");
>>>>>>> 6229c18b3411c46223990dcdf844aca190204d2a:src/main/java/com/example/javaprojekt226b/start.java
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}