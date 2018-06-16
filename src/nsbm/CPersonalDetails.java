/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

/**
 *
 * @author Rangoda
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CPersonalDetails extends javax.swing.JFrame {

    /**
     * Creates new form CPersonalDetails
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public CPersonalDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        lName = new javax.swing.JLabel();
        txtlName = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_type = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combo_intake = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combo_faculty = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Personal & Course Details");

        fName.setText("First Name");

        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });

        lName.setText("Last Name");

        txtlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlNameActionPerformed(evt);
            }
        });

        dob.setText("DOB");

        txtdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdobActionPerformed(evt);
            }
        });

        jLabel1.setText("Address");

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        jLabel4.setText("Tel No.");

        txttelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelNoActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel5.setText("Course type");

        combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bsc", "Msc" }));
        combo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_typeActionPerformed(evt);
            }
        });

        jLabel6.setText("Intake");

        combo_intake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feb", "July" }));
        combo_intake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_intakeActionPerformed(evt);
            }
        });

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Faculty");

        combo_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Business", "Engineering" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dob)
                                .addComponent(lName)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fName)
                                .addGap(9, 9, 9)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combo_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(44, 44, 44))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameActionPerformed

    private void txtdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdobActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txttelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelNoActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void combo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            conn=MySqlConnect.ConnectDB();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        String value1=combo_type.getSelectedItem().toString();
        String value2=combo_intake.getSelectedItem().toString();
        String fac=combo_faculty.getSelectedItem().toString();
        
        //new CBacFebPreEducation(fac);
        
        if(fac=="Computing")
        {
            if(value1=="Bsc")
            {
                String Sql="INSERT INTO c_bac_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){
                        if(value2=="Feb"){
                            CBacFebPreEducation cbfpe=new CBacFebPreEducation(fac);
                            cbfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CBacJulyPreEducation cbjpe=new CBacJulyPreEducation(fac);
                            cbjpe.setVisible(true);
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }

            else if(value1=="Msc")
            {
                String Sql="INSERT INTO c_mas_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){

                        if(value2=="Feb"){
                            CMasFebPreEducation cmfpe=new CMasFebPreEducation(fac);
                            cmfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CMasJulyPreEducation cmjpe=new CMasJulyPreEducation(fac);
                            cmjpe.setVisible(true);
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }
        }
        else if(fac=="Business")
        {
            if(value1=="Bsc")
            {
                String Sql="INSERT INTO b_bac_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){
                        if(value2=="Feb"){
                            CBacFebPreEducation cbfpe=new CBacFebPreEducation(fac);
                            cbfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CBacJulyPreEducation cbjpe=new CBacJulyPreEducation(fac);
                            cbjpe.setVisible(true);
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }

            else if(value1=="Msc")
            {
                String Sql="INSERT INTO b_mas_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){

                        if(value2=="Feb"){
                            CMasFebPreEducation cmfpe=new CMasFebPreEducation(fac);
                            cmfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CMasJulyPreEducation cmjpe=new CMasJulyPreEducation(fac);
                            cmjpe.setVisible(true);
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }
        }
        else if(fac=="Engineering")
        {
            if(value1=="Bsc")
            {
                String Sql="INSERT INTO e_bac_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){
                        if(value2=="Feb"){
                            CBacFebPreEducation cbfpe=new CBacFebPreEducation(fac);
                            cbfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CBacJulyPreEducation cbjpe=new CBacJulyPreEducation(fac);
                            cbjpe.setVisible(true);
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }

            else if(value1=="Msc")
            {
                String Sql="INSERT INTO e_mas_student (fName,lName,dob,address,telNo,email,intake) values (?,?,?,?,?,?,?)";
                try{
                    pst=conn.prepareStatement(Sql);
                    pst.setString(1,txtfName.getText());
                    pst.setString(2,txtlName.getText());
                    pst.setString(3,txtdob.getText());
                    pst.setString(4,txtaddress.getText());
                    pst.setString(5,txttelNo.getText());
                    pst.setString(6,txtemail.getText());


                    pst.setString(7,value2);

                    pst.executeUpdate();
                    //if(rs.next()){

                        if(value2=="Feb"){
                            CMasFebPreEducation cmfpe=new CMasFebPreEducation(fac);
                            cmfpe.setVisible(true);
                        }
                        else if(value2=="July"){
                            CMasJulyPreEducation cmjpe=new CMasJulyPreEducation(fac);
                            cmjpe.setVisible(true);
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_intakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_intakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_intakeActionPerformed

//    public String getVariable()
//    {
//        return "INSERT INTO c_bac_student (fName,lName,dob,address,telNo,email) values (?,?,?,?,?,?)";
//    }
    
    
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
            java.util.logging.Logger.getLogger(CPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPersonalDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_faculty;
    private javax.swing.JComboBox<String> combo_intake;
    private javax.swing.JComboBox<String> combo_type;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtlName;
    private javax.swing.JTextField txttelNo;
    // End of variables declaration//GEN-END:variables
}
