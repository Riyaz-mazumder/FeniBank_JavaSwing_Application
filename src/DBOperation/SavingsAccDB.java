
package DBOperation;

import Models.SavingsAccountModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SavingsAccDB {
    public static String savingsExHolder = "";
   public static int save(SavingsAccountModel m){
       int status = 0;
       String sql = "insert into savings_account (owner, accountNumber, withdrawLimit, transactionLimit, balance, interest) values (?,?,?,?,?,?);";
       
       try {
           PreparedStatement psmt = DBCon.getConnection().prepareStatement(sql);
           psmt.setString(1, m.getOwner());
           psmt.setString(2, m.getAccountNumber());
           psmt.setString(3, m.getWithdrawLimit());
           psmt.setString(4, m.getTransactionLimit());
           psmt.setDouble(5, m.getDipositMoney());
           psmt.setString(6, m.getInterest());
           psmt.executeUpdate();
       } catch (SQLException ex) {
           ex.printStackTrace();
           savingsExHolder = ex.toString();
       }
       return status;
       
   }
}
