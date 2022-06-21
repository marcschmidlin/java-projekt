package ui.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import logic.Loginlogic;

import java.io.IOException;
import java.util.Optional;


public class Signupcontroller {

    @FXML
    public TextField vorname;
    @FXML
    public TextField nachname;
    @FXML
    public TextField username;
    @FXML
    public TextField email;
    @FXML
    public TextField password;

    Loginlogic loginlogic = new Loginlogic();

    @FXML
    public void SignupButtonPushed(ActionEvent event) throws IOException {
        if (vorname.getText().equals(null) || nachname.getText().equals(null) || username.getText().equals(null) || email.getText().equals(null) || password.getText().equals(null)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("The password or username you entered is incorrect!");
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            }
        } else {
            loginlogic.checkSignUp(vorname.getText(), nachname.getText(), username.getText(), email.getText(), password.getText());
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
            Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        }
    }

    @FXML
    public void Loginpushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/login/logingui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
}