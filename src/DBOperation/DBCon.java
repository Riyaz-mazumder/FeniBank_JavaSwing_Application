
package DBOperation;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBCon {
    
    public static Connection getConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/the_bank";
        String user = "root";
        String pass = "root";
        
        try {
          con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
      return con; 
    }
    
}
