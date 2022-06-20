package logic;

import ui.login.logincontroller;

import java.io.IOException;

public class loginlogic {

    private String firstname, lastname, username, email, password;
    public boolean schalter = false;

    public loginlogic(String firstname, String lastname, String username, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public boolean checkLogin1() throws IOException {
        if (username == "Flxvio" && password =="cool") {
            return true;
        } else {
            return false;
        }
    }



}

