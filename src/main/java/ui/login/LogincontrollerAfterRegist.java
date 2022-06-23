package ui.login;

/*
Autor: Marc Schmidlin und Flavio Schaffer
Diese Klasse dient dient zur Loginfunktion, wenn man einen neuen Account angelegt hat. (Nach Signup)
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import logic.Loginlogic;

import java.io.IOException;
import java.util.Optional;

public class LogincontrollerAfterRegist {
    //Instanzierung und Dekleration
    @FXML
    private Button login;
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    @FXML
    public Label registrationSucc;


    Loginlogic loginlogic = new Loginlogic();

    /*
    Methode für Login wird aufgeruden
     */

    public void LoginButtonPushed(ActionEvent event) throws IOException {

        //Boolean der abgefragt wird mit übergabeparameter. Aufruf in loginlogic
        boolean schalter = loginlogic.checkLogin(username.getText(), password.getText());
        boolean nousername = loginlogic.nousername(username.getText());
        boolean nopassword = loginlogic.nopassword(password.getText());
        

        //Falls kein Userame eingegeben wird, wird ein Gui angezeigt
        if (nousername == true) {
            registrationSucc.setStyle("-fx-text-fill: #f8f4f4;");
            Alert alertnoun = new Alert(Alert.AlertType.WARNING);
            alertnoun.setTitle("Error");
            alertnoun.setHeaderText("No Username entered!");
            Stage stage = (Stage) alertnoun.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alertnoun.showAndWait();
            System.out.println("No username entered!");
            if (result.get() == ButtonType.OK) {
            }
        }

        //Falls kein password eingegeben wir,d wird ein Gui angezeigt
        if (nopassword == true) {
            registrationSucc.setStyle("-fx-text-fill: #f8f4f4;");
            Alert alertnopw = new Alert(Alert.AlertType.WARNING);
            alertnopw.setTitle("Error");
            alertnopw.setHeaderText("No Password entered!");
            Stage stage = (Stage) alertnopw.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("/icon.png"));
            Optional<ButtonType> result = alertnopw.showAndWait();
            System.out.println("No password entered!");
            if (result.get() == ButtonType.OK) {
            }
        }

        //Falls die eingaben nicht richtig sind
        if (schalter == true && nopassword == false && nousername == false){
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/main/overview.fxml"));
            Scene tableViewScene = new Scene(tableViewParent, 1000, 600);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableViewScene);
            window.show();
        }
        //Falls nichts eingetragen wurde
        if(schalter == false && nopassword == false && nousername == false) {
            registrationSucc.setStyle("-fx-text-fill: #f8f4f4;");
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

    /*
   Methode die aufgerufen wird, wenn der Signup butten geklickt wird.
   Gibt vorgehen nach gedrücktem Button vor. Aufruf von signupgui.
    */
    @FXML
    public void Signuppushed(ActionEvent event) throws IOException {
        //signupgui.fxml wir aufgeruden
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("/ui/login/signupgui.fxml"));
        Scene tableViewScene = new Scene(tableViewParent, 700, 500);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

}
