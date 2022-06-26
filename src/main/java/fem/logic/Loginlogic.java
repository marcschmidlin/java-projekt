package fem.logic;

import fem.entity.User;
import fem.entity.UserCreate;
import fem.entity.UserReader;

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
    public boolean nopassword(String password) throws IOException {
        if (password.equals("")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean nousername(String username) throws IOException {
        if (username.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public void checkSignUp(String vorname, String nachname, String username, String email, String passwort) throws IOException {
        User user = new User(vorname, nachname, username, email, passwort);
        userCreate.createUser(user);
    }

}

