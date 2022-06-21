package entity;

import logic.Loginlogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserReader {

    User user;

    public UserReader() {

        user = new User();

        File takeuser = new File("src/main/java/entity/TakeUser.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(takeuser);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        while (scan.hasNext()) {
            user.firstname = scan.next();
            user.lastname = scan.next();
            user.username = scan.next();
            user.email = scan.next();
            user.password = scan.next();
        }
    }

    public User getUser() {
        return user;
    }
}
