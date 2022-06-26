package fem.ui;

import fem.logic.LoginLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SignUpController implements Initializable {

    @FXML
    public TextField username;
    @FXML
    public TextField email;
    @FXML
    public TextField password;
    @FXML
    public Button register;

    LoginLogic loginlogic = new LoginLogic();


    @FXML
    public void SignupButtonPushed(ActionEvent event) throws IOException {
        loginlogic.signUp(username.getText(), email.getText(), password.getText());
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.register.setDisable(true);
    }

    public void buttonactivater() {
        this.register.setDisable(false);
    }

    @FXML
    public void Loginpushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
}