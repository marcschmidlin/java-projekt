package logic;

import entity.UserReader;

import java.io.IOException;

public class Loginlogic {

    public boolean schalter = false;

    private UserReader userReader;

    public Loginlogic() {

    }

    public boolean checkLogin(String username, String password) throws IOException {
        userReader = new UserReader();

        if (username.equals(userReader.getUser().getUsername())  && password.equals(userReader.getUser().getPassword())) {
            return true;
        } else {
            return false;
        }
    }





}
