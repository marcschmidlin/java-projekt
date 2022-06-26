package fem.ui;

import fem.logic.LoginLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class LoginController {
    @FXML
    private Button login;
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    @FXML
    public Label signUpMessage;
    LoginLogic loginlogic = new LoginLogic();

    public void loginButtonPushed(ActionEvent event) throws IOException {
        boolean emptyCredentials = username.getText().isEmpty() || username.getText().isEmpty();
        if (emptyCredentials) {
            showAlert("No username and/or password entered!");
        } else {
            boolean loginSuccessful = loginlogic.checkLogin(username.getText(), password.getText());
            if (loginSuccessful) {
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("overview.fxml"));
                Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
            } else {
                showAlert("The password or username you entered is incorrect");
            }
        }
    }

    private void showAlert(String message) {
        signUpMessage.setStyle("-fx-text-fill: #f8f4f4;");
        Alert alertnoun = new Alert(Alert.AlertType.WARNING);
        alertnoun.setTitle("Warning");
        alertnoun.setHeaderText(message);
        Stage stage = (Stage) alertnoun.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(getClass().getResource("ui/icon.png").toString()));
        Optional<ButtonType> result = alertnoun.showAndWait();
        System.out.println("No username/pw entered!");
    }

    @FXML
    public void signUpPushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("signupgui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

}
