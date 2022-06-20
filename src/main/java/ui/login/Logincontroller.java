package ui.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.Loginlogic;

import java.io.IOException;

public class Logincontroller {
    @FXML
    private Label welcomeText;
    @FXML
    private Button login;
    @FXML
    public TextField username;
    @FXML
    public TextField password;


    Loginlogic loginlogic = new Loginlogic();

    public void LoginButtonPushed(ActionEvent event) throws IOException {

        boolean schalter = loginlogic.checkLogin(username.getText(), password.getText());
        if (schalter == true){
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
            Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        }

    }

    @FXML
    public void Signuppushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/login/signupgui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
}
