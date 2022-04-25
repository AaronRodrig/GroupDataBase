
package softwaredevdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectDataBase {
       
    public static Connection getConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:AppDataBase.db";
            Connection con = DriverManager.getConnection(url);
            return con;
        
        }
        catch (Exception e){
            
            return null;
        }
    }
}
