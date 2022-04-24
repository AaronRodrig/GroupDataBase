package softwaredevdatabase;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class CreateDataBase {
    /**
* @param args the command line arguments
*/
public static void main(String[] args) {
    new Connect();
    
}
   
}
   
class Connect {
   
    private String urlSQLite;
    private Driver driverSQLite;
    private Connection con;
    
    public Connect() {
   
        urlSQLite = "jdbc:sqlite:AppDataBase.db";
    
        try {
    
            driverSQLite = new org.sqlite.JDBC();
   
            DriverManager.registerDriver(driverSQLite);
   
            System.out.println("Driver for SQLite downloaded.");
   
        } 
        catch (Exception e) {

            System.out.println("Problem with download driver for SQLite: " +
  
                    e.getMessage());
    }
  
        try {

            con = DriverManager.getConnection(urlSQLite);
    
            System.out.println("Connection to SQLite is done.");

        } 
        catch (Exception e) {

            System.out.println("Problem with connection to SQLite: " +

                    e.getMessage());

        }

        try {

            if (!con.isClosed()) {

                con.close();

                System.out.println("Connection to SQLite closed.");

            }

        } 
        catch (Exception e) {

            System.out.println("Problem with close connection of SQLite");

        }

    }

}
