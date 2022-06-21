package entity;

import logic.Loginlogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserReader {

    private ArrayList<User> users = new ArrayList<>();

    public UserReader() {

        File takeuser = new File("src/main/java/entity/TakeUser.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(takeuser);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        while (scan.hasNextLine()) {
            while (scan.hasNext()) {
                String firstname = scan.next();
                String lastname = scan.next();
                String username = scan.next();
                String email = scan.next();
                String password = scan.next();

                users.add(new User(firstname,lastname,username,email,password));
            }
        }

    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
