package entity;

import logic.loginlogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class user {
    private String firstname, lastname, username, email, password;

    public void dateieinlesen(){
        File datei = new File("src/main/java/entity/user.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(datei);
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        while (scan.hasNext()) {
            firstname = scan.next();
            lastname = scan.next();
            username = scan.next();
            email = scan.next();
            password = scan.next();
            logic.loginlogic loginlogic = new loginlogic(firstname, lastname, username, email, password);
        }

    }


}
