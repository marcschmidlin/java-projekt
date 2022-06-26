package fem.ui.login;
import java.sql.*;

public class SqlLite {
    public static Connection Connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:EmployeeDb.sqlite");
            return con;
        }catch(Exception e){
            // TODO: Hande exeption
        }
        return null;
    }
}
