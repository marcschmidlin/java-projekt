package fem.logic;

import fem.data.StoreRegistry;
import fem.dto.User;

import java.io.IOException;

public class LoginLogic {

    private final StoreRegistry storeRegistry;

    public LoginLogic()  {
        storeRegistry = StoreRegistry.getStoreRegistry();
    }

    public boolean checkLogin(String username, String password) throws IOException {
        return storeRegistry.getUserStore()
                .getAll()
                .stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(user.getPassword()))
                .count() > 0;
    }

    public void signUp(String username, String email, String password) throws IOException {
        User user = new User(username, email, password);
        storeRegistry.getUserStore().add(user);
    }

}

