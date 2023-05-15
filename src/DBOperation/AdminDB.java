
package DBOperation;

import Models.ClientBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminDB {
    public int CreateClients(ClientBean m){
        int status = 0;
        String query = "INSERT INTO the_bank.clients (first_name, last_name, payee_address, password, date) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(query);
            psmt.setString(1, m.getCFName());
            psmt.setString(2, m.getCLName());
            psmt.setString(3, m.getPayAddress());
            psmt.setString(4, m.getPassword());
            psmt.setString(5, m.getDate());
            status =  psmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        return status;
    }
    
    public int createClientCurrAccount(ClientBean m){
        int status = 0;
        String query = "INSERT INTO the_bank.current_acount (owner, account_number, transaction_limit, balance) VALUES(?,?,?,?)";
        try {
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(query);
            psmt.setString(1, m.getCurrentAccOwner());
            psmt.setString(2, m.getCurrentAccNumber());
            psmt.setString(3, m.getCurrentAccTrLimit());
            psmt.setString(4, m.getCurrentAccBalance());
            status =  psmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        return 0;
    }
    
    public int createSavingAccount(ClientBean m){
        int status = 0;
        String query = "INSERT INTO the_bank.saving_account (owner, account_number, withdraw_limit, balance) VALUES(?,?,?,?)";
        try {
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(query);
            psmt.setString(1, m.getSavingAccOwner());
            psmt.setString(2, m.getSavingAccNumber());
            psmt.setString(3, m.getSavingAccWithdrawLimit());
            psmt.setString(4, m.getSavingAccBalance());
            status =  psmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return status;
    }
}
