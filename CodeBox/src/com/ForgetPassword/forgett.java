/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ForgetPassword;

import com.Loginpage.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author 91898
 */
public class forgett extends javax.swing.JFrame {

    /**
     * Creates new form forgett
     */
    public forgett() {
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

        frame1 = new com.ForgetPassword.Frame();
        Username = new com.ForgetPassword.Username();
        SecurityQ = new com.ForgetPassword.SecurityQ();
        Answer = new com.ForgetPassword.Answertxt();
        NewPass = new com.ForgetPassword.NewPasswordtxt();
        Submit = new com.ForgetPassword.Submit();
        Back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Search = new com.ForgetPassword.Search();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1099, 602));
        setMinimumSize(new java.awt.Dimension(1099, 602));
        getContentPane().setLayout(null);

        frame1.setBackground(new java.awt.Color(255, 255, 255));
        frame1.setBottomleft(50);
        frame1.setBottomright(50);
        frame1.setTopleft(50);
        frame1.setTopright(50);
        frame1.setLayout(null);

        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Username.setFocusCycleRoot(true);
        Username.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Username.setInheritsPopupMenu(true);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        frame1.add(Username);
        Username.setBounds(50, 130, 260, 40);

        SecurityQ.setEditable(false);
        SecurityQ.setBackground(new java.awt.Color(255, 255, 255));
        SecurityQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        SecurityQ.setToolTipText("");
        SecurityQ.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        frame1.add(SecurityQ);
        SecurityQ.setBounds(50, 220, 270, 40);

        Answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        Answer.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        frame1.add(Answer);
        Answer.setBounds(50, 270, 270, 40);

        NewPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 230, 230), 3, true));
        NewPass.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        frame1.add(NewPass);
        NewPass.setBounds(50, 320, 270, 40);

        Submit.setBackground(new java.awt.Color(102, 102, 255));
        Submit.setBorder(null);
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");
        Submit.setBottomleft(35);
        Submit.setBottomright(35);
        Submit.setContentAreaFilled(false);
        Submit.setFocusPainted(false);
        Submit.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        Submit.setTopleft(35);
        Submit.setTopright(35);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        frame1.add(Submit);
        Submit.setBounds(80, 390, 200, 40);

        Back.setBackground(new java.awt.Color(51, 102, 255));
        Back.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorderPainted(false);
        Back.setFocusPainted(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        frame1.add(Back);
        Back.setBounds(20, 20, 72, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/Redlock1-removebg-preview.png"))); // NOI18N
        frame1.add(jLabel6);
        jLabel6.setBounds(130, 10, 100, 70);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel1.setText("Reset Password ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        frame1.add(jLabel1);
        jLabel1.setBounds(90, 80, 210, 35);

        Search.setBackground(new java.awt.Color(102, 102, 255));
        Search.setBorder(null);
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setBottomleft(20);
        Search.setBottomright(20);
        Search.setContentAreaFilled(false);
        Search.setFocusPainted(false);
        Search.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        Search.setTopleft(20);
        Search.setTopright(20);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        frame1.add(Search);
        Search.setBounds(250, 190, 72, 23);

        getContentPane().add(frame1);
        frame1.setBounds(390, 60, 360, 480);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icons/forget.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -90, 1100, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        String ans = Answer.getText();
        String newPassword = NewPass.getText();
        String username = Username.getText();

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("select * from login where Username = '"+username+"'and Answer = '"+ans+"'");
            if(rs.next()){
                // It will submit the and set the new Password if answer matches ..
                s.executeUpdate("update login set Pass = '"+newPassword+"'where Username = '"+username+"'and Answer ='"+ans+"'");
                JOptionPane.showMessageDialog(null,"Password Chnage Succesfully");
            }
            else{
                // else error is shown..
                JOptionPane.showMessageDialog(null,"Invalid username");
                c.close();
                rs.close();
            }

        }
        catch(Exception e){

        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // This will redirect to login page ...
        setVisible(false);
        Login p = new Login();
        p.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        String username = Username.getText();
        System.out.print(username);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // It will show the security question of User...

        String username = Username.getText();
        System.out.print(username);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///projectmanager","root","Him@nshu2004");
            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("Select SecurityQ from login where Username = '"+username+"'");

            if(rs.next()){

                SecurityQ.setText(rs.getString("SecurityQ"));
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid username");
                c.close();
                rs.close();
            }
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(forgett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgett().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ForgetPassword.Answertxt Answer;
    private javax.swing.JButton Back;
    private com.ForgetPassword.NewPasswordtxt NewPass;
    private com.ForgetPassword.Search Search;
    private com.ForgetPassword.SecurityQ SecurityQ;
    private com.ForgetPassword.Submit Submit;
    private com.ForgetPassword.Username Username;
    private com.ForgetPassword.Frame frame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
