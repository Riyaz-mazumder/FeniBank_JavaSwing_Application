
package DBOperation;

import Models.CreateAccountBen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManagerDB {
    public static List gelAll(String a){
        List userList = new ArrayList();
        try {
            PreparedStatement psm =  DBCon.getConnection().prepareStatement("SELECT * FROM createaccount where AccAStatus=0 AND branch='"+a+"';");
         ResultSet rr = psm.executeQuery();
         while (rr.next()) {
          CreateAccountBen createAcc = new CreateAccountBen();
         createAcc.setUserName(rr.getString("userName"));
         createAcc.setUserPhoneNo(rr.getString("userPnoneNo"));
         createAcc.setPhoto(rr.getBytes("photo"));
         createAcc.setNidNo(rr.getString("nidNo"));
         createAcc.setNidFront(rr.getBytes("nidFront"));
         createAcc.setDateOfBirth(rr.getString("dateOfBirth"));
         createAcc.setBranch(rr.getString("branch"));
         createAcc.setNomineeName(rr.getString("nomineeName"));
         createAcc.setNomineePhoneNo(rr.getString("nomineePhoneNo"));
         createAcc.setNomineeRelation(rr.getString("nomineeRelation"));
         createAcc.setNomineeNidNo(rr.getString("nomineeNidNo"));
         createAcc.setAccountType(rr.getString("accountType"));
         createAcc.setProfession(rr.getString("profession"));
         createAcc.setPvillRoad(rr.getString("PvillRoad"));
         createAcc.setPpostOffice(rr.getString("PpostOffice"));
         createAcc.setPupazila(rr.getString("Pupazila"));
         createAcc.setPdistric(rr.getString("Pdistric"));
         createAcc.setElectricityBillPhoto(rr.getBytes("electricityBillPhoto"));
         createAcc.setAccountNumber(rr.getString("accountNumber"));
         createAcc.setAccAStatus(rr.getBoolean("AccAStatus"));
         userList.add(createAcc); 
        }
        }
       catch (SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return userList;
    }
}
