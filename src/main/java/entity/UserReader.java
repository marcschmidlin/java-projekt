package entity;

/*
Autor Marc Schmidlin und Flavio Schaffer
Diese Klasse nimmt die Benutzer aus dem Textfile und gibt sie in die Logikschicht weiter
 */

import logic.Loginlogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserReader {

    //Arraylist für User
    private ArrayList<User> users = new ArrayList<>();

    public UserReader() {

        //Scannt die user aus dem Takeuser file heraus und schreibt diese in ein Txtx file
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
                //User wird in Arraylist hinzugefügt
                users.add(new User(firstname,lastname,username,email,password));
            }
        }

    }
//Gibt arraylist zurück /getter
    public ArrayList<User> getUsers() {
        return users;
    }
}
