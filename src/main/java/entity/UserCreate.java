package entity;

/*
Autor Marc Schmidlin und Flavio Schaffer
Diese Klasse dient zum erstellen eines Benutzers. Benutzer wird in Textfile geschrieben
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserCreate {

    //Nimmt die Daten, die von der Logicschicht weitergegeben wurden und schreibt diese in TakeUser.txt
    public void createUser(User user){

        File newuser = new File("src/main/java/entity/TakeUser.txt");
        FileWriter writer;
        {
            try {
                writer = new FileWriter(newuser, true);
                writer.write("\n" + user.getFirstname() +" ");
                writer.write(user.getLastname()+" ");
                writer.write(user.getUsername()+" ");
                writer.write(user.getEmail()+" ");
                writer.write(user.getPassword());

                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Datei konnte nicht bearbeitet werden");
            }
        }
        }

}


