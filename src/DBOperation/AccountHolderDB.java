
package DBOperation;

import Models.CreateAccountBen;
import Models.SavingsAccountModel;
import Models.sendMoneyModel;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AccountHolderDB {
   public static String accountExHolder = "";
   public static int createAccount(CreateAccountBen m){
       int status = 0;
       String showFeldsName = "SHOW COLUMNS FROM createaccount";
       List<String> names = new ArrayList<>();
       
     try {
         PreparedStatement psmt =  DBCon.getConnection().prepareStatement(showFeldsName);
         ResultSet rs = psmt.executeQuery(showFeldsName);
         
         while (rs.next()) {
             names.add(rs.getString("Field"));
         }
         names.remove(0);
         String sName = "";
            for (String name : names) {
             sName += name + ", ";
         }
      String sql = "insert into createaccount (" +sName.substring(0, sName.length() -2)+") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
      PreparedStatement psm =  DBCon.getConnection().prepareStatement(sql);
      psm.setString(1, m.getUserName());
      psm.setString(2, m.getUserPhoneNo());
      psm.setBytes(3, m.getPhoto());
      psm.setString(4, m.getNidNo());
      psm.setString(5, m.getGender());
      psm.setBytes(6, m.getNidFront());
      psm.setBytes(7, m.getNidBack());
      psm.setString(8, String.valueOf(m.getDob()));
      psm.setString(9, m.getBranch());
      psm.setString(10, m.getNomineeName());
      psm.setString(11, m.getNomineePhoneNo());
      psm.setString(12, m.getNomineeRelation());
      psm.setString(13, m.getNomineeNidNo());
      psm.setString(14, m.getAccountType());
      psm.setString(15, m.getProfession());
      psm.setString(16, m.getPvillRoad());
      psm.setString(17, m.getPpostOffice());
      psm.setString(18, m.getPupazila());
      psm.setString(19, m.getPdistric());
      psm.setString(20, m.getPpostCode());
      psm.setBytes(21, m.getElectricityBillPhoto());
      psm.setString(22, m.getPaVillRoad());
      psm.setString(23, m.getPaPostOffice());
      psm.setString(24, m.getPaUpazila());
      psm.setString(25, m.getPaDistric());
      psm.setString(26, m.getPaPostCode());
      psm.setBoolean(27, m.isAccAStatus());
      psm.setString(28, m.getAccountNumber());
      status = psm.executeUpdate();
     } catch (Exception e) {
         accountExHolder = e.toString();
     }       
       return status;
   }
   
    public static List gelAllSavingAcc(String a){
        List userList = new ArrayList();
        try {
            PreparedStatement psm =  DBCon.getConnection().prepareStatement("SELECT * FROM the_bank.savings_account where accountNumber ='"+a+"';");
         ResultSet rr = psm.executeQuery();
         while (rr.next()) {
         SavingsAccountModel mo = new SavingsAccountModel();
         mo.setOwner(rr.getString("owner"));
         mo.setAccountNumber(rr.getString("accountNumber"));
         mo.setWithdrawLimit(rr.getString("withDrawLimit"));
         mo.setTransactionLimit(rr.getString("transactionLimit"));
         mo.setDipositMoney(rr.getDouble("balance"));
         mo.setInterest(rr.getString("interest"));
         userList.add(mo);
        }
        }
       catch (SQLException ex) {
           ex.printStackTrace();
        }
         return userList;
    }
    public static int sendMoney(String sender, String reciver, String amount, String message){
        int status = 0;
        try {
            Date d = new Date();
            SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
            String dd = sim.format(d);
            String sql = "insert into the_bank.sendmoneysavingsacc (sender, reciver, amount, message, date) values(?,?,?,?,?);";
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(sql);
            psmt.setString(1, sender);
            psmt.setString(2, reciver);
            psmt.setString(3, amount);
            psmt.setString(4, message);
            psmt.setString(5, dd);
            status = psmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public static List gelAllSendMoney(String a){
        List userList = new ArrayList();
        try {
            PreparedStatement psm =  DBCon.getConnection().prepareStatement("SELECT * FROM the_bank.sendmoneysavingsacc where sender ='"+a+"';");
         ResultSet rr = psm.executeQuery();
         while (rr.next()) {
         sendMoneyModel mo = new sendMoneyModel();
         mo.setSender(rr.getString("sender"));
         mo.setReciver(rr.getString("reciver"));
         mo.setAmount(String.valueOf(rr.getDouble("amount")));
         mo.setMessage(rr.getString("message"));
         mo.setDate(rr.getString("date"));
         userList.add(mo);
        }
        }
       catch (SQLException ex) {
           ex.printStackTrace();
        }
         return userList;
    }
}
