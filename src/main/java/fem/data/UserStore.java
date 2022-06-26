package fem.data;

import fem.dto.User;

import java.io.File;

public class UserStore extends Store<User> {

    public UserStore(File file) {
        super(file);
    }

    @Override
    public User newInstance() {
        return new User();
    }
}
