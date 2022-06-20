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
import logic.loginlogic;

import java.io.IOException;
import java.util.EventObject;

public class logincontroller {
    @FXML
    private Label welcomeText;
    @FXML
    private Button login;
    @FXML
    public TextField username;
    @FXML
    public TextField password;


    loginlogic loginlogic = new loginlogic();

    public void LoginButtonPushed(ActionEvent event) throws IOException {

        boolean schalter = loginlogic.checkLogin1(username.getText(), password.getText());
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
