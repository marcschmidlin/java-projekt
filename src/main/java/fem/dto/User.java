package fem.dto;

public class User implements CommaSeparatedValue {

    public String username;
    public String email;
    public String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String getCommaSeparateValue() {
        return username + DELIMITER + email + DELIMITER + password + DELIMITER;
    }

    @Override
    public void loadCommaSeparateValue(String commaSeparatedValue) {
        String[] split = commaSeparatedValue.split(DELIMITER);
        setUsername(split[0]);
        setEmail(split[1]);
        setPassword(split[2]);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
