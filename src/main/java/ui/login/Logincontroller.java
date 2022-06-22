package ui.login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import logic.Loginlogic;

import java.io.IOException;
import java.util.Optional;

public class Logincontroller {
    @FXML
    private Button login;
    @FXML
    public TextField username;
    @FXML
    public TextField password;


    Loginlogic loginlogic = new Loginlogic();

    public void LoginButtonPushed(ActionEvent event) throws IOException {

        boolean schalter = loginlogic.checkLogin(username.getText(), password.getText());
        boolean nopassword = loginlogic.nopassword(password.getText());
        boolean nousername = loginlogic.nousername(username.getText());

        System.out.println(schalter);
        System.out.println(nopassword);
        System.out.println(password.getText());
        System.out.println(nousername);
        System.out.println(username.getText());

        if (nousername == true) {
            Alert alertnoun = new Alert(Alert.AlertType.WARNING);
            alertnoun.setTitle("Error");
            alertnoun.setHeaderText("No username entered!");
            Stage stage = (Stage) alertnoun.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alertnoun.showAndWait();
            System.out.println("No username entered!");
            if (result.get() == ButtonType.OK) {
            }
        }
        if (nopassword == true) {
            Alert alertnopw = new Alert(Alert.AlertType.WARNING);
            alertnopw.setTitle("Error");
            alertnopw.setHeaderText("No password entered!");
            Stage stage = (Stage) alertnopw.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alertnopw.showAndWait();
            System.out.println("No password entered!");
            if (result.get() == ButtonType.OK) {
            }
        }
        if (schalter == true){
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
            Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        }



        if (nousername == false && nopassword == false && schalter == false) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("The password or username you entered is incorrect!");
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            }
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
