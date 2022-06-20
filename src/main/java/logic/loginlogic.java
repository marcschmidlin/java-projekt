package logic;

import ui.login.logincontroller;

import java.io.IOException;

public class loginlogic {
    public boolean schalter = false;


    public boolean checkLogin1(String username, String password) throws IOException {
        if (username.equals("hallo") && password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

}

