/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Rangoda
 */
public class CAddSubject extends javax.swing.JFrame {

    /**
     * Creates new form CAddSubject
     */
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public CAddSubject() {
        initComponents();
        
        setSize(576,610);
        setResizable(false);
        
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
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
        combo_cType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsubID = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcredits = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combo_faculty = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        combo_sem = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        combo_category = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        combo_cType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_cType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bsc", "Msc" }));
        jPanel1.add(combo_cType);
        combo_cType.setBounds(318, 171, 61, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Course Type:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(77, 174, 83, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Subject Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(77, 371, 86, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Subject ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(77, 308, 65, 17);

        txtsubID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtsubID);
        txtsubID.setBounds(292, 305, 132, 23);

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtname);
        txtname.setBounds(292, 368, 132, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(438, 546, 69, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Add Subject");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(235, 22, 108, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No of credits");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(77, 429, 77, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Price");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(77, 493, 29, 17);

        txtcredits.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcreditsActionPerformed(evt);
            }
        });
        jPanel1.add(txtcredits);
        txtcredits.setBounds(292, 426, 132, 23);

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtprice);
        txtprice.setBounds(292, 490, 132, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Faculty:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(77, 83, 49, 17);

        combo_faculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Business", "Engineering" }));
        jPanel1.add(combo_faculty);
        combo_faculty.setBounds(318, 80, 106, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Semester:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(77, 246, 62, 17);

        combo_sem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem1", "Sem2" }));
        combo_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_semActionPerformed(evt);
            }
        });
        jPanel1.add(combo_sem);
        combo_sem.setBounds(178, 243, 82, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Category:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(287, 246, 62, 17);

        combo_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel1.add(combo_category);
        combo_category.setBounds(371, 243, 53, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 11, 57, 33);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/wallpaper4.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 580, 610);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            conn=MySqlConnect.ConnectDB();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String value1=combo_faculty.getSelectedItem().toString();
        
        if(value1=="Computing")
        {
            String Sql="INSERT INTO c_subject (subID,name,cType,credits,price,category,semester) values (?,?,?,?,?,?,?)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtsubID.getText());
                pst.setString(2,txtname.getText());

                String value2=combo_cType.getSelectedItem().toString();
                pst.setString(3,value2);

                pst.setString(4,txtcredits.getText());
                pst.setString(5,txtprice.getText());
                
                String value3=combo_category.getSelectedItem().toString();
                pst.setString(6,value3);
                
                String value4=combo_sem.getSelectedItem().toString();
                pst.setString(7,value4);

                pst.executeUpdate();
                if(true){
                    JOptionPane.showMessageDialog(null, "Record added successfully");
                    //System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        if(value1=="Business")
        {
            String Sql="INSERT INTO b_subject (subID,name,cType,credits,price,category,semester) values (?,?,?,?,?,?,?)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtsubID.getText());
                pst.setString(2,txtname.getText());

                String value=combo_cType.getSelectedItem().toString();
                pst.setString(3,value);

                pst.setString(4,txtcredits.getText());
                pst.setString(5,txtprice.getText());
                
                String value3=combo_category.getSelectedItem().toString();
                pst.setString(6,value3);
                
                String value4=combo_sem.getSelectedItem().toString();
                pst.setString(7,value4);

                pst.executeUpdate();
                if(true){
                    JOptionPane.showMessageDialog(null, "Record added successfully");
                    //System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        if(value1=="Engineering")
        {
            String Sql="INSERT INTO e_subject (subID,name,cType,credits,price,category,semester) values (?,?,?,?,?,?,?)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtsubID.getText());
                pst.setString(2,txtname.getText());

                String value=combo_cType.getSelectedItem().toString();
                pst.setString(3,value);

                pst.setString(4,txtcredits.getText());
                pst.setString(5,txtprice.getText());
                
                String value3=combo_category.getSelectedItem().toString();
                pst.setString(6,value3);
                
                String value4=combo_sem.getSelectedItem().toString();
                pst.setString(7,value4);

                pst.executeUpdate();
                if(true){
                    JOptionPane.showMessageDialog(null, "Record added successfully");
                    //System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        CHome h=new CHome();
        h.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcreditsActionPerformed

    private void combo_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_semActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CHome h=new CHome();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CAddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAddSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_cType;
    private javax.swing.JComboBox<String> combo_category;
    private javax.swing.JComboBox<String> combo_faculty;
    private javax.swing.JComboBox<String> combo_sem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcredits;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsubID;
    // End of variables declaration//GEN-END:variables
}
