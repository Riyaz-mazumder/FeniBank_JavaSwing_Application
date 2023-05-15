
package DBOperation;
import Models.ClientBean;
import Views.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class loginCredentials {
    Login Alog = new Login();
    public String checkACCHolder(String username, String password){
        String pass = "";
        String query = "SELECT password accountHolder where name=?;";
        try {
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(query);
           
           psmt.setString(1, username);
            ResultSet res =  psmt.executeQuery();
            while(res.next()){
              pass = res.getString("password");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
     return pass;
    }
   
}
