/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DBOperation.DBCon;
import DBOperation.ManagerDB;
import Models.CreateAccountBen;
import java.awt.Image;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.internal.oxm.schema.model.All;

/**
 *
 * @author WALTON N41
 */
public class Branch_mannager extends javax.swing.JFrame {
    /**
     * Creates new form Admin
     */
    String srr = "";
    private void getInit() {
        setResizable(false);
        setTitle("Feni Bank");
        try {
            Image icon = new ImageIcon(this.getClass().getResource("/Icons/sub_bank.png")).getImage();
            this.setIconImage(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Branch_mannager() {
        initComponents();
        getInit();
        srr = "Feni";
        data(srr);
    }
    
   public Branch_mannager(String s, String a) {
        initComponents();
        getInit();
        logAs.setText(a);
        data(s);
        srr = s;
        
    }
   
//   private void getSavingsAprove(String a){
//       List userList = new ArrayList();
//       try {
//        PreparedStatement psm =  DBCon.getConnection().prepareStatement("SELECT * FROM createaccount where AccAStatus=0 AND branch='"+a+"';");
//         ResultSet rr = psm.executeQuery();
//         while (rr.next()) {
//          CreateAccountBen createAcc = new CreateAccountBen();
//         createAcc.setUserName(rr.getString("userName"));
//         createAcc.setUserPhoneNo(rr.getString("userPnoneNo"));
//         createAcc.setPhoto(rr.getBytes("photo"));
//         createAcc.setNidNo(rr.getString("nidNo"));
//         createAcc.setNidFront(rr.getBytes("nidFront"));
//         createAcc.setDateOfBirth(rr.getString("dateOfBirth"));
//         createAcc.setBranch(rr.getString("branch"));
//         createAcc.setNomineeName(rr.getString("nomineeName"));
//         createAcc.setNomineePhoneNo(rr.getString("nomineePhoneNo"));
//         createAcc.setNomineeRelation(rr.getString("nomineeRelation"));
//         createAcc.setNomineeNidNo(rr.getString("nomineeNidNo"));
//         createAcc.setAccountType(rr.getString("accountType"));
//         createAcc.setProfession(rr.getString("profession"));
//         createAcc.setPvillRoad(rr.getString("PvillRoad"));
//         createAcc.setPpostOffice(rr.getString("PpostOffice"));
//         createAcc.setPupazila(rr.getString("Pupazila"));
//         createAcc.setPdistric(rr.getString("Pdistric"));
//         createAcc.setElectricityBillPhoto(rr.getBytes("electricityBillPhoto"));
//         createAcc.setAccountNumber(rr.getString("accountNumber"));
//         userList.add(createAcc);
//         }
//         System.out.println(a);
//          
//         System.out.println("lllllllll..........");
   public void data(String ok){
       List<CreateAccountBen> all = ManagerDB.gelAll(ok);
      
       String[] clos = {"User Name", "Phone Number", "Photo", "Nid No", "Nid Photo", "Date of Birth", "Branch Name", "Nominee Name", "Nominee Phone NO", "Nominee Relation", "Nominee Nid No", "Account Type", "Profession", "Vill/Road", "Post Office", "Upazila", "Distric", "Electricity bill", "Account Number", "Status"};
       String[][] rows = new String[all.size()][clos.length];
        
         for(int i=0;i<all.size();i++){
             rows[i][0] = all.get(i).getUserName();
             rows[i][1] = all.get(i).getUserPhoneNo();
             rows[i][2] = String.valueOf(all.get(i).getPhoto());
             rows[i][3] = all.get(i).getNidNo();
             rows[i][4] = String.valueOf(all.get(i).getNidFront());
             rows[i][5] = all.get(i).getDateOfBirth();
             rows[i][6] = all.get(i).getBranch();
             rows[i][7] = all.get(i).getNomineeName();
             rows[i][8] = all.get(i).getNomineePhoneNo();
             rows[i][9] = all.get(i).getNomineeRelation();
             rows[i][10] = all.get(i).getNomineeNidNo();
             rows[i][11] = all.get(i).getAccountType();
             rows[i][12] = all.get(i).getProfession();
             rows[i][13] = all.get(i).getPvillRoad();
             rows[i][14] = all.get(i).getPpostOffice();
             rows[i][15] = all.get(i).getPupazila();
             rows[i][16] = all.get(i).getPdistric();
             rows[i][17] = String.valueOf(all.get(i).getElectricityBillPhoto());
             rows[i][18] = all.get(i).getAccountNumber();
             rows[i][19] = String.valueOf(all.get(i).isAccAStatus());
         }
     DefaultTableModel dtm = new DefaultTableModel(rows, clos);
     jTable1.setModel(dtm);
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
      
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logAs = new javax.swing.JLabel();
        createBranch1 = new javax.swing.JButton();
        aprove = new javax.swing.JButton();
        appro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Approve New Account");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Logged In As: ");

        logAs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logAs.setForeground(new java.awt.Color(204, 0, 51));

        createBranch1.setBackground(new java.awt.Color(19, 24, 19));
        createBranch1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createBranch1.setForeground(new java.awt.Color(255, 255, 255));
        createBranch1.setText("Back");
        createBranch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBranch1ActionPerformed(evt);
            }
        });

        aprove.setBackground(new java.awt.Color(19, 24, 19));
        aprove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aprove.setForeground(new java.awt.Color(255, 255, 255));
        aprove.setText("Approve");
        aprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aproveActionPerformed(evt);
            }
        });

        appro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appro.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logAs, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(createBranch1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(aprove, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(appro, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logAs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createBranch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aprove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(appro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Approve Savings Accounts", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1545, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Approve Transaction", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1545, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Create Stuff", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aproveActionPerformed
        try {
            int status = 0;
            int selectedRow =  jTable1.getSelectedRow();
            String accountNum = jTable1.getValueAt(selectedRow, 18).toString();
            String sql = "UPDATE the_bank.createaccount SET AccAStatus=? WHERE accountNumber='"+accountNum+"';";
            
            PreparedStatement psmt = DBCon.getConnection().prepareStatement(sql);
            psmt.setString(1, "1");
            status = psmt.executeUpdate();
            if(status> 0){
               JOptionPane.showMessageDialog(rootPane, "The Account Has Been Approved");
                data(srr);
            }
            
//        if(selectedRow==null){
//            JOptionPane.showMessageDialog(rootPane, "First Select a Account");
//        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
            Logger.getLogger(Branch_mannager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aproveActionPerformed

    private void createBranch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBranch1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_createBranch1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Branch_mannager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Branch_mannager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Branch_mannager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Branch_mannager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Branch_mannager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appro;
    private javax.swing.JButton aprove;
    private javax.swing.JButton createBranch1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logAs;
    // End of variables declaration//GEN-END:variables
}
