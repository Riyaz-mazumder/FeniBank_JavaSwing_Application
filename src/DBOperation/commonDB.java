
package DBOperation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class commonDB {
    public static List<String> getBranchs(){
      List<String> lis = new ArrayList();
      String query = "SELECT branchName FROM the_bank.createbranch c;";
        try {
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(query);
            ResultSet res = psmt.executeQuery();
            while (res.next()) {                
               lis.add(res.getString("branchName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(commonDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      return lis;
    }
}
