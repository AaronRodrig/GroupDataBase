
package softwaredevdatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
   public static void main(String[] args) {
   Connection con = ConnectDataBase.getConnection();// gets connection from connectDataBase class
   Statement stmt = null;
   String createString;
   createString = "\"CREATE TABLE if not exists\n" + 
           "User (\\n\"\n" 
           + "+ \" UserID INTEGER\n" 
           +"PRIMARY KEY,\\n\"\n" 
           +"+ \" UserName VARCHAR\n" 
           +"(15),\\n\"\n" 
           +"+ \" UserEmail VARCHAR\n" 
           +"(30),\\n\"\n" 
           +"+ \" UserPassword VARCHAR\n"
           +"(15),\\n\"\n"  
           +"\") ;\";";
   
   
try 
   {
    stmt = con.createStatement();
    stmt.executeUpdate(createString);
    con.commit();
    }
    catch (SQLException ex){
    System.err.println("SQLExeption:" + ex.getMessage());
    
    } finally{
        if(stmt != null){
        try{
        stmt.close();
        }catch (SQLException e){
       System.err.println("SQLException:" + e.getMessage());
        }
        }
        if(con != null){
        try{
        con.close();
        }catch (SQLException e){
        System.out.println("SQLException:" + e.getMessage());
            }
        }
    }
}
}
