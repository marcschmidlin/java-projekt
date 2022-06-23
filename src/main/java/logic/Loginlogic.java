package logic;

/*
Auto: Marc Schmidlin und Flavio Schaffer
Diese Klasse implementiert die Methoden zur logigschicht die in dem Login programm stadtfindet.
 */

import entity.User;
import entity.UserCreate;
import entity.UserReader;

import java.io.IOException;

public class Loginlogic {

    //Deklaration von den Objekten
    private UserReader userReader;
    private UserCreate userCreate = new UserCreate();



    //Methode die das Login überprüft.
    public boolean checkLogin(String username, String password) throws IOException {
        userReader = new UserReader();
        //For Schliefe für durch jeden user durchzugehen
        for (User user : userReader.getUsers()) {
            //Stimmern Username und passwort überein
            if (username.equals(user.getUsername())  && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
    //kein passwort eingegeben
    public boolean nopassword(String password) throws IOException {
        if (password.equals("")) {
            return true;
        } else {
            return false;
        }
    }
    //kein username eingegben
    public boolean nousername(String username) throws IOException {
        if (username.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    //Gibt daten für den User weiter und kreiert neues Objekt von user
    public void checkSignUp(String vorname, String nachname, String username, String email, String passwort) throws IOException {
        User user = new User(vorname, nachname, username, email, passwort);
        userCreate.createUser(user);
    }

}

