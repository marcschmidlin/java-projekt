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

import java.io.IOException;

public class logincontroller {
    @FXML
    private Label welcomeText;
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private TextField password;


    @FXML
    public void LoginButtonPushed(ActionEvent event) throws IOException {
        checkLogin(event);
        // Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
        //Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
        //Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //window.setScene(tableViewScene);
        //window.show();


    }

    private void checkLogin(ActionEvent event) throws IOException {
        if (username.getText().toString().equals("javacoding") && password.getText().toString().equals("123")) {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
            Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();

            //m.changeScene("afterLogin.fxml");
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