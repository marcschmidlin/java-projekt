package logic;

import entity.User;
import entity.UserCreate;
import entity.UserReader;

import java.io.IOException;

public class Loginlogic {

    private UserReader userReader;
    private UserCreate userCreate = new UserCreate();

    public Loginlogic() {
    }

    public boolean checkLogin(String username, String password) throws IOException {
        userReader = new UserReader();

        for (User user : userReader.getUsers()) {
            if (username.equals(user.getUsername())  && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void checkSignUp(String vorname, String nachname, String username, String email, String passwort) throws IOException {
        User user = new User(vorname, nachname, username, email, passwort);
        userCreate.createUser(user);
    }

}

