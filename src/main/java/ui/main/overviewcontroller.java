package ui.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class overviewcontroller {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView lsvProjects;

    @FXML
    protected void onObjectNewClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/ui/main/dialogobject.fxml"));
            DialogPane objectDialogPane = fxmlLoader.load();

            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(objectDialogPane);
            dialog.setTitle("New Object");
            Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));

            Optional<ButtonType> clickedButton = dialog.showAndWait();
            if (clickedButton.get() == ButtonType.FINISH) {
                System.out.println("New Object Created");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void onCloseClick(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/login/logingui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) lsvProjects.getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }



}
